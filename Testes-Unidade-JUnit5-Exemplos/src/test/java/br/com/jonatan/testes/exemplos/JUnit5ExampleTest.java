package br.com.jonatan.testes.exemplos;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test; 


@DisplayName("JUnit 5 Example")
class JUnit5ExampleTest {
 
	
	
    @BeforeAll
    static void beforeAll() {
        System.out.println("  Antes de tudo! OBJETIVO: Inicializar os recursos internos!");
    }
 
    @BeforeEach
    void beforeEach() {
        System.out.println("Antes de cada teste o metodo: '@BeforeEach' será chamado");
    }
 
    @AfterEach
    void afterEach() {
        System.out.println("Após cada teste o metodo '@AfterEach' será chamado");
    }
 
    @AfterAll
    static void afterAll() {
        System.out.println("   depois de tudo! OBJETIVO: Finalizar os recursos internos!");
    }
    
    
    
    
 
    @Test
    @DisplayName("First test")
    void firstTest() {
        System.out.println("Primeiro metodo testado");
    }
 
    @Test
    @DisplayName("Second test")
    void secondTest() {
        System.out.println("Segundo metodo testado");
    }
	
	
}
