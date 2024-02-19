package bg.aspar.example.service.dto;

import java.util.Objects;

public class MessageDTO {

	private String message;

	public MessageDTO() {
		super();
	}

	public MessageDTO(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

    @Override
    public int hashCode() {
        return Objects.hash(this.message);
    }

	@Override
	public String toString() {
		return "MessageDTO {"
				+ "message=" + message
				+ "}";
	}
}
