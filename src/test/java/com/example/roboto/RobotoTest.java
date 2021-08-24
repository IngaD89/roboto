package com.example.roboto;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RobotoTest {
    @Test
    void robotoDevuelveSaludo() {

        Roboto roboto = new Roboto();
        String respuesta = roboto.respuesta("Hola Roboto!");
        assertThat(respuesta, equalTo("Hola a ti tambien"));
    }

    @Test
    void robotoDevuelveRespuesta() {

        Roboto roboto = new Roboto();
        String respuesta = roboto.respuesta("¿Qué tiempo hace en Madrid?");

        assertThat(respuesta, equalTo("Te vas a Madrid y lo miras"));
    }

    @Test
    void robotoEstaEncantadoDeConoserse() {

        Roboto roboto = new Roboto();
        String respuesta = roboto.respuesta("Me llamo Luisa.");

        assertThat(respuesta, equalTo("encantada de conocerme, Luisa."));
    }

    @Test
    void robotoSabeCualEsElMejor() {

        Roboto roboto = new Roboto();
        String respuesta = roboto.respuesta("¿Qué es mejor, Mac o Linux?");

        assertThat(respuesta, equalTo("Sin duda Mac es mejor que Linux"));
    }

    @Test
    void robotoSabeCalcular() {

        Roboto roboto = new Roboto();
        String respuesta = roboto.respuesta("¿Cuánto es 2+2?");

        assertThat(respuesta, equalTo("La respuesta es 4"));
    }


    @Test
    void robotoSabeCualEsElMejor2() {

        Roboto roboto = new Roboto();
        String respuesta = roboto.respuesta("¿Qué es mejor, React o Vue?");

        assertThat(respuesta, equalTo("Sin duda React es mejor que Vue"));
    }
}
