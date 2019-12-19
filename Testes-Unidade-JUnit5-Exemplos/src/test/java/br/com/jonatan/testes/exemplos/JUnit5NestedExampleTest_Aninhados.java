package br.com.jonatan.testes.exemplos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll; 
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Nested Examplos TESTES ANINHADOS")
public class JUnit5NestedExampleTest_Aninhados {
	
	
	//configuração dos testes de integração e unidade com os metodos do JUnit 5
	
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
        System.out.println("Depois de cada teste o metodo: '@AfterEach' será chamado");
    }
 
    @AfterAll
    static void afterAll() {
        System.out.println("   depois de tudo! OBJETIVO: Finalizar os recursos internos!");
    }
    
    
    
    //
 
    @Nested
    @DisplayName("Testes do metodo A")
    class A {
 
        @BeforeEach
        void beforeEach() {
            System.out.println("Antes de cada teste do metodo A");
        }
 
        @AfterEach
        void afterEach() {
            System.out.println("Depois de cada teste do metodo A");
        }
        
        
 
        @Test
        @DisplayName("2 + 2 = 4")
        void sampleTestForMethodA() {
            System.out.println("executando o teste do metodo A");
            assertEquals(4, 2 + 2);
        }
        
        
 
        @Nested
        @DisplayName("Testes do metodo B")
        class B {
 
            @BeforeEach
            void beforeEach() {
                System.out.println("Antes de cada teste do metodo B");
            }
 
            @AfterEach
            void afterEach() {
                System.out.println("Depois de cada teste do metodo B");
            }
 
            @Test
            @DisplayName("1 + 1 = 2")
            void sampleTestForMethodAWhenX() {
                System.out.println("Executando o teste do metodo B");
                assertEquals(2, 1 + 1);
            }
        }
        
        
        
        
        @Nested
        @DisplayName("Testes do metodo C")
        class C {
 
            @BeforeEach
            void beforeEach() {
                System.out.println("Antes de cada teste do metodo C");
            }
 
            @AfterEach
            void afterEach() {
                System.out.println("Depois de cada teste do metodo c");
            }
 
            @Test
            @DisplayName("3 + 3 = 6")
            void sampleTestForMethodAWhenX() {
                System.out.println("Executando o teste do metodo c");
                assertEquals(6, 3 + 3);
            }
        }
        
        
        
        
        
        
    }
	
	

}
