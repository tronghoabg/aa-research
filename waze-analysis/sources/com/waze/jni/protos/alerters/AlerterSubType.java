package com.waze.jni.protos.alerters;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AlerterSubType extends du<AlerterSubType, Builder> implements AlerterSubTypeOrBuilder {
    private static final AlerterSubType DEFAULT_INSTANCE;
    private static volatile fo<AlerterSubType> PARSER;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.alerters.AlerterSubType$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: WazeSource */
    public enum BlockedLaneSubType implements eg {
        BLOCKED_LANE_SUB_TYPE_UNSPECIFIED(0),
        BLOCKED_LANE_SUB_TYPE_DEFAULT(1),
        BLOCKED_LANE_SUB_TYPE_CENTER(2),
        BLOCKED_LANE_SUB_TYPE_RIGHT(3),
        BLOCKED_LANE_SUB_TYPE_LEFT(4),
        UNRECOGNIZED(-1);

        public static final int BLOCKED_LANE_SUB_TYPE_CENTER_VALUE = 2;
        public static final int BLOCKED_LANE_SUB_TYPE_DEFAULT_VALUE = 1;
        public static final int BLOCKED_LANE_SUB_TYPE_LEFT_VALUE = 4;
        public static final int BLOCKED_LANE_SUB_TYPE_RIGHT_VALUE = 3;
        public static final int BLOCKED_LANE_SUB_TYPE_UNSPECIFIED_VALUE = 0;
        private static final eh<BlockedLaneSubType> internalValueMap = new eh<BlockedLaneSubType>() { // from class: com.waze.jni.protos.alerters.AlerterSubType.BlockedLaneSubType.1
            @Override // com.google.v.eh
            public BlockedLaneSubType findValueByNumber(int i2) {
                return BlockedLaneSubType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class BlockedLaneSubTypeVerifier implements ei {
            static final ei INSTANCE = new BlockedLaneSubTypeVerifier();

            private BlockedLaneSubTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return BlockedLaneSubType.forNumber(i2) != null;
            }
        }

        BlockedLaneSubType(int i2) {
            this.value = i2;
        }

        public static BlockedLaneSubType forNumber(int i2) {
            if (i2 == 0) {
                return BLOCKED_LANE_SUB_TYPE_UNSPECIFIED;
            }
            if (i2 == 1) {
                return BLOCKED_LANE_SUB_TYPE_DEFAULT;
            }
            if (i2 == 2) {
                return BLOCKED_LANE_SUB_TYPE_CENTER;
            }
            if (i2 == 3) {
                return BLOCKED_LANE_SUB_TYPE_RIGHT;
            }
            if (i2 != 4) {
                return null;
            }
            return BLOCKED_LANE_SUB_TYPE_LEFT;
        }

        public static eh<BlockedLaneSubType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return BlockedLaneSubTypeVerifier.INSTANCE;
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

    /* compiled from: WazeSource */
    public final class Builder extends dm<AlerterSubType, Builder> implements AlerterSubTypeOrBuilder {
        private Builder() {
            super(AlerterSubType.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: WazeSource */
    public enum HazardSubType implements eg {
        HAZARD_SUB_TYPE_UNSPECIFIED(0),
        HAZARD_SUB_TYPE_DEFAULT(1),
        HAZARD_SUB_TYPE_ON_ROAD_CONSTRUCTION(2),
        HAZARD_SUB_TYPE_ON_ROAD_CAR_STOPPED(3),
        HAZARD_SUB_TYPE_ON_ROAD_OBJECT(4),
        HAZARD_SUB_TYPE_ON_ROAD_POT_HOLE(5),
        HAZARD_SUB_TYPE_ON_ROAD_BROKEN_TRAFFIC_LIGHT(6),
        HAZARD_SUB_TYPE_ON_ROAD_OIL(7),
        HAZARD_SUB_TYPE_ON_SHOULDER_ANIMALS(8),
        HAZARD_SUB_TYPE_ON_SHOULDER_MISSING_SIGN(9),
        HAZARD_SUB_TYPE_ON_ROAD_ROAD_KILL(10),
        HAZARD_SUB_TYPE_ON_SHOULDER(11),
        HAZARD_SUB_TYPE_ON_SHOULDER_CAR_STOPPED(12),
        HAZARD_SUB_TYPE_EMERGENCY_VEHICLE(13),
        UNRECOGNIZED(-1);

        public static final int HAZARD_SUB_TYPE_DEFAULT_VALUE = 1;
        public static final int HAZARD_SUB_TYPE_EMERGENCY_VEHICLE_VALUE = 13;
        public static final int HAZARD_SUB_TYPE_ON_ROAD_BROKEN_TRAFFIC_LIGHT_VALUE = 6;
        public static final int HAZARD_SUB_TYPE_ON_ROAD_CAR_STOPPED_VALUE = 3;
        public static final int HAZARD_SUB_TYPE_ON_ROAD_CONSTRUCTION_VALUE = 2;
        public static final int HAZARD_SUB_TYPE_ON_ROAD_OBJECT_VALUE = 4;
        public static final int HAZARD_SUB_TYPE_ON_ROAD_OIL_VALUE = 7;
        public static final int HAZARD_SUB_TYPE_ON_ROAD_POT_HOLE_VALUE = 5;
        public static final int HAZARD_SUB_TYPE_ON_ROAD_ROAD_KILL_VALUE = 10;
        public static final int HAZARD_SUB_TYPE_ON_SHOULDER_ANIMALS_VALUE = 8;
        public static final int HAZARD_SUB_TYPE_ON_SHOULDER_CAR_STOPPED_VALUE = 12;
        public static final int HAZARD_SUB_TYPE_ON_SHOULDER_MISSING_SIGN_VALUE = 9;
        public static final int HAZARD_SUB_TYPE_ON_SHOULDER_VALUE = 11;
        public static final int HAZARD_SUB_TYPE_UNSPECIFIED_VALUE = 0;
        private static final eh<HazardSubType> internalValueMap = new eh<HazardSubType>() { // from class: com.waze.jni.protos.alerters.AlerterSubType.HazardSubType.1
            @Override // com.google.v.eh
            public HazardSubType findValueByNumber(int i2) {
                return HazardSubType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class HazardSubTypeVerifier implements ei {
            static final ei INSTANCE = new HazardSubTypeVerifier();

            private HazardSubTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return HazardSubType.forNumber(i2) != null;
            }
        }

        HazardSubType(int i2) {
            this.value = i2;
        }

        public static HazardSubType forNumber(int i2) {
            switch (i2) {
                case 0:
                    return HAZARD_SUB_TYPE_UNSPECIFIED;
                case 1:
                    return HAZARD_SUB_TYPE_DEFAULT;
                case 2:
                    return HAZARD_SUB_TYPE_ON_ROAD_CONSTRUCTION;
                case 3:
                    return HAZARD_SUB_TYPE_ON_ROAD_CAR_STOPPED;
                case 4:
                    return HAZARD_SUB_TYPE_ON_ROAD_OBJECT;
                case 5:
                    return HAZARD_SUB_TYPE_ON_ROAD_POT_HOLE;
                case 6:
                    return HAZARD_SUB_TYPE_ON_ROAD_BROKEN_TRAFFIC_LIGHT;
                case 7:
                    return HAZARD_SUB_TYPE_ON_ROAD_OIL;
                case 8:
                    return HAZARD_SUB_TYPE_ON_SHOULDER_ANIMALS;
                case 9:
                    return HAZARD_SUB_TYPE_ON_SHOULDER_MISSING_SIGN;
                case 10:
                    return HAZARD_SUB_TYPE_ON_ROAD_ROAD_KILL;
                case 11:
                    return HAZARD_SUB_TYPE_ON_SHOULDER;
                case 12:
                    return HAZARD_SUB_TYPE_ON_SHOULDER_CAR_STOPPED;
                case 13:
                    return HAZARD_SUB_TYPE_EMERGENCY_VEHICLE;
                default:
                    return null;
            }
        }

        public static eh<HazardSubType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return HazardSubTypeVerifier.INSTANCE;
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

    static {
        AlerterSubType alerterSubType = new AlerterSubType();
        DEFAULT_INSTANCE = alerterSubType;
        du.registerDefaultInstance(AlerterSubType.class, alerterSubType);
    }

    private AlerterSubType() {
    }

    public static AlerterSubType getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AlerterSubType parseDelimitedFrom(InputStream inputStream) {
        return (AlerterSubType) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlerterSubType parseFrom(v vVar) {
        return (AlerterSubType) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<AlerterSubType> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new AlerterSubType();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<AlerterSubType> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (AlerterSubType.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static Builder newBuilder(AlerterSubType alerterSubType) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(alerterSubType);
    }

    public static AlerterSubType parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (AlerterSubType) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AlerterSubType parseFrom(v vVar, de deVar) {
        return (AlerterSubType) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static AlerterSubType parseFrom(z zVar) {
        return (AlerterSubType) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static AlerterSubType parseFrom(z zVar, de deVar) {
        return (AlerterSubType) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static AlerterSubType parseFrom(InputStream inputStream) {
        return (AlerterSubType) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlerterSubType parseFrom(InputStream inputStream, de deVar) {
        return (AlerterSubType) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AlerterSubType parseFrom(ByteBuffer byteBuffer) {
        return (AlerterSubType) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AlerterSubType parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (AlerterSubType) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static AlerterSubType parseFrom(byte[] bArr) {
        return (AlerterSubType) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlerterSubType parseFrom(byte[] bArr, de deVar) {
        return (AlerterSubType) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
