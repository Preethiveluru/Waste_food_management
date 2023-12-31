package bd.edu.rifat.foodDonationApp.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Delete;

import java.util.List;

import bd.edu.rifat.foodDonationApp.entities.Food;

@Dao
public interface FoodDao {


    @Insert
    void insertFoodDonar(Food food);
    @Delete
    void delete(Food food);
    @Query("select * from tbl_food")
    LiveData<List<Food>> getAllDonars();
}
