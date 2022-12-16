

class Solution {
public int reverse(int x) {
long ansLong = 0;
int ansInt = 0;
while(x != 0) {
ansLong = ansLong * 10 + x % 10;
x /= 10;
}
if(ansLong > Integer.MAX_VALUE || ansLong < Integer.MIN_VALUE) return 0;
else {
ansInt = (int)ansLong;
return ansInt;
}
}
}
