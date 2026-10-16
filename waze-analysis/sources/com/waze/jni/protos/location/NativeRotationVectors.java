package com.waze.jni.protos.location;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.location.Quaternion;
import com.waze.jni.protos.location.Vector3;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeRotationVectors extends du<NativeRotationVectors, Builder> implements NativeRotationVectorsOrBuilder {
    private static final NativeRotationVectors DEFAULT_INSTANCE;
    public static final int DELTA_TNS_FIELD_NUMBER = 2;
    public static final int GRAVITY_FIELD_NUMBER = 4;
    public static final int MAGNETIC_FIELD_FIELD_NUMBER = 5;
    public static final int MAX_ACCELERATION_FIELD_NUMBER = 7;
    public static final int MAX_RATE_OF_TURN_FIELD_NUMBER = 6;
    private static volatile fo<NativeRotationVectors> PARSER = null;
    public static final int ROTATION_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 1;
    private int bitField0_;
    private long deltaTns_;
    private Vector3 gravity_;
    private Vector3 magneticField_;
    private float maxAcceleration_;
    private float maxRateOfTurn_;
    private Quaternion rotation_;
    private long timestampMs_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.location.NativeRotationVectors$1, reason: invalid class name */
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
        NativeRotationVectors nativeRotationVectors = new NativeRotationVectors();
        DEFAULT_INSTANCE = nativeRotationVectors;
        du.registerDefaultInstance(NativeRotationVectors.class, nativeRotationVectors);
    }

    private NativeRotationVectors() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeltaTns() {
        this.bitField0_ &= -3;
        this.deltaTns_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGravity() {
        this.gravity_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMagneticField() {
        this.magneticField_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxAcceleration() {
        this.bitField0_ &= -65;
        this.maxAcceleration_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxRateOfTurn() {
        this.bitField0_ &= -33;
        this.maxRateOfTurn_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRotation() {
        this.rotation_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestampMs() {
        this.bitField0_ &= -2;
        this.timestampMs_ = 0L;
    }

    public static NativeRotationVectors getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGravity(Vector3 vector3) {
        Objects.requireNonNull(vector3);
        Vector3 vector32 = this.gravity_;
        if (vector32 != null && vector32 != Vector3.getDefaultInstance()) {
            Vector3.Builder builderNewBuilder = Vector3.newBuilder(vector32);
            builderNewBuilder.mergeFrom((Vector3.Builder) vector3);
            vector3 = builderNewBuilder.buildPartial();
        }
        this.gravity_ = vector3;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMagneticField(Vector3 vector3) {
        Objects.requireNonNull(vector3);
        Vector3 vector32 = this.magneticField_;
        if (vector32 != null && vector32 != Vector3.getDefaultInstance()) {
            Vector3.Builder builderNewBuilder = Vector3.newBuilder(vector32);
            builderNewBuilder.mergeFrom((Vector3.Builder) vector3);
            vector3 = builderNewBuilder.buildPartial();
        }
        this.magneticField_ = vector3;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRotation(Quaternion quaternion) {
        Objects.requireNonNull(quaternion);
        Quaternion quaternion2 = this.rotation_;
        if (quaternion2 != null && quaternion2 != Quaternion.getDefaultInstance()) {
            Quaternion.Builder builderNewBuilder = Quaternion.newBuilder(quaternion2);
            builderNewBuilder.mergeFrom((Quaternion.Builder) quaternion);
            quaternion = builderNewBuilder.buildPartial();
        }
        this.rotation_ = quaternion;
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NativeRotationVectors parseDelimitedFrom(InputStream inputStream) {
        return (NativeRotationVectors) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeRotationVectors parseFrom(v vVar) {
        return (NativeRotationVectors) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NativeRotationVectors> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeltaTns(long j2) {
        this.bitField0_ |= 2;
        this.deltaTns_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGravity(Vector3 vector3) {
        Objects.requireNonNull(vector3);
        this.gravity_ = vector3;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMagneticField(Vector3 vector3) {
        Objects.requireNonNull(vector3);
        this.magneticField_ = vector3;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxAcceleration(float f2) {
        this.bitField0_ |= 64;
        this.maxAcceleration_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxRateOfTurn(float f2) {
        this.bitField0_ |= 32;
        this.maxRateOfTurn_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRotation(Quaternion quaternion) {
        Objects.requireNonNull(quaternion);
        this.rotation_ = quaternion;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampMs(long j2) {
        this.bitField0_ |= 1;
        this.timestampMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ခ\u0005\u0007ခ\u0006", new Object[]{"bitField0_", "timestampMs_", "deltaTns_", "rotation_", "gravity_", "magneticField_", "maxRateOfTurn_", "maxAcceleration_"});
        }
        if (iOrdinal == 3) {
            return new NativeRotationVectors();
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
        fo<NativeRotationVectors> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NativeRotationVectors.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
    public long getDeltaTns() {
        return this.deltaTns_;
    }

    @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
    public Vector3 getGravity() {
        Vector3 vector3 = this.gravity_;
        return vector3 == null ? Vector3.getDefaultInstance() : vector3;
    }

    @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
    public Vector3 getMagneticField() {
        Vector3 vector3 = this.magneticField_;
        return vector3 == null ? Vector3.getDefaultInstance() : vector3;
    }

    @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
    public float getMaxAcceleration() {
        return this.maxAcceleration_;
    }

    @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
    public float getMaxRateOfTurn() {
        return this.maxRateOfTurn_;
    }

    @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
    public Quaternion getRotation() {
        Quaternion quaternion = this.rotation_;
        return quaternion == null ? Quaternion.getDefaultInstance() : quaternion;
    }

    @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
    public long getTimestampMs() {
        return this.timestampMs_;
    }

    @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
    public boolean hasDeltaTns() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
    public boolean hasGravity() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
    public boolean hasMagneticField() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
    public boolean hasMaxAcceleration() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
    public boolean hasMaxRateOfTurn() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
    public boolean hasRotation() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
    public boolean hasTimestampMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(NativeRotationVectors nativeRotationVectors) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nativeRotationVectors);
    }

    public static NativeRotationVectors parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NativeRotationVectors) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NativeRotationVectors parseFrom(v vVar, de deVar) {
        return (NativeRotationVectors) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NativeRotationVectors parseFrom(z zVar) {
        return (NativeRotationVectors) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NativeRotationVectors parseFrom(z zVar, de deVar) {
        return (NativeRotationVectors) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NativeRotationVectors parseFrom(InputStream inputStream) {
        return (NativeRotationVectors) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeRotationVectors parseFrom(InputStream inputStream, de deVar) {
        return (NativeRotationVectors) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NativeRotationVectors parseFrom(ByteBuffer byteBuffer) {
        return (NativeRotationVectors) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeRotationVectors parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NativeRotationVectors) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NativeRotationVectors, Builder> implements NativeRotationVectorsOrBuilder {
        private Builder() {
            super(NativeRotationVectors.DEFAULT_INSTANCE);
        }

        public Builder clearDeltaTns() {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).clearDeltaTns();
            return this;
        }

        public Builder clearGravity() {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).clearGravity();
            return this;
        }

        public Builder clearMagneticField() {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).clearMagneticField();
            return this;
        }

        public Builder clearMaxAcceleration() {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).clearMaxAcceleration();
            return this;
        }

        public Builder clearMaxRateOfTurn() {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).clearMaxRateOfTurn();
            return this;
        }

        public Builder clearRotation() {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).clearRotation();
            return this;
        }

        public Builder clearTimestampMs() {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).clearTimestampMs();
            return this;
        }

        @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
        public long getDeltaTns() {
            return ((NativeRotationVectors) this.instance).getDeltaTns();
        }

        @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
        public Vector3 getGravity() {
            return ((NativeRotationVectors) this.instance).getGravity();
        }

        @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
        public Vector3 getMagneticField() {
            return ((NativeRotationVectors) this.instance).getMagneticField();
        }

        @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
        public float getMaxAcceleration() {
            return ((NativeRotationVectors) this.instance).getMaxAcceleration();
        }

        @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
        public float getMaxRateOfTurn() {
            return ((NativeRotationVectors) this.instance).getMaxRateOfTurn();
        }

        @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
        public Quaternion getRotation() {
            return ((NativeRotationVectors) this.instance).getRotation();
        }

        @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
        public long getTimestampMs() {
            return ((NativeRotationVectors) this.instance).getTimestampMs();
        }

        @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
        public boolean hasDeltaTns() {
            return ((NativeRotationVectors) this.instance).hasDeltaTns();
        }

        @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
        public boolean hasGravity() {
            return ((NativeRotationVectors) this.instance).hasGravity();
        }

        @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
        public boolean hasMagneticField() {
            return ((NativeRotationVectors) this.instance).hasMagneticField();
        }

        @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
        public boolean hasMaxAcceleration() {
            return ((NativeRotationVectors) this.instance).hasMaxAcceleration();
        }

        @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
        public boolean hasMaxRateOfTurn() {
            return ((NativeRotationVectors) this.instance).hasMaxRateOfTurn();
        }

        @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
        public boolean hasRotation() {
            return ((NativeRotationVectors) this.instance).hasRotation();
        }

        @Override // com.waze.jni.protos.location.NativeRotationVectorsOrBuilder
        public boolean hasTimestampMs() {
            return ((NativeRotationVectors) this.instance).hasTimestampMs();
        }

        public Builder mergeGravity(Vector3 vector3) {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).mergeGravity(vector3);
            return this;
        }

        public Builder mergeMagneticField(Vector3 vector3) {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).mergeMagneticField(vector3);
            return this;
        }

        public Builder mergeRotation(Quaternion quaternion) {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).mergeRotation(quaternion);
            return this;
        }

        public Builder setDeltaTns(long j2) {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).setDeltaTns(j2);
            return this;
        }

        public Builder setGravity(Vector3.Builder builder) {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).setGravity(builder.build());
            return this;
        }

        public Builder setMagneticField(Vector3.Builder builder) {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).setMagneticField(builder.build());
            return this;
        }

        public Builder setMaxAcceleration(float f2) {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).setMaxAcceleration(f2);
            return this;
        }

        public Builder setMaxRateOfTurn(float f2) {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).setMaxRateOfTurn(f2);
            return this;
        }

        public Builder setRotation(Quaternion.Builder builder) {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).setRotation(builder.build());
            return this;
        }

        public Builder setTimestampMs(long j2) {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).setTimestampMs(j2);
            return this;
        }

        public Builder setGravity(Vector3 vector3) {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).setGravity(vector3);
            return this;
        }

        public Builder setMagneticField(Vector3 vector3) {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).setMagneticField(vector3);
            return this;
        }

        public Builder setRotation(Quaternion quaternion) {
            copyOnWrite();
            ((NativeRotationVectors) this.instance).setRotation(quaternion);
            return this;
        }
    }

    public static NativeRotationVectors parseFrom(byte[] bArr) {
        return (NativeRotationVectors) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeRotationVectors parseFrom(byte[] bArr, de deVar) {
        return (NativeRotationVectors) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
