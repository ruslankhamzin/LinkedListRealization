package com.example.linkedlistrealize;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListRealizeApplicationTests {

    private CustomLinkedList linkedList;

    @BeforeEach
    public void setUp() {
        linkedList = new CustomLinkedList();
    }

    @Test
    public void testPutAndGet() {
        linkedList.put(1);
        linkedList.put(2);
        linkedList.put(3);

        assertEquals(1, linkedList.get(0));
        assertEquals(2, linkedList.get(1));
        assertEquals(3, linkedList.get(2));
    }

    @Test
    public void testDelete() {
        linkedList.put(1);
        linkedList.put(2);
        linkedList.put(3);

        assertTrue(linkedList.delete(2));
        assertFalse(linkedList.delete(4));

        assertEquals(1, linkedList.get(0));
        assertEquals(3, linkedList.get(1));
    }

    @Test
    public void testGetOutOfBounds() {
        linkedList.put(1);
        Assert.assertThrows(IndexOutOfBoundsException.class, () -> linkedList.get(1));
    }

    @Test
    public void testReverse() {
        linkedList.put(1);
        linkedList.put(2);
        linkedList.put(3);

        linkedList.reverse();
        assertEquals(3, linkedList.get(0));
        assertEquals(2, linkedList.get(1));
        assertEquals(1, linkedList.get(2));
        linkedList.display();
    }


}
