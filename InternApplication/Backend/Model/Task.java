package MRC.InternApp.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="internTask")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String dueDate;
    @Column
    private boolean completed;



}
