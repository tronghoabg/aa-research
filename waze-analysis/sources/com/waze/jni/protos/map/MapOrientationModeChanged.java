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
public final class MapOrientationModeChanged extends du<MapOrientationModeChanged, Builder> implements MapOrientationModeChangedOrBuilder {
    private static final MapOrientationModeChanged DEFAULT_INSTANCE;
    public static final int ORIENTATION_MODE_FIELD_NUMBER = 1;
    private static volatile fo<MapOrientationModeChanged> PARSER;
    private int orientationMode_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.MapOrientationModeChanged$1, reason: invalid class name */
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
    public final class Builder extends dm<MapOrientationModeChanged, Builder> implements MapOrientationModeChangedOrBuilder {
        private Builder() {
            super(MapOrientationModeChanged.DEFAULT_INSTANCE);
        }

        public Builder clearOrientationMode() {
            copyOnWrite();
            ((MapOrientationModeChanged) this.instance).clearOrientationMode();
            return this;
        }

        @Override // com.waze.jni.protos.map.MapOrientationModeChangedOrBuilder
        public OrientationMode getOrientationMode() {
            return ((MapOrientationModeChanged) this.instance).getOrientationMode();
        }

        @Override // com.waze.jni.protos.map.MapOrientationModeChangedOrBuilder
        public int getOrientationModeValue() {
            return ((MapOrientationModeChanged) this.instance).getOrientationModeValue();
        }

        public Builder setOrientationMode(OrientationMode orientationMode) {
            copyOnWrite();
            ((MapOrientationModeChanged) this.instance).setOrientationMode(orientationMode);
            return this;
        }

        public Builder setOrientationModeValue(int i2) {
            copyOnWrite();
            ((MapOrientationModeChanged) this.instance).setOrientationModeValue(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum OrientationMode implements eg {
        DYNAMIC(0),
        FIXED(1),
        UNRECOGNIZED(-1);

        public static final int DYNAMIC_VALUE = 0;
        public static final int FIXED_VALUE = 1;
        private static final eh<OrientationMode> internalValueMap = new eh<OrientationMode>() { // from class: com.waze.jni.protos.map.MapOrientationModeChanged.OrientationMode.1
            @Override // com.google.v.eh
            public OrientationMode findValueByNumber(int i2) {
                return OrientationMode.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class OrientationModeVerifier implements ei {
            static final ei INSTANCE = new OrientationModeVerifier();

            private OrientationModeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return OrientationMode.forNumber(i2) != null;
            }
        }

        OrientationMode(int i2) {
            this.value = i2;
        }

        public static OrientationMode forNumber(int i2) {
            if (i2 == 0) {
                return DYNAMIC;
            }
            if (i2 != 1) {
                return null;
            }
            return FIXED;
        }

        public static eh<OrientationMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return OrientationModeVerifier.INSTANCE;
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
        MapOrientationModeChanged mapOrientationModeChanged = new MapOrientationModeChanged();
        DEFAULT_INSTANCE = mapOrientationModeChanged;
        du.registerDefaultInstance(MapOrientationModeChanged.class, mapOrientationModeChanged);
    }

    private MapOrientationModeChanged() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrientationMode() {
        this.orientationMode_ = 0;
    }

    public static MapOrientationModeChanged getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MapOrientationModeChanged parseDelimitedFrom(InputStream inputStream) {
        return (MapOrientationModeChanged) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapOrientationModeChanged parseFrom(v vVar) {
        return (MapOrientationModeChanged) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MapOrientationModeChanged> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrientationMode(OrientationMode orientationMode) {
        this.orientationMode_ = orientationMode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrientationModeValue(int i2) {
        this.orientationMode_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"orientationMode_"});
        }
        if (iOrdinal == 3) {
            return new MapOrientationModeChanged();
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
        fo<MapOrientationModeChanged> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MapOrientationModeChanged.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.MapOrientationModeChangedOrBuilder
    public OrientationMode getOrientationMode() {
        OrientationMode orientationModeForNumber = OrientationMode.forNumber(this.orientationMode_);
        return orientationModeForNumber == null ? OrientationMode.UNRECOGNIZED : orientationModeForNumber;
    }

    @Override // com.waze.jni.protos.map.MapOrientationModeChangedOrBuilder
    public int getOrientationModeValue() {
        return this.orientationMode_;
    }

    public static Builder newBuilder(MapOrientationModeChanged mapOrientationModeChanged) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mapOrientationModeChanged);
    }

    public static MapOrientationModeChanged parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MapOrientationModeChanged) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapOrientationModeChanged parseFrom(v vVar, de deVar) {
        return (MapOrientationModeChanged) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MapOrientationModeChanged parseFrom(z zVar) {
        return (MapOrientationModeChanged) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MapOrientationModeChanged parseFrom(z zVar, de deVar) {
        return (MapOrientationModeChanged) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MapOrientationModeChanged parseFrom(InputStream inputStream) {
        return (MapOrientationModeChanged) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapOrientationModeChanged parseFrom(InputStream inputStream, de deVar) {
        return (MapOrientationModeChanged) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapOrientationModeChanged parseFrom(ByteBuffer byteBuffer) {
        return (MapOrientationModeChanged) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MapOrientationModeChanged parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MapOrientationModeChanged) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static MapOrientationModeChanged parseFrom(byte[] bArr) {
        return (MapOrientationModeChanged) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MapOrientationModeChanged parseFrom(byte[] bArr, de deVar) {
        return (MapOrientationModeChanged) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
