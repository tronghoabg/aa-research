package com.waze.jni.protos;

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
public final class NavigationSegment extends du<NavigationSegment, Builder> implements NavigationSegmentOrBuilder {
    private static final NavigationSegment DEFAULT_INSTANCE;
    public static final int FROM_COORDINATE_FIELD_NUMBER = 6;
    public static final int FROM_NODE_FIELD_NUMBER = 4;
    public static final int IS_REVERSED_FIELD_NUMBER = 3;
    public static final int LINE_ID_FIELD_NUMBER = 2;
    private static volatile fo<NavigationSegment> PARSER = null;
    public static final int TILE_ID_FIELD_NUMBER = 1;
    public static final int TO_COORDINATE_FIELD_NUMBER = 7;
    public static final int TO_NODE_FIELD_NUMBER = 5;
    private int bitField0_;
    private Position.IntPosition fromCoordinate_;
    private int fromNode_;
    private boolean isReversed_;
    private int lineId_;
    private int tileId_;
    private Position.IntPosition toCoordinate_;
    private int toNode_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.NavigationSegment$1, reason: invalid class name */
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
        NavigationSegment navigationSegment = new NavigationSegment();
        DEFAULT_INSTANCE = navigationSegment;
        du.registerDefaultInstance(NavigationSegment.class, navigationSegment);
    }

    private NavigationSegment() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromCoordinate() {
        this.fromCoordinate_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNode() {
        this.bitField0_ &= -9;
        this.fromNode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsReversed() {
        this.bitField0_ &= -5;
        this.isReversed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLineId() {
        this.bitField0_ &= -3;
        this.lineId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileId() {
        this.bitField0_ &= -2;
        this.tileId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToCoordinate() {
        this.toCoordinate_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToNode() {
        this.bitField0_ &= -17;
        this.toNode_ = 0;
    }

    public static NavigationSegment getDefaultInstance() {
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
        this.bitField0_ |= 32;
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
        this.bitField0_ |= 64;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NavigationSegment parseDelimitedFrom(InputStream inputStream) {
        return (NavigationSegment) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationSegment parseFrom(v vVar) {
        return (NavigationSegment) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NavigationSegment> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromCoordinate(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.fromCoordinate_ = intPosition;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNode(int i2) {
        this.bitField0_ |= 8;
        this.fromNode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsReversed(boolean z) {
        this.bitField0_ |= 4;
        this.isReversed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLineId(int i2) {
        this.bitField0_ |= 2;
        this.lineId_ = i2;
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
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToNode(int i2) {
        this.bitField0_ |= 16;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005င\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"bitField0_", "tileId_", "lineId_", "isReversed_", "fromNode_", "toNode_", "fromCoordinate_", "toCoordinate_"});
        }
        if (iOrdinal == 3) {
            return new NavigationSegment();
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
        fo<NavigationSegment> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NavigationSegment.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
    public Position.IntPosition getFromCoordinate() {
        Position.IntPosition intPosition = this.fromCoordinate_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
    public int getFromNode() {
        return this.fromNode_;
    }

    @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
    public boolean getIsReversed() {
        return this.isReversed_;
    }

    @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
    public int getLineId() {
        return this.lineId_;
    }

    @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
    public int getTileId() {
        return this.tileId_;
    }

    @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
    public Position.IntPosition getToCoordinate() {
        Position.IntPosition intPosition = this.toCoordinate_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
    public int getToNode() {
        return this.toNode_;
    }

    @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
    public boolean hasFromCoordinate() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
    public boolean hasFromNode() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
    public boolean hasIsReversed() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
    public boolean hasLineId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
    public boolean hasTileId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
    public boolean hasToCoordinate() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
    public boolean hasToNode() {
        return (this.bitField0_ & 16) != 0;
    }

    public static Builder newBuilder(NavigationSegment navigationSegment) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(navigationSegment);
    }

    public static NavigationSegment parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NavigationSegment) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationSegment parseFrom(v vVar, de deVar) {
        return (NavigationSegment) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NavigationSegment parseFrom(z zVar) {
        return (NavigationSegment) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NavigationSegment parseFrom(z zVar, de deVar) {
        return (NavigationSegment) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NavigationSegment parseFrom(InputStream inputStream) {
        return (NavigationSegment) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationSegment parseFrom(InputStream inputStream, de deVar) {
        return (NavigationSegment) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationSegment parseFrom(ByteBuffer byteBuffer) {
        return (NavigationSegment) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NavigationSegment parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NavigationSegment) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NavigationSegment, Builder> implements NavigationSegmentOrBuilder {
        private Builder() {
            super(NavigationSegment.DEFAULT_INSTANCE);
        }

        public Builder clearFromCoordinate() {
            copyOnWrite();
            ((NavigationSegment) this.instance).clearFromCoordinate();
            return this;
        }

        public Builder clearFromNode() {
            copyOnWrite();
            ((NavigationSegment) this.instance).clearFromNode();
            return this;
        }

        public Builder clearIsReversed() {
            copyOnWrite();
            ((NavigationSegment) this.instance).clearIsReversed();
            return this;
        }

        public Builder clearLineId() {
            copyOnWrite();
            ((NavigationSegment) this.instance).clearLineId();
            return this;
        }

        public Builder clearTileId() {
            copyOnWrite();
            ((NavigationSegment) this.instance).clearTileId();
            return this;
        }

        public Builder clearToCoordinate() {
            copyOnWrite();
            ((NavigationSegment) this.instance).clearToCoordinate();
            return this;
        }

        public Builder clearToNode() {
            copyOnWrite();
            ((NavigationSegment) this.instance).clearToNode();
            return this;
        }

        @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
        public Position.IntPosition getFromCoordinate() {
            return ((NavigationSegment) this.instance).getFromCoordinate();
        }

        @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
        public int getFromNode() {
            return ((NavigationSegment) this.instance).getFromNode();
        }

        @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
        public boolean getIsReversed() {
            return ((NavigationSegment) this.instance).getIsReversed();
        }

        @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
        public int getLineId() {
            return ((NavigationSegment) this.instance).getLineId();
        }

        @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
        public int getTileId() {
            return ((NavigationSegment) this.instance).getTileId();
        }

        @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
        public Position.IntPosition getToCoordinate() {
            return ((NavigationSegment) this.instance).getToCoordinate();
        }

        @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
        public int getToNode() {
            return ((NavigationSegment) this.instance).getToNode();
        }

        @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
        public boolean hasFromCoordinate() {
            return ((NavigationSegment) this.instance).hasFromCoordinate();
        }

        @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
        public boolean hasFromNode() {
            return ((NavigationSegment) this.instance).hasFromNode();
        }

        @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
        public boolean hasIsReversed() {
            return ((NavigationSegment) this.instance).hasIsReversed();
        }

        @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
        public boolean hasLineId() {
            return ((NavigationSegment) this.instance).hasLineId();
        }

        @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
        public boolean hasTileId() {
            return ((NavigationSegment) this.instance).hasTileId();
        }

        @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
        public boolean hasToCoordinate() {
            return ((NavigationSegment) this.instance).hasToCoordinate();
        }

        @Override // com.waze.jni.protos.NavigationSegmentOrBuilder
        public boolean hasToNode() {
            return ((NavigationSegment) this.instance).hasToNode();
        }

        public Builder mergeFromCoordinate(Position.IntPosition intPosition) {
            copyOnWrite();
            ((NavigationSegment) this.instance).mergeFromCoordinate(intPosition);
            return this;
        }

        public Builder mergeToCoordinate(Position.IntPosition intPosition) {
            copyOnWrite();
            ((NavigationSegment) this.instance).mergeToCoordinate(intPosition);
            return this;
        }

        public Builder setFromCoordinate(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((NavigationSegment) this.instance).setFromCoordinate(builder.build());
            return this;
        }

        public Builder setFromNode(int i2) {
            copyOnWrite();
            ((NavigationSegment) this.instance).setFromNode(i2);
            return this;
        }

        public Builder setIsReversed(boolean z) {
            copyOnWrite();
            ((NavigationSegment) this.instance).setIsReversed(z);
            return this;
        }

        public Builder setLineId(int i2) {
            copyOnWrite();
            ((NavigationSegment) this.instance).setLineId(i2);
            return this;
        }

        public Builder setTileId(int i2) {
            copyOnWrite();
            ((NavigationSegment) this.instance).setTileId(i2);
            return this;
        }

        public Builder setToCoordinate(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((NavigationSegment) this.instance).setToCoordinate(builder.build());
            return this;
        }

        public Builder setToNode(int i2) {
            copyOnWrite();
            ((NavigationSegment) this.instance).setToNode(i2);
            return this;
        }

        public Builder setFromCoordinate(Position.IntPosition intPosition) {
            copyOnWrite();
            ((NavigationSegment) this.instance).setFromCoordinate(intPosition);
            return this;
        }

        public Builder setToCoordinate(Position.IntPosition intPosition) {
            copyOnWrite();
            ((NavigationSegment) this.instance).setToCoordinate(intPosition);
            return this;
        }
    }

    public static NavigationSegment parseFrom(byte[] bArr) {
        return (NavigationSegment) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NavigationSegment parseFrom(byte[] bArr, de deVar) {
        return (NavigationSegment) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
