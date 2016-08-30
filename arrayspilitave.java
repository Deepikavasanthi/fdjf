Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();int i,l=1,c,c1,m=0,sum1=0,sum=0; 
    int[] a=new int[n];
    for(i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    while(l<=4)
    {c=0;c1=0;sum=0;sum1=0;
        for(i=0;i<l;i++)
        {c++;
            sum+=a[i];
        }
       for(int k=i;k<5;k++)
        {c1++;
            sum1+=a[k];
        }
  
        sum=sum/c;
         sum1=sum1/c1;
        if(sum==sum1)
        {m++;
            System.out.println("\n");
             for(i=0;i<l;i++)
        {
          System.out.print(""+a[i]);
        }  System.out.print("  ");
        for(int k=i;k<5;k++)
        {
          System.out.print(""+a[k]);
        } }
       l++;
        }
    if(m==0)
            System.out.println("not possible");
    }
    