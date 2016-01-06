package pack.data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by User on 1/3/2016.
 */

@DatabaseTable(tableName = "gmailMessages")
public class GmailMessage {

    public static final String FIELD_MESSAGE_ID = "messageId";
    public static final String FIELD_THREAD_ID = "threadId";

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = FIELD_MESSAGE_ID, canBeNull = false)
    private String messageId;

    @DatabaseField(columnName = FIELD_THREAD_ID, canBeNull = false)
    private String threadId;


    GmailMessage() {
        // all persisted classes must define a no-arg constructor with at least package visibility
    }

    public GmailMessage(String messageId, String threadId) {
        this.messageId = messageId;
        this.threadId = threadId;
    }

    @Override
    public int hashCode() {
        return (messageId + threadId).hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || other.getClass().equals(getClass())) {
            return false;
        }
        return messageId.equals(((GmailMessage) other).messageId)
                && threadId.equals(((GmailMessage) other).threadId);
    }

    //////////////////////////////////////////////////

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }
}