#include <iostream>

using namespace std;

int main(){

    long shift = 0;
    string msg = "", encMsg = "";

    cin >> shift;
    cin >> msg;

    for (int i = 0; i < msg.length(); i++){
        int charAscii = 65 + ((int) msg[i] - 65 + shift) % 26;
        encMsg += (char) charAscii;
    }

    cout << encMsg;

    return 0;
}