package ru.myitschool.nasa_bootcamp.model.spaceX.launches

import com.google.gson.annotations.SerializedName
import ru.myitschool.nasa_bootcamp.model.models.SxLaunchModel

class Launch( //MAIN
    @field:SerializedName("flight_number") val flight_number: Int,
    @field:SerializedName("mission_name") val mission_name: String,
    @field:SerializedName("launch_year") val launch_year: Int,
    @field:SerializedName("launch_date_utc") val launch_date_utc: String,
    @field:SerializedName("links") val links: Links, //Cсылка на эмблему миссии
    @field:SerializedName("rocket") val rocket: Rocket,
    @field:SerializedName("upcoming") val upcoming: Boolean,
    @field:SerializedName("launch_success") val launch_success: Boolean,
    @field:SerializedName("details") val details: String,
    @field:SerializedName("launch_site") val launch_site: LaunchSite

) {
    public fun createLaunchModel(): SxLaunchModel {
        return SxLaunchModel(
            launch_site,
            rocket,
            links,
            flight_number, mission_name,
            launch_year, launch_date_utc, upcoming, launch_success, details
        )
    }
}