package api.hs.notification.common.response.service.impl;

import api.hs.notification.common.exception.type.SuccessCode;
import api.hs.notification.common.response.dto.CommonResponse;
import api.hs.notification.common.response.service.ResponseService;
import org.springframework.stereotype.Service;

/**
 * please explain class!
 *
 * @author :Uheejoon
 * @package :api.hs.notification.common.response.service.impl
 * @fileName :ResponseServiceImpl
 * @since :2024-03-21 오후 6:57
 */
@Service
public class ResponseServiceImpl implements ResponseService {
  @Override
  public CommonResponse<?> successWithNoContent(SuccessCode successCode) {
    return CommonResponse
      .builder()
      .success(true)
      .message(successCode.getMessage())
      .data(null)
      .build();
  }

  @Override
  public <T> CommonResponse<T> success(T data, SuccessCode successCode) {
    return CommonResponse.<T>builder()
      .success(true)
      .message(successCode.getMessage())
      .data(data)
      .build();
  }

  @Override
  public <T> CommonResponse<T> failure(String errorMessage) {
    return CommonResponse.<T>builder()
      .success(false)
      .message(errorMessage)
      .build();
  }
}
