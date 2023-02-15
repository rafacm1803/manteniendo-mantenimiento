package org.mps.RafaCeballos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    /*
     * Inicializamos las variables de tipo persona para usarlas a la hora de los tests
     */
    Person persona1;
    Person persona2;
    Person persona3;
    Person persona4;
    Person persona5;
    Person persona6;
    Person persona7;
    List<Person> personas = new ArrayList<>();
    @BeforeEach

    public void nuevo(){
        persona1 = new Person("Rafa",20,"Male");
        persona2 = new Person("Alberto",21,"Male");
        persona3 = new Person("Ramon",19,"Male");
        persona4 = new Person("Alba",40,"Female");
        persona5 = new Person("Maria",41,"Female");
        persona6 = new Person("Alice",39,"Female");
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);
        personas.add(persona6);
    }
    @Test
    /*
     * Test que comprueba si devuelve el nombre correcto
     */
    public void testName(){
    assertEquals("Rafa",persona1.name());
    assertEquals("Alba",persona4.name());
    }

    @Test
    /*
     * Test que comprueba si devuelve la edad correcta
     */
    public void testAge(){
        assertEquals(20,persona1.age());
        assertEquals(40,persona4.age());
    }

    @Test
    /*
     * Test que comprueba si devuelve el genero correcto
     */
    public void testGender(){
        assertEquals("Male",persona1.gender());
        assertEquals("Female",persona4.gender());
    }

    @Test
    /*
     * Test que comprueba si lanza una excepcion en caso de que el genero no sea Male o Female
     */
    public void testGenderErr(){
        assertThrows(RuntimeException.class,()->{new Person("Rafael",10,"m");});
    }

    @Test
    /*
     * Test que comprueba si lanza una excepcion en caso de que la edad no sea correcta
     */
    public void testAgeErr(){
        assertThrows(RuntimeException.class,()->{new Person("Rafael",-1,"m");});
        assertThrows(RuntimeException.class,()->{new Person("Rafael",0,"m");});
    }

    @Test
    /*
     * Test que comprueba si lanza una excepcion en caso de que el genero no sea Male o Female
     */
    public void testNameErr(){
        assertThrows(RuntimeException.class,()->{new Person("",10,"m");});
        assertThrows(RuntimeException.class,()->{new Person(null,10,"m");});
    }

    @Test
    /*
     * Test que comprueba la funcion averageAgePerGender
     */
    public void testAverageAge(){
        assertEquals(20,Person.averageAgePerGender(personas)[0]);
        assertEquals(40,Person.averageAgePerGender(personas)[1]);
    }
}