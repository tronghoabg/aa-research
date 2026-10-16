package com.waze.jni.protos.rtalerts;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.location.ProviderPosition;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ReportLocationProto extends du<ReportLocationProto, Builder> implements ReportLocationProtoOrBuilder {
    private static final ReportLocationProto DEFAULT_INSTANCE;
    public static final int FROM_NODE_DB_ID_FIELD_NUMBER = 2;
    private static volatile fo<ReportLocationProto> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    public static final int TO_NODE_DB_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private long fromNodeDbId_;
    private ProviderPosition position_;
    private long toNodeDbId_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.rtalerts.ReportLocationProto$1, reason: invalid class name */
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

    static {
        ReportLocationProto reportLocationProto = new ReportLocationProto();
        DEFAULT_INSTANCE = reportLocationProto;
        du.registerDefaultInstance(ReportLocationProto.class, reportLocationProto);
    }

    private ReportLocationProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNodeDbId() {
        this.bitField0_ &= -3;
        this.fromNodeDbId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToNodeDbId() {
        this.bitField0_ &= -5;
        this.toNodeDbId_ = 0L;
    }

    public static ReportLocationProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(ProviderPosition providerPosition) {
        Objects.requireNonNull(providerPosition);
        ProviderPosition providerPosition2 = this.position_;
        if (providerPosition2 != null && providerPosition2 != ProviderPosition.getDefaultInstance()) {
            ProviderPosition.Builder builderNewBuilder = ProviderPosition.newBuilder(providerPosition2);
            builderNewBuilder.mergeFrom((ProviderPosition.Builder) providerPosition);
            providerPosition = builderNewBuilder.buildPartial();
        }
        this.position_ = providerPosition;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ReportLocationProto parseDelimitedFrom(InputStream inputStream) {
        return (ReportLocationProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReportLocationProto parseFrom(v vVar) {
        return (ReportLocationProto) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ReportLocationProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNodeDbId(long j2) {
        this.bitField0_ |= 2;
        this.fromNodeDbId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(ProviderPosition providerPosition) {
        Objects.requireNonNull(providerPosition);
        this.position_ = providerPosition;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToNodeDbId(long j2) {
        this.bitField0_ |= 4;
        this.toNodeDbId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "position_", "fromNodeDbId_", "toNodeDbId_"});
        }
        if (iOrdinal == 3) {
            return new ReportLocationProto();
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
        fo<ReportLocationProto> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ReportLocationProto.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.rtalerts.ReportLocationProtoOrBuilder
    public long getFromNodeDbId() {
        return this.fromNodeDbId_;
    }

    @Override // com.waze.jni.protos.rtalerts.ReportLocationProtoOrBuilder
    public ProviderPosition getPosition() {
        ProviderPosition providerPosition = this.position_;
        return providerPosition == null ? ProviderPosition.getDefaultInstance() : providerPosition;
    }

    @Override // com.waze.jni.protos.rtalerts.ReportLocationProtoOrBuilder
    public long getToNodeDbId() {
        return this.toNodeDbId_;
    }

    @Override // com.waze.jni.protos.rtalerts.ReportLocationProtoOrBuilder
    public boolean hasFromNodeDbId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.rtalerts.ReportLocationProtoOrBuilder
    public boolean hasPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.rtalerts.ReportLocationProtoOrBuilder
    public boolean hasToNodeDbId() {
        return (this.bitField0_ & 4) != 0;
    }

    public static Builder newBuilder(ReportLocationProto reportLocationProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(reportLocationProto);
    }

    public static ReportLocationProto parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ReportLocationProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ReportLocationProto parseFrom(v vVar, de deVar) {
        return (ReportLocationProto) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ReportLocationProto parseFrom(z zVar) {
        return (ReportLocationProto) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ReportLocationProto parseFrom(z zVar, de deVar) {
        return (ReportLocationProto) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ReportLocationProto parseFrom(InputStream inputStream) {
        return (ReportLocationProto) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReportLocationProto parseFrom(InputStream inputStream, de deVar) {
        return (ReportLocationProto) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ReportLocationProto parseFrom(ByteBuffer byteBuffer) {
        return (ReportLocationProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ReportLocationProto parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ReportLocationProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<ReportLocationProto, Builder> implements ReportLocationProtoOrBuilder {
        private Builder() {
            super(ReportLocationProto.DEFAULT_INSTANCE);
        }

        public Builder clearFromNodeDbId() {
            copyOnWrite();
            ((ReportLocationProto) this.instance).clearFromNodeDbId();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((ReportLocationProto) this.instance).clearPosition();
            return this;
        }

        public Builder clearToNodeDbId() {
            copyOnWrite();
            ((ReportLocationProto) this.instance).clearToNodeDbId();
            return this;
        }

        @Override // com.waze.jni.protos.rtalerts.ReportLocationProtoOrBuilder
        public long getFromNodeDbId() {
            return ((ReportLocationProto) this.instance).getFromNodeDbId();
        }

        @Override // com.waze.jni.protos.rtalerts.ReportLocationProtoOrBuilder
        public ProviderPosition getPosition() {
            return ((ReportLocationProto) this.instance).getPosition();
        }

        @Override // com.waze.jni.protos.rtalerts.ReportLocationProtoOrBuilder
        public long getToNodeDbId() {
            return ((ReportLocationProto) this.instance).getToNodeDbId();
        }

        @Override // com.waze.jni.protos.rtalerts.ReportLocationProtoOrBuilder
        public boolean hasFromNodeDbId() {
            return ((ReportLocationProto) this.instance).hasFromNodeDbId();
        }

        @Override // com.waze.jni.protos.rtalerts.ReportLocationProtoOrBuilder
        public boolean hasPosition() {
            return ((ReportLocationProto) this.instance).hasPosition();
        }

        @Override // com.waze.jni.protos.rtalerts.ReportLocationProtoOrBuilder
        public boolean hasToNodeDbId() {
            return ((ReportLocationProto) this.instance).hasToNodeDbId();
        }

        public Builder mergePosition(ProviderPosition providerPosition) {
            copyOnWrite();
            ((ReportLocationProto) this.instance).mergePosition(providerPosition);
            return this;
        }

        public Builder setFromNodeDbId(long j2) {
            copyOnWrite();
            ((ReportLocationProto) this.instance).setFromNodeDbId(j2);
            return this;
        }

        public Builder setPosition(ProviderPosition.Builder builder) {
            copyOnWrite();
            ((ReportLocationProto) this.instance).setPosition(builder.build());
            return this;
        }

        public Builder setToNodeDbId(long j2) {
            copyOnWrite();
            ((ReportLocationProto) this.instance).setToNodeDbId(j2);
            return this;
        }

        public Builder setPosition(ProviderPosition providerPosition) {
            copyOnWrite();
            ((ReportLocationProto) this.instance).setPosition(providerPosition);
            return this;
        }
    }

    public static ReportLocationProto parseFrom(byte[] bArr) {
        return (ReportLocationProto) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReportLocationProto parseFrom(byte[] bArr, de deVar) {
        return (ReportLocationProto) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
