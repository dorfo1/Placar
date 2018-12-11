package rodolfo.com.br.placar.ui.time

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import kotlinx.android.synthetic.main.activity_times.*
import rodolfo.com.br.placar.R
import rodolfo.com.br.placar.ui.placar.PlacarActivity
import rodolfo.com.br.placar.ui.placaraac.PlacarAACActivity
import rodolfo.com.br.placar.utils.KEY_EXTRA_TIME_1
import rodolfo.com.br.placar.utils.KEY_EXTRA_TIME_2

class TimesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_times)

        times_btn_iniciar.setOnClickListener({
            val time1 = times_time1.text.toString()
            val time2 = times_time2.text.toString()
            if(!time1.isEmpty() && !time2.isEmpty()){
                val intent = Intent(this, PlacarAACActivity::class.java)
                val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this,times_btn_iniciar,"transicao")
                intent.putExtra(KEY_EXTRA_TIME_1,time1)
                intent.putExtra(KEY_EXTRA_TIME_2,time2)
                startActivity(intent,options.toBundle())
            }
//            Toast.makeText(this,"Teste",Toast.LENGTH_LONG).show();
        })
    }
}


