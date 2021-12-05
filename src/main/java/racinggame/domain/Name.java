package racinggame.domain;

import java.util.Objects;
import org.springframework.util.StringUtils;

public class Name {
    private final String name;

    public Name(String name) {
        if(!StringUtils.hasText(name)){
            throw new IllegalArgumentException("자동차 이름은 값이 존재해야 합니다.");
        }
        if(name.length() > 5){
            throw new IllegalArgumentException("자동차 이름은 5를 초과할 수 없습니다.");
        }
        this.name = name.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
