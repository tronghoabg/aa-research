package com.waze.jni.protos.map;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum ClickedPoiType implements eg {
    HOME(0),
    WORK(1),
    PARKED(2),
    DEPARTURE(3),
    UNRECOGNIZED(-1);

    public static final int DEPARTURE_VALUE = 3;
    public static final int HOME_VALUE = 0;
    public static final int PARKED_VALUE = 2;
    public static final int WORK_VALUE = 1;
    private static final eh<ClickedPoiType> internalValueMap = new eh<ClickedPoiType>() { // from class: com.waze.jni.protos.map.ClickedPoiType.1
        @Override // com.google.v.eh
        public ClickedPoiType findValueByNumber(int i2) {
            return ClickedPoiType.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class ClickedPoiTypeVerifier implements ei {
        static final ei INSTANCE = new ClickedPoiTypeVerifier();

        private ClickedPoiTypeVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return ClickedPoiType.forNumber(i2) != null;
        }
    }

    ClickedPoiType(int i2) {
        this.value = i2;
    }

    public static ClickedPoiType forNumber(int i2) {
        if (i2 == 0) {
            return HOME;
        }
        if (i2 == 1) {
            return WORK;
        }
        if (i2 == 2) {
            return PARKED;
        }
        if (i2 != 3) {
            return null;
        }
        return DEPARTURE;
    }

    public static eh<ClickedPoiType> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return ClickedPoiTypeVerifier.INSTANCE;
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
