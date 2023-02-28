class Decipherer {
    public static String coder(String message) {
       int codeClef = message.length() / 2;
       String codeClefReplace = message.substring(5,5 + codeClef);
       String newCode = codeClefReplace.replace("@#?", " ");
       String leMessage = new StringBuilder (newCode).reverse().toString();       
       
       return leMessage;
    }
    
    public static void main(String[] args) {
        System.out.println(coder("0@sn9sirppa@#?ia'jgtvryko1"));

		System.out.println(coder("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));

		System.out.println(coder("aopi?sedohtém@#?sedhtmg+p9l!"));
        
    }


}