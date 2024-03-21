package api.hs.notification.common.exception.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * 에러코드 정의
 *
 * @author :Uheejoon
 * @package :api.hs.notification.common.exception.type
 * @fileName :ErrorCode
 * @since :2024-03-21 오후 6:02
 */
@AllArgsConstructor
@Getter
public enum ErrorCode {

  INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "내부 서버 오류가 발생하였습니다."),
  INVALID_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),

  ;
  private final HttpStatus httpStatus;
  private final String message;
}
