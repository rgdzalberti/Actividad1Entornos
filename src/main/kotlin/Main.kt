class InteractuadorLista(lista:List<Int>){

    val lista = lista

    fun sumar(){
        lista.sum()
    }

    fun mayorValor(){
        lista.maxOrNull()
    }

    fun ordenar(){
        lista.sorted()
    }

    fun menorValor(){
        lista.minOrNull()
    }


}

fun main() {

}