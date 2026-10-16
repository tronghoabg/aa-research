package com.waze.jni.protos.alerters;

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
import com.waze.jni.protos.alerters.AlerterId;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RejectedAlert extends du<RejectedAlert, Builder> implements RejectedAlertOrBuilder {
    public static final int ALERT_ID_FIELD_NUMBER = 1;
    private static final RejectedAlert DEFAULT_INSTANCE;
    private static volatile fo<RejectedAlert> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private AlerterId alertId_;
    private int bitField0_;
    private int reason_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.alerters.RejectedAlert$1, reason: invalid class name */
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
    public enum Reason implements eg {
        NOT_SUPPORTED_IN_CAR(0),
        UNRECOGNIZED(-1);

        public static final int NOT_SUPPORTED_IN_CAR_VALUE = 0;
        private static final eh<Reason> internalValueMap = new eh<Reason>() { // from class: com.waze.jni.protos.alerters.RejectedAlert.Reason.1
            @Override // com.google.v.eh
            public Reason findValueByNumber(int i2) {
                return Reason.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class ReasonVerifier implements ei {
            static final ei INSTANCE = new ReasonVerifier();

            private ReasonVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return Reason.forNumber(i2) != null;
            }
        }

        Reason(int i2) {
            this.value = i2;
        }

        public static Reason forNumber(int i2) {
            if (i2 != 0) {
                return null;
            }
            return NOT_SUPPORTED_IN_CAR;
        }

        public static eh<Reason> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return ReasonVerifier.INSTANCE;
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
        RejectedAlert rejectedAlert = new RejectedAlert();
        DEFAULT_INSTANCE = rejectedAlert;
        du.registerDefaultInstance(RejectedAlert.class, rejectedAlert);
    }

    private RejectedAlert() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertId() {
        this.alertId_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    public static RejectedAlert getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertId(AlerterId alerterId) {
        Objects.requireNonNull(alerterId);
        AlerterId alerterId2 = this.alertId_;
        if (alerterId2 != null && alerterId2 != AlerterId.getDefaultInstance()) {
            AlerterId.Builder builderNewBuilder = AlerterId.newBuilder(alerterId2);
            builderNewBuilder.mergeFrom((AlerterId.Builder) alerterId);
            alerterId = builderNewBuilder.buildPartial();
        }
        this.alertId_ = alerterId;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RejectedAlert parseDelimitedFrom(InputStream inputStream) {
        return (RejectedAlert) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RejectedAlert parseFrom(v vVar) {
        return (RejectedAlert) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RejectedAlert> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertId(AlerterId alerterId) {
        Objects.requireNonNull(alerterId);
        this.alertId_ = alerterId;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(Reason reason) {
        this.reason_ = reason.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "alertId_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new RejectedAlert();
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
        fo<RejectedAlert> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RejectedAlert.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.alerters.RejectedAlertOrBuilder
    public AlerterId getAlertId() {
        AlerterId alerterId = this.alertId_;
        return alerterId == null ? AlerterId.getDefaultInstance() : alerterId;
    }

    @Override // com.waze.jni.protos.alerters.RejectedAlertOrBuilder
    public Reason getReason() {
        Reason reasonForNumber = Reason.forNumber(this.reason_);
        return reasonForNumber == null ? Reason.UNRECOGNIZED : reasonForNumber;
    }

    @Override // com.waze.jni.protos.alerters.RejectedAlertOrBuilder
    public int getReasonValue() {
        return this.reason_;
    }

    @Override // com.waze.jni.protos.alerters.RejectedAlertOrBuilder
    public boolean hasAlertId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(RejectedAlert rejectedAlert) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(rejectedAlert);
    }

    public static RejectedAlert parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RejectedAlert) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RejectedAlert parseFrom(v vVar, de deVar) {
        return (RejectedAlert) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RejectedAlert parseFrom(z zVar) {
        return (RejectedAlert) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RejectedAlert parseFrom(z zVar, de deVar) {
        return (RejectedAlert) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RejectedAlert parseFrom(InputStream inputStream) {
        return (RejectedAlert) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RejectedAlert parseFrom(InputStream inputStream, de deVar) {
        return (RejectedAlert) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RejectedAlert parseFrom(ByteBuffer byteBuffer) {
        return (RejectedAlert) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RejectedAlert parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RejectedAlert) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<RejectedAlert, Builder> implements RejectedAlertOrBuilder {
        private Builder() {
            super(RejectedAlert.DEFAULT_INSTANCE);
        }

        public Builder clearAlertId() {
            copyOnWrite();
            ((RejectedAlert) this.instance).clearAlertId();
            return this;
        }

        public Builder clearReason() {
            copyOnWrite();
            ((RejectedAlert) this.instance).clearReason();
            return this;
        }

        @Override // com.waze.jni.protos.alerters.RejectedAlertOrBuilder
        public AlerterId getAlertId() {
            return ((RejectedAlert) this.instance).getAlertId();
        }

        @Override // com.waze.jni.protos.alerters.RejectedAlertOrBuilder
        public Reason getReason() {
            return ((RejectedAlert) this.instance).getReason();
        }

        @Override // com.waze.jni.protos.alerters.RejectedAlertOrBuilder
        public int getReasonValue() {
            return ((RejectedAlert) this.instance).getReasonValue();
        }

        @Override // com.waze.jni.protos.alerters.RejectedAlertOrBuilder
        public boolean hasAlertId() {
            return ((RejectedAlert) this.instance).hasAlertId();
        }

        public Builder mergeAlertId(AlerterId alerterId) {
            copyOnWrite();
            ((RejectedAlert) this.instance).mergeAlertId(alerterId);
            return this;
        }

        public Builder setAlertId(AlerterId.Builder builder) {
            copyOnWrite();
            ((RejectedAlert) this.instance).setAlertId(builder.build());
            return this;
        }

        public Builder setReason(Reason reason) {
            copyOnWrite();
            ((RejectedAlert) this.instance).setReason(reason);
            return this;
        }

        public Builder setReasonValue(int i2) {
            copyOnWrite();
            ((RejectedAlert) this.instance).setReasonValue(i2);
            return this;
        }

        public Builder setAlertId(AlerterId alerterId) {
            copyOnWrite();
            ((RejectedAlert) this.instance).setAlertId(alerterId);
            return this;
        }
    }

    public static RejectedAlert parseFrom(byte[] bArr) {
        return (RejectedAlert) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RejectedAlert parseFrom(byte[] bArr, de deVar) {
        return (RejectedAlert) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
