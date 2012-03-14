#ifndef QUEUE_H
#define QUEUE_H

class Queue {
    int size;
    int growthSize;
    int first, last;
    int next(int pos);
    int * contents;
    void grow();
//    void grow(int increment);
    public:
    Queue();
    Queue(int initSize);
//    Queue(int initSize, int initGrowthSize);
    ~Queue();
//    void copy(Queue * to);
    void insert(int el);
    bool extract(int & el);
};

#endif
