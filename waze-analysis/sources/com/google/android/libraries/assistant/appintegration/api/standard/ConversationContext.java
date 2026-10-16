package com.google.android.libraries.assistant.appintegration.api.standard;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ConversationContext {
    private final String conversationId;
    private final String conversationTitle;

    /* compiled from: WazeSource */
    public class Builder {
        private String conversationId;
        private String conversationTitle;

        private Builder() {
        }

        public ConversationContext build() {
            return new ConversationContext(this);
        }

        public Builder setConversationId(String str) {
            this.conversationId = str;
            return this;
        }

        public Builder setConversationTitle(String str) {
            this.conversationTitle = str;
            return this;
        }
    }

    private ConversationContext(Builder builder) {
        this.conversationId = builder.conversationId;
        this.conversationTitle = builder.conversationTitle;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public String getConversationTitle() {
        return this.conversationTitle;
    }
}
