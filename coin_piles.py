t=int(input())
while(t):
    L=list(map(int,input().split(" ")))
    a=L[0]
    b=L[1]
    if(((a==0 or b==0) and a!=b)):
        print("NO")
    elif(a>2*b or b>2*a or (a+b)%3!=0):
        print("NO")
    elif((a==b and a%3==0) or (a==2*b or b==2*a)):
        print("YES")
    else:
        temp1=a
        temp2=b
        a=max(temp1,temp2)
        b=min(temp1,temp2)
        k=abs(a-2*b)
        if(k%3==0):
            print("YES")
        else:
            print("NO")
    t-=1