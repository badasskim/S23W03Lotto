package kr.ac.kumoh.ce.s20190345.s23w03lotto

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class LottoViewModel : ViewModel() {
    private var _numbers = IntArray(6){ 0 };
    val numbers get() = _numbers; //getter method,

    fun generate(){
        var num = 0;
        for(i in _numbers.indices){
            do{
                num = Random.nextInt(1,46);
            }while (_numbers.contains(num))
        _numbers[i] = num;
        Log.i("number!!!", _numbers[i].toString()   )
        }
        _numbers.sort();
    }
}