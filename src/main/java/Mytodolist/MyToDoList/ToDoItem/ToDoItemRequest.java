package Mytodolist.MyToDoList.ToDoItem;

import lombok.*;

@Getter @Setter
@NoArgsConstructor // @builder로 하면 postman에서 error 남
public class ToDoItemRequest {

    private String id;
    private String title;
    private boolean isDone;

}