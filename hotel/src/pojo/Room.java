package pojo;

import java.sql.Date;

public class Room {

	private   int id;  //���
	private   int roomNo;//������
	private   String roomType;//��������
	private   int peopleCount;//��������
	private   double rent;//���
	private   int isRental;//����״̬

	private   Date createdTime;//���ʱ��
	private   Date updatedTime;//�޸�ʱ��
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getPeopleCount() {
		return peopleCount;
	}
	public void setPeopleCount(int peopleCount) {
		this.peopleCount = peopleCount;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public int getIsRental() {
		return isRental;
	}
	public void setIsRental(int isRental) {
		this.isRental = isRental;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Date getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	
	
}
