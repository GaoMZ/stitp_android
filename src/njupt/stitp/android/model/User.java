package njupt.stitp.android.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private int timeOfContinuousUse;
	private int timeOfContinuousListen;
	private String channel_id;
	private String question;
	private String answer;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTimeOfContinuousUse() {
		return timeOfContinuousUse;
	}

	public void setTimeOfContinuousUse(int timeOfContinuousUse) {
		this.timeOfContinuousUse = timeOfContinuousUse;
	}

	public int getTimeOfContinuousListen() {
		return timeOfContinuousListen;
	}

	public void setTimeOfContinuousListen(int timeOfContinuousListen) {
		this.timeOfContinuousListen = timeOfContinuousListen;
	}

	public String getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
