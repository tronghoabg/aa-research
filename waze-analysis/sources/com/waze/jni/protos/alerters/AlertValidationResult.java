package com.waze.jni.protos.alerters;

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
/* loaded from: classes6.dex */
public final class AlertValidationResult extends du<AlertValidationResult, Builder> implements AlertValidationResultOrBuilder {
    private static final AlertValidationResult DEFAULT_INSTANCE;
    public static final int DISTANCE_METERS_FIELD_NUMBER = 2;
    public static final int IS_VALID_FIELD_NUMBER = 1;
    private static volatile fo<AlertValidationResult> PARSER = null;
    public static final int TIME_TO_ALERT_SEC_FIELD_NUMBER = 3;
    private int bitField0_;
    private int distanceMeters_;
    private boolean isValid_;
    private int timeToAlertSec_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.alerters.AlertValidationResult$1, reason: invalid class name */
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
    public final class Builder extends dm<AlertValidationResult, Builder> implements AlertValidationResultOrBuilder {
        private Builder() {
            super(AlertValidationResult.DEFAULT_INSTANCE);
        }

        public Builder clearDistanceMeters() {
            copyOnWrite();
            ((AlertValidationResult) this.instance).clearDistanceMeters();
            return this;
        }

        public Builder clearIsValid() {
            copyOnWrite();
            ((AlertValidationResult) this.instance).clearIsValid();
            return this;
        }

        public Builder clearTimeToAlertSec() {
            copyOnWrite();
            ((AlertValidationResult) this.instance).clearTimeToAlertSec();
            return this;
        }

        @Override // com.waze.jni.protos.alerters.AlertValidationResultOrBuilder
        public int getDistanceMeters() {
            return ((AlertValidationResult) this.instance).getDistanceMeters();
        }

        @Override // com.waze.jni.protos.alerters.AlertValidationResultOrBuilder
        public boolean getIsValid() {
            return ((AlertValidationResult) this.instance).getIsValid();
        }

        @Override // com.waze.jni.protos.alerters.AlertValidationResultOrBuilder
        public int getTimeToAlertSec() {
            return ((AlertValidationResult) this.instance).getTimeToAlertSec();
        }

        @Override // com.waze.jni.protos.alerters.AlertValidationResultOrBuilder
        public boolean hasDistanceMeters() {
            return ((AlertValidationResult) this.instance).hasDistanceMeters();
        }

        @Override // com.waze.jni.protos.alerters.AlertValidationResultOrBuilder
        public boolean hasTimeToAlertSec() {
            return ((AlertValidationResult) this.instance).hasTimeToAlertSec();
        }

        public Builder setDistanceMeters(int i2) {
            copyOnWrite();
            ((AlertValidationResult) this.instance).setDistanceMeters(i2);
            return this;
        }

        public Builder setIsValid(boolean z) {
            copyOnWrite();
            ((AlertValidationResult) this.instance).setIsValid(z);
            return this;
        }

        public Builder setTimeToAlertSec(int i2) {
            copyOnWrite();
            ((AlertValidationResult) this.instance).setTimeToAlertSec(i2);
            return this;
        }
    }

    static {
        AlertValidationResult alertValidationResult = new AlertValidationResult();
        DEFAULT_INSTANCE = alertValidationResult;
        du.registerDefaultInstance(AlertValidationResult.class, alertValidationResult);
    }

    private AlertValidationResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceMeters() {
        this.bitField0_ &= -2;
        this.distanceMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsValid() {
        this.isValid_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToAlertSec() {
        this.bitField0_ &= -3;
        this.timeToAlertSec_ = 0;
    }

    public static AlertValidationResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AlertValidationResult parseDelimitedFrom(InputStream inputStream) {
        return (AlertValidationResult) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlertValidationResult parseFrom(v vVar) {
        return (AlertValidationResult) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<AlertValidationResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceMeters(int i2) {
        this.bitField0_ |= 1;
        this.distanceMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsValid(boolean z) {
        this.isValid_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToAlertSec(int i2) {
        this.bitField0_ |= 2;
        this.timeToAlertSec_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002င\u0000\u0003င\u0001", new Object[]{"bitField0_", "isValid_", "distanceMeters_", "timeToAlertSec_"});
        }
        if (iOrdinal == 3) {
            return new AlertValidationResult();
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
        fo<AlertValidationResult> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (AlertValidationResult.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.alerters.AlertValidationResultOrBuilder
    public int getDistanceMeters() {
        return this.distanceMeters_;
    }

    @Override // com.waze.jni.protos.alerters.AlertValidationResultOrBuilder
    public boolean getIsValid() {
        return this.isValid_;
    }

    @Override // com.waze.jni.protos.alerters.AlertValidationResultOrBuilder
    public int getTimeToAlertSec() {
        return this.timeToAlertSec_;
    }

    @Override // com.waze.jni.protos.alerters.AlertValidationResultOrBuilder
    public boolean hasDistanceMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlertValidationResultOrBuilder
    public boolean hasTimeToAlertSec() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(AlertValidationResult alertValidationResult) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(alertValidationResult);
    }

    public static AlertValidationResult parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (AlertValidationResult) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AlertValidationResult parseFrom(v vVar, de deVar) {
        return (AlertValidationResult) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static AlertValidationResult parseFrom(z zVar) {
        return (AlertValidationResult) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static AlertValidationResult parseFrom(z zVar, de deVar) {
        return (AlertValidationResult) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static AlertValidationResult parseFrom(InputStream inputStream) {
        return (AlertValidationResult) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlertValidationResult parseFrom(InputStream inputStream, de deVar) {
        return (AlertValidationResult) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AlertValidationResult parseFrom(ByteBuffer byteBuffer) {
        return (AlertValidationResult) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AlertValidationResult parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (AlertValidationResult) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static AlertValidationResult parseFrom(byte[] bArr) {
        return (AlertValidationResult) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlertValidationResult parseFrom(byte[] bArr, de deVar) {
        return (AlertValidationResult) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
