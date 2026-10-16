package com.waze.jni.protos.location;

import androidx.camera.video.AudioStats;
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
import com.waze.jni.protos.Position;
import com.waze.jni.protos.location.Vector3;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeLocationJNI extends du<NativeLocationJNI, Builder> implements NativeLocationJNIOrBuilder {
    public static final int ACCELEROMETER_FIELD_NUMBER = 9;
    public static final int ACCURACY_METERS_FIELD_NUMBER = 4;
    public static final int ALTITUDE_FIELD_NUMBER = 3;
    public static final int COMPASS_FIELD_NUMBER = 11;
    public static final int DECAY_STALE_ACCURACY_FIELD_NUMBER = 13;
    private static final NativeLocationJNI DEFAULT_INSTANCE;
    public static final int GENERATED_BY_SOFTWARE_FIELD_NUMBER = 15;
    public static final int GPS_TIME_MS_FIELD_NUMBER = 1;
    public static final int GYROSCOPE_FIELD_NUMBER = 10;
    private static volatile fo<NativeLocationJNI> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 2;
    public static final int PROVIDER_FIELD_NUMBER = 12;
    public static final int SOURCE_TYPE_FIELD_NUMBER = 14;
    public static final int SPEED_ACCURACY_MM_SEC_FIELD_NUMBER = 7;
    public static final int SPEED_MM_SEC_FIELD_NUMBER = 5;
    public static final int STEERING_ACCURACY_DEGREES_FIELD_NUMBER = 8;
    public static final int STEERING_DEGREES_FIELD_NUMBER = 6;
    private Vector3 accelerometer_;
    private double accuracyMeters_;
    private int altitude_;
    private int bitField0_;
    private Vector3 compass_;
    private boolean decayStaleAccuracy_;
    private boolean generatedBySoftware_;
    private long gpsTimeMs_;
    private Vector3 gyroscope_;
    private Position.IntPosition position_;
    private int provider_;
    private int sourceType_;
    private int speedAccuracyMmSec_;
    private int speedMmSec_;
    private int steeringAccuracyDegrees_;
    private int steeringDegrees_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.location.NativeLocationJNI$1, reason: invalid class name */
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
    public enum Provider implements eg {
        GPS(0),
        NETWORK(1),
        UNRECOGNIZED(-1);

        public static final int GPS_VALUE = 0;
        public static final int NETWORK_VALUE = 1;
        private static final eh<Provider> internalValueMap = new eh<Provider>() { // from class: com.waze.jni.protos.location.NativeLocationJNI.Provider.1
            @Override // com.google.v.eh
            public Provider findValueByNumber(int i2) {
                return Provider.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class ProviderVerifier implements ei {
            static final ei INSTANCE = new ProviderVerifier();

            private ProviderVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return Provider.forNumber(i2) != null;
            }
        }

        Provider(int i2) {
            this.value = i2;
        }

        public static Provider forNumber(int i2) {
            if (i2 == 0) {
                return GPS;
            }
            if (i2 != 1) {
                return null;
            }
            return NETWORK;
        }

        public static eh<Provider> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return ProviderVerifier.INSTANCE;
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

    /* compiled from: WazeSource */
    public enum SourceType implements eg {
        SOURCE_TYPE_UNSPECIFIED(0),
        DEVICE(1),
        EXTERNAL_DEVICE(2),
        UNRECOGNIZED(-1);

        public static final int DEVICE_VALUE = 1;
        public static final int EXTERNAL_DEVICE_VALUE = 2;
        public static final int SOURCE_TYPE_UNSPECIFIED_VALUE = 0;
        private static final eh<SourceType> internalValueMap = new eh<SourceType>() { // from class: com.waze.jni.protos.location.NativeLocationJNI.SourceType.1
            @Override // com.google.v.eh
            public SourceType findValueByNumber(int i2) {
                return SourceType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class SourceTypeVerifier implements ei {
            static final ei INSTANCE = new SourceTypeVerifier();

            private SourceTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return SourceType.forNumber(i2) != null;
            }
        }

        SourceType(int i2) {
            this.value = i2;
        }

        public static SourceType forNumber(int i2) {
            if (i2 == 0) {
                return SOURCE_TYPE_UNSPECIFIED;
            }
            if (i2 == 1) {
                return DEVICE;
            }
            if (i2 != 2) {
                return null;
            }
            return EXTERNAL_DEVICE;
        }

        public static eh<SourceType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return SourceTypeVerifier.INSTANCE;
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
        NativeLocationJNI nativeLocationJNI = new NativeLocationJNI();
        DEFAULT_INSTANCE = nativeLocationJNI;
        du.registerDefaultInstance(NativeLocationJNI.class, nativeLocationJNI);
    }

    private NativeLocationJNI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccelerometer() {
        this.accelerometer_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccuracyMeters() {
        this.bitField0_ &= -9;
        this.accuracyMeters_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltitude() {
        this.bitField0_ &= -5;
        this.altitude_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCompass() {
        this.compass_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDecayStaleAccuracy() {
        this.bitField0_ &= -4097;
        this.decayStaleAccuracy_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeneratedBySoftware() {
        this.bitField0_ &= -16385;
        this.generatedBySoftware_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGpsTimeMs() {
        this.bitField0_ &= -2;
        this.gpsTimeMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGyroscope() {
        this.gyroscope_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.bitField0_ &= -2049;
        this.provider_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceType() {
        this.bitField0_ &= -8193;
        this.sourceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedAccuracyMmSec() {
        this.bitField0_ &= -65;
        this.speedAccuracyMmSec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedMmSec() {
        this.bitField0_ &= -17;
        this.speedMmSec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSteeringAccuracyDegrees() {
        this.bitField0_ &= -129;
        this.steeringAccuracyDegrees_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSteeringDegrees() {
        this.bitField0_ &= -33;
        this.steeringDegrees_ = 0;
    }

    public static NativeLocationJNI getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAccelerometer(Vector3 vector3) {
        Objects.requireNonNull(vector3);
        Vector3 vector32 = this.accelerometer_;
        if (vector32 != null && vector32 != Vector3.getDefaultInstance()) {
            Vector3.Builder builderNewBuilder = Vector3.newBuilder(vector32);
            builderNewBuilder.mergeFrom((Vector3.Builder) vector3);
            vector3 = builderNewBuilder.buildPartial();
        }
        this.accelerometer_ = vector3;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCompass(Vector3 vector3) {
        Objects.requireNonNull(vector3);
        Vector3 vector32 = this.compass_;
        if (vector32 != null && vector32 != Vector3.getDefaultInstance()) {
            Vector3.Builder builderNewBuilder = Vector3.newBuilder(vector32);
            builderNewBuilder.mergeFrom((Vector3.Builder) vector3);
            vector3 = builderNewBuilder.buildPartial();
        }
        this.compass_ = vector3;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGyroscope(Vector3 vector3) {
        Objects.requireNonNull(vector3);
        Vector3 vector32 = this.gyroscope_;
        if (vector32 != null && vector32 != Vector3.getDefaultInstance()) {
            Vector3.Builder builderNewBuilder = Vector3.newBuilder(vector32);
            builderNewBuilder.mergeFrom((Vector3.Builder) vector3);
            vector3 = builderNewBuilder.buildPartial();
        }
        this.gyroscope_ = vector3;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.position_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.position_ = intPosition;
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NativeLocationJNI parseDelimitedFrom(InputStream inputStream) {
        return (NativeLocationJNI) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeLocationJNI parseFrom(v vVar) {
        return (NativeLocationJNI) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NativeLocationJNI> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccelerometer(Vector3 vector3) {
        Objects.requireNonNull(vector3);
        this.accelerometer_ = vector3;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccuracyMeters(double d2) {
        this.bitField0_ |= 8;
        this.accuracyMeters_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltitude(int i2) {
        this.bitField0_ |= 4;
        this.altitude_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompass(Vector3 vector3) {
        Objects.requireNonNull(vector3);
        this.compass_ = vector3;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDecayStaleAccuracy(boolean z) {
        this.bitField0_ |= 4096;
        this.decayStaleAccuracy_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeneratedBySoftware(boolean z) {
        this.bitField0_ |= 16384;
        this.generatedBySoftware_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGpsTimeMs(long j2) {
        this.bitField0_ |= 1;
        this.gpsTimeMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGyroscope(Vector3 vector3) {
        Objects.requireNonNull(vector3);
        this.gyroscope_ = vector3;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.position_ = intPosition;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(Provider provider) {
        this.provider_ = provider.getNumber();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderValue(int i2) {
        this.bitField0_ |= 2048;
        this.provider_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceType(SourceType sourceType) {
        this.sourceType_ = sourceType.getNumber();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceTypeValue(int i2) {
        this.bitField0_ |= 8192;
        this.sourceType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedAccuracyMmSec(int i2) {
        this.bitField0_ |= 64;
        this.speedAccuracyMmSec_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedMmSec(int i2) {
        this.bitField0_ |= 16;
        this.speedMmSec_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSteeringAccuracyDegrees(int i2) {
        this.bitField0_ |= 128;
        this.steeringAccuracyDegrees_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSteeringDegrees(int i2) {
        this.bitField0_ |= 32;
        this.steeringDegrees_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004က\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဌ\u000b\rဇ\f\u000eဌ\r\u000fဇ\u000e", new Object[]{"bitField0_", "gpsTimeMs_", "position_", "altitude_", "accuracyMeters_", "speedMmSec_", "steeringDegrees_", "speedAccuracyMmSec_", "steeringAccuracyDegrees_", "accelerometer_", "gyroscope_", "compass_", "provider_", "decayStaleAccuracy_", "sourceType_", "generatedBySoftware_"});
        }
        if (iOrdinal == 3) {
            return new NativeLocationJNI();
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
        fo<NativeLocationJNI> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NativeLocationJNI.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public Vector3 getAccelerometer() {
        Vector3 vector3 = this.accelerometer_;
        return vector3 == null ? Vector3.getDefaultInstance() : vector3;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public double getAccuracyMeters() {
        return this.accuracyMeters_;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public int getAltitude() {
        return this.altitude_;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public Vector3 getCompass() {
        Vector3 vector3 = this.compass_;
        return vector3 == null ? Vector3.getDefaultInstance() : vector3;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean getDecayStaleAccuracy() {
        return this.decayStaleAccuracy_;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean getGeneratedBySoftware() {
        return this.generatedBySoftware_;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public long getGpsTimeMs() {
        return this.gpsTimeMs_;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public Vector3 getGyroscope() {
        Vector3 vector3 = this.gyroscope_;
        return vector3 == null ? Vector3.getDefaultInstance() : vector3;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public Position.IntPosition getPosition() {
        Position.IntPosition intPosition = this.position_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public Provider getProvider() {
        Provider providerForNumber = Provider.forNumber(this.provider_);
        return providerForNumber == null ? Provider.UNRECOGNIZED : providerForNumber;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public int getProviderValue() {
        return this.provider_;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public SourceType getSourceType() {
        SourceType sourceTypeForNumber = SourceType.forNumber(this.sourceType_);
        return sourceTypeForNumber == null ? SourceType.UNRECOGNIZED : sourceTypeForNumber;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public int getSourceTypeValue() {
        return this.sourceType_;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public int getSpeedAccuracyMmSec() {
        return this.speedAccuracyMmSec_;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public int getSpeedMmSec() {
        return this.speedMmSec_;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public int getSteeringAccuracyDegrees() {
        return this.steeringAccuracyDegrees_;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public int getSteeringDegrees() {
        return this.steeringDegrees_;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasAccelerometer() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasAccuracyMeters() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasAltitude() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasCompass() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasDecayStaleAccuracy() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasGeneratedBySoftware() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasGpsTimeMs() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasGyroscope() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasPosition() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasProvider() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasSourceType() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasSpeedAccuracyMmSec() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasSpeedMmSec() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasSteeringAccuracyDegrees() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
    public boolean hasSteeringDegrees() {
        return (this.bitField0_ & 32) != 0;
    }

    public static Builder newBuilder(NativeLocationJNI nativeLocationJNI) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nativeLocationJNI);
    }

    public static NativeLocationJNI parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NativeLocationJNI) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NativeLocationJNI parseFrom(v vVar, de deVar) {
        return (NativeLocationJNI) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NativeLocationJNI parseFrom(z zVar) {
        return (NativeLocationJNI) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NativeLocationJNI parseFrom(z zVar, de deVar) {
        return (NativeLocationJNI) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NativeLocationJNI parseFrom(InputStream inputStream) {
        return (NativeLocationJNI) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeLocationJNI parseFrom(InputStream inputStream, de deVar) {
        return (NativeLocationJNI) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NativeLocationJNI parseFrom(ByteBuffer byteBuffer) {
        return (NativeLocationJNI) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeLocationJNI parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NativeLocationJNI) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NativeLocationJNI, Builder> implements NativeLocationJNIOrBuilder {
        private Builder() {
            super(NativeLocationJNI.DEFAULT_INSTANCE);
        }

        public Builder clearAccelerometer() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearAccelerometer();
            return this;
        }

        public Builder clearAccuracyMeters() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearAccuracyMeters();
            return this;
        }

        public Builder clearAltitude() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearAltitude();
            return this;
        }

        public Builder clearCompass() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearCompass();
            return this;
        }

        public Builder clearDecayStaleAccuracy() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearDecayStaleAccuracy();
            return this;
        }

        public Builder clearGeneratedBySoftware() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearGeneratedBySoftware();
            return this;
        }

        public Builder clearGpsTimeMs() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearGpsTimeMs();
            return this;
        }

        public Builder clearGyroscope() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearGyroscope();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearPosition();
            return this;
        }

        public Builder clearProvider() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearProvider();
            return this;
        }

        public Builder clearSourceType() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearSourceType();
            return this;
        }

        public Builder clearSpeedAccuracyMmSec() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearSpeedAccuracyMmSec();
            return this;
        }

        public Builder clearSpeedMmSec() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearSpeedMmSec();
            return this;
        }

        public Builder clearSteeringAccuracyDegrees() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearSteeringAccuracyDegrees();
            return this;
        }

        public Builder clearSteeringDegrees() {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).clearSteeringDegrees();
            return this;
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public Vector3 getAccelerometer() {
            return ((NativeLocationJNI) this.instance).getAccelerometer();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public double getAccuracyMeters() {
            return ((NativeLocationJNI) this.instance).getAccuracyMeters();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public int getAltitude() {
            return ((NativeLocationJNI) this.instance).getAltitude();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public Vector3 getCompass() {
            return ((NativeLocationJNI) this.instance).getCompass();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean getDecayStaleAccuracy() {
            return ((NativeLocationJNI) this.instance).getDecayStaleAccuracy();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean getGeneratedBySoftware() {
            return ((NativeLocationJNI) this.instance).getGeneratedBySoftware();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public long getGpsTimeMs() {
            return ((NativeLocationJNI) this.instance).getGpsTimeMs();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public Vector3 getGyroscope() {
            return ((NativeLocationJNI) this.instance).getGyroscope();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public Position.IntPosition getPosition() {
            return ((NativeLocationJNI) this.instance).getPosition();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public Provider getProvider() {
            return ((NativeLocationJNI) this.instance).getProvider();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public int getProviderValue() {
            return ((NativeLocationJNI) this.instance).getProviderValue();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public SourceType getSourceType() {
            return ((NativeLocationJNI) this.instance).getSourceType();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public int getSourceTypeValue() {
            return ((NativeLocationJNI) this.instance).getSourceTypeValue();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public int getSpeedAccuracyMmSec() {
            return ((NativeLocationJNI) this.instance).getSpeedAccuracyMmSec();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public int getSpeedMmSec() {
            return ((NativeLocationJNI) this.instance).getSpeedMmSec();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public int getSteeringAccuracyDegrees() {
            return ((NativeLocationJNI) this.instance).getSteeringAccuracyDegrees();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public int getSteeringDegrees() {
            return ((NativeLocationJNI) this.instance).getSteeringDegrees();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasAccelerometer() {
            return ((NativeLocationJNI) this.instance).hasAccelerometer();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasAccuracyMeters() {
            return ((NativeLocationJNI) this.instance).hasAccuracyMeters();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasAltitude() {
            return ((NativeLocationJNI) this.instance).hasAltitude();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasCompass() {
            return ((NativeLocationJNI) this.instance).hasCompass();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasDecayStaleAccuracy() {
            return ((NativeLocationJNI) this.instance).hasDecayStaleAccuracy();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasGeneratedBySoftware() {
            return ((NativeLocationJNI) this.instance).hasGeneratedBySoftware();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasGpsTimeMs() {
            return ((NativeLocationJNI) this.instance).hasGpsTimeMs();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasGyroscope() {
            return ((NativeLocationJNI) this.instance).hasGyroscope();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasPosition() {
            return ((NativeLocationJNI) this.instance).hasPosition();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasProvider() {
            return ((NativeLocationJNI) this.instance).hasProvider();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasSourceType() {
            return ((NativeLocationJNI) this.instance).hasSourceType();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasSpeedAccuracyMmSec() {
            return ((NativeLocationJNI) this.instance).hasSpeedAccuracyMmSec();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasSpeedMmSec() {
            return ((NativeLocationJNI) this.instance).hasSpeedMmSec();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasSteeringAccuracyDegrees() {
            return ((NativeLocationJNI) this.instance).hasSteeringAccuracyDegrees();
        }

        @Override // com.waze.jni.protos.location.NativeLocationJNIOrBuilder
        public boolean hasSteeringDegrees() {
            return ((NativeLocationJNI) this.instance).hasSteeringDegrees();
        }

        public Builder mergeAccelerometer(Vector3 vector3) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).mergeAccelerometer(vector3);
            return this;
        }

        public Builder mergeCompass(Vector3 vector3) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).mergeCompass(vector3);
            return this;
        }

        public Builder mergeGyroscope(Vector3 vector3) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).mergeGyroscope(vector3);
            return this;
        }

        public Builder mergePosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).mergePosition(intPosition);
            return this;
        }

        public Builder setAccelerometer(Vector3.Builder builder) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setAccelerometer(builder.build());
            return this;
        }

        public Builder setAccuracyMeters(double d2) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setAccuracyMeters(d2);
            return this;
        }

        public Builder setAltitude(int i2) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setAltitude(i2);
            return this;
        }

        public Builder setCompass(Vector3.Builder builder) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setCompass(builder.build());
            return this;
        }

        public Builder setDecayStaleAccuracy(boolean z) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setDecayStaleAccuracy(z);
            return this;
        }

        public Builder setGeneratedBySoftware(boolean z) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setGeneratedBySoftware(z);
            return this;
        }

        public Builder setGpsTimeMs(long j2) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setGpsTimeMs(j2);
            return this;
        }

        public Builder setGyroscope(Vector3.Builder builder) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setGyroscope(builder.build());
            return this;
        }

        public Builder setPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setPosition(builder.build());
            return this;
        }

        public Builder setProvider(Provider provider) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setProvider(provider);
            return this;
        }

        public Builder setProviderValue(int i2) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setProviderValue(i2);
            return this;
        }

        public Builder setSourceType(SourceType sourceType) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setSourceType(sourceType);
            return this;
        }

        public Builder setSourceTypeValue(int i2) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setSourceTypeValue(i2);
            return this;
        }

        public Builder setSpeedAccuracyMmSec(int i2) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setSpeedAccuracyMmSec(i2);
            return this;
        }

        public Builder setSpeedMmSec(int i2) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setSpeedMmSec(i2);
            return this;
        }

        public Builder setSteeringAccuracyDegrees(int i2) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setSteeringAccuracyDegrees(i2);
            return this;
        }

        public Builder setSteeringDegrees(int i2) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setSteeringDegrees(i2);
            return this;
        }

        public Builder setAccelerometer(Vector3 vector3) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setAccelerometer(vector3);
            return this;
        }

        public Builder setCompass(Vector3 vector3) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setCompass(vector3);
            return this;
        }

        public Builder setGyroscope(Vector3 vector3) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setGyroscope(vector3);
            return this;
        }

        public Builder setPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((NativeLocationJNI) this.instance).setPosition(intPosition);
            return this;
        }
    }

    public static NativeLocationJNI parseFrom(byte[] bArr) {
        return (NativeLocationJNI) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeLocationJNI parseFrom(byte[] bArr, de deVar) {
        return (NativeLocationJNI) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
