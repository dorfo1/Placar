package rodolfo.com.br.placar.ui.placaraac

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_placar_aac.*
import rodolfo.com.br.placar.R

class PlacarAACActivity : AppCompatActivity() {

    lateinit var placarAACViewModel: PlacarAACViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar_aac)

        placarAACViewModel = ViewModelProviders.of(this).get(PlacarAACViewModel::class.java)

        registraObservers()

        btn_3pontos_time1.setOnClickListener({placarAACViewModel.adicionarPontoTime1(3)})
        btn_2pontos_time1.setOnClickListener({placarAACViewModel.adicionarPontoTime1(2)})
        btn_1pontos_time1.setOnClickListener({placarAACViewModel.adicionarPontoTime1(1)})
        btn_3pontos_time2.setOnClickListener({placarAACViewModel.adicionarPontoTime2(3)})
        btn_2pontos_time2.setOnClickListener({placarAACViewModel.adicionarPontoTime2(2)})
        btn_1pontos_time2.setOnClickListener({placarAACViewModel.adicionarPontoTime2(1)})
        btn_reniciar.setOnClickListener({placarAACViewModel.reniciar()})
    }

    private fun registraObservers() {
        placarAACViewModel.placar1.observe(this, Observer{
            placar_score_time1.text = it.toString()
        })

        placarAACViewModel.placar2.observe(this, Observer {
            placar_score_time2.text = it.toString()
        })
    }
}
