package by.bsuir.myapplication.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Location(
    val region: String
)

@Serializable
data class Current(

    @SerialName("last_updated")
    val lastUpdated: String,
    @SerialName("temp_c")
    val temperatureCelsius: Double,
    val condition: Condition,
)

@Serializable
data class Condition(
    val text: String
)

@Serializable
data class Forecast(
    @SerialName("прогнозируемый день")
    val forecastDay: List<ForecastDay>
)

@Serializable
data class ForecastDay(
    val date: String,
    @SerialName("дата_почты")
    val dateEpoch: Long,
    val day: Day,
    val astro: Astro
)

@Serializable
data class Day(
    @SerialName("макстемп_c")
    val maxTemperatureCelsius: Double,
    @SerialName("макстемп_f")
    val maxTemperatureFahrenheit: Double,
    @SerialName("минтемп_c")
    val minTemperatureCelsius: Double,
    @SerialName("минтемп_f")
    val minTemperatureFahrenheit: Double,
    @SerialName("avgtemp_c")
    val averageTemperatureCelsius: Double,
    @SerialName("avgtemp_f")
    val averageTemperatureFahrenheit: Double,
    @SerialName("максветер_mph")
    val maxWindMph: Double,
    @SerialName("максветер_kph")
    val maxWindKph: Double,
    @SerialName("totalprecip_mm")
    val totalPrecipitationMm: Double,
    @SerialName("totalprecip_in")
    val totalPrecipitationIn: Double,
    @SerialName("totalsnow_cm")
    val totalSnowCm: Double,
    @SerialName("avgvis_km")
    val averageVisibilityKm: Double,
    @SerialName("avgvis_miles")
    val averageVisibilityMiles: Double,
    @SerialName("средняя влажность")
    val averageHumidity: Double,
    @SerialName("день когда будет дождь")
    val willItRain: Int,
    @SerialName("дневная вероятность дождя")
    val chanceOfRain: Int,
    @SerialName("день когда будет снеш")
    val willItSnow: Int,
    @SerialName("дневная вероятность снега")
    val chanceOfSnow: Int,
    val condition: Condition
)

@Serializable
data class Astro(
    val sunrise: String,
    val sunset: String,
    val moonrise: String,
    val moonset: String,
    @SerialName("фаза луны")
    val moonPhase: String,
    @SerialName("лунное сияние")
    val moonillumination: Int,
    @SerialName("луна поднимается")
    val isMoonUp: Int,
    @SerialName("солнце встаёт")
    val isSunUp: Int
)

@Serializable
data class WeatherData(
    val location: Location,
    val current: Current,
    val forecast: Forecast
)
