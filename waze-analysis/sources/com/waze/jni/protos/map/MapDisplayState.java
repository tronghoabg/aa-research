package com.waze.jni.protos.map;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum MapDisplayState implements eg {
    DEFAULT(0),
    OVERVIEW(1),
    UNRECOGNIZED(-1);

    public static final int DEFAULT_VALUE = 0;
    public static final int OVERVIEW_VALUE = 1;
    private static final eh<MapDisplayState> internalValueMap = new eh<MapDisplayState>() { // from class: com.waze.jni.protos.map.MapDisplayState.1
        @Override // com.google.v.eh
        public MapDisplayState findValueByNumber(int i2) {
            return MapDisplayState.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class MapDisplayStateVerifier implements ei {
        static final ei INSTANCE = new MapDisplayStateVerifier();

        private MapDisplayStateVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return MapDisplayState.forNumber(i2) != null;
        }
    }

    MapDisplayState(int i2) {
        this.value = i2;
    }

    public static MapDisplayState forNumber(int i2) {
        if (i2 == 0) {
            return DEFAULT;
        }
        if (i2 != 1) {
            return null;
        }
        return OVERVIEW;
    }

    public static eh<MapDisplayState> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return MapDisplayStateVerifier.INSTANCE;
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
