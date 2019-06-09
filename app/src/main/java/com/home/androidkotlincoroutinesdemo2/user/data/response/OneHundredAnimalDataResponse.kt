package com.home.androidkotlincoroutinesdemo2.user.data.response

import com.google.gson.annotations.SerializedName

data class OneHundredAnimalDataResponse(
    @SerializedName("result")
    val result: Result
) {
    data class Result(
        @SerializedName("limit")
        val limit: Int,
        @SerializedName("offset")
        val offset: Int,
        @SerializedName("count")
        val count: Int,
        @SerializedName("sort")
        val sort: String,
        @SerializedName("results")
        val results: List<Result>
    ) {
        data class Result(
            @SerializedName("A_Behavior")
            val aBehavior: String,
            @SerializedName("A_Distribution")
            val distribution: String,
            @SerializedName("A_Voice03_URL")
            val aVoice03URL: String,
            @SerializedName("A_POIGroup")
            val aPOIGroup: String,
            @SerializedName("A_Code")
            val aCode: String,
            @SerializedName("A_Pic04_ALT")
            val A_Pic04_ALT: String,
            @SerializedName("A_Voice03_ALT")
            val aVoice03ALT: String,
            @SerializedName("A_Theme_URL")
            val aThemeURL: String,
            @SerializedName("A_Summary")
            val aSummary: String,
            @SerializedName("A_Update")
            val aUpdate: String,
            @SerializedName("A_Pic02_URL")
            val imageUrl: String,
            @SerializedName("A_pdf01_ALT")
            val aPdf01ALT: String,
            @SerializedName("A_Keywords")
            val aKeywords: String,
            @SerializedName("A_Theme_Name")
            val aThemeName: String,
            @SerializedName("A_pdf02_ALT")
            val aPdf02ALT: String,
            @SerializedName("A_Family")
            val aFamily: String,
            @SerializedName("A_Adopt")
            val aAdopt: String,
            @SerializedName("A_Voice01_ALT")
            val aVoice01ALT: String,
            @SerializedName("A_Pic02_ALT")
            val aPic02ALT: String,
            @SerializedName("A_Vedio_URL")
            val aVedioURL: String,
            @SerializedName("A_Pic04_URL")
            val aPic04URL: String,
            @SerializedName("A_Order")
            val aOrder: String,
            @SerializedName("A_pdf01_URL")
            val aPdf01URL: String,
            @SerializedName("A_Voice02_ALT")
            val aVoice02ALT: String,
            @SerializedName("A_Diet")
            val aDiet: String,
            @SerializedName("A_Name_Latin")
            val aNameLatin: String,
            @SerializedName("A_Feature")
            val aFeature: String,
            @SerializedName("A_Habitat")
            val aHabitat: String,
            @SerializedName("A_Phylum")
            val aPhylum: String,
            @SerializedName("A_Class")
            val aClass: String,
            @SerializedName("A_Pic03_ALT")
            val aPic03ALT: String,
            @SerializedName("A_AlsoKnown")
            val aAlsoKnown: String,
            @SerializedName("A_Voice02_URL")
            val aVoice02URL: String,
            @SerializedName("A_Name_En")
            val aNameEn: String,
            @SerializedName("A_Name_Ch")
            val name: String,
            @SerializedName("A_Pic03_URL")
            val aPic03URL: String,
            @SerializedName("A_Location")
            val aLocation: String,
            @SerializedName("A_Voice01_URL")
            val aVoice01URL: String,
            @SerializedName("A_pdf02_URL")
            val aPdf02URL: String,
            @SerializedName("A_CID")
            val aCID: String,
            @SerializedName("A_Interpretation")
            val aInterpretation: String,
            @SerializedName("A_Pic01_URL")
            val aPic01URL: String,
            @SerializedName("A_Conservation")
            val aConservation: String,
            @SerializedName("A_Pic01_ALT")
            val aPic01ALT: String,
            @SerializedName("_id")
            val id: Int,
            @SerializedName("A_Geo")
            val aGeo: String,
            @SerializedName("A_Crisis")
            val aCrisis: String
        )
    }
}