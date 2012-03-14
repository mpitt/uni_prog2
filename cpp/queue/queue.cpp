#include "queue.h"

Queue::Queue() {
    size = 4;
    growthSize = size;
    first = 0;
    last = 0;
    contents = new int[size];
}

Queue::Queue(int initSize) {
    size = initSize;
    growthSize = size;
    first = 0;
    last = 0;
    contents = new int[size];
}

/* How do I write the copy constructor?
 * Access to private data?
Queue::Queue(int initSize, int initGrowthSize) {
    size = initSize;
    growthSize = initGrowthSize;
    first = 0;
    last = 0;
    contents = new int[size];
}

Queue * Queue::copy() {
    Queue * to = new Queue(size, growthSize);
    
}
*/

Queue::~Queue() {
    delete contents;
}

int Queue::next(int pos) {
    return (pos+1)%size;
}

void Queue::grow() {
    int newSize = size + growthSize;
    int * tmp = new int[newSize];
    for (int i=0; i<size; i++) {
        if (i<first)
            tmp[i] = contents[i];
        else
            tmp[i+growthSize] = contents[i];
    }
    first += growthSize;
    size = newSize;
    delete contents;
    contents = tmp;
}

void Queue::insert(int el) {
    if (next(last) == first)
        grow();
    contents[last] = el;
    last = next(last);
}

bool Queue::extract(int & el) {
    if (first == last)
        return false;
    el = contents[first];
    first = next(first);
    return true;
}
