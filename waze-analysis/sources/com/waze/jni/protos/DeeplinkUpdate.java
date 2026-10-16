package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DeeplinkUpdate extends du<DeeplinkUpdate, Builder> implements DeeplinkUpdateOrBuilder {
    private static final DeeplinkUpdate DEFAULT_INSTANCE;
    public static final int LOCATION_SHARING_FIELD_NUMBER = 1;
    private static volatile fo<DeeplinkUpdate> PARSER;
    private int actionCase_ = 0;
    private Object action_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.DeeplinkUpdate$1, reason: invalid class name */
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
    public enum ActionCase {
        LOCATION_SHARING(1),
        ACTION_NOT_SET(0);

        private final int value;

        ActionCase(int i2) {
            this.value = i2;
        }

        public static ActionCase forNumber(int i2) {
            if (i2 == 0) {
                return ACTION_NOT_SET;
            }
            if (i2 != 1) {
                return null;
            }
            return LOCATION_SHARING;
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* compiled from: WazeSource */
    public interface LocationSharingOrBuilder extends fj {
        Position.IntPosition getPosition();

        boolean hasPosition();
    }

    static {
        DeeplinkUpdate deeplinkUpdate = new DeeplinkUpdate();
        DEFAULT_INSTANCE = deeplinkUpdate;
        du.registerDefaultInstance(DeeplinkUpdate.class, deeplinkUpdate);
    }

    private DeeplinkUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.actionCase_ = 0;
        this.action_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationSharing() {
        if (this.actionCase_ == 1) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    public static DeeplinkUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocationSharing(LocationSharing locationSharing) {
        Objects.requireNonNull(locationSharing);
        if (this.actionCase_ == 1 && this.action_ != LocationSharing.getDefaultInstance()) {
            LocationSharing.Builder builderNewBuilder = LocationSharing.newBuilder((LocationSharing) this.action_);
            builderNewBuilder.mergeFrom((LocationSharing.Builder) locationSharing);
            locationSharing = builderNewBuilder.buildPartial();
        }
        this.action_ = locationSharing;
        this.actionCase_ = 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DeeplinkUpdate parseDelimitedFrom(InputStream inputStream) {
        return (DeeplinkUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeeplinkUpdate parseFrom(v vVar) {
        return (DeeplinkUpdate) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<DeeplinkUpdate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationSharing(LocationSharing locationSharing) {
        Objects.requireNonNull(locationSharing);
        this.action_ = locationSharing;
        this.actionCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"action_", "actionCase_", LocationSharing.class});
        }
        if (iOrdinal == 3) {
            return new DeeplinkUpdate();
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
        fo<DeeplinkUpdate> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (DeeplinkUpdate.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.DeeplinkUpdateOrBuilder
    public ActionCase getActionCase() {
        return ActionCase.forNumber(this.actionCase_);
    }

    @Override // com.waze.jni.protos.DeeplinkUpdateOrBuilder
    public LocationSharing getLocationSharing() {
        return this.actionCase_ == 1 ? (LocationSharing) this.action_ : LocationSharing.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.DeeplinkUpdateOrBuilder
    public boolean hasLocationSharing() {
        return this.actionCase_ == 1;
    }

    /* compiled from: WazeSource */
    public final class LocationSharing extends du<LocationSharing, Builder> implements LocationSharingOrBuilder {
        private static final LocationSharing DEFAULT_INSTANCE;
        private static volatile fo<LocationSharing> PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 1;
        private int bitField0_;
        private Position.IntPosition position_;

        static {
            LocationSharing locationSharing = new LocationSharing();
            DEFAULT_INSTANCE = locationSharing;
            du.registerDefaultInstance(LocationSharing.class, locationSharing);
        }

        private LocationSharing() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPosition() {
            this.position_ = null;
            this.bitField0_ &= -2;
        }

        public static LocationSharing getDefaultInstance() {
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

        public static LocationSharing parseDelimitedFrom(InputStream inputStream) {
            return (LocationSharing) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LocationSharing parseFrom(v vVar) {
            return (LocationSharing) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<LocationSharing> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            this.position_ = intPosition;
            this.bitField0_ |= 1;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "position_"});
            }
            if (iOrdinal == 3) {
                return new LocationSharing();
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
            fo<LocationSharing> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (LocationSharing.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.DeeplinkUpdate.LocationSharingOrBuilder
        public Position.IntPosition getPosition() {
            Position.IntPosition intPosition = this.position_;
            return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
        }

        @Override // com.waze.jni.protos.DeeplinkUpdate.LocationSharingOrBuilder
        public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(LocationSharing locationSharing) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(locationSharing);
        }

        public static LocationSharing parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (LocationSharing) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static LocationSharing parseFrom(v vVar, de deVar) {
            return (LocationSharing) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static LocationSharing parseFrom(z zVar) {
            return (LocationSharing) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static LocationSharing parseFrom(z zVar, de deVar) {
            return (LocationSharing) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static LocationSharing parseFrom(InputStream inputStream) {
            return (LocationSharing) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LocationSharing parseFrom(InputStream inputStream, de deVar) {
            return (LocationSharing) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static LocationSharing parseFrom(ByteBuffer byteBuffer) {
            return (LocationSharing) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static LocationSharing parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (LocationSharing) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<LocationSharing, Builder> implements LocationSharingOrBuilder {
            private Builder() {
                super(LocationSharing.DEFAULT_INSTANCE);
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((LocationSharing) this.instance).clearPosition();
                return this;
            }

            @Override // com.waze.jni.protos.DeeplinkUpdate.LocationSharingOrBuilder
            public Position.IntPosition getPosition() {
                return ((LocationSharing) this.instance).getPosition();
            }

            @Override // com.waze.jni.protos.DeeplinkUpdate.LocationSharingOrBuilder
            public boolean hasPosition() {
                return ((LocationSharing) this.instance).hasPosition();
            }

            public Builder mergePosition(Position.IntPosition intPosition) {
                copyOnWrite();
                ((LocationSharing) this.instance).mergePosition(intPosition);
                return this;
            }

            public Builder setPosition(Position.IntPosition.Builder builder) {
                copyOnWrite();
                ((LocationSharing) this.instance).setPosition(builder.build());
                return this;
            }

            public Builder setPosition(Position.IntPosition intPosition) {
                copyOnWrite();
                ((LocationSharing) this.instance).setPosition(intPosition);
                return this;
            }
        }

        public static LocationSharing parseFrom(byte[] bArr) {
            return (LocationSharing) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LocationSharing parseFrom(byte[] bArr, de deVar) {
            return (LocationSharing) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(DeeplinkUpdate deeplinkUpdate) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(deeplinkUpdate);
    }

    public static DeeplinkUpdate parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (DeeplinkUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static DeeplinkUpdate parseFrom(v vVar, de deVar) {
        return (DeeplinkUpdate) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static DeeplinkUpdate parseFrom(z zVar) {
        return (DeeplinkUpdate) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static DeeplinkUpdate parseFrom(z zVar, de deVar) {
        return (DeeplinkUpdate) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static DeeplinkUpdate parseFrom(InputStream inputStream) {
        return (DeeplinkUpdate) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeeplinkUpdate parseFrom(InputStream inputStream, de deVar) {
        return (DeeplinkUpdate) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static DeeplinkUpdate parseFrom(ByteBuffer byteBuffer) {
        return (DeeplinkUpdate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DeeplinkUpdate parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (DeeplinkUpdate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<DeeplinkUpdate, Builder> implements DeeplinkUpdateOrBuilder {
        private Builder() {
            super(DeeplinkUpdate.DEFAULT_INSTANCE);
        }

        public Builder clearAction() {
            copyOnWrite();
            ((DeeplinkUpdate) this.instance).clearAction();
            return this;
        }

        public Builder clearLocationSharing() {
            copyOnWrite();
            ((DeeplinkUpdate) this.instance).clearLocationSharing();
            return this;
        }

        @Override // com.waze.jni.protos.DeeplinkUpdateOrBuilder
        public ActionCase getActionCase() {
            return ((DeeplinkUpdate) this.instance).getActionCase();
        }

        @Override // com.waze.jni.protos.DeeplinkUpdateOrBuilder
        public LocationSharing getLocationSharing() {
            return ((DeeplinkUpdate) this.instance).getLocationSharing();
        }

        @Override // com.waze.jni.protos.DeeplinkUpdateOrBuilder
        public boolean hasLocationSharing() {
            return ((DeeplinkUpdate) this.instance).hasLocationSharing();
        }

        public Builder mergeLocationSharing(LocationSharing locationSharing) {
            copyOnWrite();
            ((DeeplinkUpdate) this.instance).mergeLocationSharing(locationSharing);
            return this;
        }

        public Builder setLocationSharing(LocationSharing.Builder builder) {
            copyOnWrite();
            ((DeeplinkUpdate) this.instance).setLocationSharing(builder.build());
            return this;
        }

        public Builder setLocationSharing(LocationSharing locationSharing) {
            copyOnWrite();
            ((DeeplinkUpdate) this.instance).setLocationSharing(locationSharing);
            return this;
        }
    }

    public static DeeplinkUpdate parseFrom(byte[] bArr) {
        return (DeeplinkUpdate) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DeeplinkUpdate parseFrom(byte[] bArr, de deVar) {
        return (DeeplinkUpdate) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
