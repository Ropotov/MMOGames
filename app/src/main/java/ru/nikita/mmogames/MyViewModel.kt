package ru.nikita.mmogames

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response
import ru.nikita.mmogames.Model.GamesApi
import ru.nikita.mmogames.Repository.Repository


class MyViewModel : ViewModel() {

    var repo = Repository()
    var myGameList: MutableLiveData<Response<GamesApi>> = MutableLiveData()

    fun getMyGames() {
        viewModelScope.launch {
            myGameList.value = repo.getGame()
        }
    }
}
