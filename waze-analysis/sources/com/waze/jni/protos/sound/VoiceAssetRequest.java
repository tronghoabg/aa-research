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
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VoiceAssetRequest extends du<VoiceAssetRequest, Builder> implements VoiceAssetRequestOrBuilder {
    public static final int BYTES_FIELD_NUMBER = 2;
    private static final VoiceAssetRequest DEFAULT_INSTANCE;
    private static volatile fo<VoiceAssetRequest> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private v bytes_ = v.f13054a;
    private String requestId_ = "";
    private int type_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.sound.VoiceAssetRequest$1, reason: invalid class name */
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
    public final class Builder extends dm<VoiceAssetRequest, Builder> implements VoiceAssetRequestOrBuilder {
        private Builder() {
            super(VoiceAssetRequest.DEFAULT_INSTANCE);
        }

        public Builder clearBytes() {
            copyOnWrite();
            ((VoiceAssetRequest) this.instance).clearBytes();
            return this;
        }

        public Builder clearRequestId() {
            copyOnWrite();
            ((VoiceAssetRequest) this.instance).clearRequestId();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((VoiceAssetRequest) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetRequestOrBuilder
        public v getBytes() {
            return ((VoiceAssetRequest) this.instance).getBytes();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetRequestOrBuilder
        public String getRequestId() {
            return ((VoiceAssetRequest) this.instance).getRequestId();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetRequestOrBuilder
        public v getRequestIdBytes() {
            return ((VoiceAssetRequest) this.instance).getRequestIdBytes();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetRequestOrBuilder
        public Type getType() {
            return ((VoiceAssetRequest) this.instance).getType();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetRequestOrBuilder
        public int getTypeValue() {
            return ((VoiceAssetRequest) this.instance).getTypeValue();
        }

        public Builder setBytes(v vVar) {
            copyOnWrite();
            ((VoiceAssetRequest) this.instance).setBytes(vVar);
            return this;
        }

        public Builder setRequestId(String str) {
            copyOnWrite();
            ((VoiceAssetRequest) this.instance).setRequestId(str);
            return this;
        }

        public Builder setRequestIdBytes(v vVar) {
            copyOnWrite();
            ((VoiceAssetRequest) this.instance).setRequestIdBytes(vVar);
            return this;
        }

        public Builder setType(Type type) {
            copyOnWrite();
            ((VoiceAssetRequest) this.instance).setType(type);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((VoiceAssetRequest) this.instance).setTypeValue(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum Type implements eg {
        REROUTE_SUGGESTION(0),
        UNRECOGNIZED(-1);

        public static final int REROUTE_SUGGESTION_VALUE = 0;
        private static final eh<Type> internalValueMap = new eh<Type>() { // from class: com.waze.jni.protos.sound.VoiceAssetRequest.Type.1
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
            if (i2 != 0) {
                return null;
            }
            return REROUTE_SUGGESTION;
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
        VoiceAssetRequest voiceAssetRequest = new VoiceAssetRequest();
        DEFAULT_INSTANCE = voiceAssetRequest;
        du.registerDefaultInstance(VoiceAssetRequest.class, voiceAssetRequest);
    }

    private VoiceAssetRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytes() {
        this.bytes_ = getDefaultInstance().getBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static VoiceAssetRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static VoiceAssetRequest parseDelimitedFrom(InputStream inputStream) {
        return (VoiceAssetRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VoiceAssetRequest parseFrom(v vVar) {
        return (VoiceAssetRequest) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<VoiceAssetRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytes(v vVar) {
        Objects.requireNonNull(vVar);
        this.bytes_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(String str) {
        Objects.requireNonNull(str);
        this.requestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.requestId_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\n\u0003Ȉ", new Object[]{"type_", "bytes_", "requestId_"});
        }
        if (iOrdinal == 3) {
            return new VoiceAssetRequest();
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
        fo<VoiceAssetRequest> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (VoiceAssetRequest.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetRequestOrBuilder
    public v getBytes() {
        return this.bytes_;
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetRequestOrBuilder
    public String getRequestId() {
        return this.requestId_;
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetRequestOrBuilder
    public v getRequestIdBytes() {
        return v.s(this.requestId_);
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetRequestOrBuilder
    public Type getType() {
        Type typeForNumber = Type.forNumber(this.type_);
        return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetRequestOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    public static Builder newBuilder(VoiceAssetRequest voiceAssetRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(voiceAssetRequest);
    }

    public static VoiceAssetRequest parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (VoiceAssetRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VoiceAssetRequest parseFrom(v vVar, de deVar) {
        return (VoiceAssetRequest) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static VoiceAssetRequest parseFrom(z zVar) {
        return (VoiceAssetRequest) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static VoiceAssetRequest parseFrom(z zVar, de deVar) {
        return (VoiceAssetRequest) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static VoiceAssetRequest parseFrom(InputStream inputStream) {
        return (VoiceAssetRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VoiceAssetRequest parseFrom(InputStream inputStream, de deVar) {
        return (VoiceAssetRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VoiceAssetRequest parseFrom(ByteBuffer byteBuffer) {
        return (VoiceAssetRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VoiceAssetRequest parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (VoiceAssetRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static VoiceAssetRequest parseFrom(byte[] bArr) {
        return (VoiceAssetRequest) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VoiceAssetRequest parseFrom(byte[] bArr, de deVar) {
        return (VoiceAssetRequest) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
