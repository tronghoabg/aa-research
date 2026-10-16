package com.waze.jni.protos.network;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum MessageAuthType implements eg {
    SESSION(0),
    SESSION_OR_OFFLINE(1),
    CLIENT_INFO(2),
    UNRECOGNIZED(-1);

    public static final int CLIENT_INFO_VALUE = 2;
    public static final int SESSION_OR_OFFLINE_VALUE = 1;
    public static final int SESSION_VALUE = 0;
    private static final eh<MessageAuthType> internalValueMap = new eh<MessageAuthType>() { // from class: com.waze.jni.protos.network.MessageAuthType.1
        @Override // com.google.v.eh
        public MessageAuthType findValueByNumber(int i2) {
            return MessageAuthType.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class MessageAuthTypeVerifier implements ei {
        static final ei INSTANCE = new MessageAuthTypeVerifier();

        private MessageAuthTypeVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return MessageAuthType.forNumber(i2) != null;
        }
    }

    MessageAuthType(int i2) {
        this.value = i2;
    }

    public static MessageAuthType forNumber(int i2) {
        if (i2 == 0) {
            return SESSION;
        }
        if (i2 == 1) {
            return SESSION_OR_OFFLINE;
        }
        if (i2 != 2) {
            return null;
        }
        return CLIENT_INFO;
    }

    public static eh<MessageAuthType> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return MessageAuthTypeVerifier.INSTANCE;
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
