package com.khan.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.khan.entity.Student;
import com.khan.service.UploadService;

@RestController
@RequestMapping("/students")
public class UploadController {

	@Autowired
	private UploadService uploadService;

	@Autowired
	UploadController(UploadService uploadService) {
		this.uploadService = uploadService;
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public List<Student> uploadFile(@RequestPart(value = "file") MultipartFile multiPartFile) throws IOException {
		return uploadService.uploadFile(multiPartFile);
	}
}