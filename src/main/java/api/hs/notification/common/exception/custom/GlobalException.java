package api.hs.notification.common.exception.custom;

import api.hs.notification.common.exception.type.ErrorCode;
import org.springframework.http.HttpStatus;

/**
 * 내가 만든 최 상위 예외
 *
 * @author :Uheejoon
 * @package :api.hs.notification.common.exception.custom
 * @fileName :GlobalException
 * @since :2024-03-21 오후 6:29
 */
public abstract class GlobalException extends RuntimeException{
  public GlobalException(String message) {
    super(message);
  }
  public abstract HttpStatus getHttpStatus();
  public abstract String getErrorMessage();
}
