package com.waze.jni.protos.places;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum RecentPlaceType implements eg {
    RECENT_PLACE_TYPE_DEFAULT(0),
    RECENT_PLACE_TYPE_ADS(1),
    UNRECOGNIZED(-1);

    public static final int RECENT_PLACE_TYPE_ADS_VALUE = 1;
    public static final int RECENT_PLACE_TYPE_DEFAULT_VALUE = 0;
    private static final eh<RecentPlaceType> internalValueMap = new eh<RecentPlaceType>() { // from class: com.waze.jni.protos.places.RecentPlaceType.1
        @Override // com.google.v.eh
        public RecentPlaceType findValueByNumber(int i2) {
            return RecentPlaceType.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class RecentPlaceTypeVerifier implements ei {
        static final ei INSTANCE = new RecentPlaceTypeVerifier();

        private RecentPlaceTypeVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return RecentPlaceType.forNumber(i2) != null;
        }
    }

    RecentPlaceType(int i2) {
        this.value = i2;
    }

    public static RecentPlaceType forNumber(int i2) {
        if (i2 == 0) {
            return RECENT_PLACE_TYPE_DEFAULT;
        }
        if (i2 != 1) {
            return null;
        }
        return RECENT_PLACE_TYPE_ADS;
    }

    public static eh<RecentPlaceType> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return RecentPlaceTypeVerifier.INSTANCE;
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
