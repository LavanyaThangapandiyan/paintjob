package bucketcount;

import java.util.Scanner;
class Bucket
   {   
	  	 static int getBucketCount(double width, double height, double areaPerBucket)
	  		 {
	  		if(width <= 0 || height <= 0 || areaPerBucket <= 0)
	         {
	            return -1;
	         }
	  		
	        int numOfBuckets = (int) Math.ceil((width * height) / areaPerBucket);
	        return numOfBuckets;
	  		 }
   
	  	static int getBucketCount(double area, double areaPerBucket)
	  		   {
	  	        
	  	        if(area <= 0 || areaPerBucket <= 0)
	  	        {
	  	            return -1;
	  	        }
	  	       
	  	        int numOfBuckets = (int) Math.ceil(area / areaPerBucket);
	  	        return numOfBuckets;
	  		}
	  	public class Paint {
	  		 public static void main (String[]args)
	  		 {
	  		 double w,h,ab,a;
	  		 int cal;
	  		 int n;
	  		 Scanner sc=new Scanner(System.in);
	  		 System.out.println("1.If you Know the Height and Width Please Enter1\n2. if Not Please Enter 2");
	  		 n=sc.nextInt();
	  		 if(n==1) 
				{	
	  			     System.out.println("Enter the Weight");
					 w=sc.nextDouble();
					 System.out.println("Enter the Height");
					 h=sc.nextDouble();
					 System.out.println("Enter the Area Per Bucket");
					 ab=sc.nextDouble();
					 Bucket obj=new Bucket();
					 cal=obj.getBucketCount(w,h,ab);
					 System.out.println((cal));
		
					 
				}
	  		 else if(n==2)
	  		 {
	  		 System.out.println("Enter the area of Wall");
	  		 a=sc.nextDouble();
	  		 System.out.println("Enter the area per bucket");
	  		 ab=sc.nextDouble();
	  		 Bucket obj=new Bucket();
			 cal=obj.getBucketCount(a,ab);
			 System.out.println((cal));
	  		 }
	  		 else {
	  			 System.out.println("Error");
	  		 }
	  		 
	  	}
	  	}
   }
  
