
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
package com.agungsetiawan.interview.stack;
 
import java.util.ArrayList;
import java.util.List;
 

public class Stack {
    
    private List<Object> list=new ArrayList<Object>();
    private int currentIndex=-1;
    
    public void push(Object object){
        list.add(object);
        currentIndex++;
    }
    
    public Object pop(){
        Object object=list.remove(currentIndex);
        currentIndex--;
        return object;
    }
    
    public int count(){
        return list.size();
    }
    
    public Object peek(){
        return list.get(currentIndex);
    }
    
    public void clear(){
        list.clear();
        currentIndex=-1;
    }
    
}
