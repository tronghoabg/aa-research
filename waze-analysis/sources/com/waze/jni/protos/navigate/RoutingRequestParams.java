package com.waze.jni.protos.navigate;

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
public final class RoutingRequestParams extends du<RoutingRequestParams, Builder> implements RoutingRequestParamsOrBuilder {
    private static final RoutingRequestParams DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 1;
    private static volatile fo<RoutingRequestParams> PARSER;
    private int bitField0_;
    private Position.IntPosition destination_;
    private Position.IntPosition origin_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.RoutingRequestParams$1, reason: invalid class name */
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
        RoutingRequestParams routingRequestParams = new RoutingRequestParams();
        DEFAULT_INSTANCE = routingRequestParams;
        du.registerDefaultInstance(RoutingRequestParams.class, routingRequestParams);
    }

    private RoutingRequestParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigin() {
        this.origin_ = null;
        this.bitField0_ &= -2;
    }

    public static RoutingRequestParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestination(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.destination_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.destination_ = intPosition;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOrigin(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.origin_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.origin_ = intPosition;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RoutingRequestParams parseDelimitedFrom(InputStream inputStream) {
        return (RoutingRequestParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RoutingRequestParams parseFrom(v vVar) {
        return (RoutingRequestParams) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RoutingRequestParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.destination_ = intPosition;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigin(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.origin_ = intPosition;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "origin_", "destination_"});
        }
        if (iOrdinal == 3) {
            return new RoutingRequestParams();
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
        fo<RoutingRequestParams> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RoutingRequestParams.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsOrBuilder
    public Position.IntPosition getDestination() {
        Position.IntPosition intPosition = this.destination_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsOrBuilder
    public Position.IntPosition getOrigin() {
        Position.IntPosition intPosition = this.origin_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsOrBuilder
    public boolean hasDestination() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsOrBuilder
    public boolean hasOrigin() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(RoutingRequestParams routingRequestParams) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(routingRequestParams);
    }

    public static RoutingRequestParams parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RoutingRequestParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RoutingRequestParams parseFrom(v vVar, de deVar) {
        return (RoutingRequestParams) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RoutingRequestParams parseFrom(z zVar) {
        return (RoutingRequestParams) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RoutingRequestParams parseFrom(z zVar, de deVar) {
        return (RoutingRequestParams) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RoutingRequestParams parseFrom(InputStream inputStream) {
        return (RoutingRequestParams) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RoutingRequestParams parseFrom(InputStream inputStream, de deVar) {
        return (RoutingRequestParams) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RoutingRequestParams parseFrom(ByteBuffer byteBuffer) {
        return (RoutingRequestParams) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RoutingRequestParams parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RoutingRequestParams) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<RoutingRequestParams, Builder> implements RoutingRequestParamsOrBuilder {
        private Builder() {
            super(RoutingRequestParams.DEFAULT_INSTANCE);
        }

        public Builder clearDestination() {
            copyOnWrite();
            ((RoutingRequestParams) this.instance).clearDestination();
            return this;
        }

        public Builder clearOrigin() {
            copyOnWrite();
            ((RoutingRequestParams) this.instance).clearOrigin();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsOrBuilder
        public Position.IntPosition getDestination() {
            return ((RoutingRequestParams) this.instance).getDestination();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsOrBuilder
        public Position.IntPosition getOrigin() {
            return ((RoutingRequestParams) this.instance).getOrigin();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsOrBuilder
        public boolean hasDestination() {
            return ((RoutingRequestParams) this.instance).hasDestination();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsOrBuilder
        public boolean hasOrigin() {
            return ((RoutingRequestParams) this.instance).hasOrigin();
        }

        public Builder mergeDestination(Position.IntPosition intPosition) {
            copyOnWrite();
            ((RoutingRequestParams) this.instance).mergeDestination(intPosition);
            return this;
        }

        public Builder mergeOrigin(Position.IntPosition intPosition) {
            copyOnWrite();
            ((RoutingRequestParams) this.instance).mergeOrigin(intPosition);
            return this;
        }

        public Builder setDestination(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((RoutingRequestParams) this.instance).setDestination(builder.build());
            return this;
        }

        public Builder setOrigin(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((RoutingRequestParams) this.instance).setOrigin(builder.build());
            return this;
        }

        public Builder setDestination(Position.IntPosition intPosition) {
            copyOnWrite();
            ((RoutingRequestParams) this.instance).setDestination(intPosition);
            return this;
        }

        public Builder setOrigin(Position.IntPosition intPosition) {
            copyOnWrite();
            ((RoutingRequestParams) this.instance).setOrigin(intPosition);
            return this;
        }
    }

    public static RoutingRequestParams parseFrom(byte[] bArr) {
        return (RoutingRequestParams) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RoutingRequestParams parseFrom(byte[] bArr, de deVar) {
        return (RoutingRequestParams) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
