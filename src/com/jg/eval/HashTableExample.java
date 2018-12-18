package com.jg.eval;

import java.util.Arrays;

import org.apache.log4j.Logger;

/**
 * 
 * Java program to implement Hash Table
 * 
 **/

class HashTableExample

{
	static Logger log = Logger.getLogger(HashTableExample.class.getName() );
	int[] arr;

	int capacity;

	/** constructor **/

	public HashTableExample(int capacity)

	{

		this.capacity = nextPrime(capacity);

		arr = new int[this.capacity];
		log.info("int capacity->" + Arrays.toString(arr) );

	}

	/** function to insert **/

	public void insert(int ele)

	{
		log.info("Before insert->" + arr[ele % capacity]);
		arr[ele % capacity] = ele;
		log.info("After insert->" + arr[ele % capacity]);
	}

	/** function to clear **/

	public void clear()

	{

		arr = new int[capacity];

	}

	/** function contains **/

	public boolean contains(int ele)

	{

		return arr[ele % capacity] == ele;

	}

	/** function to delete **/

	public void delete(int ele)

	{

		if (arr[ele % capacity] == ele)

			arr[ele % capacity] = 0;

		else

			log.info("\nError : Element not found\n");

	}

	/** Function to generate next prime number >= n **/

	private static int nextPrime(int n)

	{

		if (n % 2 == 0)

			n++;

		for (; !isPrime(n); n += 2)
			;

		return n;

	}

	/** Function to check if given number is prime **/

	private static boolean isPrime(int n)

	{

		if (n == 2 || n == 3)

			return true;

		if (n == 1 || n % 2 == 0)

			return false;

		for (int i = 3; i * i <= n; i += 2)

			if (n % i == 0)

				return false;

		return true;

	}

	/** function to print hash table **/

	public void printTable()

	{

		log.info("\nHash Table = ");

		for (int i = 0; i < capacity; i++)

			log.info(arr[i] + " ");

	}

}