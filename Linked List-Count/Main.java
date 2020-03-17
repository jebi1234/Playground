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
 int count=0; 
struct node* head = NULL;
//head = malloc(sizeof(struct node));
appendNode(&head,4);
appendNode(&head,3);
appendNode(&head,2);
appendNode(&head,1);
printf("The students who are present in the class are \n");
while(head != NULL){
  count++;
printf("%d ",head->data);
head = head->next;
}
  printf("\n");
  printf("The number of students who are present is %d.",count);
printf("\n");
}  