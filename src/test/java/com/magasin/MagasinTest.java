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
        Item[] items = new Item[] {new Item("Whatever1", 20, 60), new Item("Whatever2", 20, 20), new Item("Whatever3", -20, 30)};
        Magasin magasin = new Magasin(items);
        magasin.updateQuality();

        assertEquals(19, magasin.items[0].sellIn);
        assertEquals(59, magasin.items[0].quality);

        assertEquals(19, magasin.items[1].sellIn);
        assertEquals(19, magasin.items[1].quality);

        assertEquals(-21, magasin.items[2].sellIn);
        assertEquals(28, magasin.items[2].quality);
    }

    @Test
    void testComte(){
        Item[] items = new Item[] {new Item("Comté", 20, 30), new Item("Comté", -10, 40)};
        Magasin magasin = new Magasin(items);
        magasin.updateQuality();

        assertEquals(19, magasin.items[0].sellIn);
        assertEquals(31, magasin.items[0].quality);

        assertEquals(-11, magasin.items[1].sellIn);
        assertEquals(42, magasin.items[1].quality);
    }

    @Test
    void testKrypto(){
        Item[] items = new Item[] {new Item("Kryptonite", 20, 30)};
        Magasin magasin = new Magasin(items);
        magasin.updateQuality();

        assertEquals(20, magasin.items[0].sellIn);
        assertEquals(30, magasin.items[0].quality);

    }

    @Test
    void testPass(){
        Item[] items = new Item[] {new Item("Pass VIP Concert", 20, 30), new Item("Pass VIP Concert", 8, 30), new Item("Pass VIP Concert", 2, 30), new Item("Pass VIP Concert", -20, 30)};
        Magasin magasin = new Magasin(items);

        magasin.updateQuality();

        assertEquals(19, magasin.items[0].sellIn);
        assertEquals(31, magasin.items[0].quality);

        assertEquals(7, magasin.items[1].sellIn);
        assertEquals(32, magasin.items[1].quality);

        assertEquals(1, magasin.items[2].sellIn);
        assertEquals(33, magasin.items[2].quality);

        assertEquals(-21, magasin.items[3].sellIn);
        assertEquals(0, magasin.items[3].quality);

    }

}
