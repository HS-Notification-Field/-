package api.hs.notification.common.response.service;

import api.hs.notification.common.exception.type.ErrorCode;
import api.hs.notification.common.exception.type.SuccessCode;
import api.hs.notification.common.response.dto.CommonResponse;

/**
 * 응답 객체 서비스
 *
 * @author :Uheejoon
 * @package :api.hs.notification.common.response.service
 * @fileName :ResponseService
 * @since :2024-03-21 오후 6:04
 */
public interface ResponseService {
  // 데이터가 존재하지 않는 성공 응답
  CommonResponse<?> successWithNoContent(SuccessCode successCode);

  // 데이터가 존재하는 성공 응답
  <T> CommonResponse<T> success(T data, SuccessCode successCode);

  // 실패 응답 (ErrorMessage)
  <T> CommonResponse<T> failure(String errorMessage);
}
