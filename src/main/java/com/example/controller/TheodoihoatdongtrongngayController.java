package com.example.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.HinhanhService;
import com.example.service.HoatdongtrongngayService;
import com.example.service.HocsinhHinhanhService;
import com.example.entity.*;
import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/api")
public class TheodoihoatdongtrongngayController {
	@Autowired
	HoatdongtrongngayService hoatdongtrongngayService;
	
	@Autowired
	HinhanhService hinhanhService;
	
	@Autowired
	HocsinhHinhanhService hocsiinhinhanhService;
	
	//Danh sach hoat dong trong ngay. Trang chinh
	@RequestMapping(value = "/hoatdongtrongngay/",method = RequestMethod.GET)
	public ResponseEntity<List<HoatdongtrongngayEntity>> listHoatdongtrongngay(){
		List<HoatdongtrongngayEntity> listHoatdongtrongngay = hoatdongtrongngayService.getAllHoatdong();
		if(listHoatdongtrongngay.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<HoatdongtrongngayEntity>>(listHoatdongtrongngay,HttpStatus.OK);
	}
	
	//Them moi hoat dong trong ngay. 
	//Input: String image, HoatdongtrongngayEntity
	//Output: Danh sach hinh anh da cap nhat
	@RequestMapping(value = "/hoatdongtrongngay/giaovien/",method = RequestMethod.POST)
	public ResponseEntity<List<HoatdongtrongngayEntity>> themHoatdongtrongngay(String image,Date thoigian) throws Exception{
		HinhanhEntity newHinhanh = new HinhanhEntity();
		newHinhanh.setId(hinhanhService.lastID()+1);
		newHinhanh.setImage(image);
		newHinhanh.setThoigian(thoigian);
		hinhanhService.createOrUpdateHinhanh(newHinhanh);

		HoatdongtrongngayEntity newHoatdong = new HoatdongtrongngayEntity();
		newHoatdong.setId(hoatdongtrongngayService.lastID()+1);
		newHoatdong.setNgay(thoigian);
		List<HinhanhEntity> newHinhanhEntity = new ArrayList<HinhanhEntity>();
		newHinhanhEntity.add(newHinhanh);
		newHoatdong.setHinhanhsById(newHinhanhEntity);
		
		List<HoatdongtrongngayEntity> listHoatdongtrongngay = hoatdongtrongngayService.getAllHoatdong();
		if(listHoatdongtrongngay.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<HoatdongtrongngayEntity>>(listHoatdongtrongngay,HttpStatus.OK);
	}
}

