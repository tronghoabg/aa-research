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
public final class EtaLabelDefinitions extends du<EtaLabelDefinitions, Builder> implements EtaLabelDefinitionsOrBuilder {
    private static final EtaLabelDefinitions DEFAULT_INSTANCE;
    private static volatile fo<EtaLabelDefinitions> PARSER;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.EtaLabelDefinitions$1, reason: invalid class name */
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
    public final class Builder extends dm<EtaLabelDefinitions, Builder> implements EtaLabelDefinitionsOrBuilder {
        private Builder() {
            super(EtaLabelDefinitions.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: WazeSource */
    public enum PinAlignment implements eg {
        TOP_RIGHT(0),
        BOTTOM_RIGHT(1),
        BOTTOM_LEFT(2),
        TOP_LEFT(3),
        UNRECOGNIZED(-1);

        public static final int BOTTOM_LEFT_VALUE = 2;
        public static final int BOTTOM_RIGHT_VALUE = 1;
        public static final int TOP_LEFT_VALUE = 3;
        public static final int TOP_RIGHT_VALUE = 0;
        private static final eh<PinAlignment> internalValueMap = new eh<PinAlignment>() { // from class: com.waze.jni.protos.EtaLabelDefinitions.PinAlignment.1
            @Override // com.google.v.eh
            public PinAlignment findValueByNumber(int i2) {
                return PinAlignment.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class PinAlignmentVerifier implements ei {
            static final ei INSTANCE = new PinAlignmentVerifier();

            private PinAlignmentVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return PinAlignment.forNumber(i2) != null;
            }
        }

        PinAlignment(int i2) {
            this.value = i2;
        }

        public static PinAlignment forNumber(int i2) {
            if (i2 == 0) {
                return TOP_RIGHT;
            }
            if (i2 == 1) {
                return BOTTOM_RIGHT;
            }
            if (i2 == 2) {
                return BOTTOM_LEFT;
            }
            if (i2 != 3) {
                return null;
            }
            return TOP_LEFT;
        }

        public static eh<PinAlignment> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return PinAlignmentVerifier.INSTANCE;
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
        EtaLabelDefinitions etaLabelDefinitions = new EtaLabelDefinitions();
        DEFAULT_INSTANCE = etaLabelDefinitions;
        du.registerDefaultInstance(EtaLabelDefinitions.class, etaLabelDefinitions);
    }

    private EtaLabelDefinitions() {
    }

    public static EtaLabelDefinitions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EtaLabelDefinitions parseDelimitedFrom(InputStream inputStream) {
        return (EtaLabelDefinitions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EtaLabelDefinitions parseFrom(v vVar) {
        return (EtaLabelDefinitions) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<EtaLabelDefinitions> parser() {
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
            return new EtaLabelDefinitions();
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
        fo<EtaLabelDefinitions> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (EtaLabelDefinitions.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static Builder newBuilder(EtaLabelDefinitions etaLabelDefinitions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(etaLabelDefinitions);
    }

    public static EtaLabelDefinitions parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (EtaLabelDefinitions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EtaLabelDefinitions parseFrom(v vVar, de deVar) {
        return (EtaLabelDefinitions) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static EtaLabelDefinitions parseFrom(z zVar) {
        return (EtaLabelDefinitions) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static EtaLabelDefinitions parseFrom(z zVar, de deVar) {
        return (EtaLabelDefinitions) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static EtaLabelDefinitions parseFrom(InputStream inputStream) {
        return (EtaLabelDefinitions) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EtaLabelDefinitions parseFrom(InputStream inputStream, de deVar) {
        return (EtaLabelDefinitions) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EtaLabelDefinitions parseFrom(ByteBuffer byteBuffer) {
        return (EtaLabelDefinitions) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EtaLabelDefinitions parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (EtaLabelDefinitions) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static EtaLabelDefinitions parseFrom(byte[] bArr) {
        return (EtaLabelDefinitions) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EtaLabelDefinitions parseFrom(byte[] bArr, de deVar) {
        return (EtaLabelDefinitions) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
