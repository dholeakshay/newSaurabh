class array {

    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'C'};
        int[] intArray = {3, 2, 1};

        for (int i = 0; i < charArray.length; i++) {
            for (int j = charArray.length; j > 0; j--){
                System.out.print(charArray[i] + " "+intArray[j]+" ");

            }
        }
    }
}
