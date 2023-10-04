package com.example.mvvmkullanimi

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MatematikRepository {
    var mds = MatematikDataSource()

    suspend fun toplama(alinanSayi1: String, alinanSayi2:String) : String =  mds.toplama(alinanSayi1,alinanSayi2)

    suspend fun carpma(alinanSayi1: String, alinanSayi2:String) : String = mds.carpma(alinanSayi1,alinanSayi2)

}