Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=new StringBuffer(s).reverse().toString();
        System.out.println(s1);
        int l=s.length();
        char[] c=new char[l];
         c=s.toCharArray();
         for(int i=0;i<l;i++){
            if(c[i]!='a'&&c[i]!='e'&&c[i]!='i'&&c[i]!='o'&&c[i]!='u'&&c[i]!='A'&&c[i]!='E'&&c[i]!='I'&&c[i]!='O'&&c[i]!='U'){
                System.out.print(c[i]);    
            } continue;
         }