package com.waze.jni.protos.map.canvas;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum MainCanvasCameraStateProto implements eg {
    OVERVIEW(0),
    OVERVIEW_WITH_OFFSET(1),
    TRACKING_USER_LOCATION(2),
    EXTERNAL_CANVAS(3),
    OTHER(4),
    UNRECOGNIZED(-1);

    public static final int EXTERNAL_CANVAS_VALUE = 3;
    public static final int OTHER_VALUE = 4;
    public static final int OVERVIEW_VALUE = 0;
    public static final int OVERVIEW_WITH_OFFSET_VALUE = 1;
    public static final int TRACKING_USER_LOCATION_VALUE = 2;
    private static final eh<MainCanvasCameraStateProto> internalValueMap = new eh<MainCanvasCameraStateProto>() { // from class: com.waze.jni.protos.map.canvas.MainCanvasCameraStateProto.1
        @Override // com.google.v.eh
        public MainCanvasCameraStateProto findValueByNumber(int i2) {
            return MainCanvasCameraStateProto.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class MainCanvasCameraStateProtoVerifier implements ei {
        static final ei INSTANCE = new MainCanvasCameraStateProtoVerifier();

        private MainCanvasCameraStateProtoVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return MainCanvasCameraStateProto.forNumber(i2) != null;
        }
    }

    MainCanvasCameraStateProto(int i2) {
        this.value = i2;
    }

    public static MainCanvasCameraStateProto forNumber(int i2) {
        if (i2 == 0) {
            return OVERVIEW;
        }
        if (i2 == 1) {
            return OVERVIEW_WITH_OFFSET;
        }
        if (i2 == 2) {
            return TRACKING_USER_LOCATION;
        }
        if (i2 == 3) {
            return EXTERNAL_CANVAS;
        }
        if (i2 != 4) {
            return null;
        }
        return OTHER;
    }

    public static eh<MainCanvasCameraStateProto> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return MainCanvasCameraStateProtoVerifier.INSTANCE;
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
