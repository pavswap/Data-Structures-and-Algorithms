
class isSorted {
  
    static boolean isSorted(int[] ar, int i) {

        if( i == ar.length - 1) {

            return true;
        }

        if(ar[i] <= ar[i + 1]) {

            return isSorted(ar, i + 1);
        }
        return false;
    }
}
