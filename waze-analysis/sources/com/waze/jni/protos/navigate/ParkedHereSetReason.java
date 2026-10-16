package com.waze.jni.protos.navigate;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum ParkedHereSetReason implements eg {
    UNSPECIFIED(0),
    AUTO_DETECTED(1),
    MANUALLY(2),
    MANUALLY_PARK_NOW(3),
    LOCATION_EDITED(4),
    UNRECOGNIZED(-1);

    public static final int AUTO_DETECTED_VALUE = 1;
    public static final int LOCATION_EDITED_VALUE = 4;
    public static final int MANUALLY_PARK_NOW_VALUE = 3;
    public static final int MANUALLY_VALUE = 2;
    public static final int UNSPECIFIED_VALUE = 0;
    private static final eh<ParkedHereSetReason> internalValueMap = new eh<ParkedHereSetReason>() { // from class: com.waze.jni.protos.navigate.ParkedHereSetReason.1
        @Override // com.google.v.eh
        public ParkedHereSetReason findValueByNumber(int i2) {
            return ParkedHereSetReason.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class ParkedHereSetReasonVerifier implements ei {
        static final ei INSTANCE = new ParkedHereSetReasonVerifier();

        private ParkedHereSetReasonVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return ParkedHereSetReason.forNumber(i2) != null;
        }
    }

    ParkedHereSetReason(int i2) {
        this.value = i2;
    }

    public static ParkedHereSetReason forNumber(int i2) {
        if (i2 == 0) {
            return UNSPECIFIED;
        }
        if (i2 == 1) {
            return AUTO_DETECTED;
        }
        if (i2 == 2) {
            return MANUALLY;
        }
        if (i2 == 3) {
            return MANUALLY_PARK_NOW;
        }
        if (i2 != 4) {
            return null;
        }
        return LOCATION_EDITED;
    }

    public static eh<ParkedHereSetReason> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return ParkedHereSetReasonVerifier.INSTANCE;
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
