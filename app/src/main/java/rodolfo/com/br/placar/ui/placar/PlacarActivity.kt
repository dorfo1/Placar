package rodolfo.com.br.placar.ui.placar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_placar.*
import rodolfo.com.br.placar.R
import rodolfo.com.br.placar.utils.KEY_EXTRA_TIME_1
import rodolfo.com.br.placar.utils.KEY_EXTRA_TIME_2

class PlacarActivity : AppCompatActivity(), View.OnClickListener {


    private var placar1 = 0
    private var placar2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)
        supportActionBar?.hide()
        if(savedInstanceState!=null){
            if(savedInstanceState?.containsKey(KEY_EXTRA_TIME_1 )&& savedInstanceState?.containsKey(KEY_EXTRA_TIME_2)){
                placar1 = savedInstanceState.getInt(KEY_EXTRA_TIME_1)
                placar2 = savedInstanceState.getInt(KEY_EXTRA_TIME_2)
                placar_score_time1.text = placar1.toString()
                placar_score_time2.text = placar2.toString()
            }
        }

        var time1 = intent.getStringExtra(KEY_EXTRA_TIME_1)
        var time2 = intent.getStringExtra(KEY_EXTRA_TIME_2)

        placar_time1.text = time1
        placar_time2.text = time2

        btn_3pontos_time1.setOnClickListener(this)
        btn_3pontos_time2.setOnClickListener(this)

        btn_2pontos_time1.setOnClickListener(this)
        btn_2pontos_time2.setOnClickListener(this)

        btn_1pontos_time1.setOnClickListener(this)
        btn_1pontos_time2.setOnClickListener(this)

        btn_reniciar.setOnClickListener(this)

    }



    override fun onClick(v: View?) {
        if(v==btn_3pontos_time1){
            adicionarPontoTime1(3)
        }
        if(v==btn_2pontos_time1){
            adicionarPontoTime1(2)
        }
        if(v==btn_1pontos_time1){
            adicionarPontoTime1(1)
        }
        if(v==btn_3pontos_time2){
            adicionarPontoTime2(3)
         }
        if(v==btn_2pontos_time2){
            adicionarPontoTime2(2)
        }
        if(v==btn_1pontos_time2){
            adicionarPontoTime2(1)
        }
        if(v==btn_reniciar){
            placar1 =0
            placar2 =0
            placar_score_time1.text = "0"
            placar_score_time2.text = "0"
        }
    }

    private fun adicionarPontoTime2(ponto: Int) {
        placar2 +=ponto
        placar_score_time2.text = placar2.toString()

    }

    private fun adicionarPontoTime1(ponto: Int) {
        placar1 += ponto
        placar_score_time1.text = placar1.toString()

    }


    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        outState?.putInt(KEY_EXTRA_TIME_1,placar1)
        outState?.putInt(KEY_EXTRA_TIME_2,placar1)

    }
}
