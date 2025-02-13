package proje.v1.api.domian.classroom;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import proje.v1.api.common.domain.BaseModel;
import proje.v1.api.domian.rollcall.RollCall;
import proje.v1.api.domian.student.Student;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Entity
public class Classroom extends BaseModel {

    @OneToMany
    @Fetch(FetchMode.JOIN)
    private List<RollCall> rollCalls = new ArrayList<>();
    private String cod;
    private String name;
    @Enumerated(value = EnumType.STRING)
    private SectionType sectionType;
    @Enumerated(value = EnumType.STRING)
    private EducationType educationType;
}
