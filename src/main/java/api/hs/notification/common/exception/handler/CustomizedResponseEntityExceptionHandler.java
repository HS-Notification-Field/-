package api.hs.notification.common.exception.handler;

import api.hs.notification.common.response.service.ResponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static api.hs.notification.common.exception.type.ErrorCode.INVALID_REQUEST;

/**
 * 기존 핸들러 리턴값 재정의
 *
 * @author :Uheejoon
 * @package :api.hs.notification.common.exception.handler
 * @fileName :CustomizedResponseEntityExceptionHandler
 * @since :2024-03-21 오후 6:18
 */

@RequiredArgsConstructor
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

  private final ResponseService responseService;

  //  잘못된 메서드 요청이 왔을 때
  @Override
  protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
    return ResponseEntity.status(INVALID_REQUEST.getHttpStatus()).body(responseService.failure(INVALID_REQUEST.getMessage()));
  }

  //  validation 실패
  @Override
  public final ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
    return ResponseEntity.status(INVALID_REQUEST.getHttpStatus()).body(responseService.failure(INVALID_REQUEST.getMessage()));
  }
}
