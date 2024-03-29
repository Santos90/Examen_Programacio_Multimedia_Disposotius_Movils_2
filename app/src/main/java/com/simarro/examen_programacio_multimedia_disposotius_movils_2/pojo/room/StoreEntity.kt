package com.simarro.examen_programacio_multimedia_disposotius_movils_2.pojo.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "StoreEntity")
data class StoreEntity (
	@PrimaryKey (autoGenerate = true)
	var id: Long = 0,
	var name: String = "",
	var phone: String = "",
	var website: String = "",
	var photoUrl: String = "",
	var isFavorite: Boolean = false
) : Serializable {


}