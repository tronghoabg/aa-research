package com.waze.jni.protos;

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
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapAdObject extends du<MapAdObject, Builder> implements MapAdObjectOrBuilder {
    private static final MapAdObject DEFAULT_INSTANCE;
    private static volatile fo<MapAdObject> PARSER = null;
    public static final int PINTYPE_FIELD_NUMBER = 1;
    public static final int POSITION_FIELD_NUMBER = 2;
    public static final int VENUE_CONTEXT_FIELD_NUMBER = 4;
    public static final int VENUE_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private int pinType_;
    private Position.IntPosition position_;
    private String venueId_ = "";
    private String venueContext_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.MapAdObject$1, reason: invalid class name */
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
    public enum PinType implements eg {
        PIN_TYPE_UNSPECIFIED(0),
        AD(1),
        AD_ARROW(2),
        UNRECOGNIZED(-1);

        public static final int AD_ARROW_VALUE = 2;
        public static final int AD_VALUE = 1;
        public static final int PIN_TYPE_UNSPECIFIED_VALUE = 0;
        private static final eh<PinType> internalValueMap = new eh<PinType>() { // from class: com.waze.jni.protos.MapAdObject.PinType.1
            @Override // com.google.v.eh
            public PinType findValueByNumber(int i2) {
                return PinType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class PinTypeVerifier implements ei {
            static final ei INSTANCE = new PinTypeVerifier();

            private PinTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return PinType.forNumber(i2) != null;
            }
        }

        PinType(int i2) {
            this.value = i2;
        }

        public static PinType forNumber(int i2) {
            if (i2 == 0) {
                return PIN_TYPE_UNSPECIFIED;
            }
            if (i2 == 1) {
                return AD;
            }
            if (i2 != 2) {
                return null;
            }
            return AD_ARROW;
        }

        public static eh<PinType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return PinTypeVerifier.INSTANCE;
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
        MapAdObject mapAdObject = new MapAdObject();
        DEFAULT_INSTANCE = mapAdObject;
        du.registerDefaultInstance(MapAdObject.class, mapAdObject);
    }

    private MapAdObject() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinType() {
        this.bitField0_ &= -2;
        this.pinType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueContext() {
        this.bitField0_ &= -9;
        this.venueContext_ = getDefaultInstance().getVenueContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.bitField0_ &= -5;
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static MapAdObject getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MapAdObject parseDelimitedFrom(InputStream inputStream) {
        return (MapAdObject) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapAdObject parseFrom(v vVar) {
        return (MapAdObject) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MapAdObject> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinType(PinType pinType) {
        this.pinType_ = pinType.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinTypeValue(int i2) {
        this.bitField0_ |= 1;
        this.pinType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.position_ = intPosition;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.venueContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueContextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueContext_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "pinType_", "position_", "venueId_", "venueContext_"});
        }
        if (iOrdinal == 3) {
            return new MapAdObject();
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
        fo<MapAdObject> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MapAdObject.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.MapAdObjectOrBuilder
    public PinType getPinType() {
        PinType pinTypeForNumber = PinType.forNumber(this.pinType_);
        return pinTypeForNumber == null ? PinType.UNRECOGNIZED : pinTypeForNumber;
    }

    @Override // com.waze.jni.protos.MapAdObjectOrBuilder
    public int getPinTypeValue() {
        return this.pinType_;
    }

    @Override // com.waze.jni.protos.MapAdObjectOrBuilder
    public Position.IntPosition getPosition() {
        Position.IntPosition intPosition = this.position_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.MapAdObjectOrBuilder
    public String getVenueContext() {
        return this.venueContext_;
    }

    @Override // com.waze.jni.protos.MapAdObjectOrBuilder
    public v getVenueContextBytes() {
        return v.s(this.venueContext_);
    }

    @Override // com.waze.jni.protos.MapAdObjectOrBuilder
    public String getVenueId() {
        return this.venueId_;
    }

    @Override // com.waze.jni.protos.MapAdObjectOrBuilder
    public v getVenueIdBytes() {
        return v.s(this.venueId_);
    }

    @Override // com.waze.jni.protos.MapAdObjectOrBuilder
    public boolean hasPinType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.MapAdObjectOrBuilder
    public boolean hasPosition() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.MapAdObjectOrBuilder
    public boolean hasVenueContext() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.MapAdObjectOrBuilder
    public boolean hasVenueId() {
        return (this.bitField0_ & 4) != 0;
    }

    public static Builder newBuilder(MapAdObject mapAdObject) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mapAdObject);
    }

    public static MapAdObject parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MapAdObject) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapAdObject parseFrom(v vVar, de deVar) {
        return (MapAdObject) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MapAdObject parseFrom(z zVar) {
        return (MapAdObject) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MapAdObject parseFrom(z zVar, de deVar) {
        return (MapAdObject) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MapAdObject parseFrom(InputStream inputStream) {
        return (MapAdObject) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapAdObject parseFrom(InputStream inputStream, de deVar) {
        return (MapAdObject) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapAdObject parseFrom(ByteBuffer byteBuffer) {
        return (MapAdObject) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MapAdObject parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MapAdObject) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<MapAdObject, Builder> implements MapAdObjectOrBuilder {
        private Builder() {
            super(MapAdObject.DEFAULT_INSTANCE);
        }

        public Builder clearPinType() {
            copyOnWrite();
            ((MapAdObject) this.instance).clearPinType();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((MapAdObject) this.instance).clearPosition();
            return this;
        }

        public Builder clearVenueContext() {
            copyOnWrite();
            ((MapAdObject) this.instance).clearVenueContext();
            return this;
        }

        public Builder clearVenueId() {
            copyOnWrite();
            ((MapAdObject) this.instance).clearVenueId();
            return this;
        }

        @Override // com.waze.jni.protos.MapAdObjectOrBuilder
        public PinType getPinType() {
            return ((MapAdObject) this.instance).getPinType();
        }

        @Override // com.waze.jni.protos.MapAdObjectOrBuilder
        public int getPinTypeValue() {
            return ((MapAdObject) this.instance).getPinTypeValue();
        }

        @Override // com.waze.jni.protos.MapAdObjectOrBuilder
        public Position.IntPosition getPosition() {
            return ((MapAdObject) this.instance).getPosition();
        }

        @Override // com.waze.jni.protos.MapAdObjectOrBuilder
        public String getVenueContext() {
            return ((MapAdObject) this.instance).getVenueContext();
        }

        @Override // com.waze.jni.protos.MapAdObjectOrBuilder
        public v getVenueContextBytes() {
            return ((MapAdObject) this.instance).getVenueContextBytes();
        }

        @Override // com.waze.jni.protos.MapAdObjectOrBuilder
        public String getVenueId() {
            return ((MapAdObject) this.instance).getVenueId();
        }

        @Override // com.waze.jni.protos.MapAdObjectOrBuilder
        public v getVenueIdBytes() {
            return ((MapAdObject) this.instance).getVenueIdBytes();
        }

        @Override // com.waze.jni.protos.MapAdObjectOrBuilder
        public boolean hasPinType() {
            return ((MapAdObject) this.instance).hasPinType();
        }

        @Override // com.waze.jni.protos.MapAdObjectOrBuilder
        public boolean hasPosition() {
            return ((MapAdObject) this.instance).hasPosition();
        }

        @Override // com.waze.jni.protos.MapAdObjectOrBuilder
        public boolean hasVenueContext() {
            return ((MapAdObject) this.instance).hasVenueContext();
        }

        @Override // com.waze.jni.protos.MapAdObjectOrBuilder
        public boolean hasVenueId() {
            return ((MapAdObject) this.instance).hasVenueId();
        }

        public Builder mergePosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((MapAdObject) this.instance).mergePosition(intPosition);
            return this;
        }

        public Builder setPinType(PinType pinType) {
            copyOnWrite();
            ((MapAdObject) this.instance).setPinType(pinType);
            return this;
        }

        public Builder setPinTypeValue(int i2) {
            copyOnWrite();
            ((MapAdObject) this.instance).setPinTypeValue(i2);
            return this;
        }

        public Builder setPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((MapAdObject) this.instance).setPosition(builder.build());
            return this;
        }

        public Builder setVenueContext(String str) {
            copyOnWrite();
            ((MapAdObject) this.instance).setVenueContext(str);
            return this;
        }

        public Builder setVenueContextBytes(v vVar) {
            copyOnWrite();
            ((MapAdObject) this.instance).setVenueContextBytes(vVar);
            return this;
        }

        public Builder setVenueId(String str) {
            copyOnWrite();
            ((MapAdObject) this.instance).setVenueId(str);
            return this;
        }

        public Builder setVenueIdBytes(v vVar) {
            copyOnWrite();
            ((MapAdObject) this.instance).setVenueIdBytes(vVar);
            return this;
        }

        public Builder setPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((MapAdObject) this.instance).setPosition(intPosition);
            return this;
        }
    }

    public static MapAdObject parseFrom(byte[] bArr) {
        return (MapAdObject) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MapAdObject parseFrom(byte[] bArr, de deVar) {
        return (MapAdObject) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
