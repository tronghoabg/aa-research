package com.waze.jni.protos.alerters;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum AlerterTimerType implements eg {
    NONE(0),
    TIMER_BAR(1),
    PRIMARY_BUTTON(2),
    SECONDARY_BUTTON(3),
    UNRECOGNIZED(-1);

    public static final int NONE_VALUE = 0;
    public static final int PRIMARY_BUTTON_VALUE = 2;
    public static final int SECONDARY_BUTTON_VALUE = 3;
    public static final int TIMER_BAR_VALUE = 1;
    private static final eh<AlerterTimerType> internalValueMap = new eh<AlerterTimerType>() { // from class: com.waze.jni.protos.alerters.AlerterTimerType.1
        @Override // com.google.v.eh
        public AlerterTimerType findValueByNumber(int i2) {
            return AlerterTimerType.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class AlerterTimerTypeVerifier implements ei {
        static final ei INSTANCE = new AlerterTimerTypeVerifier();

        private AlerterTimerTypeVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return AlerterTimerType.forNumber(i2) != null;
        }
    }

    AlerterTimerType(int i2) {
        this.value = i2;
    }

    public static AlerterTimerType forNumber(int i2) {
        if (i2 == 0) {
            return NONE;
        }
        if (i2 == 1) {
            return TIMER_BAR;
        }
        if (i2 == 2) {
            return PRIMARY_BUTTON;
        }
        if (i2 != 3) {
            return null;
        }
        return SECONDARY_BUTTON;
    }

    public static eh<AlerterTimerType> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return AlerterTimerTypeVerifier.INSTANCE;
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
