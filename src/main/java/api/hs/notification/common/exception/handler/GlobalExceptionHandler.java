package api.hs.notification.common.exception.handler;

import api.hs.notification.common.exception.handler.CustomizedResponseEntityExceptionHandler;
import api.hs.notification.common.response.service.ResponseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static api.hs.notification.common.exception.type.ErrorCode.INVALID_REQUEST;

/**
 * 내가 만든 예외에 대한 핸들러
 *
 * @author :Uheejoon
 * @package :api.hs.notification.common.exception.handler
 * @fileName :GlobalExceptionHandler
 * @since :2024-03-21 오후 6:12
 */
@RestControllerAdvice
public class GlobalExceptionHandler extends CustomizedResponseEntityExceptionHandler {
  private final ResponseService responseService;

  public GlobalExceptionHandler(ResponseService responseService) {
    super(responseService);
    this.responseService = responseService;
  }

  @ExceptionHandler(Exception.class)
  public final ResponseEntity<?> handleAllException() {
    return ResponseEntity.status(INVALID_REQUEST.getHttpStatus()).body(INVALID_REQUEST.getMessage());
  }

}
