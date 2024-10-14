class Solution {
    public String reverseWords(String s) {
        char [] sArray = s.toCharArray();

        int left = 0;
        int right = 0;

        while(right < sArray.length){
            if(sArray[right] == ' '){
                reverse(sArray,left, right -1);
                left = right + 1;
            };

            right ++;

        }

        reverse(sArray,left,right-1);

        return new String(sArray);
    }

    public void reverse( char [] sArray, int left, int right){
       while(left < right){
        char temp = sArray[left];
        sArray[left ++] = sArray[right];

        sArray[right --] = temp;
       }
    }
}
