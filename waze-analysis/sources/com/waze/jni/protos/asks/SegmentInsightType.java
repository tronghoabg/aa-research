package com.waze.jni.protos.asks;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum SegmentInsightType implements eg {
    SEGMENT_TRAFFIC(0),
    SEGMENT_SPEED_BUMP(1),
    SEGMENT_DANGEROUS_CURVE(2),
    SEGMENT_HOV_LANE(3),
    SEGMENT_CARPOOL_LANE(4),
    SEGMENT_BUS_LANE(5),
    SEGMENT_ENFORCEMENT_ZONE(6),
    SEGMENT_AVERAGE_SPEED_CAMERA(7),
    SEGMENT_SCHOOL_ZONE(8),
    UNRECOGNIZED(-1);

    public static final int SEGMENT_AVERAGE_SPEED_CAMERA_VALUE = 7;
    public static final int SEGMENT_BUS_LANE_VALUE = 5;
    public static final int SEGMENT_CARPOOL_LANE_VALUE = 4;
    public static final int SEGMENT_DANGEROUS_CURVE_VALUE = 2;
    public static final int SEGMENT_ENFORCEMENT_ZONE_VALUE = 6;
    public static final int SEGMENT_HOV_LANE_VALUE = 3;
    public static final int SEGMENT_SCHOOL_ZONE_VALUE = 8;
    public static final int SEGMENT_SPEED_BUMP_VALUE = 1;
    public static final int SEGMENT_TRAFFIC_VALUE = 0;
    private static final eh<SegmentInsightType> internalValueMap = new eh<SegmentInsightType>() { // from class: com.waze.jni.protos.asks.SegmentInsightType.1
        @Override // com.google.v.eh
        public SegmentInsightType findValueByNumber(int i2) {
            return SegmentInsightType.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class SegmentInsightTypeVerifier implements ei {
        static final ei INSTANCE = new SegmentInsightTypeVerifier();

        private SegmentInsightTypeVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return SegmentInsightType.forNumber(i2) != null;
        }
    }

    SegmentInsightType(int i2) {
        this.value = i2;
    }

    public static SegmentInsightType forNumber(int i2) {
        switch (i2) {
            case 0:
                return SEGMENT_TRAFFIC;
            case 1:
                return SEGMENT_SPEED_BUMP;
            case 2:
                return SEGMENT_DANGEROUS_CURVE;
            case 3:
                return SEGMENT_HOV_LANE;
            case 4:
                return SEGMENT_CARPOOL_LANE;
            case 5:
                return SEGMENT_BUS_LANE;
            case 6:
                return SEGMENT_ENFORCEMENT_ZONE;
            case 7:
                return SEGMENT_AVERAGE_SPEED_CAMERA;
            case 8:
                return SEGMENT_SCHOOL_ZONE;
            default:
                return null;
        }
    }

    public static eh<SegmentInsightType> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return SegmentInsightTypeVerifier.INSTANCE;
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
