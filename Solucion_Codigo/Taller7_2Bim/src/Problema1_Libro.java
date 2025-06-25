
/**
 * Problema 1 - Jerarquía de clases para el capítulo de libro
 * Dibujad un diagrama de clases que muestre la estructura de un capítulo de libro;
 * un capítulo está compuesto por varias secciones, cada una de las cuales
 * comprende varios párrafos y figuras. Un párrafo incluye varias sentencias,
 * cada una de las cuales contiene varias palabras.
 *
 * Note
 *
 * Suponga que en un futuro se prevé que el sistema gestione además de párrafos
 * y figuras otros componentes, como tablas, listas, viñetas, etc.
 * Suponga además que una palabra puede aparecer en varias sentencias.
 *
 * @author Carlos Correa
 */
public class Problema1_Libro {

    public class Palabra {

        public String texto;
    }

    public class Sentencia {

        public Palabra[] palabras;
    }

    public class Parrafo extends Contenido {

        public Sentencia[] sentencias;
    }

    public class Figura extends Contenido {

        public String descripcion;
    }

    public class Contenido {

        public String tipo;
    }

    public class Seccion {

        public Contenido[] contenidos;
    }

    public class Capitulo {

        public Seccion[] secciones;
    }
}
