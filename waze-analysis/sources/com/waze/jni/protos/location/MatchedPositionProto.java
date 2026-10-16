package com.waze.jni.protos.location;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MatchedPositionProto extends du<MatchedPositionProto, Builder> implements MatchedPositionProtoOrBuilder {
    public static final int ACCURACY_METERS_FIELD_NUMBER = 2;
    private static final MatchedPositionProto DEFAULT_INSTANCE;
    public static final int FROM_NODE_DB_ID_FIELD_NUMBER = 3;
    private static volatile fo<MatchedPositionProto> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    public static final int STREET_NAME_FIELD_NUMBER = 5;
    public static final int TO_NODE_DB_ID_FIELD_NUMBER = 4;
    private double accuracyMeters_;
    private int bitField0_;
    private long fromNodeDbId_;
    private Position.IntPosition position_;
    private String streetName_ = "";
    private long toNodeDbId_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.location.MatchedPositionProto$1, reason: invalid class name */
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
        MatchedPositionProto matchedPositionProto = new MatchedPositionProto();
        DEFAULT_INSTANCE = matchedPositionProto;
        du.registerDefaultInstance(MatchedPositionProto.class, matchedPositionProto);
    }

    private MatchedPositionProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccuracyMeters() {
        this.accuracyMeters_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNodeDbId() {
        this.fromNodeDbId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreetName() {
        this.bitField0_ &= -3;
        this.streetName_ = getDefaultInstance().getStreetName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToNodeDbId() {
        this.toNodeDbId_ = 0L;
    }

    public static MatchedPositionProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    public static MatchedPositionProto parseDelimitedFrom(InputStream inputStream) {
        return (MatchedPositionProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MatchedPositionProto parseFrom(v vVar) {
        return (MatchedPositionProto) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MatchedPositionProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccuracyMeters(double d2) {
        this.accuracyMeters_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNodeDbId(long j2) {
        this.fromNodeDbId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.position_ = intPosition;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.streetName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.streetName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToNodeDbId(long j2) {
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000\u0003\u0002\u0004\u0002\u0005ለ\u0001", new Object[]{"bitField0_", "position_", "accuracyMeters_", "fromNodeDbId_", "toNodeDbId_", "streetName_"});
        }
        if (iOrdinal == 3) {
            return new MatchedPositionProto();
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
        fo<MatchedPositionProto> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MatchedPositionProto.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
    public double getAccuracyMeters() {
        return this.accuracyMeters_;
    }

    @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
    public long getFromNodeDbId() {
        return this.fromNodeDbId_;
    }

    @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
    public Position.IntPosition getPosition() {
        Position.IntPosition intPosition = this.position_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
    public String getStreetName() {
        return this.streetName_;
    }

    @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
    public v getStreetNameBytes() {
        return v.s(this.streetName_);
    }

    @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
    public long getToNodeDbId() {
        return this.toNodeDbId_;
    }

    @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
    public boolean hasPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
    public boolean hasStreetName() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(MatchedPositionProto matchedPositionProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(matchedPositionProto);
    }

    public static MatchedPositionProto parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MatchedPositionProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MatchedPositionProto parseFrom(v vVar, de deVar) {
        return (MatchedPositionProto) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MatchedPositionProto parseFrom(z zVar) {
        return (MatchedPositionProto) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MatchedPositionProto parseFrom(z zVar, de deVar) {
        return (MatchedPositionProto) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MatchedPositionProto parseFrom(InputStream inputStream) {
        return (MatchedPositionProto) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MatchedPositionProto parseFrom(InputStream inputStream, de deVar) {
        return (MatchedPositionProto) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MatchedPositionProto parseFrom(ByteBuffer byteBuffer) {
        return (MatchedPositionProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MatchedPositionProto parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MatchedPositionProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<MatchedPositionProto, Builder> implements MatchedPositionProtoOrBuilder {
        private Builder() {
            super(MatchedPositionProto.DEFAULT_INSTANCE);
        }

        public Builder clearAccuracyMeters() {
            copyOnWrite();
            ((MatchedPositionProto) this.instance).clearAccuracyMeters();
            return this;
        }

        public Builder clearFromNodeDbId() {
            copyOnWrite();
            ((MatchedPositionProto) this.instance).clearFromNodeDbId();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((MatchedPositionProto) this.instance).clearPosition();
            return this;
        }

        public Builder clearStreetName() {
            copyOnWrite();
            ((MatchedPositionProto) this.instance).clearStreetName();
            return this;
        }

        public Builder clearToNodeDbId() {
            copyOnWrite();
            ((MatchedPositionProto) this.instance).clearToNodeDbId();
            return this;
        }

        @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
        public double getAccuracyMeters() {
            return ((MatchedPositionProto) this.instance).getAccuracyMeters();
        }

        @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
        public long getFromNodeDbId() {
            return ((MatchedPositionProto) this.instance).getFromNodeDbId();
        }

        @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
        public Position.IntPosition getPosition() {
            return ((MatchedPositionProto) this.instance).getPosition();
        }

        @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
        public String getStreetName() {
            return ((MatchedPositionProto) this.instance).getStreetName();
        }

        @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
        public v getStreetNameBytes() {
            return ((MatchedPositionProto) this.instance).getStreetNameBytes();
        }

        @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
        public long getToNodeDbId() {
            return ((MatchedPositionProto) this.instance).getToNodeDbId();
        }

        @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
        public boolean hasPosition() {
            return ((MatchedPositionProto) this.instance).hasPosition();
        }

        @Override // com.waze.jni.protos.location.MatchedPositionProtoOrBuilder
        public boolean hasStreetName() {
            return ((MatchedPositionProto) this.instance).hasStreetName();
        }

        public Builder mergePosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((MatchedPositionProto) this.instance).mergePosition(intPosition);
            return this;
        }

        public Builder setAccuracyMeters(double d2) {
            copyOnWrite();
            ((MatchedPositionProto) this.instance).setAccuracyMeters(d2);
            return this;
        }

        public Builder setFromNodeDbId(long j2) {
            copyOnWrite();
            ((MatchedPositionProto) this.instance).setFromNodeDbId(j2);
            return this;
        }

        public Builder setPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((MatchedPositionProto) this.instance).setPosition(builder.build());
            return this;
        }

        public Builder setStreetName(String str) {
            copyOnWrite();
            ((MatchedPositionProto) this.instance).setStreetName(str);
            return this;
        }

        public Builder setStreetNameBytes(v vVar) {
            copyOnWrite();
            ((MatchedPositionProto) this.instance).setStreetNameBytes(vVar);
            return this;
        }

        public Builder setToNodeDbId(long j2) {
            copyOnWrite();
            ((MatchedPositionProto) this.instance).setToNodeDbId(j2);
            return this;
        }

        public Builder setPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((MatchedPositionProto) this.instance).setPosition(intPosition);
            return this;
        }
    }

    public static MatchedPositionProto parseFrom(byte[] bArr) {
        return (MatchedPositionProto) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MatchedPositionProto parseFrom(byte[] bArr, de deVar) {
        return (MatchedPositionProto) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
