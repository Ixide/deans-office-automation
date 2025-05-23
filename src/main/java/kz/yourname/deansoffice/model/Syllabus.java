package kz.yourname.deansoffice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "syllabi") // Имя коллекции в MongoDB
public class Syllabus {
    @Id
    private String id;
    private DisciplineInfo disciplineInfo;
    private String courseDescription;
    private List<String> lectureTopics;
    private List<String> practicalTopics;
    private List<String> literatureList;
    private AssessmentCriteria assessmentCriteria;
    private String generatedRawText; // Для хранения сырого ответа от ИИ, если нужно
}