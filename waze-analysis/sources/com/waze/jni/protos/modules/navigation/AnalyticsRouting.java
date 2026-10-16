package com.waze.jni.protos.modules.navigation;

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
public final class AnalyticsRouting extends du<AnalyticsRouting, Builder> implements AnalyticsRoutingOrBuilder {
    private static final AnalyticsRouting DEFAULT_INSTANCE;
    private static volatile fo<AnalyticsRouting> PARSER;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.modules.navigation.AnalyticsRouting$1, reason: invalid class name */
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
    public enum AnalyticsRoutingUseCase implements eg {
        USE_CASE_TRIP_OVERVIEW(0),
        UNRECOGNIZED(-1);

        public static final int USE_CASE_TRIP_OVERVIEW_VALUE = 0;
        private static final eh<AnalyticsRoutingUseCase> internalValueMap = new eh<AnalyticsRoutingUseCase>() { // from class: com.waze.jni.protos.modules.navigation.AnalyticsRouting.AnalyticsRoutingUseCase.1
            @Override // com.google.v.eh
            public AnalyticsRoutingUseCase findValueByNumber(int i2) {
                return AnalyticsRoutingUseCase.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class AnalyticsRoutingUseCaseVerifier implements ei {
            static final ei INSTANCE = new AnalyticsRoutingUseCaseVerifier();

            private AnalyticsRoutingUseCaseVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return AnalyticsRoutingUseCase.forNumber(i2) != null;
            }
        }

        AnalyticsRoutingUseCase(int i2) {
            this.value = i2;
        }

        public static AnalyticsRoutingUseCase forNumber(int i2) {
            if (i2 != 0) {
                return null;
            }
            return USE_CASE_TRIP_OVERVIEW;
        }

        public static eh<AnalyticsRoutingUseCase> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return AnalyticsRoutingUseCaseVerifier.INSTANCE;
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
    public final class Builder extends dm<AnalyticsRouting, Builder> implements AnalyticsRoutingOrBuilder {
        private Builder() {
            super(AnalyticsRouting.DEFAULT_INSTANCE);
        }
    }

    static {
        AnalyticsRouting analyticsRouting = new AnalyticsRouting();
        DEFAULT_INSTANCE = analyticsRouting;
        du.registerDefaultInstance(AnalyticsRouting.class, analyticsRouting);
    }

    private AnalyticsRouting() {
    }

    public static AnalyticsRouting getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AnalyticsRouting parseDelimitedFrom(InputStream inputStream) {
        return (AnalyticsRouting) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AnalyticsRouting parseFrom(v vVar) {
        return (AnalyticsRouting) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<AnalyticsRouting> parser() {
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
            return new AnalyticsRouting();
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
        fo<AnalyticsRouting> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (AnalyticsRouting.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static Builder newBuilder(AnalyticsRouting analyticsRouting) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(analyticsRouting);
    }

    public static AnalyticsRouting parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (AnalyticsRouting) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AnalyticsRouting parseFrom(v vVar, de deVar) {
        return (AnalyticsRouting) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static AnalyticsRouting parseFrom(z zVar) {
        return (AnalyticsRouting) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static AnalyticsRouting parseFrom(z zVar, de deVar) {
        return (AnalyticsRouting) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static AnalyticsRouting parseFrom(InputStream inputStream) {
        return (AnalyticsRouting) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AnalyticsRouting parseFrom(InputStream inputStream, de deVar) {
        return (AnalyticsRouting) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AnalyticsRouting parseFrom(ByteBuffer byteBuffer) {
        return (AnalyticsRouting) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AnalyticsRouting parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (AnalyticsRouting) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static AnalyticsRouting parseFrom(byte[] bArr) {
        return (AnalyticsRouting) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AnalyticsRouting parseFrom(byte[] bArr, de deVar) {
        return (AnalyticsRouting) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
