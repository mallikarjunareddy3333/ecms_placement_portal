package com.placement.portal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.placement.portal.dto.ApiResponse;
import com.placement.portal.model.ProfileImage;
import com.placement.portal.service.ProfileImageService;

@RestController
@RequestMapping("/api/v1/student")
public class ProfileImageController {

	@Autowired
	private ProfileImageService imageService;

	@PostMapping("/{id}/profile_pic")
	public ApiResponse<String> uProfilePic(@PathVariable Long id, @RequestParam("file") MultipartFile file) {

		ApiResponse<String> error = new ApiResponse<>(HttpStatus.INTERNAL_SERVER_ERROR.value(),
				"You failed to upload because the file was empty.", "You failed to upload because the file was empty.");

		if (!file.isEmpty()) {
			try {

				byte[] bytes = file.getBytes();

				ProfileImage obj = new ProfileImage(bytes, id);

				imageService.save(obj);

			} catch (Exception e) {
				return error;
			}
		} else {
			return error;
		}

		return new ApiResponse<>(HttpStatus.OK.value(), "Profile pic uploaded successfully", "");
	}

}
