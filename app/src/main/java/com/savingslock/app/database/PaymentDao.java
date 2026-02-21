package com.savingslock.app.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.savingslock.app.models.Payment;
import java.util.List;

@Dao
public interface PaymentDao {
    @Insert
    long insert(Payment payment);

    @Update
    void update(Payment payment);

    @Query("SELECT * FROM payments WHERE id = :id")
    Payment getById(int id);

    @Query("SELECT * FROM payments WHERE savingsGoalId = :savingsGoalId ORDER BY createdAt DESC")
    List<Payment> getPaymentsByGoalId(int savingsGoalId);

    @Query("SELECT * FROM payments WHERE status = 1")
    List<Payment> getSuccessfulPayments();
}