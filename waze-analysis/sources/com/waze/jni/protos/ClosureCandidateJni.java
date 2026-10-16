package com.waze.jni.protos;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ClosureCandidateJni extends du<ClosureCandidateJni, Builder> implements ClosureCandidateJniOrBuilder {
    private static final ClosureCandidateJni DEFAULT_INSTANCE;
    public static final int FROM_COORDINATE_FIELD_NUMBER = 6;
    public static final int FROM_NODE_FIELD_NUMBER = 4;
    public static final int IS_ON_ROUTE_FIELD_NUMBER = 9;
    public static final int LINE_ID_FIELD_NUMBER = 2;
    private static volatile fo<ClosureCandidateJni> PARSER = null;
    public static final int POLYLINE_FIELD_NUMBER = 10;
    public static final int STREET_NAME_FIELD_NUMBER = 8;
    public static final int TILE_ID_FIELD_NUMBER = 1;
    public static final int TO_COORDINATE_FIELD_NUMBER = 7;
    public static final int TO_NODE_FIELD_NUMBER = 5;
    private int bitField0_;
    private Position.IntPosition fromCoordinate_;
    private int fromNode_;
    private boolean isOnRoute_;
    private int lineId_;
    private int tileId_;
    private Position.IntPosition toCoordinate_;
    private int toNode_;
    private String streetName_ = "";
    private eo<Position.IntPosition> polyline_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.ClosureCandidateJni$1, reason: invalid class name */
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
        ClosureCandidateJni closureCandidateJni = new ClosureCandidateJni();
        DEFAULT_INSTANCE = closureCandidateJni;
        du.registerDefaultInstance(ClosureCandidateJni.class, closureCandidateJni);
    }

    private ClosureCandidateJni() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPolyline(Iterable<? extends Position.IntPosition> iterable) {
        ensurePolylineIsMutable();
        c.addAll(iterable, this.polyline_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolyline(int i2, Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensurePolylineIsMutable();
        this.polyline_.add(i2, intPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromCoordinate() {
        this.fromCoordinate_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNode() {
        this.bitField0_ &= -5;
        this.fromNode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsOnRoute() {
        this.bitField0_ &= -129;
        this.isOnRoute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLineId() {
        this.bitField0_ &= -3;
        this.lineId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolyline() {
        this.polyline_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreetName() {
        this.bitField0_ &= -65;
        this.streetName_ = getDefaultInstance().getStreetName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileId() {
        this.bitField0_ &= -2;
        this.tileId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToCoordinate() {
        this.toCoordinate_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToNode() {
        this.bitField0_ &= -9;
        this.toNode_ = 0;
    }

    private void ensurePolylineIsMutable() {
        eo<Position.IntPosition> eoVar = this.polyline_;
        if (eoVar.c()) {
            return;
        }
        this.polyline_ = du.mutableCopy(eoVar);
    }

    public static ClosureCandidateJni getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFromCoordinate(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.fromCoordinate_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.fromCoordinate_ = intPosition;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToCoordinate(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.toCoordinate_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.toCoordinate_ = intPosition;
        this.bitField0_ |= 32;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ClosureCandidateJni parseDelimitedFrom(InputStream inputStream) {
        return (ClosureCandidateJni) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClosureCandidateJni parseFrom(v vVar) {
        return (ClosureCandidateJni) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ClosureCandidateJni> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePolyline(int i2) {
        ensurePolylineIsMutable();
        this.polyline_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromCoordinate(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.fromCoordinate_ = intPosition;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNode(int i2) {
        this.bitField0_ |= 4;
        this.fromNode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsOnRoute(boolean z) {
        this.bitField0_ |= 128;
        this.isOnRoute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLineId(int i2) {
        this.bitField0_ |= 2;
        this.lineId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolyline(int i2, Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensurePolylineIsMutable();
        this.polyline_.set(i2, intPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.streetName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.streetName_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileId(int i2) {
        this.bitField0_ |= 1;
        this.tileId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToCoordinate(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.toCoordinate_ = intPosition;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToNode(int i2) {
        this.bitField0_ |= 8;
        this.toNode_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0004င\u0002\u0005င\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bለ\u0006\tဇ\u0007\n\u001b", new Object[]{"bitField0_", "tileId_", "lineId_", "fromNode_", "toNode_", "fromCoordinate_", "toCoordinate_", "streetName_", "isOnRoute_", "polyline_", Position.IntPosition.class});
        }
        if (iOrdinal == 3) {
            return new ClosureCandidateJni();
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
        fo<ClosureCandidateJni> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ClosureCandidateJni.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public Position.IntPosition getFromCoordinate() {
        Position.IntPosition intPosition = this.fromCoordinate_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public int getFromNode() {
        return this.fromNode_;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public boolean getIsOnRoute() {
        return this.isOnRoute_;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public int getLineId() {
        return this.lineId_;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public Position.IntPosition getPolyline(int i2) {
        return this.polyline_.get(i2);
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public int getPolylineCount() {
        return this.polyline_.size();
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public List<Position.IntPosition> getPolylineList() {
        return this.polyline_;
    }

    public Position.IntPositionOrBuilder getPolylineOrBuilder(int i2) {
        return this.polyline_.get(i2);
    }

    public List<? extends Position.IntPositionOrBuilder> getPolylineOrBuilderList() {
        return this.polyline_;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public String getStreetName() {
        return this.streetName_;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public v getStreetNameBytes() {
        return v.s(this.streetName_);
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public int getTileId() {
        return this.tileId_;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public Position.IntPosition getToCoordinate() {
        Position.IntPosition intPosition = this.toCoordinate_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public int getToNode() {
        return this.toNode_;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public boolean hasFromCoordinate() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public boolean hasFromNode() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public boolean hasIsOnRoute() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public boolean hasLineId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public boolean hasStreetName() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public boolean hasTileId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public boolean hasToCoordinate() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
    public boolean hasToNode() {
        return (this.bitField0_ & 8) != 0;
    }

    public static Builder newBuilder(ClosureCandidateJni closureCandidateJni) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(closureCandidateJni);
    }

    public static ClosureCandidateJni parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ClosureCandidateJni) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ClosureCandidateJni parseFrom(v vVar, de deVar) {
        return (ClosureCandidateJni) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ClosureCandidateJni parseFrom(z zVar) {
        return (ClosureCandidateJni) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ClosureCandidateJni parseFrom(z zVar, de deVar) {
        return (ClosureCandidateJni) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolyline(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensurePolylineIsMutable();
        this.polyline_.add(intPosition);
    }

    public static ClosureCandidateJni parseFrom(InputStream inputStream) {
        return (ClosureCandidateJni) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClosureCandidateJni parseFrom(InputStream inputStream, de deVar) {
        return (ClosureCandidateJni) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ClosureCandidateJni parseFrom(ByteBuffer byteBuffer) {
        return (ClosureCandidateJni) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ClosureCandidateJni parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ClosureCandidateJni) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<ClosureCandidateJni, Builder> implements ClosureCandidateJniOrBuilder {
        private Builder() {
            super(ClosureCandidateJni.DEFAULT_INSTANCE);
        }

        public Builder addAllPolyline(Iterable<? extends Position.IntPosition> iterable) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).addAllPolyline(iterable);
            return this;
        }

        public Builder addPolyline(int i2, Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).addPolyline(i2, builder.build());
            return this;
        }

        public Builder clearFromCoordinate() {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).clearFromCoordinate();
            return this;
        }

        public Builder clearFromNode() {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).clearFromNode();
            return this;
        }

        public Builder clearIsOnRoute() {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).clearIsOnRoute();
            return this;
        }

        public Builder clearLineId() {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).clearLineId();
            return this;
        }

        public Builder clearPolyline() {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).clearPolyline();
            return this;
        }

        public Builder clearStreetName() {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).clearStreetName();
            return this;
        }

        public Builder clearTileId() {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).clearTileId();
            return this;
        }

        public Builder clearToCoordinate() {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).clearToCoordinate();
            return this;
        }

        public Builder clearToNode() {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).clearToNode();
            return this;
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public Position.IntPosition getFromCoordinate() {
            return ((ClosureCandidateJni) this.instance).getFromCoordinate();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public int getFromNode() {
            return ((ClosureCandidateJni) this.instance).getFromNode();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public boolean getIsOnRoute() {
            return ((ClosureCandidateJni) this.instance).getIsOnRoute();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public int getLineId() {
            return ((ClosureCandidateJni) this.instance).getLineId();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public Position.IntPosition getPolyline(int i2) {
            return ((ClosureCandidateJni) this.instance).getPolyline(i2);
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public int getPolylineCount() {
            return ((ClosureCandidateJni) this.instance).getPolylineCount();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public List<Position.IntPosition> getPolylineList() {
            return DesugarCollections.unmodifiableList(((ClosureCandidateJni) this.instance).getPolylineList());
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public String getStreetName() {
            return ((ClosureCandidateJni) this.instance).getStreetName();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public v getStreetNameBytes() {
            return ((ClosureCandidateJni) this.instance).getStreetNameBytes();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public int getTileId() {
            return ((ClosureCandidateJni) this.instance).getTileId();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public Position.IntPosition getToCoordinate() {
            return ((ClosureCandidateJni) this.instance).getToCoordinate();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public int getToNode() {
            return ((ClosureCandidateJni) this.instance).getToNode();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public boolean hasFromCoordinate() {
            return ((ClosureCandidateJni) this.instance).hasFromCoordinate();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public boolean hasFromNode() {
            return ((ClosureCandidateJni) this.instance).hasFromNode();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public boolean hasIsOnRoute() {
            return ((ClosureCandidateJni) this.instance).hasIsOnRoute();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public boolean hasLineId() {
            return ((ClosureCandidateJni) this.instance).hasLineId();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public boolean hasStreetName() {
            return ((ClosureCandidateJni) this.instance).hasStreetName();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public boolean hasTileId() {
            return ((ClosureCandidateJni) this.instance).hasTileId();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public boolean hasToCoordinate() {
            return ((ClosureCandidateJni) this.instance).hasToCoordinate();
        }

        @Override // com.waze.jni.protos.ClosureCandidateJniOrBuilder
        public boolean hasToNode() {
            return ((ClosureCandidateJni) this.instance).hasToNode();
        }

        public Builder mergeFromCoordinate(Position.IntPosition intPosition) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).mergeFromCoordinate(intPosition);
            return this;
        }

        public Builder mergeToCoordinate(Position.IntPosition intPosition) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).mergeToCoordinate(intPosition);
            return this;
        }

        public Builder removePolyline(int i2) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).removePolyline(i2);
            return this;
        }

        public Builder setFromCoordinate(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).setFromCoordinate(builder.build());
            return this;
        }

        public Builder setFromNode(int i2) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).setFromNode(i2);
            return this;
        }

        public Builder setIsOnRoute(boolean z) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).setIsOnRoute(z);
            return this;
        }

        public Builder setLineId(int i2) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).setLineId(i2);
            return this;
        }

        public Builder setPolyline(int i2, Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).setPolyline(i2, builder.build());
            return this;
        }

        public Builder setStreetName(String str) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).setStreetName(str);
            return this;
        }

        public Builder setStreetNameBytes(v vVar) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).setStreetNameBytes(vVar);
            return this;
        }

        public Builder setTileId(int i2) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).setTileId(i2);
            return this;
        }

        public Builder setToCoordinate(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).setToCoordinate(builder.build());
            return this;
        }

        public Builder setToNode(int i2) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).setToNode(i2);
            return this;
        }

        public Builder addPolyline(int i2, Position.IntPosition intPosition) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).addPolyline(i2, intPosition);
            return this;
        }

        public Builder setFromCoordinate(Position.IntPosition intPosition) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).setFromCoordinate(intPosition);
            return this;
        }

        public Builder setPolyline(int i2, Position.IntPosition intPosition) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).setPolyline(i2, intPosition);
            return this;
        }

        public Builder setToCoordinate(Position.IntPosition intPosition) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).setToCoordinate(intPosition);
            return this;
        }

        public Builder addPolyline(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).addPolyline(builder.build());
            return this;
        }

        public Builder addPolyline(Position.IntPosition intPosition) {
            copyOnWrite();
            ((ClosureCandidateJni) this.instance).addPolyline(intPosition);
            return this;
        }
    }

    public static ClosureCandidateJni parseFrom(byte[] bArr) {
        return (ClosureCandidateJni) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClosureCandidateJni parseFrom(byte[] bArr, de deVar) {
        return (ClosureCandidateJni) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
