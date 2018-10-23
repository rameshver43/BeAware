package com.omen.acer.rescue.feature

data class Disaster(val name:String)

object Set
{
    var Dset= listOf<Disaster>(
            Disaster("Earthquake"),
            Disaster("Vulcano"),
            Disaster("Tsunami"),
            Disaster("Flood"),
            Disaster("Drought")
    )
}