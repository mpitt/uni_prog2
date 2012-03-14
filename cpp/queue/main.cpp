#include <iostream>
#include "queue.h"

using namespace std;

int main (int argc, char ** argv) {
    int initSize = 5;
    int elems[4] = {34, 52, 6545, 1};
    int moreElems[4] = {6556, 35879, 5646, 32};
    int k;

    cout << "Testing the queue\n";
    cout << "Create the queue" << endl;
    Queue * q = new Queue(initSize);
    cout << "Insert 4 elements" << endl;
    for (int i=0; i<4; i++)
        q->insert(elems[i]);
    cout << "Extract 2 elements" << endl;
    for (int i=0; i<2; i++) {
        if (!q->extract(k)) {
            cout << "Extraction failed" << endl;
            return -1;
        }
        cout << "Expected: " << elems[i] << " - Extracted: " << k << endl;
        if (k != elems[i]) {
            cout << "The extracted element is wrong" << endl;
            return -1;
        }
    }
    cout << "Insert 4 more elements (the queue should grow)" << endl;
    for (int i=0; i<4; i++)
        q->insert(moreElems[i]);
    cout << "Extract 2+4 elements" << endl;
    for (int i=0; i<5; i++) {
        int el = i<2?elems[i+2]:moreElems[i-2];
        if (!q->extract(k)) {
            cout << "Extraction failed" << endl;
            return -1;
        }
        cout << "Expected: " << el << " - Extracted: " << k << endl;
        if (k != el) {
            cout << "The extracted element is wrong" << endl;
            return -1;
        }
    }
    cout << "Delete the queue" << endl;
    delete q;
    return 0;
}
