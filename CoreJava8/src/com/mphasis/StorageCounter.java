package com.mphasis;
import java.lang.Runnable;
public class StorageCounter {
		private int x;
		public StorageCounter(int X) { x=X; }
		public int GetX() { return(x); }
		public StorageCounter(StorageCounter s) { this.x = s.GetX(); }

		}
		class Printer implements Runnable

		{

		private StorageCounter storage;
		Printer(StorageCounter s) { storage = new StorageCounter(s); }
		public void run()

		{

		System.out.println(storage.GetX());

		}

		}



		class Counter implements Runnable

		{

		private int N;



		public Counter(int n) { N=n; }

		public int GetN() { return(N); }



		public void run()

		{

		for (int iLoop=1; iLoop<=N; iLoop++)

		{

		StorageCounter storage = new StorageCounter(iLoop);

		Printer printer = new Printer(storage);

		Thread.yield();

		printer.run();

		}



		}



		}


