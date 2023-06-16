package com.mad.task15junspotify.model

class ModelBig {

    var bigImgId:Int=0
    var smallImgId:Int=0
    var songTitle:String=""
    var songDesc:String=""

    constructor(bigImgId: Int, smallImgId: Int, songTitle: String, songDesc: String) {
        this.bigImgId = bigImgId
        this.smallImgId = smallImgId
        this.songTitle = songTitle
        this.songDesc = songDesc
    }
}