package com.google.android.libraries.assistant.appintegration.proto;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum NightModeStatus implements eg {
    NIGHT_MODE_STATUS_UNKNOWN(0),
    NIGHT_MODE_STATUS_DAY(1),
    NIGHT_MODE_STATUS_NIGHT(2);

    public static final int NIGHT_MODE_STATUS_DAY_VALUE = 1;
    public static final int NIGHT_MODE_STATUS_NIGHT_VALUE = 2;
    public static final int NIGHT_MODE_STATUS_UNKNOWN_VALUE = 0;
    private static final eh<NightModeStatus> internalValueMap = new eh<NightModeStatus>() { // from class: com.google.android.libraries.assistant.appintegration.proto.NightModeStatus.1
        @Override // com.google.v.eh
        public NightModeStatus findValueByNumber(int i2) {
            return NightModeStatus.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class NightModeStatusVerifier implements ei {
        static final ei INSTANCE = new NightModeStatusVerifier();

        private NightModeStatusVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return NightModeStatus.forNumber(i2) != null;
        }
    }

    NightModeStatus(int i2) {
        this.value = i2;
    }

    public static NightModeStatus forNumber(int i2) {
        if (i2 == 0) {
            return NIGHT_MODE_STATUS_UNKNOWN;
        }
        if (i2 == 1) {
            return NIGHT_MODE_STATUS_DAY;
        }
        if (i2 != 2) {
            return null;
        }
        return NIGHT_MODE_STATUS_NIGHT;
    }

    public static eh<NightModeStatus> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return NightModeStatusVerifier.INSTANCE;
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
