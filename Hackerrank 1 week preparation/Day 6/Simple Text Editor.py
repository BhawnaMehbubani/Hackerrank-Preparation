# Enter your code here. Read input from STDIN. Print output to STDOUT
n=int(input())
s = ''
stack=[]


while n:
    val= input().split()
    if val[0] == '1':
        s += val[1] # Ok
        stack.append(s)


    elif val[0] == '2':
        s=s[0:len(s)-int(val[1])]
        stack.append(s)



    elif val[0] == '3':
        print(s[int(val[1])-1]) # Ok

    else:
        stack.pop()
        if len(stack)>0:
            s=stack[-1]
        else:
            s=''
    n-=1