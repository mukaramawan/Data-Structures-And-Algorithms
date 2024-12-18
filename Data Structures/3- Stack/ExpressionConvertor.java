package dsa;

public class ExpressionConvertor {
    
    public String infixToPostfix(String exp){
        int size=exp.length();
       Stack s=new Stack(size);
        String Cexp="";
        
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            
            if(ch=='('){
            s.push('(');
            }
            else if(Character.isLetterOrDigit(ch)){
            Cexp=Cexp+ch;
            }
            else if(ch==')'){
                while(!s.isEmpty() && (char)s.peek()!='('){
                    Cexp=Cexp+s.pop();
                }
                if((char)s.peek()=='(')
                    s.pop();
            }
            else{
                while(!s.isEmpty() && checkPrecedence(ch)< checkPrecedence((char)s.peek())){
                    Cexp=Cexp+s.pop();
                }
                s.push(ch);
            }
            
        }
        
        while(!s.isEmpty())
            Cexp=Cexp+s.pop();
        
        return Cexp;
        
    }
    
    public int checkPrecedence(char op){
        if(op=='^')
            return 3;
        else if(op=='*' || op=='/' ||op=='%')
            return 2;
        else if(op=='+' || op=='-')
            return 1;
        else 
            return 0;
    }

    public String infixToPrefix(String exp){
    
    String revExp="";
    String Cexp="";
    
    for(int i=exp.length()-1;i>=0;i--){
        char ch=exp.charAt(i);
        
        if(ch=='(')
            revExp=revExp+')';
        else if(ch==')')
            revExp=revExp+'(';
        else
            revExp=revExp+ch;
    }
    
    Cexp=infixToPostfix(revExp);
    
    String con = "";
        for(int i = Cexp.length()-1; i>=0; i--)
        con = con+Cexp.charAt(i);
    
    return con;
    
    }
}
