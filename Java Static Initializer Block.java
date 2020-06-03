 

        static int B,H;
        static boolean flag;
        static
	{
            Scanner sc=new Scanner(System.in);
            B=sc.nextInt();
            H=sc.nextInt();
            flag=false;
            if((B>=0) && (H>=0))
            {
                flag=true;
                //break;
            }
            else
                System.out.print("java.lang.Exception: Breadth and height must be positive");
        }