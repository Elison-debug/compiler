package p;

import org.junit.*;

import p.A;

import static org.junit.Assert.*;
public class testA {
    @Test
    public void testm() {
        assertEquals(5, A.m());
        System.out.println("Hello, World!");
    }
}
