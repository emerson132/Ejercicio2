open class VideoJuego : Entregable{
    var titulo: String = ""
    var horas_estimadas: Int = 10
    var entregado: Boolean = false
    var genero: String = ""
    var creador: String = ""

    constructor()
    constructor(titulo: String, horas_estimadas: Int){
        this.titulo = titulo
        this.horas_estimadas = horas_estimadas
    }
    constructor(titulo: String, horas_estimadas: Int, genero: String, creador: String){
        this.titulo = titulo
        this.horas_estimadas = horas_estimadas
        this. genero = genero
        this.creador = creador
    }
    override fun entregar() {
        entregado = true

    }

    override fun devolver() {
        entregado = false
    }

    override fun isEntregado(): Boolean {
        return entregado
    }
}