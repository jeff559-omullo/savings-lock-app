package com.savingslock.app.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.savingslock.app.models.SavingsGoal;
import com.savingslock.app.models.Payment;
import com.savingslock.app.models.LockedApp;

@Database(entities = {SavingsGoal.class, Payment.class, LockedApp.class}, version = 1, exportSchema = false)
public abstract class SavingsLockDatabase extends RoomDatabase {
    public abstract SavingsGoalDao savingsGoalDao();
    public abstract PaymentDao paymentDao();
    public abstract LockedAppDao lockedAppDao();

    private static volatile SavingsLockDatabase INSTANCE;

    public static SavingsLockDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (SavingsLockDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), SavingsLockDatabase.class, "savings_lock_db").build();
                }
            }
        }
        return INSTANCE;
    }
}