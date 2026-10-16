package com.waze.jni.protos.location;

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
import com.waze.jni.protos.location.MatchedPositionProto;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ProviderPosition extends du<ProviderPosition, Builder> implements ProviderPositionOrBuilder {
    public static final int ACCURACY_FIELD_NUMBER = 4;
    private static final ProviderPosition DEFAULT_INSTANCE;
    public static final int LAST_UPDATE_TIME_EPOCH_SECONDS_FIELD_NUMBER = 7;
    public static final int MATCHER_INFO_FIELD_NUMBER = 6;
    private static volatile fo<ProviderPosition> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    public static final int PROVIDER_FIELD_NUMBER = 5;
    public static final int SPEED_FIELD_NUMBER = 2;
    public static final int STEERING_FIELD_NUMBER = 3;
    private int accuracy_;
    private int bitField0_;
    private long lastUpdateTimeEpochSeconds_;
    private MatchedPositionProto matcherInfo_;
    private Position.IntPosition position_;
    private int provider_;
    private int speed_;
    private int steering_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.location.ProviderPosition$1, reason: invalid class name */
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
    public enum LocProvider implements eg {
        UNKNOWN(0),
        GPS(1),
        ANY(2),
        NETWORK(3),
        CSV(4),
        BEACON(5),
        UNRECOGNIZED(-1);

        public static final int ANY_VALUE = 2;
        public static final int BEACON_VALUE = 5;
        public static final int CSV_VALUE = 4;
        public static final int GPS_VALUE = 1;
        public static final int NETWORK_VALUE = 3;
        public static final int UNKNOWN_VALUE = 0;
        private static final eh<LocProvider> internalValueMap = new eh<LocProvider>() { // from class: com.waze.jni.protos.location.ProviderPosition.LocProvider.1
            @Override // com.google.v.eh
            public LocProvider findValueByNumber(int i2) {
                return LocProvider.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class LocProviderVerifier implements ei {
            static final ei INSTANCE = new LocProviderVerifier();

            private LocProviderVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return LocProvider.forNumber(i2) != null;
            }
        }

        LocProvider(int i2) {
            this.value = i2;
        }

        public static LocProvider forNumber(int i2) {
            if (i2 == 0) {
                return UNKNOWN;
            }
            if (i2 == 1) {
                return GPS;
            }
            if (i2 == 2) {
                return ANY;
            }
            if (i2 == 3) {
                return NETWORK;
            }
            if (i2 == 4) {
                return CSV;
            }
            if (i2 != 5) {
                return null;
            }
            return BEACON;
        }

        public static eh<LocProvider> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return LocProviderVerifier.INSTANCE;
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
        ProviderPosition providerPosition = new ProviderPosition();
        DEFAULT_INSTANCE = providerPosition;
        du.registerDefaultInstance(ProviderPosition.class, providerPosition);
    }

    private ProviderPosition() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccuracy() {
        this.accuracy_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastUpdateTimeEpochSeconds() {
        this.lastUpdateTimeEpochSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMatcherInfo() {
        this.matcherInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.provider_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeed() {
        this.speed_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSteering() {
        this.steering_ = 0;
    }

    public static ProviderPosition getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMatcherInfo(MatchedPositionProto matchedPositionProto) {
        Objects.requireNonNull(matchedPositionProto);
        MatchedPositionProto matchedPositionProto2 = this.matcherInfo_;
        if (matchedPositionProto2 != null && matchedPositionProto2 != MatchedPositionProto.getDefaultInstance()) {
            MatchedPositionProto.Builder builderNewBuilder = MatchedPositionProto.newBuilder(matchedPositionProto2);
            builderNewBuilder.mergeFrom((MatchedPositionProto.Builder) matchedPositionProto);
            matchedPositionProto = builderNewBuilder.buildPartial();
        }
        this.matcherInfo_ = matchedPositionProto;
        this.bitField0_ |= 2;
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
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ProviderPosition parseDelimitedFrom(InputStream inputStream) {
        return (ProviderPosition) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProviderPosition parseFrom(v vVar) {
        return (ProviderPosition) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ProviderPosition> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccuracy(int i2) {
        this.accuracy_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastUpdateTimeEpochSeconds(long j2) {
        this.lastUpdateTimeEpochSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatcherInfo(MatchedPositionProto matchedPositionProto) {
        Objects.requireNonNull(matchedPositionProto);
        this.matcherInfo_ = matchedPositionProto;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.position_ = intPosition;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(LocProvider locProvider) {
        this.provider_ = locProvider.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderValue(int i2) {
        this.provider_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(int i2) {
        this.speed_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSteering(int i2) {
        this.steering_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004\u0003\u0004\u0004\u0004\u0005\f\u0006ဉ\u0001\u0007\u0002", new Object[]{"bitField0_", "position_", "speed_", "steering_", "accuracy_", "provider_", "matcherInfo_", "lastUpdateTimeEpochSeconds_"});
        }
        if (iOrdinal == 3) {
            return new ProviderPosition();
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
        fo<ProviderPosition> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ProviderPosition.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
    public int getAccuracy() {
        return this.accuracy_;
    }

    @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
    public long getLastUpdateTimeEpochSeconds() {
        return this.lastUpdateTimeEpochSeconds_;
    }

    @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
    public MatchedPositionProto getMatcherInfo() {
        MatchedPositionProto matchedPositionProto = this.matcherInfo_;
        return matchedPositionProto == null ? MatchedPositionProto.getDefaultInstance() : matchedPositionProto;
    }

    @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
    public Position.IntPosition getPosition() {
        Position.IntPosition intPosition = this.position_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
    public LocProvider getProvider() {
        LocProvider locProviderForNumber = LocProvider.forNumber(this.provider_);
        return locProviderForNumber == null ? LocProvider.UNRECOGNIZED : locProviderForNumber;
    }

    @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
    public int getProviderValue() {
        return this.provider_;
    }

    @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
    public int getSpeed() {
        return this.speed_;
    }

    @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
    public int getSteering() {
        return this.steering_;
    }

    @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
    public boolean hasMatcherInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
    public boolean hasPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(ProviderPosition providerPosition) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(providerPosition);
    }

    public static ProviderPosition parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ProviderPosition) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ProviderPosition parseFrom(v vVar, de deVar) {
        return (ProviderPosition) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ProviderPosition parseFrom(z zVar) {
        return (ProviderPosition) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ProviderPosition parseFrom(z zVar, de deVar) {
        return (ProviderPosition) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ProviderPosition parseFrom(InputStream inputStream) {
        return (ProviderPosition) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProviderPosition parseFrom(InputStream inputStream, de deVar) {
        return (ProviderPosition) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ProviderPosition parseFrom(ByteBuffer byteBuffer) {
        return (ProviderPosition) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ProviderPosition parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ProviderPosition) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<ProviderPosition, Builder> implements ProviderPositionOrBuilder {
        private Builder() {
            super(ProviderPosition.DEFAULT_INSTANCE);
        }

        public Builder clearAccuracy() {
            copyOnWrite();
            ((ProviderPosition) this.instance).clearAccuracy();
            return this;
        }

        public Builder clearLastUpdateTimeEpochSeconds() {
            copyOnWrite();
            ((ProviderPosition) this.instance).clearLastUpdateTimeEpochSeconds();
            return this;
        }

        public Builder clearMatcherInfo() {
            copyOnWrite();
            ((ProviderPosition) this.instance).clearMatcherInfo();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((ProviderPosition) this.instance).clearPosition();
            return this;
        }

        public Builder clearProvider() {
            copyOnWrite();
            ((ProviderPosition) this.instance).clearProvider();
            return this;
        }

        public Builder clearSpeed() {
            copyOnWrite();
            ((ProviderPosition) this.instance).clearSpeed();
            return this;
        }

        public Builder clearSteering() {
            copyOnWrite();
            ((ProviderPosition) this.instance).clearSteering();
            return this;
        }

        @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
        public int getAccuracy() {
            return ((ProviderPosition) this.instance).getAccuracy();
        }

        @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
        public long getLastUpdateTimeEpochSeconds() {
            return ((ProviderPosition) this.instance).getLastUpdateTimeEpochSeconds();
        }

        @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
        public MatchedPositionProto getMatcherInfo() {
            return ((ProviderPosition) this.instance).getMatcherInfo();
        }

        @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
        public Position.IntPosition getPosition() {
            return ((ProviderPosition) this.instance).getPosition();
        }

        @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
        public LocProvider getProvider() {
            return ((ProviderPosition) this.instance).getProvider();
        }

        @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
        public int getProviderValue() {
            return ((ProviderPosition) this.instance).getProviderValue();
        }

        @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
        public int getSpeed() {
            return ((ProviderPosition) this.instance).getSpeed();
        }

        @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
        public int getSteering() {
            return ((ProviderPosition) this.instance).getSteering();
        }

        @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
        public boolean hasMatcherInfo() {
            return ((ProviderPosition) this.instance).hasMatcherInfo();
        }

        @Override // com.waze.jni.protos.location.ProviderPositionOrBuilder
        public boolean hasPosition() {
            return ((ProviderPosition) this.instance).hasPosition();
        }

        public Builder mergeMatcherInfo(MatchedPositionProto matchedPositionProto) {
            copyOnWrite();
            ((ProviderPosition) this.instance).mergeMatcherInfo(matchedPositionProto);
            return this;
        }

        public Builder mergePosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((ProviderPosition) this.instance).mergePosition(intPosition);
            return this;
        }

        public Builder setAccuracy(int i2) {
            copyOnWrite();
            ((ProviderPosition) this.instance).setAccuracy(i2);
            return this;
        }

        public Builder setLastUpdateTimeEpochSeconds(long j2) {
            copyOnWrite();
            ((ProviderPosition) this.instance).setLastUpdateTimeEpochSeconds(j2);
            return this;
        }

        public Builder setMatcherInfo(MatchedPositionProto.Builder builder) {
            copyOnWrite();
            ((ProviderPosition) this.instance).setMatcherInfo(builder.build());
            return this;
        }

        public Builder setPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((ProviderPosition) this.instance).setPosition(builder.build());
            return this;
        }

        public Builder setProvider(LocProvider locProvider) {
            copyOnWrite();
            ((ProviderPosition) this.instance).setProvider(locProvider);
            return this;
        }

        public Builder setProviderValue(int i2) {
            copyOnWrite();
            ((ProviderPosition) this.instance).setProviderValue(i2);
            return this;
        }

        public Builder setSpeed(int i2) {
            copyOnWrite();
            ((ProviderPosition) this.instance).setSpeed(i2);
            return this;
        }

        public Builder setSteering(int i2) {
            copyOnWrite();
            ((ProviderPosition) this.instance).setSteering(i2);
            return this;
        }

        public Builder setMatcherInfo(MatchedPositionProto matchedPositionProto) {
            copyOnWrite();
            ((ProviderPosition) this.instance).setMatcherInfo(matchedPositionProto);
            return this;
        }

        public Builder setPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((ProviderPosition) this.instance).setPosition(intPosition);
            return this;
        }
    }

    public static ProviderPosition parseFrom(byte[] bArr) {
        return (ProviderPosition) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ProviderPosition parseFrom(byte[] bArr, de deVar) {
        return (ProviderPosition) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
