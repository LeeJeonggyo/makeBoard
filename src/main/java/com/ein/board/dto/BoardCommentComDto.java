package com.ein.board.dto;

public class BoardCommentComDto {
	
	int com_No;
	int bb_Comment_Seq;
	String com_Content;
	String ins_Date;
	
	String Result;
	
	public int getCom_No() {
		return com_No;
	}
	public void setCom_No(int com_No) {
		this.com_No = com_No;
	}
	public int getBb_Comment_Seq() {
		return bb_Comment_Seq;
	}
	public void setBb_Comment_Seq(int bb_Comment_Seq) {
		this.bb_Comment_Seq = bb_Comment_Seq;
	}
	public String getCom_Content() {
		return com_Content;
	}
	public void setCom_Content(String com_Content) {
		this.com_Content = com_Content;
	}
	public String getIns_Date() {
		return ins_Date;
	}
	public void setIns_Date(String ins_Date) {
		this.ins_Date = ins_Date;
	}
	public String getResult() {
		return Result;
	}
	public void setResult(String result) {
		Result = result;
	}
	
}
