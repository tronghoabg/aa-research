package com.waze.jni.protos.alerters;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AlerterId extends du<AlerterId, Builder> implements AlerterIdOrBuilder {
    private static final AlerterId DEFAULT_INSTANCE;
    private static volatile fo<AlerterId> PARSER = null;
    public static final int PROVIDER_ID_FIELD_NUMBER = 1;
    public static final int UNIQUE_ID_FIELD_NUMBER = 2;
    public static final int UUID_FIELD_NUMBER = 3;
    private String providerId_ = "";
    private String uniqueId_ = "";
    private String uuid_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.alerters.AlerterId$1, reason: invalid class name */
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
    public final class Builder extends dm<AlerterId, Builder> implements AlerterIdOrBuilder {
        private Builder() {
            super(AlerterId.DEFAULT_INSTANCE);
        }

        public Builder clearProviderId() {
            copyOnWrite();
            ((AlerterId) this.instance).clearProviderId();
            return this;
        }

        public Builder clearUniqueId() {
            copyOnWrite();
            ((AlerterId) this.instance).clearUniqueId();
            return this;
        }

        public Builder clearUuid() {
            copyOnWrite();
            ((AlerterId) this.instance).clearUuid();
            return this;
        }

        @Override // com.waze.jni.protos.alerters.AlerterIdOrBuilder
        public String getProviderId() {
            return ((AlerterId) this.instance).getProviderId();
        }

        @Override // com.waze.jni.protos.alerters.AlerterIdOrBuilder
        public v getProviderIdBytes() {
            return ((AlerterId) this.instance).getProviderIdBytes();
        }

        @Override // com.waze.jni.protos.alerters.AlerterIdOrBuilder
        public String getUniqueId() {
            return ((AlerterId) this.instance).getUniqueId();
        }

        @Override // com.waze.jni.protos.alerters.AlerterIdOrBuilder
        public v getUniqueIdBytes() {
            return ((AlerterId) this.instance).getUniqueIdBytes();
        }

        @Override // com.waze.jni.protos.alerters.AlerterIdOrBuilder
        public String getUuid() {
            return ((AlerterId) this.instance).getUuid();
        }

        @Override // com.waze.jni.protos.alerters.AlerterIdOrBuilder
        public v getUuidBytes() {
            return ((AlerterId) this.instance).getUuidBytes();
        }

        public Builder setProviderId(String str) {
            copyOnWrite();
            ((AlerterId) this.instance).setProviderId(str);
            return this;
        }

        public Builder setProviderIdBytes(v vVar) {
            copyOnWrite();
            ((AlerterId) this.instance).setProviderIdBytes(vVar);
            return this;
        }

        public Builder setUniqueId(String str) {
            copyOnWrite();
            ((AlerterId) this.instance).setUniqueId(str);
            return this;
        }

        public Builder setUniqueIdBytes(v vVar) {
            copyOnWrite();
            ((AlerterId) this.instance).setUniqueIdBytes(vVar);
            return this;
        }

        public Builder setUuid(String str) {
            copyOnWrite();
            ((AlerterId) this.instance).setUuid(str);
            return this;
        }

        public Builder setUuidBytes(v vVar) {
            copyOnWrite();
            ((AlerterId) this.instance).setUuidBytes(vVar);
            return this;
        }
    }

    static {
        AlerterId alerterId = new AlerterId();
        DEFAULT_INSTANCE = alerterId;
        du.registerDefaultInstance(AlerterId.class, alerterId);
    }

    private AlerterId() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviderId() {
        this.providerId_ = getDefaultInstance().getProviderId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUniqueId() {
        this.uniqueId_ = getDefaultInstance().getUniqueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUuid() {
        this.uuid_ = getDefaultInstance().getUuid();
    }

    public static AlerterId getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AlerterId parseDelimitedFrom(InputStream inputStream) {
        return (AlerterId) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlerterId parseFrom(v vVar) {
        return (AlerterId) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<AlerterId> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderId(String str) {
        Objects.requireNonNull(str);
        this.providerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.providerId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUniqueId(String str) {
        Objects.requireNonNull(str);
        this.uniqueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUniqueIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.uniqueId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuid(String str) {
        Objects.requireNonNull(str);
        this.uuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuidBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.uuid_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"providerId_", "uniqueId_", "uuid_"});
        }
        if (iOrdinal == 3) {
            return new AlerterId();
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
        fo<AlerterId> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (AlerterId.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.alerters.AlerterIdOrBuilder
    public String getProviderId() {
        return this.providerId_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterIdOrBuilder
    public v getProviderIdBytes() {
        return v.s(this.providerId_);
    }

    @Override // com.waze.jni.protos.alerters.AlerterIdOrBuilder
    public String getUniqueId() {
        return this.uniqueId_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterIdOrBuilder
    public v getUniqueIdBytes() {
        return v.s(this.uniqueId_);
    }

    @Override // com.waze.jni.protos.alerters.AlerterIdOrBuilder
    public String getUuid() {
        return this.uuid_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterIdOrBuilder
    public v getUuidBytes() {
        return v.s(this.uuid_);
    }

    public static Builder newBuilder(AlerterId alerterId) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(alerterId);
    }

    public static AlerterId parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (AlerterId) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AlerterId parseFrom(v vVar, de deVar) {
        return (AlerterId) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static AlerterId parseFrom(z zVar) {
        return (AlerterId) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static AlerterId parseFrom(z zVar, de deVar) {
        return (AlerterId) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static AlerterId parseFrom(InputStream inputStream) {
        return (AlerterId) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlerterId parseFrom(InputStream inputStream, de deVar) {
        return (AlerterId) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AlerterId parseFrom(ByteBuffer byteBuffer) {
        return (AlerterId) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AlerterId parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (AlerterId) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static AlerterId parseFrom(byte[] bArr) {
        return (AlerterId) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlerterId parseFrom(byte[] bArr, de deVar) {
        return (AlerterId) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
