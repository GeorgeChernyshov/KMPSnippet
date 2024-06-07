package data

class DestinationsRepository() {
    private val destinationsLocalDataSource = DI.destinationsLocalDataSource

    val destinations: List<ExploreModel> = destinationsLocalDataSource.craneDestinations
    val hotels: List<ExploreModel> = destinationsLocalDataSource.craneHotels
    val restaurants: List<ExploreModel> = destinationsLocalDataSource.craneRestaurants
}