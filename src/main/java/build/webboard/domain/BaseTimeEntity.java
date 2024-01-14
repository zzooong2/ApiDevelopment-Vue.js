package build.webboard.domain;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass // JPA Entity 클래스들이 BaseTimeEntity를 상속할 경우 이 클래스의 필드들도 칼럼으로 인식
@EntityListeners(AuditingEntityListener.class) // BaseTimeEntity 클래스에 Auditing 기능 포함
public class BaseTimeEntity {

    @CreatedDate // Entity가 생성되어 저장될 때 시간 자동 저장
    private LocalDateTime created;

    @LastModifiedDate // 조회한 Entity의 값을 변경할 때 시간 자동 저장
    private LocalDateTime modified;
}
