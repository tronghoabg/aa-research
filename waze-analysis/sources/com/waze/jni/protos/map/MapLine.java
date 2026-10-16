package com.waze.jni.protos.map;

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
public final class MapLine extends du<MapLine, Builder> implements MapLineOrBuilder {
    public static final int CENTER_POSITION_FIELD_NUMBER = 5;
    private static final MapLine DEFAULT_INSTANCE;
    public static final int LINE_ID_FIELD_NUMBER = 2;
    private static volatile fo<MapLine> PARSER = null;
    public static final int POSITIONS_FIELD_NUMBER = 4;
    public static final int REVERSED_FIELD_NUMBER = 3;
    public static final int TILE_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Position.IntPosition centerPosition_;
    private int lineId_;
    private eo<Position.IntPosition> positions_ = emptyProtobufList();
    private boolean reversed_;
    private int tileId_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.MapLine$1, reason: invalid class name */
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
        MapLine mapLine = new MapLine();
        DEFAULT_INSTANCE = mapLine;
        du.registerDefaultInstance(MapLine.class, mapLine);
    }

    private MapLine() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPositions(Iterable<? extends Position.IntPosition> iterable) {
        ensurePositionsIsMutable();
        c.addAll(iterable, this.positions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPositions(int i2, Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensurePositionsIsMutable();
        this.positions_.add(i2, intPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCenterPosition() {
        this.centerPosition_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLineId() {
        this.lineId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPositions() {
        this.positions_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReversed() {
        this.reversed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileId() {
        this.tileId_ = 0;
    }

    private void ensurePositionsIsMutable() {
        eo<Position.IntPosition> eoVar = this.positions_;
        if (eoVar.c()) {
            return;
        }
        this.positions_ = du.mutableCopy(eoVar);
    }

    public static MapLine getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCenterPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.centerPosition_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.centerPosition_ = intPosition;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MapLine parseDelimitedFrom(InputStream inputStream) {
        return (MapLine) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapLine parseFrom(v vVar) {
        return (MapLine) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MapLine> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePositions(int i2) {
        ensurePositionsIsMutable();
        this.positions_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCenterPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.centerPosition_ = intPosition;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLineId(int i2) {
        this.lineId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPositions(int i2, Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensurePositionsIsMutable();
        this.positions_.set(i2, intPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReversed(boolean z) {
        this.reversed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileId(int i2) {
        this.tileId_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003\u0007\u0004\u001b\u0005ဉ\u0000", new Object[]{"bitField0_", "tileId_", "lineId_", "reversed_", "positions_", Position.IntPosition.class, "centerPosition_"});
        }
        if (iOrdinal == 3) {
            return new MapLine();
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
        fo<MapLine> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MapLine.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.MapLineOrBuilder
    public Position.IntPosition getCenterPosition() {
        Position.IntPosition intPosition = this.centerPosition_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.map.MapLineOrBuilder
    public int getLineId() {
        return this.lineId_;
    }

    @Override // com.waze.jni.protos.map.MapLineOrBuilder
    public Position.IntPosition getPositions(int i2) {
        return this.positions_.get(i2);
    }

    @Override // com.waze.jni.protos.map.MapLineOrBuilder
    public int getPositionsCount() {
        return this.positions_.size();
    }

    @Override // com.waze.jni.protos.map.MapLineOrBuilder
    public List<Position.IntPosition> getPositionsList() {
        return this.positions_;
    }

    public Position.IntPositionOrBuilder getPositionsOrBuilder(int i2) {
        return this.positions_.get(i2);
    }

    public List<? extends Position.IntPositionOrBuilder> getPositionsOrBuilderList() {
        return this.positions_;
    }

    @Override // com.waze.jni.protos.map.MapLineOrBuilder
    public boolean getReversed() {
        return this.reversed_;
    }

    @Override // com.waze.jni.protos.map.MapLineOrBuilder
    public int getTileId() {
        return this.tileId_;
    }

    @Override // com.waze.jni.protos.map.MapLineOrBuilder
    public boolean hasCenterPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(MapLine mapLine) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mapLine);
    }

    public static MapLine parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MapLine) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapLine parseFrom(v vVar, de deVar) {
        return (MapLine) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MapLine parseFrom(z zVar) {
        return (MapLine) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MapLine parseFrom(z zVar, de deVar) {
        return (MapLine) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPositions(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensurePositionsIsMutable();
        this.positions_.add(intPosition);
    }

    public static MapLine parseFrom(InputStream inputStream) {
        return (MapLine) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapLine parseFrom(InputStream inputStream, de deVar) {
        return (MapLine) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapLine parseFrom(ByteBuffer byteBuffer) {
        return (MapLine) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MapLine parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MapLine) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<MapLine, Builder> implements MapLineOrBuilder {
        private Builder() {
            super(MapLine.DEFAULT_INSTANCE);
        }

        public Builder addAllPositions(Iterable<? extends Position.IntPosition> iterable) {
            copyOnWrite();
            ((MapLine) this.instance).addAllPositions(iterable);
            return this;
        }

        public Builder addPositions(int i2, Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((MapLine) this.instance).addPositions(i2, builder.build());
            return this;
        }

        public Builder clearCenterPosition() {
            copyOnWrite();
            ((MapLine) this.instance).clearCenterPosition();
            return this;
        }

        public Builder clearLineId() {
            copyOnWrite();
            ((MapLine) this.instance).clearLineId();
            return this;
        }

        public Builder clearPositions() {
            copyOnWrite();
            ((MapLine) this.instance).clearPositions();
            return this;
        }

        public Builder clearReversed() {
            copyOnWrite();
            ((MapLine) this.instance).clearReversed();
            return this;
        }

        public Builder clearTileId() {
            copyOnWrite();
            ((MapLine) this.instance).clearTileId();
            return this;
        }

        @Override // com.waze.jni.protos.map.MapLineOrBuilder
        public Position.IntPosition getCenterPosition() {
            return ((MapLine) this.instance).getCenterPosition();
        }

        @Override // com.waze.jni.protos.map.MapLineOrBuilder
        public int getLineId() {
            return ((MapLine) this.instance).getLineId();
        }

        @Override // com.waze.jni.protos.map.MapLineOrBuilder
        public Position.IntPosition getPositions(int i2) {
            return ((MapLine) this.instance).getPositions(i2);
        }

        @Override // com.waze.jni.protos.map.MapLineOrBuilder
        public int getPositionsCount() {
            return ((MapLine) this.instance).getPositionsCount();
        }

        @Override // com.waze.jni.protos.map.MapLineOrBuilder
        public List<Position.IntPosition> getPositionsList() {
            return DesugarCollections.unmodifiableList(((MapLine) this.instance).getPositionsList());
        }

        @Override // com.waze.jni.protos.map.MapLineOrBuilder
        public boolean getReversed() {
            return ((MapLine) this.instance).getReversed();
        }

        @Override // com.waze.jni.protos.map.MapLineOrBuilder
        public int getTileId() {
            return ((MapLine) this.instance).getTileId();
        }

        @Override // com.waze.jni.protos.map.MapLineOrBuilder
        public boolean hasCenterPosition() {
            return ((MapLine) this.instance).hasCenterPosition();
        }

        public Builder mergeCenterPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((MapLine) this.instance).mergeCenterPosition(intPosition);
            return this;
        }

        public Builder removePositions(int i2) {
            copyOnWrite();
            ((MapLine) this.instance).removePositions(i2);
            return this;
        }

        public Builder setCenterPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((MapLine) this.instance).setCenterPosition(builder.build());
            return this;
        }

        public Builder setLineId(int i2) {
            copyOnWrite();
            ((MapLine) this.instance).setLineId(i2);
            return this;
        }

        public Builder setPositions(int i2, Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((MapLine) this.instance).setPositions(i2, builder.build());
            return this;
        }

        public Builder setReversed(boolean z) {
            copyOnWrite();
            ((MapLine) this.instance).setReversed(z);
            return this;
        }

        public Builder setTileId(int i2) {
            copyOnWrite();
            ((MapLine) this.instance).setTileId(i2);
            return this;
        }

        public Builder addPositions(int i2, Position.IntPosition intPosition) {
            copyOnWrite();
            ((MapLine) this.instance).addPositions(i2, intPosition);
            return this;
        }

        public Builder setCenterPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((MapLine) this.instance).setCenterPosition(intPosition);
            return this;
        }

        public Builder setPositions(int i2, Position.IntPosition intPosition) {
            copyOnWrite();
            ((MapLine) this.instance).setPositions(i2, intPosition);
            return this;
        }

        public Builder addPositions(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((MapLine) this.instance).addPositions(builder.build());
            return this;
        }

        public Builder addPositions(Position.IntPosition intPosition) {
            copyOnWrite();
            ((MapLine) this.instance).addPositions(intPosition);
            return this;
        }
    }

    public static MapLine parseFrom(byte[] bArr) {
        return (MapLine) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MapLine parseFrom(byte[] bArr, de deVar) {
        return (MapLine) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
