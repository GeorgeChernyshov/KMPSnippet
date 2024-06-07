import data.DestinationsLocalDataSource
import data.DestinationsRepository

object DI {
    val destinationsLocalDataSource: DestinationsLocalDataSource by lazy {
        DestinationsLocalDataSource()
    }

    val destinationsRepository: DestinationsRepository by lazy {
        DestinationsRepository()
    }
}