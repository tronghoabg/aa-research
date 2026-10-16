package com.waze.jni.protos.sound;

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
public final class GuidanceMode extends du<GuidanceMode, Builder> implements GuidanceModeOrBuilder {
    private static final GuidanceMode DEFAULT_INSTANCE;
    private static volatile fo<GuidanceMode> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.sound.GuidanceMode$1, reason: invalid class name */
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
    public final class Builder extends dm<GuidanceMode, Builder> implements GuidanceModeOrBuilder {
        private Builder() {
            super(GuidanceMode.DEFAULT_INSTANCE);
        }

        public Builder clearType() {
            copyOnWrite();
            ((GuidanceMode) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.sound.GuidanceModeOrBuilder
        public Type getType() {
            return ((GuidanceMode) this.instance).getType();
        }

        @Override // com.waze.jni.protos.sound.GuidanceModeOrBuilder
        public int getTypeValue() {
            return ((GuidanceMode) this.instance).getTypeValue();
        }

        public Builder setType(Type type) {
            copyOnWrite();
            ((GuidanceMode) this.instance).setType(type);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((GuidanceMode) this.instance).setTypeValue(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum Type implements eg {
        FULL(0),
        BRIEF(1),
        SMART(2),
        ALERTS(3),
        OFF(4),
        UNRECOGNIZED(-1);

        public static final int ALERTS_VALUE = 3;
        public static final int BRIEF_VALUE = 1;
        public static final int FULL_VALUE = 0;
        public static final int OFF_VALUE = 4;
        public static final int SMART_VALUE = 2;
        private static final eh<Type> internalValueMap = new eh<Type>() { // from class: com.waze.jni.protos.sound.GuidanceMode.Type.1
            @Override // com.google.v.eh
            public Type findValueByNumber(int i2) {
                return Type.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class TypeVerifier implements ei {
            static final ei INSTANCE = new TypeVerifier();

            private TypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return Type.forNumber(i2) != null;
            }
        }

        Type(int i2) {
            this.value = i2;
        }

        public static Type forNumber(int i2) {
            if (i2 == 0) {
                return FULL;
            }
            if (i2 == 1) {
                return BRIEF;
            }
            if (i2 == 2) {
                return SMART;
            }
            if (i2 == 3) {
                return ALERTS;
            }
            if (i2 != 4) {
                return null;
            }
            return OFF;
        }

        public static eh<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return TypeVerifier.INSTANCE;
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
        GuidanceMode guidanceMode = new GuidanceMode();
        DEFAULT_INSTANCE = guidanceMode;
        du.registerDefaultInstance(GuidanceMode.class, guidanceMode);
    }

    private GuidanceMode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static GuidanceMode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GuidanceMode parseDelimitedFrom(InputStream inputStream) {
        return (GuidanceMode) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GuidanceMode parseFrom(v vVar) {
        return (GuidanceMode) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<GuidanceMode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(Type type) {
        this.type_ = type.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
        }
        if (iOrdinal == 3) {
            return new GuidanceMode();
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
        fo<GuidanceMode> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (GuidanceMode.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.sound.GuidanceModeOrBuilder
    public Type getType() {
        Type typeForNumber = Type.forNumber(this.type_);
        return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
    }

    @Override // com.waze.jni.protos.sound.GuidanceModeOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    public static Builder newBuilder(GuidanceMode guidanceMode) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(guidanceMode);
    }

    public static GuidanceMode parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (GuidanceMode) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GuidanceMode parseFrom(v vVar, de deVar) {
        return (GuidanceMode) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static GuidanceMode parseFrom(z zVar) {
        return (GuidanceMode) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static GuidanceMode parseFrom(z zVar, de deVar) {
        return (GuidanceMode) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static GuidanceMode parseFrom(InputStream inputStream) {
        return (GuidanceMode) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GuidanceMode parseFrom(InputStream inputStream, de deVar) {
        return (GuidanceMode) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GuidanceMode parseFrom(ByteBuffer byteBuffer) {
        return (GuidanceMode) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static GuidanceMode parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (GuidanceMode) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static GuidanceMode parseFrom(byte[] bArr) {
        return (GuidanceMode) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GuidanceMode parseFrom(byte[] bArr, de deVar) {
        return (GuidanceMode) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
