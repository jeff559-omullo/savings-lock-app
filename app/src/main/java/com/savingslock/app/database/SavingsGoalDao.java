package com.savingslock.app.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.savingslock.app.models.SavingsGoal;
import java.util.List;

@Dao
public interface SavingsGoalDao {
    @Insert
    long insert(SavingsGoal goal);

    @Update
    void update(SavingsGoal goal);

    @Delete
    void delete(SavingsGoal goal);

    @Query("SELECT * FROM savings_goals WHERE id = :id")
    SavingsGoal getById(int id);

    @Query("SELECT * FROM savings_goals ORDER BY deadlineTimestamp ASC")
    List<SavingsGoal> getAllGoals();

    @Query("SELECT * FROM savings_goals WHERE status = :status")
    List<SavingsGoal> getGoalsByStatus(int status);

    @Query("SELECT * FROM savings_goals WHERE status = 2")
    List<SavingsGoal> getLockedGoals();
}