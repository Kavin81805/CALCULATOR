#include <iostream>
using namespace std;


int main(){ 

    double n1,n2;
    char op;
    cout<<"Enter First number :";
    cin>>n1;
    cout<<"Enter the operator (+ , - , * , /) :";
    cin>>op;
    cout<<"Enter Second number :";
    cin>>n2;

    switch (op) {
    case '+':
        cout<<n1<<"+"<<n2<<" = "<<n1+n2<<endl;
        break;
    
    case '-':
        cout<<n1<<"-"<<n2<<"= "<<n1-n2<<endl;
        break;
    case '*':
        cout<<n1<<"X"<<n2<<"="<<n1*n2<<endl;
        break;
    case '/':
        if (n2 !=0){
        cout<<n1<<"/"<<n2<<"="<<n1/n2<<endl;
        }
        else{
        cout<<"Error : Division by 0 is not allowed."<<endl;
        }
        break;

        default:
        cout<<"Error : Invalid operator."<<endl;
        break;
    }
       return 0;
}

    

