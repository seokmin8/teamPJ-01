/* 작성자 : 황석민
 * 파일의 역할 : 공지사항 제목만 List화 Dto
 * 작성날짜 : 2023-01-17
 * 
 * 업데이트 작성자 : -
 * 업데이트 날짜 : -
 * */
package com.project.irunyou.data.dto;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import com.project.irunyou.data.entity.NoticeBoardEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoticeResponseDto {
	@NotNull
	private String title;
	@NotNull
	private String content;
	@NotNull
	private Timestamp datetime;
	
	public NoticeResponseDto(NoticeBoardEntity noticeEntity) {
		this.title = noticeEntity.getTitle();
		this.content = noticeEntity.getContent();
		this.datetime = new Timestamp(System.currentTimeMillis());
	}
}
