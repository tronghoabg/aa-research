package com.waze.jni.protos.canvas;

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
public final class LocationPickerCanvas extends du<LocationPickerCanvas, Builder> implements LocationPickerCanvasOrBuilder {
    private static final LocationPickerCanvas DEFAULT_INSTANCE;
    private static volatile fo<LocationPickerCanvas> PARSER;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.canvas.LocationPickerCanvas$1, reason: invalid class name */
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
    public final class Builder extends dm<LocationPickerCanvas, Builder> implements LocationPickerCanvasOrBuilder {
        private Builder() {
            super(LocationPickerCanvas.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: WazeSource */
    public enum PinMode implements eg {
        NO_PIN(0),
        ROADSIDE_ONLY(1),
        FULL(2),
        UNRECOGNIZED(-1);

        public static final int FULL_VALUE = 2;
        public static final int NO_PIN_VALUE = 0;
        public static final int ROADSIDE_ONLY_VALUE = 1;
        private static final eh<PinMode> internalValueMap = new eh<PinMode>() { // from class: com.waze.jni.protos.canvas.LocationPickerCanvas.PinMode.1
            @Override // com.google.v.eh
            public PinMode findValueByNumber(int i2) {
                return PinMode.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class PinModeVerifier implements ei {
            static final ei INSTANCE = new PinModeVerifier();

            private PinModeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return PinMode.forNumber(i2) != null;
            }
        }

        PinMode(int i2) {
            this.value = i2;
        }

        public static PinMode forNumber(int i2) {
            if (i2 == 0) {
                return NO_PIN;
            }
            if (i2 == 1) {
                return ROADSIDE_ONLY;
            }
            if (i2 != 2) {
                return null;
            }
            return FULL;
        }

        public static eh<PinMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return PinModeVerifier.INSTANCE;
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
        LocationPickerCanvas locationPickerCanvas = new LocationPickerCanvas();
        DEFAULT_INSTANCE = locationPickerCanvas;
        du.registerDefaultInstance(LocationPickerCanvas.class, locationPickerCanvas);
    }

    private LocationPickerCanvas() {
    }

    public static LocationPickerCanvas getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static LocationPickerCanvas parseDelimitedFrom(InputStream inputStream) {
        return (LocationPickerCanvas) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocationPickerCanvas parseFrom(v vVar) {
        return (LocationPickerCanvas) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<LocationPickerCanvas> parser() {
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
            return new LocationPickerCanvas();
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
        fo<LocationPickerCanvas> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (LocationPickerCanvas.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static Builder newBuilder(LocationPickerCanvas locationPickerCanvas) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(locationPickerCanvas);
    }

    public static LocationPickerCanvas parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (LocationPickerCanvas) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static LocationPickerCanvas parseFrom(v vVar, de deVar) {
        return (LocationPickerCanvas) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static LocationPickerCanvas parseFrom(z zVar) {
        return (LocationPickerCanvas) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static LocationPickerCanvas parseFrom(z zVar, de deVar) {
        return (LocationPickerCanvas) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static LocationPickerCanvas parseFrom(InputStream inputStream) {
        return (LocationPickerCanvas) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocationPickerCanvas parseFrom(InputStream inputStream, de deVar) {
        return (LocationPickerCanvas) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static LocationPickerCanvas parseFrom(ByteBuffer byteBuffer) {
        return (LocationPickerCanvas) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static LocationPickerCanvas parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (LocationPickerCanvas) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static LocationPickerCanvas parseFrom(byte[] bArr) {
        return (LocationPickerCanvas) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LocationPickerCanvas parseFrom(byte[] bArr, de deVar) {
        return (LocationPickerCanvas) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
