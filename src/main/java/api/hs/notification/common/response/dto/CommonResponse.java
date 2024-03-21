package api.hs.notification.common.response.dto;

import lombok.Builder;
import lombok.Getter;

/**
 * 응답 개체
 *
 * @author :Uheejoon
 * @package :api.hs.notification.common.response.dto
 * @fileName :CommonResponse
 * @since :2024-03-21 오후 6:05
 */
@Getter
@Builder
public class CommonResponse<T> {

  private boolean success;
  private String message;
  private T data;

}
