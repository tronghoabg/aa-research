package com.waze.jni.protos.insights_infra;

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
public final class NotificationId extends du<NotificationId, Builder> implements NotificationIdOrBuilder {
    private static final NotificationId DEFAULT_INSTANCE;
    public static final int FEATURE_FIELD_NUMBER = 1;
    public static final int ID_FIELD_NUMBER = 2;
    private static volatile fo<NotificationId> PARSER;
    private int feature_;
    private String id_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.insights_infra.NotificationId$1, reason: invalid class name */
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
    public final class Builder extends dm<NotificationId, Builder> implements NotificationIdOrBuilder {
        private Builder() {
            super(NotificationId.DEFAULT_INSTANCE);
        }

        public Builder clearFeature() {
            copyOnWrite();
            ((NotificationId) this.instance).clearFeature();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((NotificationId) this.instance).clearId();
            return this;
        }

        @Override // com.waze.jni.protos.insights_infra.NotificationIdOrBuilder
        public Feature getFeature() {
            return ((NotificationId) this.instance).getFeature();
        }

        @Override // com.waze.jni.protos.insights_infra.NotificationIdOrBuilder
        public int getFeatureValue() {
            return ((NotificationId) this.instance).getFeatureValue();
        }

        @Override // com.waze.jni.protos.insights_infra.NotificationIdOrBuilder
        public String getId() {
            return ((NotificationId) this.instance).getId();
        }

        @Override // com.waze.jni.protos.insights_infra.NotificationIdOrBuilder
        public v getIdBytes() {
            return ((NotificationId) this.instance).getIdBytes();
        }

        public Builder setFeature(Feature feature) {
            copyOnWrite();
            ((NotificationId) this.instance).setFeature(feature);
            return this;
        }

        public Builder setFeatureValue(int i2) {
            copyOnWrite();
            ((NotificationId) this.instance).setFeatureValue(i2);
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((NotificationId) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(v vVar) {
            copyOnWrite();
            ((NotificationId) this.instance).setIdBytes(vVar);
            return this;
        }
    }

    static {
        NotificationId notificationId = new NotificationId();
        DEFAULT_INSTANCE = notificationId;
        du.registerDefaultInstance(NotificationId.class, notificationId);
    }

    private NotificationId() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeature() {
        this.feature_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    public static NotificationId getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NotificationId parseDelimitedFrom(InputStream inputStream) {
        return (NotificationId) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationId parseFrom(v vVar) {
        return (NotificationId) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NotificationId> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeature(Feature feature) {
        this.feature_ = feature.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureValue(int i2) {
        this.feature_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.id_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"feature_", "id_"});
        }
        if (iOrdinal == 3) {
            return new NotificationId();
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
        fo<NotificationId> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NotificationId.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.insights_infra.NotificationIdOrBuilder
    public Feature getFeature() {
        Feature featureForNumber = Feature.forNumber(this.feature_);
        return featureForNumber == null ? Feature.UNRECOGNIZED : featureForNumber;
    }

    @Override // com.waze.jni.protos.insights_infra.NotificationIdOrBuilder
    public int getFeatureValue() {
        return this.feature_;
    }

    @Override // com.waze.jni.protos.insights_infra.NotificationIdOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.insights_infra.NotificationIdOrBuilder
    public v getIdBytes() {
        return v.s(this.id_);
    }

    public static Builder newBuilder(NotificationId notificationId) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(notificationId);
    }

    public static NotificationId parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NotificationId) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NotificationId parseFrom(v vVar, de deVar) {
        return (NotificationId) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NotificationId parseFrom(z zVar) {
        return (NotificationId) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NotificationId parseFrom(z zVar, de deVar) {
        return (NotificationId) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NotificationId parseFrom(InputStream inputStream) {
        return (NotificationId) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationId parseFrom(InputStream inputStream, de deVar) {
        return (NotificationId) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NotificationId parseFrom(ByteBuffer byteBuffer) {
        return (NotificationId) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NotificationId parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NotificationId) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static NotificationId parseFrom(byte[] bArr) {
        return (NotificationId) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NotificationId parseFrom(byte[] bArr, de deVar) {
        return (NotificationId) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
