package com.waze.jni.protos.map;

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
public final class WazeMapInitialization extends du<WazeMapInitialization, Builder> implements WazeMapInitializationOrBuilder {
    private static final WazeMapInitialization DEFAULT_INSTANCE;
    public static final int MAP_USAGE_TYPE_FIELD_NUMBER = 1;
    private static volatile fo<WazeMapInitialization> PARSER;
    private int mapUsageType_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.WazeMapInitialization$1, reason: invalid class name */
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
    public final class Builder extends dm<WazeMapInitialization, Builder> implements WazeMapInitializationOrBuilder {
        private Builder() {
            super(WazeMapInitialization.DEFAULT_INSTANCE);
        }

        public Builder clearMapUsageType() {
            copyOnWrite();
            ((WazeMapInitialization) this.instance).clearMapUsageType();
            return this;
        }

        @Override // com.waze.jni.protos.map.WazeMapInitializationOrBuilder
        public MapUsageType getMapUsageType() {
            return ((WazeMapInitialization) this.instance).getMapUsageType();
        }

        @Override // com.waze.jni.protos.map.WazeMapInitializationOrBuilder
        public int getMapUsageTypeValue() {
            return ((WazeMapInitialization) this.instance).getMapUsageTypeValue();
        }

        public Builder setMapUsageType(MapUsageType mapUsageType) {
            copyOnWrite();
            ((WazeMapInitialization) this.instance).setMapUsageType(mapUsageType);
            return this;
        }

        public Builder setMapUsageTypeValue(int i2) {
            copyOnWrite();
            ((WazeMapInitialization) this.instance).setMapUsageTypeValue(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum MapUsageType implements eg {
        TYPE_UNKNOWN(0),
        TYPE_MAIN_FOR_MOBILE(1),
        TYPE_MAIN_FOR_INCAR(2),
        UNRECOGNIZED(-1);

        public static final int TYPE_MAIN_FOR_INCAR_VALUE = 2;
        public static final int TYPE_MAIN_FOR_MOBILE_VALUE = 1;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        private static final eh<MapUsageType> internalValueMap = new eh<MapUsageType>() { // from class: com.waze.jni.protos.map.WazeMapInitialization.MapUsageType.1
            @Override // com.google.v.eh
            public MapUsageType findValueByNumber(int i2) {
                return MapUsageType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class MapUsageTypeVerifier implements ei {
            static final ei INSTANCE = new MapUsageTypeVerifier();

            private MapUsageTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return MapUsageType.forNumber(i2) != null;
            }
        }

        MapUsageType(int i2) {
            this.value = i2;
        }

        public static MapUsageType forNumber(int i2) {
            if (i2 == 0) {
                return TYPE_UNKNOWN;
            }
            if (i2 == 1) {
                return TYPE_MAIN_FOR_MOBILE;
            }
            if (i2 != 2) {
                return null;
            }
            return TYPE_MAIN_FOR_INCAR;
        }

        public static eh<MapUsageType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return MapUsageTypeVerifier.INSTANCE;
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
        WazeMapInitialization wazeMapInitialization = new WazeMapInitialization();
        DEFAULT_INSTANCE = wazeMapInitialization;
        du.registerDefaultInstance(WazeMapInitialization.class, wazeMapInitialization);
    }

    private WazeMapInitialization() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapUsageType() {
        this.mapUsageType_ = 0;
    }

    public static WazeMapInitialization getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static WazeMapInitialization parseDelimitedFrom(InputStream inputStream) {
        return (WazeMapInitialization) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WazeMapInitialization parseFrom(v vVar) {
        return (WazeMapInitialization) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<WazeMapInitialization> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapUsageType(MapUsageType mapUsageType) {
        this.mapUsageType_ = mapUsageType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapUsageTypeValue(int i2) {
        this.mapUsageType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"mapUsageType_"});
        }
        if (iOrdinal == 3) {
            return new WazeMapInitialization();
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
        fo<WazeMapInitialization> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (WazeMapInitialization.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.WazeMapInitializationOrBuilder
    public MapUsageType getMapUsageType() {
        MapUsageType mapUsageTypeForNumber = MapUsageType.forNumber(this.mapUsageType_);
        return mapUsageTypeForNumber == null ? MapUsageType.UNRECOGNIZED : mapUsageTypeForNumber;
    }

    @Override // com.waze.jni.protos.map.WazeMapInitializationOrBuilder
    public int getMapUsageTypeValue() {
        return this.mapUsageType_;
    }

    public static Builder newBuilder(WazeMapInitialization wazeMapInitialization) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(wazeMapInitialization);
    }

    public static WazeMapInitialization parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (WazeMapInitialization) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static WazeMapInitialization parseFrom(v vVar, de deVar) {
        return (WazeMapInitialization) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static WazeMapInitialization parseFrom(z zVar) {
        return (WazeMapInitialization) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static WazeMapInitialization parseFrom(z zVar, de deVar) {
        return (WazeMapInitialization) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static WazeMapInitialization parseFrom(InputStream inputStream) {
        return (WazeMapInitialization) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WazeMapInitialization parseFrom(InputStream inputStream, de deVar) {
        return (WazeMapInitialization) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static WazeMapInitialization parseFrom(ByteBuffer byteBuffer) {
        return (WazeMapInitialization) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static WazeMapInitialization parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (WazeMapInitialization) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static WazeMapInitialization parseFrom(byte[] bArr) {
        return (WazeMapInitialization) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WazeMapInitialization parseFrom(byte[] bArr, de deVar) {
        return (WazeMapInitialization) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
