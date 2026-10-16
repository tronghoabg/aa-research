package com.waze.jni.protos.navigate;

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
public final class DriveTo extends du<DriveTo, Builder> implements DriveToOrBuilder {
    private static final DriveTo DEFAULT_INSTANCE;
    private static volatile fo<DriveTo> PARSER;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.DriveTo$1, reason: invalid class name */
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
    public final class Builder extends dm<DriveTo, Builder> implements DriveToOrBuilder {
        private Builder() {
            super(DriveTo.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: WazeSource */
    public enum DangerZoneStatType implements eg {
        NAVIGATE_TO_DANGEROUS_AREA_POPUP_CLICKED(0),
        FAVORITE_IN_DANGER_ZONE(1),
        UNRECOGNIZED(-1);

        public static final int FAVORITE_IN_DANGER_ZONE_VALUE = 1;
        public static final int NAVIGATE_TO_DANGEROUS_AREA_POPUP_CLICKED_VALUE = 0;
        private static final eh<DangerZoneStatType> internalValueMap = new eh<DangerZoneStatType>() { // from class: com.waze.jni.protos.navigate.DriveTo.DangerZoneStatType.1
            @Override // com.google.v.eh
            public DangerZoneStatType findValueByNumber(int i2) {
                return DangerZoneStatType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class DangerZoneStatTypeVerifier implements ei {
            static final ei INSTANCE = new DangerZoneStatTypeVerifier();

            private DangerZoneStatTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return DangerZoneStatType.forNumber(i2) != null;
            }
        }

        DangerZoneStatType(int i2) {
            this.value = i2;
        }

        public static DangerZoneStatType forNumber(int i2) {
            if (i2 == 0) {
                return NAVIGATE_TO_DANGEROUS_AREA_POPUP_CLICKED;
            }
            if (i2 != 1) {
                return null;
            }
            return FAVORITE_IN_DANGER_ZONE;
        }

        public static eh<DangerZoneStatType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return DangerZoneStatTypeVerifier.INSTANCE;
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
    public enum DangerZoneType implements eg {
        NORMAL(0),
        TILE_DID_NOT_LOAD(-2),
        NOT_DANGER_ZONE(-1),
        ISRAEL(1),
        OTHER(2),
        UNRECOGNIZED(-1);

        public static final int ISRAEL_VALUE = 1;
        public static final int NORMAL_VALUE = 0;
        public static final int NOT_DANGER_ZONE_VALUE = -1;
        public static final int OTHER_VALUE = 2;
        public static final int TILE_DID_NOT_LOAD_VALUE = -2;
        private static final eh<DangerZoneType> internalValueMap = new eh<DangerZoneType>() { // from class: com.waze.jni.protos.navigate.DriveTo.DangerZoneType.1
            @Override // com.google.v.eh
            public DangerZoneType findValueByNumber(int i2) {
                return DangerZoneType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class DangerZoneTypeVerifier implements ei {
            static final ei INSTANCE = new DangerZoneTypeVerifier();

            private DangerZoneTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return DangerZoneType.forNumber(i2) != null;
            }
        }

        DangerZoneType(int i2) {
            this.value = i2;
        }

        public static DangerZoneType forNumber(int i2) {
            if (i2 == -2) {
                return TILE_DID_NOT_LOAD;
            }
            if (i2 == -1) {
                return NOT_DANGER_ZONE;
            }
            if (i2 == 0) {
                return NORMAL;
            }
            if (i2 == 1) {
                return ISRAEL;
            }
            if (i2 != 2) {
                return null;
            }
            return OTHER;
        }

        public static eh<DangerZoneType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return DangerZoneTypeVerifier.INSTANCE;
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
        DriveTo driveTo = new DriveTo();
        DEFAULT_INSTANCE = driveTo;
        du.registerDefaultInstance(DriveTo.class, driveTo);
    }

    private DriveTo() {
    }

    public static DriveTo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DriveTo parseDelimitedFrom(InputStream inputStream) {
        return (DriveTo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DriveTo parseFrom(v vVar) {
        return (DriveTo) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<DriveTo> parser() {
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
            return new DriveTo();
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
        fo<DriveTo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (DriveTo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static Builder newBuilder(DriveTo driveTo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(driveTo);
    }

    public static DriveTo parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (DriveTo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static DriveTo parseFrom(v vVar, de deVar) {
        return (DriveTo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static DriveTo parseFrom(z zVar) {
        return (DriveTo) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static DriveTo parseFrom(z zVar, de deVar) {
        return (DriveTo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static DriveTo parseFrom(InputStream inputStream) {
        return (DriveTo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DriveTo parseFrom(InputStream inputStream, de deVar) {
        return (DriveTo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static DriveTo parseFrom(ByteBuffer byteBuffer) {
        return (DriveTo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DriveTo parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (DriveTo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static DriveTo parseFrom(byte[] bArr) {
        return (DriveTo) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DriveTo parseFrom(byte[] bArr, de deVar) {
        return (DriveTo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
