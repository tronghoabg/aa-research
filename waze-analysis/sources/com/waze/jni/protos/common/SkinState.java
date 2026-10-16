package com.waze.jni.protos.common;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum SkinState implements eg {
    DAY(0),
    NIGHT(1),
    UNRECOGNIZED(-1);

    public static final int DAY_VALUE = 0;
    public static final int NIGHT_VALUE = 1;
    private static final eh<SkinState> internalValueMap = new eh<SkinState>() { // from class: com.waze.jni.protos.common.SkinState.1
        @Override // com.google.v.eh
        public SkinState findValueByNumber(int i2) {
            return SkinState.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class SkinStateVerifier implements ei {
        static final ei INSTANCE = new SkinStateVerifier();

        private SkinStateVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return SkinState.forNumber(i2) != null;
        }
    }

    SkinState(int i2) {
        this.value = i2;
    }

    public static SkinState forNumber(int i2) {
        if (i2 == 0) {
            return DAY;
        }
        if (i2 != 1) {
            return null;
        }
        return NIGHT;
    }

    public static eh<SkinState> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return SkinStateVerifier.INSTANCE;
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
