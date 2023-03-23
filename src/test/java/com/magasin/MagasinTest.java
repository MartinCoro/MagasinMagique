package com.magasin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    @Test
    void testGeneral(){
        Item general1 = new Item("Whatever1", 20, 60);
        Item general2 = new Item("Whatever2", 20, 20);
        Item general3 = new Item("Whatever3", -20, 30);
        Item[] items = new Item[] {new Item("Whatever1", 20, 60), new Item("Whatever2", 20, 20), new Item("Whatever3", -20, 30)};
        Magasin magasin = new Magasin(items);
        magasin.updateQuality();

        assertEquals(19, magasin.items);
    }

}
