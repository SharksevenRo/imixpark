package cn.ebatech.imixpark.common.model.user;

import java.util.Date;
import java.util.List;
/**
 * 用户
 * @author tanyougen
 *
 */
public class CopyOfUser {

	/**
	 * 会员id
	 */
	private int id;
	/**
	 * 商城id
	 */
	private int Mall_id;
	/**
	 * 用户名
	 */
	private String Name;
	/**
	 * 用户昵称
	 */
	private String Alias;
	/**
	 * 身份证号码
	 */
	private String card_no;
	/**
	 * 性别
	 */
	private String Sex;
	/**
	 * 电话
	 */
	private String Tel;
	/**
	 * 创建时间
	 */
	private Date Create_Time;
	/**
	 * 是生日
	 */
	private String Birthday;
	/**用户所拥有的成长值
	 * 
	 */
	private int Growth_Value;
	/**
	 * 注册所在的商场名
	 */
	private String Regedit_Address;
	/**
	 * 用户类型 0 微信注册会员 1 app注册会员',
	 */
	private String Type;
	/**
	 * 密码
	 */
	private String Pwd;
	/**
	 * 头像
	 */
	private String Picture;
	/**
	 * 用户最后登录时间',
	 */
	private Date Last_Login_Time;
	/**
	 * '会员卡号'
	 */
	private String Cardno;
	/**
	 * 星座
	 */
	private String Constellation;
	/**
	 * 会员等级 0 银卡 1 金卡 2 黑金卡',
	 */
	private String Level;
	/**
	 * 会员总积分'
	 */
	private int Sum_Integral;
	/**
	 * 会员卡
	 */
	private VIPCard card;
	/**
	 * 消费记录
	 */
	private List<Consumption> cps;
	/**
	 * 积分
	 * @return
	 */
	private List<Integral> Integrals;
	
	public String getCard_no() {
		return card_no;
	}
	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}
	public List<Integral> getIntegrals() {
		return Integrals;
	}
	public void setIntegrals(List<Integral> integrals) {
		Integrals = integrals;
	}
	public List<Consumption> getCps() {
		return cps;
	}
	public void setCps(List<Consumption> cps) {
		this.cps = cps;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMall_id() {
		return Mall_id;
	}
	public void setMall_id(int mall_id) {
		Mall_id = mall_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAlias() {
		return Alias;
	}
	public void setAlias(String alias) {
		Alias = alias;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public Date getCreate_Time() {
		return Create_Time;
	}
	public void setCreate_Time(Date create_Time) {
		Create_Time = create_Time;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
	public int getGrowth_Value() {
		return Growth_Value;
	}
	public void setGrowth_Value(int growth_Value) {
		Growth_Value = growth_Value;
	}
	public String getRegedit_Address() {
		return Regedit_Address;
	}
	public void setRegedit_Address(String regedit_Address) {
		Regedit_Address = regedit_Address;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getPwd() {
		return Pwd;
	}
	public void setPwd(String pwd) {
		Pwd = pwd;
	}
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String picture) {
		Picture = picture;
	}
	public Date getLast_Login_Time() {
		return Last_Login_Time;
	}
	public void setLast_Login_Time(Date last_Login_Time) {
		Last_Login_Time = last_Login_Time;
	}
	public String getConstellation() {
		return Constellation;
	}
	public void setConstellation(String constellation) {
		Constellation = constellation;
	}
	public String getLevel() {
		return Level;
	}
	public void setLevel(String level) {
		Level = level;
	}
	public int getSum_Integral() {
		return Sum_Integral;
	}
	public void setSum_Integral(int sum_Integral) {
		Sum_Integral = sum_Integral;
	}
	public VIPCard getCard() {
		return card;
	}
	public void setCard(VIPCard card) {
		this.card = card;
	}
	public String getCardno() {
		return Cardno;
	}
	public void setCardno(String cardno) {
		Cardno = cardno;
	}
	
	
	

}
