package rodolfo.com.br.placar.ui.placaraac

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class PlacarAACViewModel: ViewModel(){

    val placar1 = MutableLiveData<Int>()
    val placar2 = MutableLiveData<Int>()

    init {
        placar1.value=0
        placar2.value=0
    }

    fun adicionarPontoTime1(ponto:Int){
        placar1.value = placar1.value?.plus(ponto)
    }

    fun  adicionarPontoTime2(ponto: Int){
        placar2.value = placar2.value?.plus(ponto)
    }

    fun reniciar(){
        placar1.value = 0
        placar2.value = 0
    }
}