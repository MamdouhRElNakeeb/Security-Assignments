#include <iostream>
#include <vector>
#include <sstream>
#include <math.h>

using namespace std;

int main(){

    int length = 0;
    string keyLine = "";
    string message = "";
    cin >> length;
    cin.ignore();
    getline(cin, keyLine);
    getline(cin, message);

    stringstream ss(keyLine);
    vector<long long> keys;
    int n;

    while(ss >> n){
        keys.push_back(n);
    }

    int k = 0;
    int dim = (int) sqrt(length);

    vector<vector<long long> > keyMatrix(dim, vector<long long> (dim));

    for (int i = 0; i < dim; i++){
        for (int j = 0; j < dim; j++){
            keyMatrix[i][j] = keys[k];
            k++;
        }
    }

    string encrypted = "";
    vector<long long> vectors(dim);
    long long rounds = (long long) ceil((double) message.length() / (double) dim);
    
    while (message.length() % dim != 0){
        message += 'X';
    }

    for (int i = 0; i < rounds; i++){
        for (int j = 0; j < dim; j++){
            vectors[j] = ((long long) message[i * (int) dim + j]) - 65;
        }

        vector<long long> cipherMatrix(dim);

        for (int i = 0; i < dim; i++){
            for (int j = 0; j < dim; j++){
                cipherMatrix[i] += keyMatrix[i][j] * vectors[j];
            }
            cipherMatrix[i] = cipherMatrix[i] % 26;
        }

        for (int j = 0; j < dim; j++){
            encrypted += (char) (cipherMatrix[j] + 65);
        }
    }
    
    cout << encrypted << endl;
}
