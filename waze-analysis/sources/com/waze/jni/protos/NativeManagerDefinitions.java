package com.waze.jni.protos;

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
public final class NativeManagerDefinitions extends du<NativeManagerDefinitions, Builder> implements NativeManagerDefinitionsOrBuilder {
    private static final NativeManagerDefinitions DEFAULT_INSTANCE;
    private static volatile fo<NativeManagerDefinitions> PARSER;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.NativeManagerDefinitions$1, reason: invalid class name */
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
    public enum AlertTickerType implements eg {
        BEEPBEEP(0),
        MESSAGE(1),
        SHARE_DRIVE(2),
        SHARE_LOCATION(3),
        UNRECOGNIZED(-1);

        public static final int BEEPBEEP_VALUE = 0;
        public static final int MESSAGE_VALUE = 1;
        public static final int SHARE_DRIVE_VALUE = 2;
        public static final int SHARE_LOCATION_VALUE = 3;
        private static final eh<AlertTickerType> internalValueMap = new eh<AlertTickerType>() { // from class: com.waze.jni.protos.NativeManagerDefinitions.AlertTickerType.1
            @Override // com.google.v.eh
            public AlertTickerType findValueByNumber(int i2) {
                return AlertTickerType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class AlertTickerTypeVerifier implements ei {
            static final ei INSTANCE = new AlertTickerTypeVerifier();

            private AlertTickerTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return AlertTickerType.forNumber(i2) != null;
            }
        }

        AlertTickerType(int i2) {
            this.value = i2;
        }

        public static AlertTickerType forNumber(int i2) {
            if (i2 == 0) {
                return BEEPBEEP;
            }
            if (i2 == 1) {
                return MESSAGE;
            }
            if (i2 == 2) {
                return SHARE_DRIVE;
            }
            if (i2 != 3) {
                return null;
            }
            return SHARE_LOCATION;
        }

        public static eh<AlertTickerType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return AlertTickerTypeVerifier.INSTANCE;
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
    public final class Builder extends dm<NativeManagerDefinitions, Builder> implements NativeManagerDefinitionsOrBuilder {
        private Builder() {
            super(NativeManagerDefinitions.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: WazeSource */
    public enum TimeOfDay implements eg {
        MORNING(0),
        AFTERNOON(1),
        EVENING(2),
        NIGHT(3),
        UNRECOGNIZED(-1);

        public static final int AFTERNOON_VALUE = 1;
        public static final int EVENING_VALUE = 2;
        public static final int MORNING_VALUE = 0;
        public static final int NIGHT_VALUE = 3;
        private static final eh<TimeOfDay> internalValueMap = new eh<TimeOfDay>() { // from class: com.waze.jni.protos.NativeManagerDefinitions.TimeOfDay.1
            @Override // com.google.v.eh
            public TimeOfDay findValueByNumber(int i2) {
                return TimeOfDay.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class TimeOfDayVerifier implements ei {
            static final ei INSTANCE = new TimeOfDayVerifier();

            private TimeOfDayVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return TimeOfDay.forNumber(i2) != null;
            }
        }

        TimeOfDay(int i2) {
            this.value = i2;
        }

        public static TimeOfDay forNumber(int i2) {
            if (i2 == 0) {
                return MORNING;
            }
            if (i2 == 1) {
                return AFTERNOON;
            }
            if (i2 == 2) {
                return EVENING;
            }
            if (i2 != 3) {
                return null;
            }
            return NIGHT;
        }

        public static eh<TimeOfDay> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return TimeOfDayVerifier.INSTANCE;
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
    public enum TooltipTypes implements eg {
        SHARE(0),
        NEW_VIEWER(1),
        ETA_UPDATE_SENT(2),
        ARRIVAL_SENT(3),
        DRIVE_ENDED(4),
        UNRECOGNIZED(-1);

        public static final int ARRIVAL_SENT_VALUE = 3;
        public static final int DRIVE_ENDED_VALUE = 4;
        public static final int ETA_UPDATE_SENT_VALUE = 2;
        public static final int NEW_VIEWER_VALUE = 1;
        public static final int SHARE_VALUE = 0;
        private static final eh<TooltipTypes> internalValueMap = new eh<TooltipTypes>() { // from class: com.waze.jni.protos.NativeManagerDefinitions.TooltipTypes.1
            @Override // com.google.v.eh
            public TooltipTypes findValueByNumber(int i2) {
                return TooltipTypes.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class TooltipTypesVerifier implements ei {
            static final ei INSTANCE = new TooltipTypesVerifier();

            private TooltipTypesVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return TooltipTypes.forNumber(i2) != null;
            }
        }

        TooltipTypes(int i2) {
            this.value = i2;
        }

        public static TooltipTypes forNumber(int i2) {
            if (i2 == 0) {
                return SHARE;
            }
            if (i2 == 1) {
                return NEW_VIEWER;
            }
            if (i2 == 2) {
                return ETA_UPDATE_SENT;
            }
            if (i2 == 3) {
                return ARRIVAL_SENT;
            }
            if (i2 != 4) {
                return null;
            }
            return DRIVE_ENDED;
        }

        public static eh<TooltipTypes> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return TooltipTypesVerifier.INSTANCE;
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
        NativeManagerDefinitions nativeManagerDefinitions = new NativeManagerDefinitions();
        DEFAULT_INSTANCE = nativeManagerDefinitions;
        du.registerDefaultInstance(NativeManagerDefinitions.class, nativeManagerDefinitions);
    }

    private NativeManagerDefinitions() {
    }

    public static NativeManagerDefinitions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NativeManagerDefinitions parseDelimitedFrom(InputStream inputStream) {
        return (NativeManagerDefinitions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeManagerDefinitions parseFrom(v vVar) {
        return (NativeManagerDefinitions) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NativeManagerDefinitions> parser() {
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
            return new NativeManagerDefinitions();
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
        fo<NativeManagerDefinitions> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NativeManagerDefinitions.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static Builder newBuilder(NativeManagerDefinitions nativeManagerDefinitions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nativeManagerDefinitions);
    }

    public static NativeManagerDefinitions parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NativeManagerDefinitions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NativeManagerDefinitions parseFrom(v vVar, de deVar) {
        return (NativeManagerDefinitions) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NativeManagerDefinitions parseFrom(z zVar) {
        return (NativeManagerDefinitions) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NativeManagerDefinitions parseFrom(z zVar, de deVar) {
        return (NativeManagerDefinitions) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NativeManagerDefinitions parseFrom(InputStream inputStream) {
        return (NativeManagerDefinitions) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeManagerDefinitions parseFrom(InputStream inputStream, de deVar) {
        return (NativeManagerDefinitions) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NativeManagerDefinitions parseFrom(ByteBuffer byteBuffer) {
        return (NativeManagerDefinitions) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeManagerDefinitions parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NativeManagerDefinitions) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static NativeManagerDefinitions parseFrom(byte[] bArr) {
        return (NativeManagerDefinitions) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeManagerDefinitions parseFrom(byte[] bArr, de deVar) {
        return (NativeManagerDefinitions) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
