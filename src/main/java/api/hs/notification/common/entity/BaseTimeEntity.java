package api.hs.notification.common.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/**
 * 변경 시간 값 자동 반영
 *
 * @author :Uheejoon
 * @package :api.hs.notification.common.entity
 * @fileName :BaseTimeEntity
 * @since :2024-03-21 오후 5:58
 */
@Getter
@ToString
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {
  @CreatedDate
  private LocalDateTime createdDate;
  @LastModifiedDate
  private LocalDateTime modifiedDate;
  
}
