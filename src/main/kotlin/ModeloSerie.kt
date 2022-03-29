open class ModeloSerie : Entregable {
    var titulo: String = ""
    var num_Temp: Int = 3
    var entregado: Boolean = false
    var genero: String = ""
    var creador: String = ""

    constructor()
    constructor(titulo: String, creador: String) {
        this.titulo = titulo
        this.creador = creador
    }

    constructor(titulo: String, num_Temp: Int, genero: String, creador: String) {
        this.titulo = titulo
        this.num_Temp = num_Temp
        this.genero = genero
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