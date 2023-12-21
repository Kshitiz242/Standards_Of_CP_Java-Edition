#THIS CODE IS TO BE DEBUGGED FOR THE EDGE CASE IT FAILS(LATER)
t=int(input())
while(t):
    L=list(map(int,input().split()))
    L2=list(map(int,input().split())) #JELLYFISH'S APPLES
    L3=list(map(int,input().split())) #GELLYFISH'S APPLES
    n= L[0]
    m= L[1]
    k= L[2]  
    j_min= min(L2)
    j_max = max(L2)
    g_min = min(L3)
    g_max= max(L3)
    weight = 0 
    if (j_min < g_max and g_min>=j_min) : #Only J tries to swap
        if k % 2 == 0:
            weight = sum(L2)  #G retains his own apples
        else:
            weight = sum(L2) + (g_max - j_min)
    elif(j_min < g_max and g_min<j_min):
        if k%2==1:
            weight = sum(L2) + g_max - j_min
        else:
            weight = sum(L2) - j_min + g_min
    elif(g_min==j_min and g_max==j_max and j_min==j_max):
        weight = sum(L2)
    elif(j_min>=g_max):                       #only G tries to swap
        if k % 2 == 1:
            weight = sum(L2) 
        else:
            weight = sum(L2) + (g_min-j_max) 
    
    print(weight)
    t-=1
