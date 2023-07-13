public class problem {
    public static void main(String[] args) {
        public boolean mixStart(String str) {
            if(str.length()<3) return false;
            String two=str.substring(1,3);

            return(two.equals("ix"));
        }


    }
}
