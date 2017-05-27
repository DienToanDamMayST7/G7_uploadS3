package bt_amazon.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="task")
public class Post implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String title;
	private String content;
	private String url;
	
	public Post(){}
	public Post(String title, String content, String url)
	{
		super();
		this.title = title;
		this.content = content;
		this.url = url;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String geturl() {
		return url;
	}
	public void seturl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + getId() + ", title=" + title + ", content=" + content + ", url=" + url + "]";
	}
}