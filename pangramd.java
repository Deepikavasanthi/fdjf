Scanner sc=new Scanner(System.in); 
        String s=sc.nextLine(); 
       char[] a=new char[26];int j,k=0,l=0,x=1,y=1; char[] b=new char[26];char[] c=new char[26]; 
       for(char i='a';i<='z';i++){
          a[k]=i;
          k++;}
       for(char i='A';i<='Z';i++){
          b[l]=i;
          l++;}
       c=s.toCharArray();int m=c.length;
       for(int i=0;i<m;i++){
       int t=c[i];
       if(t>64&&t<90){
           for(j=0;j<26;j++){
               if(c[i]==b[j]){
                   b[j]='\0';}
           }}else if(t>96&&t<122){ for(j=0;j<26;j++){
               if(c[i]==a[j]){
                   a[j]='\0';}}}}
       for(int i=0;i<26;i++){
          if(a[i]=='\0')
          { x++;  }}
       for(j=0;j<26;j++){
    if(b[j]=='\0'){
        y++;}}
if(x==26||y==26){
    System.out.println("pangram");    
}else{
    System.out.println("not panagram");
}