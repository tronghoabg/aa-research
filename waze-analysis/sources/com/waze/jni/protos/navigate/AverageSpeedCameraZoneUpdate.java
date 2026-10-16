package com.waze.jni.protos.navigate;

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
public final class AverageSpeedCameraZoneUpdate extends du<AverageSpeedCameraZoneUpdate, Builder> implements AverageSpeedCameraZoneUpdateOrBuilder {
    private static final AverageSpeedCameraZoneUpdate DEFAULT_INSTANCE;
    public static final int LEFT_DISTANCE_FIELD_NUMBER = 2;
    private static volatile fo<AverageSpeedCameraZoneUpdate> PARSER = null;
    public static final int PERCENT_FIELD_NUMBER = 1;
    public static final int RECOMMENDED_SPEED_FIELD_NUMBER = 3;
    private int bitField0_;
    private int leftDistance_;
    private int percent_;
    private int recommendedSpeed_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdate$1, reason: invalid class name */
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
    public final class Builder extends dm<AverageSpeedCameraZoneUpdate, Builder> implements AverageSpeedCameraZoneUpdateOrBuilder {
        private Builder() {
            super(AverageSpeedCameraZoneUpdate.DEFAULT_INSTANCE);
        }

        public Builder clearLeftDistance() {
            copyOnWrite();
            ((AverageSpeedCameraZoneUpdate) this.instance).clearLeftDistance();
            return this;
        }

        public Builder clearPercent() {
            copyOnWrite();
            ((AverageSpeedCameraZoneUpdate) this.instance).clearPercent();
            return this;
        }

        public Builder clearRecommendedSpeed() {
            copyOnWrite();
            ((AverageSpeedCameraZoneUpdate) this.instance).clearRecommendedSpeed();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdateOrBuilder
        public int getLeftDistance() {
            return ((AverageSpeedCameraZoneUpdate) this.instance).getLeftDistance();
        }

        @Override // com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdateOrBuilder
        public int getPercent() {
            return ((AverageSpeedCameraZoneUpdate) this.instance).getPercent();
        }

        @Override // com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdateOrBuilder
        public int getRecommendedSpeed() {
            return ((AverageSpeedCameraZoneUpdate) this.instance).getRecommendedSpeed();
        }

        @Override // com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdateOrBuilder
        public boolean hasLeftDistance() {
            return ((AverageSpeedCameraZoneUpdate) this.instance).hasLeftDistance();
        }

        @Override // com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdateOrBuilder
        public boolean hasPercent() {
            return ((AverageSpeedCameraZoneUpdate) this.instance).hasPercent();
        }

        @Override // com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdateOrBuilder
        public boolean hasRecommendedSpeed() {
            return ((AverageSpeedCameraZoneUpdate) this.instance).hasRecommendedSpeed();
        }

        public Builder setLeftDistance(int i2) {
            copyOnWrite();
            ((AverageSpeedCameraZoneUpdate) this.instance).setLeftDistance(i2);
            return this;
        }

        public Builder setPercent(int i2) {
            copyOnWrite();
            ((AverageSpeedCameraZoneUpdate) this.instance).setPercent(i2);
            return this;
        }

        public Builder setRecommendedSpeed(int i2) {
            copyOnWrite();
            ((AverageSpeedCameraZoneUpdate) this.instance).setRecommendedSpeed(i2);
            return this;
        }
    }

    static {
        AverageSpeedCameraZoneUpdate averageSpeedCameraZoneUpdate = new AverageSpeedCameraZoneUpdate();
        DEFAULT_INSTANCE = averageSpeedCameraZoneUpdate;
        du.registerDefaultInstance(AverageSpeedCameraZoneUpdate.class, averageSpeedCameraZoneUpdate);
    }

    private AverageSpeedCameraZoneUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeftDistance() {
        this.bitField0_ &= -3;
        this.leftDistance_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPercent() {
        this.bitField0_ &= -2;
        this.percent_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecommendedSpeed() {
        this.bitField0_ &= -5;
        this.recommendedSpeed_ = 0;
    }

    public static AverageSpeedCameraZoneUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AverageSpeedCameraZoneUpdate parseDelimitedFrom(InputStream inputStream) {
        return (AverageSpeedCameraZoneUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AverageSpeedCameraZoneUpdate parseFrom(v vVar) {
        return (AverageSpeedCameraZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<AverageSpeedCameraZoneUpdate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeftDistance(int i2) {
        this.bitField0_ |= 2;
        this.leftDistance_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPercent(int i2) {
        this.bitField0_ |= 1;
        this.percent_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecommendedSpeed(int i2) {
        this.bitField0_ |= 4;
        this.recommendedSpeed_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"bitField0_", "percent_", "leftDistance_", "recommendedSpeed_"});
        }
        if (iOrdinal == 3) {
            return new AverageSpeedCameraZoneUpdate();
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
        fo<AverageSpeedCameraZoneUpdate> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (AverageSpeedCameraZoneUpdate.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdateOrBuilder
    public int getLeftDistance() {
        return this.leftDistance_;
    }

    @Override // com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdateOrBuilder
    public int getPercent() {
        return this.percent_;
    }

    @Override // com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdateOrBuilder
    public int getRecommendedSpeed() {
        return this.recommendedSpeed_;
    }

    @Override // com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdateOrBuilder
    public boolean hasLeftDistance() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdateOrBuilder
    public boolean hasPercent() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdateOrBuilder
    public boolean hasRecommendedSpeed() {
        return (this.bitField0_ & 4) != 0;
    }

    public static Builder newBuilder(AverageSpeedCameraZoneUpdate averageSpeedCameraZoneUpdate) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(averageSpeedCameraZoneUpdate);
    }

    public static AverageSpeedCameraZoneUpdate parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (AverageSpeedCameraZoneUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AverageSpeedCameraZoneUpdate parseFrom(v vVar, de deVar) {
        return (AverageSpeedCameraZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static AverageSpeedCameraZoneUpdate parseFrom(z zVar) {
        return (AverageSpeedCameraZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static AverageSpeedCameraZoneUpdate parseFrom(z zVar, de deVar) {
        return (AverageSpeedCameraZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static AverageSpeedCameraZoneUpdate parseFrom(InputStream inputStream) {
        return (AverageSpeedCameraZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AverageSpeedCameraZoneUpdate parseFrom(InputStream inputStream, de deVar) {
        return (AverageSpeedCameraZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AverageSpeedCameraZoneUpdate parseFrom(ByteBuffer byteBuffer) {
        return (AverageSpeedCameraZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AverageSpeedCameraZoneUpdate parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (AverageSpeedCameraZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static AverageSpeedCameraZoneUpdate parseFrom(byte[] bArr) {
        return (AverageSpeedCameraZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AverageSpeedCameraZoneUpdate parseFrom(byte[] bArr, de deVar) {
        return (AverageSpeedCameraZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
