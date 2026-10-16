package com.google.android.libraries.assistant.appintegration.proto;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class MorrisEligibilityStatusProto extends du<MorrisEligibilityStatusProto, Builder> implements MorrisEligibilityStatusProtoOrBuilder {
    private static final MorrisEligibilityStatusProto DEFAULT_INSTANCE;
    private static volatile fo<MorrisEligibilityStatusProto> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int status_;

    /* compiled from: WazeSource */
    /* renamed from: com.google.android.libraries.assistant.appintegration.proto.MorrisEligibilityStatusProto$1, reason: invalid class name */
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
    public final class Builder extends dm<MorrisEligibilityStatusProto, Builder> implements MorrisEligibilityStatusProtoOrBuilder {
        private Builder() {
            super(MorrisEligibilityStatusProto.DEFAULT_INSTANCE);
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((MorrisEligibilityStatusProto) this.instance).clearStatus();
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.MorrisEligibilityStatusProtoOrBuilder
        public MorrisEligibilityStatus getStatus() {
            return ((MorrisEligibilityStatusProto) this.instance).getStatus();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.MorrisEligibilityStatusProtoOrBuilder
        public boolean hasStatus() {
            return ((MorrisEligibilityStatusProto) this.instance).hasStatus();
        }

        public Builder setStatus(MorrisEligibilityStatus morrisEligibilityStatus) {
            copyOnWrite();
            ((MorrisEligibilityStatusProto) this.instance).setStatus(morrisEligibilityStatus);
            return this;
        }
    }

    static {
        MorrisEligibilityStatusProto morrisEligibilityStatusProto = new MorrisEligibilityStatusProto();
        DEFAULT_INSTANCE = morrisEligibilityStatusProto;
        du.registerDefaultInstance(MorrisEligibilityStatusProto.class, morrisEligibilityStatusProto);
    }

    private MorrisEligibilityStatusProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.bitField0_ &= -2;
        this.status_ = 0;
    }

    public static MorrisEligibilityStatusProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MorrisEligibilityStatusProto parseDelimitedFrom(InputStream inputStream) {
        return (MorrisEligibilityStatusProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MorrisEligibilityStatusProto parseFrom(v vVar) {
        return (MorrisEligibilityStatusProto) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MorrisEligibilityStatusProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(MorrisEligibilityStatus morrisEligibilityStatus) {
        this.status_ = morrisEligibilityStatus.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "status_", MorrisEligibilityStatus.internalGetVerifier()});
        }
        if (iOrdinal == 3) {
            return new MorrisEligibilityStatusProto();
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
        fo<MorrisEligibilityStatusProto> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MorrisEligibilityStatusProto.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.MorrisEligibilityStatusProtoOrBuilder
    public MorrisEligibilityStatus getStatus() {
        MorrisEligibilityStatus morrisEligibilityStatusForNumber = MorrisEligibilityStatus.forNumber(this.status_);
        return morrisEligibilityStatusForNumber == null ? MorrisEligibilityStatus.UNKNOWN : morrisEligibilityStatusForNumber;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.MorrisEligibilityStatusProtoOrBuilder
    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(MorrisEligibilityStatusProto morrisEligibilityStatusProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(morrisEligibilityStatusProto);
    }

    public static MorrisEligibilityStatusProto parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MorrisEligibilityStatusProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MorrisEligibilityStatusProto parseFrom(v vVar, de deVar) {
        return (MorrisEligibilityStatusProto) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MorrisEligibilityStatusProto parseFrom(z zVar) {
        return (MorrisEligibilityStatusProto) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MorrisEligibilityStatusProto parseFrom(z zVar, de deVar) {
        return (MorrisEligibilityStatusProto) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MorrisEligibilityStatusProto parseFrom(InputStream inputStream) {
        return (MorrisEligibilityStatusProto) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MorrisEligibilityStatusProto parseFrom(InputStream inputStream, de deVar) {
        return (MorrisEligibilityStatusProto) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MorrisEligibilityStatusProto parseFrom(ByteBuffer byteBuffer) {
        return (MorrisEligibilityStatusProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MorrisEligibilityStatusProto parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MorrisEligibilityStatusProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static MorrisEligibilityStatusProto parseFrom(byte[] bArr) {
        return (MorrisEligibilityStatusProto) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MorrisEligibilityStatusProto parseFrom(byte[] bArr, de deVar) {
        return (MorrisEligibilityStatusProto) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
