package com.simarro.examen_programacio_multimedia_disposotius_movils_2.utils.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.simarro.stores.POJOS.StoreDAO
import com.simarro.stores.POJOS.StoreEntity


@Database (entities = arrayOf(StoreEntity::class), version = 2)
abstract class StoreDatabase : RoomDatabase() {

	abstract fun storeDao() : StoreDAO
}