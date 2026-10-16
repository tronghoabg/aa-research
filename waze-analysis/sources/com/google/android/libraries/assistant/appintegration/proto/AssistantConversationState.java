package com.google.android.libraries.assistant.appintegration.proto;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum AssistantConversationState implements eg {
    ASSISTANT_CONVERSATION_STATE_UNKNOWN(0),
    ASSISTANT_CONVERSATION_STATE_STARTED(1),
    ASSISTANT_CONVERSATION_STATE_COMPLETED(2);

    public static final int ASSISTANT_CONVERSATION_STATE_COMPLETED_VALUE = 2;
    public static final int ASSISTANT_CONVERSATION_STATE_STARTED_VALUE = 1;
    public static final int ASSISTANT_CONVERSATION_STATE_UNKNOWN_VALUE = 0;
    private static final eh<AssistantConversationState> internalValueMap = new eh<AssistantConversationState>() { // from class: com.google.android.libraries.assistant.appintegration.proto.AssistantConversationState.1
        @Override // com.google.v.eh
        public AssistantConversationState findValueByNumber(int i2) {
            return AssistantConversationState.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class AssistantConversationStateVerifier implements ei {
        static final ei INSTANCE = new AssistantConversationStateVerifier();

        private AssistantConversationStateVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return AssistantConversationState.forNumber(i2) != null;
        }
    }

    AssistantConversationState(int i2) {
        this.value = i2;
    }

    public static AssistantConversationState forNumber(int i2) {
        if (i2 == 0) {
            return ASSISTANT_CONVERSATION_STATE_UNKNOWN;
        }
        if (i2 == 1) {
            return ASSISTANT_CONVERSATION_STATE_STARTED;
        }
        if (i2 != 2) {
            return null;
        }
        return ASSISTANT_CONVERSATION_STATE_COMPLETED;
    }

    public static eh<AssistantConversationState> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return AssistantConversationStateVerifier.INSTANCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.value);
    }
}
