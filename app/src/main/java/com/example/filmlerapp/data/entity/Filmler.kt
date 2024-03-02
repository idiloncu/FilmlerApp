package com.example.filmlerapp.data.entity

import java.io.Serializable

data class Filmler(var id : Int,
                   var ad:String,
                   var Resim:String,
                   var fiyat:Int):Serializable {
}