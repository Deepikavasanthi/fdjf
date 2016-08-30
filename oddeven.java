   Scanner sc=new Scanner(System.in);
int n=sc.nextInt();char  t;
    char[] c=new char[n];
for(int i=0;i<n;i++){
    c[i]=sc.next().charAt(0);}
    for(int i=0;i<n;i++){
        t=c[i];
        c[i]=c[i+1];
        c[i+1]=t;        
        i=i+1;
        t=' ';
       }for(int i=0;i<n;i++){
           System.out.println(c[i]);
                   
       }