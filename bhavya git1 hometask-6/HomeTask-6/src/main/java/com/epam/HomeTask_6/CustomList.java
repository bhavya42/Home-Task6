package com.epam.HomeTask_6;
import java.util.Arrays;

public class CustomList<C> {
private int size = 0;
	     private static final int DEFAULT_CAPACITY = 10;
	     private Object elements[];
	     public CustomList() {
	        elements = new Object[DEFAULT_CAPACITY];
	    }
	 
	    public void add(C c) {
	        if (size == elements.length) {
	            increaseCapacity();
	        }
	        elements[size++] = c;
	    }
	    
	    private void increaseCapacity() {
	        int newSize = elements.length * 2;
	        elements = Arrays.copyOf(elements, newSize);
	    }
	    
	    @SuppressWarnings("unchecked")
	    public C get(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        return (C) elements[i];
	    }
	     
	    @SuppressWarnings("unchecked")
	    public C remove(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object item = elements[i];
	        int numElts = elements.length - ( i + 1 ) ;
	        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
	        size--;
	        return (C) item;
	    }
	     
	    public int size() {
	        return size;
	    }
	     
	    @Override
	    public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         sb.append('[');
	         for(int i = 0; i < size ;i++) {
	             sb.append(elements[i].toString());
	             if(i<size-1){
	                 sb.append(",");
	             }
	         }
	         sb.append(']');
	         return sb.toString();
	    }
	    
	}



