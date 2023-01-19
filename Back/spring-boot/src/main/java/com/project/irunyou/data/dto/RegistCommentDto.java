package com.project.irunyou.data.dto;

import java.sql.Timestamp;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistCommentDto {

		@javax.validation.constraints.NotNull
	    private String content;
	    @NotNull
	    private Timestamp datetime;
}
