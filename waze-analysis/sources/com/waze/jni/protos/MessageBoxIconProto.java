package com.waze.jni.protos;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum MessageBoxIconProto implements eg {
    bigblue_v_icon(0),
    bigblue_x_icon(1),
    flag_verified(2),
    networkblue_icon(3),
    sign_up_big_v(4),
    UNRECOGNIZED(-1);

    public static final int bigblue_v_icon_VALUE = 0;
    public static final int bigblue_x_icon_VALUE = 1;
    public static final int flag_verified_VALUE = 2;
    private static final eh<MessageBoxIconProto> internalValueMap = new eh<MessageBoxIconProto>() { // from class: com.waze.jni.protos.MessageBoxIconProto.1
        @Override // com.google.v.eh
        public MessageBoxIconProto findValueByNumber(int i2) {
            return MessageBoxIconProto.forNumber(i2);
        }
    };
    public static final int networkblue_icon_VALUE = 3;
    public static final int sign_up_big_v_VALUE = 4;
    private final int value;

    /* compiled from: WazeSource */
    final class MessageBoxIconProtoVerifier implements ei {
        static final ei INSTANCE = new MessageBoxIconProtoVerifier();

        private MessageBoxIconProtoVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return MessageBoxIconProto.forNumber(i2) != null;
        }
    }

    MessageBoxIconProto(int i2) {
        this.value = i2;
    }

    public static MessageBoxIconProto forNumber(int i2) {
        if (i2 == 0) {
            return bigblue_v_icon;
        }
        if (i2 == 1) {
            return bigblue_x_icon;
        }
        if (i2 == 2) {
            return flag_verified;
        }
        if (i2 == 3) {
            return networkblue_icon;
        }
        if (i2 != 4) {
            return null;
        }
        return sign_up_big_v;
    }

    public static eh<MessageBoxIconProto> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return MessageBoxIconProtoVerifier.INSTANCE;
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
