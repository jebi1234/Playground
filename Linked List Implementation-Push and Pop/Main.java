#include <stdio.h>
#include <stdlib.h>
struct node {
int data;
struct node *next;
};

struct node *start = NULL;
void insert_at_begin(int);
void traverse();
void delete_from_begin();
int count = 0;

int main () {
int i, data;

for (;;) {
  printf("Choice 1 : Push\n");
  printf("Choice 2 : Pop\n");
  printf("Choice 3 : Display\n");
  printf("Any other choice : Exit\n");
  printf("Enter your choice\n");

  scanf("%d", &i);

  if (i == 1) {
    printf("Enter the element to be pushed\n");
    scanf("%d", &data);
    insert_at_begin(data);
  }
  else if (i == 2) {
 
    delete_from_begin(data);
  }
  else if (i == 3)
    traverse();


  else if (i != 1||2||3)
    break;
   }

return 0;
}

void insert_at_begin(int x) {
struct node *t;

t = (struct node*)malloc(sizeof(struct node));
t->data = x;
count++;

if (start == NULL) {
  start = t;
  start->next = NULL;
  return;
}

t->next = start;
start = t;
}


void traverse() {
struct node *t;

t = start;

if (t == NULL) {
  printf("The contents of the stack are {}\n");
  return;
}

printf("The contents of the stack are ", count);

while (t->next != NULL) {
  printf("%d ", t->data);
  t = t->next;
}
printf("%d\n", t->data); // Print last node
}

void delete_from_begin() {
struct node *t;
int n;

if (start == NULL) {
  printf("Stack is empty\n");
  return;
}

n = start->data;
t = start->next;
free(start);
start = t;
count--;

printf("The popped element is %d\n", n);
}