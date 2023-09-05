import java.util.*;
public class matrix
{
    void encrypt(String text)
    {
        String newtext="";
        int k=0,i=0,j=0;
        System.out.println("Original Text : "+text);
        int lim=(int)(Math.ceil(Math.sqrt(text.length())));
        for(i=0;i<lim*lim;i++)
        {
            text=text+'x';
        }
        System.out.println("Processing Text : "+text);
        System.out.println("Matrix : ");
        char ch[][]=new char[lim][lim];
        for(i=0;i<lim;i++)
        {
            for(j=0;j<lim;j++)
            {
                ch[i][j]=text.charAt(k);
                ++k;
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<lim;i++)
        {
            for(j=0;j<lim;j++)
            {
                newtext = newtext+ch[j][i];
            }
        }
        System.out.println("Encrypted Text : "+newtext);
    }
    void decrypt(String text)
    {
        System.out.println("Original Text : "+text);
        int i=0,j=0,k=0,l=text.length(),flag=0;
        int x=(int)(Math.sqrt(l));
        char ch[][]=new char[x][x];
        for(i=0;i<x;i++)
        {
            for(j=0;j<x;j++)
            {
                ch[j][i]=text.charAt(k);
                ++k;
            }
        }
        System.out.println("Processing Text.....");
        System.out.println("Matrix : ");
        String newc="";
        for(i=0;i<x;i++)
        {
            for(j=0;j<x;j++)
            {
                System.out.print(ch[i][j]);
                newc+=ch[i][j];
            }
            System.out.println();
        }
        for(i=0;i<newc.length()-1;i++)
        {
            if(newc.charAt(i)=='x'&&newc.charAt(i+1)=='x')
                break;
        }
        System.out.println("Decrypted Text : "+newc.substring(0, i+1));
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        matrix ob =  new matrix();
        int ch;
        String str;
        System.out.print("Enter your choice\n1:Encryption\n2:Decryption\nYour choice : ");
        ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter your Original String : ");
            str=sc.next();
            ob.encrypt(str);
        }
        else{
            System.out.println("Enter your Original String : ");
            str=sc.next();
            ob.decrypt(str);
        }
        sc.close();
    }
}