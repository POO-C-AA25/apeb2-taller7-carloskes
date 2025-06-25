
/**
 * Problema 3 - Sistema de envío de mensajes a móviles
 * Implemente un sistema de envío de mensajes a móviles. Existen dos tipos de 
 * mensajes que se pueden enviar entre móviles, mensajes de texto (SMS) 
 * y mensajes que contienen imágenes (MMS). Por un lado, los mensajes de texto 
 * contienen un mensaje en caracteres que se desea enviar de un móvil a otro. 
 * Por otro lado, los mensajes que contienen imágenes almacenan información 
 * sobre la imagen a enviar, la cual se representará por el nombre del fichero 
 * que la contiene. Independientemente del tipo de mensaje, cada mensaje tendrá 
 * asociado un remitente de dicho mensaje y un destinatario. Ambos estarán 
 * definidos obligatoriamente por un número de móvil, y opcionalmente se podrá 
 * guardar información sobre su nombre. Además, los métodos enviarMensaje y 
 * visualizarMensaje deben estar definidos.
 *
 * Note
 *
 * Para probar el diseño jerarquico de clases, instancia en el clase de prueba 
 * Ejecutor, con datos ficticios.
 *
 * @author Carlos Correa
 */
public class Problema3_Mensaje {

    public class Movil {

        public String numero;
        public String nombre;
    }

    public class Mensaje {

        public Movil remitente;
        public Movil destinatario;

        public void enviarMensaje() {
        }

        public void visualizarMensaje() {
        }
    }

    public class SMS extends Mensaje {

        public String texto;

        @Override
        public void enviarMensaje() {
        }

        @Override
        public void visualizarMensaje() {
        }
    }

    public class MMS extends Mensaje {

        public String nombreArchivoImagen;

        @Override
        public void enviarMensaje() {
        }

        @Override
        public void visualizarMensaje() {
        }
    }
}
