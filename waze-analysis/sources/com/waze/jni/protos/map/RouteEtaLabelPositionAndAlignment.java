package com.waze.jni.protos.map;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.Marker;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteEtaLabelPositionAndAlignment extends du<RouteEtaLabelPositionAndAlignment, Builder> implements RouteEtaLabelPositionAndAlignmentOrBuilder {
    public static final int ALIGNMENT_FIELD_NUMBER = 3;
    private static final RouteEtaLabelPositionAndAlignment DEFAULT_INSTANCE;
    private static volatile fo<RouteEtaLabelPositionAndAlignment> PARSER = null;
    public static final int POLYLINE_ID_FIELD_NUMBER = 1;
    public static final int POSITION_FIELD_NUMBER = 2;
    private int alignment_;
    private int bitField0_;
    private long polylineId_;
    private Position.IntPosition position_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignment$1, reason: invalid class name */
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
        RouteEtaLabelPositionAndAlignment routeEtaLabelPositionAndAlignment = new RouteEtaLabelPositionAndAlignment();
        DEFAULT_INSTANCE = routeEtaLabelPositionAndAlignment;
        du.registerDefaultInstance(RouteEtaLabelPositionAndAlignment.class, routeEtaLabelPositionAndAlignment);
    }

    private RouteEtaLabelPositionAndAlignment() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlignment() {
        this.alignment_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolylineId() {
        this.polylineId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -2;
    }

    public static RouteEtaLabelPositionAndAlignment getDefaultInstance() {
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

    public static RouteEtaLabelPositionAndAlignment parseDelimitedFrom(InputStream inputStream) {
        return (RouteEtaLabelPositionAndAlignment) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RouteEtaLabelPositionAndAlignment parseFrom(v vVar) {
        return (RouteEtaLabelPositionAndAlignment) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RouteEtaLabelPositionAndAlignment> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlignment(Marker.Alignment alignment) {
        this.alignment_ = alignment.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlignmentValue(int i2) {
        this.alignment_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolylineId(long j2) {
        this.polylineId_ = j2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002ဉ\u0000\u0003\f", new Object[]{"bitField0_", "polylineId_", "position_", "alignment_"});
        }
        if (iOrdinal == 3) {
            return new RouteEtaLabelPositionAndAlignment();
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
        fo<RouteEtaLabelPositionAndAlignment> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RouteEtaLabelPositionAndAlignment.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignmentOrBuilder
    public Marker.Alignment getAlignment() {
        Marker.Alignment alignmentForNumber = Marker.Alignment.forNumber(this.alignment_);
        return alignmentForNumber == null ? Marker.Alignment.UNRECOGNIZED : alignmentForNumber;
    }

    @Override // com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignmentOrBuilder
    public int getAlignmentValue() {
        return this.alignment_;
    }

    @Override // com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignmentOrBuilder
    public long getPolylineId() {
        return this.polylineId_;
    }

    @Override // com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignmentOrBuilder
    public Position.IntPosition getPosition() {
        Position.IntPosition intPosition = this.position_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignmentOrBuilder
    public boolean hasPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(RouteEtaLabelPositionAndAlignment routeEtaLabelPositionAndAlignment) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(routeEtaLabelPositionAndAlignment);
    }

    public static RouteEtaLabelPositionAndAlignment parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RouteEtaLabelPositionAndAlignment) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RouteEtaLabelPositionAndAlignment parseFrom(v vVar, de deVar) {
        return (RouteEtaLabelPositionAndAlignment) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RouteEtaLabelPositionAndAlignment parseFrom(z zVar) {
        return (RouteEtaLabelPositionAndAlignment) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RouteEtaLabelPositionAndAlignment parseFrom(z zVar, de deVar) {
        return (RouteEtaLabelPositionAndAlignment) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RouteEtaLabelPositionAndAlignment parseFrom(InputStream inputStream) {
        return (RouteEtaLabelPositionAndAlignment) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RouteEtaLabelPositionAndAlignment parseFrom(InputStream inputStream, de deVar) {
        return (RouteEtaLabelPositionAndAlignment) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RouteEtaLabelPositionAndAlignment parseFrom(ByteBuffer byteBuffer) {
        return (RouteEtaLabelPositionAndAlignment) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RouteEtaLabelPositionAndAlignment parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RouteEtaLabelPositionAndAlignment) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<RouteEtaLabelPositionAndAlignment, Builder> implements RouteEtaLabelPositionAndAlignmentOrBuilder {
        private Builder() {
            super(RouteEtaLabelPositionAndAlignment.DEFAULT_INSTANCE);
        }

        public Builder clearAlignment() {
            copyOnWrite();
            ((RouteEtaLabelPositionAndAlignment) this.instance).clearAlignment();
            return this;
        }

        public Builder clearPolylineId() {
            copyOnWrite();
            ((RouteEtaLabelPositionAndAlignment) this.instance).clearPolylineId();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((RouteEtaLabelPositionAndAlignment) this.instance).clearPosition();
            return this;
        }

        @Override // com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignmentOrBuilder
        public Marker.Alignment getAlignment() {
            return ((RouteEtaLabelPositionAndAlignment) this.instance).getAlignment();
        }

        @Override // com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignmentOrBuilder
        public int getAlignmentValue() {
            return ((RouteEtaLabelPositionAndAlignment) this.instance).getAlignmentValue();
        }

        @Override // com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignmentOrBuilder
        public long getPolylineId() {
            return ((RouteEtaLabelPositionAndAlignment) this.instance).getPolylineId();
        }

        @Override // com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignmentOrBuilder
        public Position.IntPosition getPosition() {
            return ((RouteEtaLabelPositionAndAlignment) this.instance).getPosition();
        }

        @Override // com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignmentOrBuilder
        public boolean hasPosition() {
            return ((RouteEtaLabelPositionAndAlignment) this.instance).hasPosition();
        }

        public Builder mergePosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((RouteEtaLabelPositionAndAlignment) this.instance).mergePosition(intPosition);
            return this;
        }

        public Builder setAlignment(Marker.Alignment alignment) {
            copyOnWrite();
            ((RouteEtaLabelPositionAndAlignment) this.instance).setAlignment(alignment);
            return this;
        }

        public Builder setAlignmentValue(int i2) {
            copyOnWrite();
            ((RouteEtaLabelPositionAndAlignment) this.instance).setAlignmentValue(i2);
            return this;
        }

        public Builder setPolylineId(long j2) {
            copyOnWrite();
            ((RouteEtaLabelPositionAndAlignment) this.instance).setPolylineId(j2);
            return this;
        }

        public Builder setPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((RouteEtaLabelPositionAndAlignment) this.instance).setPosition(builder.build());
            return this;
        }

        public Builder setPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((RouteEtaLabelPositionAndAlignment) this.instance).setPosition(intPosition);
            return this;
        }
    }

    public static RouteEtaLabelPositionAndAlignment parseFrom(byte[] bArr) {
        return (RouteEtaLabelPositionAndAlignment) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RouteEtaLabelPositionAndAlignment parseFrom(byte[] bArr, de deVar) {
        return (RouteEtaLabelPositionAndAlignment) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
