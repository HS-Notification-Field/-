package api.hs.notification.common.exception.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 성공 코드 정의
 *
 * @author :Uheejoon
 * @package :api.hs.notification.common.exception.type
 * @fileName :SuccessCode
 * @since :2024-03-21 오후 6:03
 */
@AllArgsConstructor
@Getter
public enum SuccessCode {

  SUCCESS("성공했습니다."),
  ;
  private final String message;
}
