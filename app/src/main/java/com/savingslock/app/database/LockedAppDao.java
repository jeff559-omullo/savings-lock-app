package com.savingslock.app.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.savingslock.app.models.LockedApp;
import java.util.List;

@Dao
public interface LockedAppDao {
    @Insert
    long insert(LockedApp lockedApp);

    @Query("SELECT * FROM locked_apps WHERE savingsGoalId = :savingsGoalId")
    List<LockedApp> getLockedAppsByGoalId(int savingsGoalId);

    @Query("SELECT * FROM locked_apps")
    List<LockedApp> getAllLockedApps();

    @Query("DELETE FROM locked_apps WHERE savingsGoalId = :savingsGoalId")
    void deleteByGoalId(int savingsGoalId);
}