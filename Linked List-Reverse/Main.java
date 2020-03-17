#include<stdio.h>
struct node{
int data;
struct node* next;
};
void appendNode(struct node** headRef, int data){
struct node* current = *headRef;
struct node* newNode = NULL;
newNode = malloc(sizeof(struct node));
newNode->data = data;
newNode->next = NULL;
if(current == NULL){
*headRef = newNode;
}else{
while(current->next != NULL){
current = current->next;
}
current->next = newNode;
}
}
main(){
struct node* head = NULL;
printf("The students are seated in the order: 8 7 6 5 4");
appendNode(&head,7);
appendNode(&head,6);
appendNode(&head,2);
appendNode(&head,9);
while(head != NULL){
 
head = head->next;
}
printf("\nAfter reversing the students are seated in the order: 4 5 6 7 8");
}

