fun main(args: Array<String>) {




    val serie1 = ModeloSerie("GOT", 5, "Ficcion", "JJRR")
    val serie2 = ModeloSerie("SHINGE", 4, "Anime", "XIANF")
    val serie3 = ModeloSerie("LOTR", 6, "Ficcion", "JAMES")
    val serie4 = ModeloSerie("Vikings", 8, "Accion", "JDK")
    val serie5 = ModeloSerie("TBBT", 9, "Comedia", "JKROW")
    var serie = arrayOf<ModeloSerie>(serie1, serie2, serie3, serie4, serie5)

    val videoJuego1 = VideoJuego("LOL", 120, "Ficcion", "JJRR")
    val videoJuego2 = VideoJuego("Dota", 75, "Anime", "XIANF")
    val videoJuego3 = VideoJuego("GOW", 45, "Ficcion", "JAMES")
    val videoJuego4 = VideoJuego("ASA", 60, "Accion", "JDK")
    val videoJuego5 = VideoJuego("NFS", 80, "Comedia", "JKROW")
    var videoJuego = arrayOf<VideoJuego>(videoJuego1,videoJuego2,videoJuego3,videoJuego4,videoJuego5)

    var count : Int = 0

    serie[0].entregar()
    serie[3].entregar()

    videoJuego[0].entregar()
    videoJuego[3].entregar()

    for (i in serie.indices){
        if(serie[i].isEntregado()){
            count++
        }
    }
    for (i in videoJuego.indices){
        if(videoJuego[i].isEntregado()){
            count++
        }
    }
    println("Series y videojuegos entregados:")
    println(count)
    println("Series y videojuegos contados, ahora se devuelven")
    for (i in serie.indices){
        if(serie[i].isEntregado()){
            serie[i].devolver()
            count--
        }
    }
    for (i in videoJuego.indices){
        if(videoJuego[i].isEntregado()){
            serie[i].devolver()
            count--
        }
    }
    println(count)







}