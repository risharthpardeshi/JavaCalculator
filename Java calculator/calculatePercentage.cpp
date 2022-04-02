#include<iostream>
#include<math.h>
using namespace std;

int main(){
    int s1,s2,s3,s4,s5;
    
    cout<<"Enter the value of s1"<< endl;
    cin>>s1;
    cout<<"Enter the value of s2"<< endl;
    cin>>s2;
    cout<<"Enter the value of s3"<< endl;
    cin>>s3;
    cout<<"Enter the value of s4"<< endl;
    cin>>s4;
    cout<<"Enter the value of s5"<< endl;
    cin>>s5;

    float result  =((s1+s2+s3+s4+s5)/200.0f)*100;

    if((s1>15) && (s2>15) && (s3>15) && (s4>15) && (s5>15)){
        cout<<"Congrats you are pass in exam "<<endl;
        cout<<"Your percentage is :" <<result <<"%" ;
    }
    else{
        cout<<"You are fail ";
        cout<<"Better luck next time";
    }
}