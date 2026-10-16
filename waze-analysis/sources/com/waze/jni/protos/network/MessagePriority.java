package com.waze.jni.protos.network;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum MessagePriority implements eg {
    USER_AWAITING(0),
    USER_VISIBLE(1),
    DATA_FETCH(2),
    DATA_SEND(3),
    UNRECOGNIZED(-1);

    public static final int DATA_FETCH_VALUE = 2;
    public static final int DATA_SEND_VALUE = 3;
    public static final int USER_AWAITING_VALUE = 0;
    public static final int USER_VISIBLE_VALUE = 1;
    private static final eh<MessagePriority> internalValueMap = new eh<MessagePriority>() { // from class: com.waze.jni.protos.network.MessagePriority.1
        @Override // com.google.v.eh
        public MessagePriority findValueByNumber(int i2) {
            return MessagePriority.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class MessagePriorityVerifier implements ei {
        static final ei INSTANCE = new MessagePriorityVerifier();

        private MessagePriorityVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return MessagePriority.forNumber(i2) != null;
        }
    }

    MessagePriority(int i2) {
        this.value = i2;
    }

    public static MessagePriority forNumber(int i2) {
        if (i2 == 0) {
            return USER_AWAITING;
        }
        if (i2 == 1) {
            return USER_VISIBLE;
        }
        if (i2 == 2) {
            return DATA_FETCH;
        }
        if (i2 != 3) {
            return null;
        }
        return DATA_SEND;
    }

    public static eh<MessagePriority> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return MessagePriorityVerifier.INSTANCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.value);
    }
}
