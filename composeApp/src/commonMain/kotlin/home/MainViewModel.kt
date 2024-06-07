package home

import androidx.lifecycle.ViewModel
import data.DestinationsRepository
import data.ExploreModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {
    private val destinationsRepository = DI.destinationsRepository

    val hotels: List<ExploreModel> = destinationsRepository.hotels
    val restaurants: List<ExploreModel> = destinationsRepository.restaurants

    private val _suggestedDestinations = MutableStateFlow<List<ExploreModel>>(emptyList())
    val suggestedDestinations = _suggestedDestinations.asStateFlow()

    init {
        _suggestedDestinations.value = destinationsRepository.destinations
    }
}