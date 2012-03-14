CC = g++
OBJECTS = main.o queue.o
BINARY = queue

all: queue

queue: $(OBJECTS)
	$(CC) -ggdb $(OBJECTS) -o $(BINARY)

clean:
	rm -f $(BINARY) $(OBJECTS)


