package br.com.techsolucoes.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_task")
public class TaskModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String description;

    @Column(length = 50)
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;

    private UUID idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // 2 - aqui eu defini que quem é responsavel pela excessao é quem esta chamando
    // o metodo title
    // 2 - here I defined that the caller is responsible for the exception
    // the title method
    public void setTitle(String title) throws Exception {
        if (title.length() > 50) {
            // 1 - aqui eu criei a excessao - // 1 - here I created the exception
            throw new Exception("O Campo title deve conter no máximo 50 caracteres");
        }
        this.title = title;
    }

}
