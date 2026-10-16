package com.waze.jni.protos.canvas;

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
import com.waze.jni.protos.map.RelativeViewPort;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class BoundsAndViewport extends du<BoundsAndViewport, Builder> implements BoundsAndViewportOrBuilder {
    private static final BoundsAndViewport DEFAULT_INSTANCE;
    private static volatile fo<BoundsAndViewport> PARSER = null;
    public static final int VIEWPORTCORNERSPOLYGON_FIELD_NUMBER = 1;
    public static final int VIEWPORT_FIELD_NUMBER = 2;
    private int bitField0_;
    private eo<Position.IntPosition> viewportCornersPolygon_ = emptyProtobufList();
    private RelativeViewPort viewport_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.canvas.BoundsAndViewport$1, reason: invalid class name */
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
        BoundsAndViewport boundsAndViewport = new BoundsAndViewport();
        DEFAULT_INSTANCE = boundsAndViewport;
        du.registerDefaultInstance(BoundsAndViewport.class, boundsAndViewport);
    }

    private BoundsAndViewport() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllViewportCornersPolygon(Iterable<? extends Position.IntPosition> iterable) {
        ensureViewportCornersPolygonIsMutable();
        c.addAll(iterable, this.viewportCornersPolygon_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViewportCornersPolygon(int i2, Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensureViewportCornersPolygonIsMutable();
        this.viewportCornersPolygon_.add(i2, intPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewport() {
        this.viewport_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewportCornersPolygon() {
        this.viewportCornersPolygon_ = emptyProtobufList();
    }

    private void ensureViewportCornersPolygonIsMutable() {
        eo<Position.IntPosition> eoVar = this.viewportCornersPolygon_;
        if (eoVar.c()) {
            return;
        }
        this.viewportCornersPolygon_ = du.mutableCopy(eoVar);
    }

    public static BoundsAndViewport getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViewport(RelativeViewPort relativeViewPort) {
        Objects.requireNonNull(relativeViewPort);
        RelativeViewPort relativeViewPort2 = this.viewport_;
        if (relativeViewPort2 != null && relativeViewPort2 != RelativeViewPort.getDefaultInstance()) {
            RelativeViewPort.Builder builderNewBuilder = RelativeViewPort.newBuilder(relativeViewPort2);
            builderNewBuilder.mergeFrom((RelativeViewPort.Builder) relativeViewPort);
            relativeViewPort = builderNewBuilder.buildPartial();
        }
        this.viewport_ = relativeViewPort;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static BoundsAndViewport parseDelimitedFrom(InputStream inputStream) {
        return (BoundsAndViewport) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoundsAndViewport parseFrom(v vVar) {
        return (BoundsAndViewport) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<BoundsAndViewport> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeViewportCornersPolygon(int i2) {
        ensureViewportCornersPolygonIsMutable();
        this.viewportCornersPolygon_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewport(RelativeViewPort relativeViewPort) {
        Objects.requireNonNull(relativeViewPort);
        this.viewport_ = relativeViewPort;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewportCornersPolygon(int i2, Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensureViewportCornersPolygonIsMutable();
        this.viewportCornersPolygon_.set(i2, intPosition);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "viewportCornersPolygon_", Position.IntPosition.class, "viewport_"});
        }
        if (iOrdinal == 3) {
            return new BoundsAndViewport();
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
        fo<BoundsAndViewport> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (BoundsAndViewport.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.canvas.BoundsAndViewportOrBuilder
    public RelativeViewPort getViewport() {
        RelativeViewPort relativeViewPort = this.viewport_;
        return relativeViewPort == null ? RelativeViewPort.getDefaultInstance() : relativeViewPort;
    }

    @Override // com.waze.jni.protos.canvas.BoundsAndViewportOrBuilder
    public Position.IntPosition getViewportCornersPolygon(int i2) {
        return this.viewportCornersPolygon_.get(i2);
    }

    @Override // com.waze.jni.protos.canvas.BoundsAndViewportOrBuilder
    public int getViewportCornersPolygonCount() {
        return this.viewportCornersPolygon_.size();
    }

    @Override // com.waze.jni.protos.canvas.BoundsAndViewportOrBuilder
    public List<Position.IntPosition> getViewportCornersPolygonList() {
        return this.viewportCornersPolygon_;
    }

    public Position.IntPositionOrBuilder getViewportCornersPolygonOrBuilder(int i2) {
        return this.viewportCornersPolygon_.get(i2);
    }

    public List<? extends Position.IntPositionOrBuilder> getViewportCornersPolygonOrBuilderList() {
        return this.viewportCornersPolygon_;
    }

    @Override // com.waze.jni.protos.canvas.BoundsAndViewportOrBuilder
    public boolean hasViewport() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(BoundsAndViewport boundsAndViewport) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(boundsAndViewport);
    }

    public static BoundsAndViewport parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (BoundsAndViewport) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static BoundsAndViewport parseFrom(v vVar, de deVar) {
        return (BoundsAndViewport) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static BoundsAndViewport parseFrom(z zVar) {
        return (BoundsAndViewport) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static BoundsAndViewport parseFrom(z zVar, de deVar) {
        return (BoundsAndViewport) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViewportCornersPolygon(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensureViewportCornersPolygonIsMutable();
        this.viewportCornersPolygon_.add(intPosition);
    }

    public static BoundsAndViewport parseFrom(InputStream inputStream) {
        return (BoundsAndViewport) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoundsAndViewport parseFrom(InputStream inputStream, de deVar) {
        return (BoundsAndViewport) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static BoundsAndViewport parseFrom(ByteBuffer byteBuffer) {
        return (BoundsAndViewport) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static BoundsAndViewport parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (BoundsAndViewport) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<BoundsAndViewport, Builder> implements BoundsAndViewportOrBuilder {
        private Builder() {
            super(BoundsAndViewport.DEFAULT_INSTANCE);
        }

        public Builder addAllViewportCornersPolygon(Iterable<? extends Position.IntPosition> iterable) {
            copyOnWrite();
            ((BoundsAndViewport) this.instance).addAllViewportCornersPolygon(iterable);
            return this;
        }

        public Builder addViewportCornersPolygon(int i2, Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((BoundsAndViewport) this.instance).addViewportCornersPolygon(i2, builder.build());
            return this;
        }

        public Builder clearViewport() {
            copyOnWrite();
            ((BoundsAndViewport) this.instance).clearViewport();
            return this;
        }

        public Builder clearViewportCornersPolygon() {
            copyOnWrite();
            ((BoundsAndViewport) this.instance).clearViewportCornersPolygon();
            return this;
        }

        @Override // com.waze.jni.protos.canvas.BoundsAndViewportOrBuilder
        public RelativeViewPort getViewport() {
            return ((BoundsAndViewport) this.instance).getViewport();
        }

        @Override // com.waze.jni.protos.canvas.BoundsAndViewportOrBuilder
        public Position.IntPosition getViewportCornersPolygon(int i2) {
            return ((BoundsAndViewport) this.instance).getViewportCornersPolygon(i2);
        }

        @Override // com.waze.jni.protos.canvas.BoundsAndViewportOrBuilder
        public int getViewportCornersPolygonCount() {
            return ((BoundsAndViewport) this.instance).getViewportCornersPolygonCount();
        }

        @Override // com.waze.jni.protos.canvas.BoundsAndViewportOrBuilder
        public List<Position.IntPosition> getViewportCornersPolygonList() {
            return DesugarCollections.unmodifiableList(((BoundsAndViewport) this.instance).getViewportCornersPolygonList());
        }

        @Override // com.waze.jni.protos.canvas.BoundsAndViewportOrBuilder
        public boolean hasViewport() {
            return ((BoundsAndViewport) this.instance).hasViewport();
        }

        public Builder mergeViewport(RelativeViewPort relativeViewPort) {
            copyOnWrite();
            ((BoundsAndViewport) this.instance).mergeViewport(relativeViewPort);
            return this;
        }

        public Builder removeViewportCornersPolygon(int i2) {
            copyOnWrite();
            ((BoundsAndViewport) this.instance).removeViewportCornersPolygon(i2);
            return this;
        }

        public Builder setViewport(RelativeViewPort.Builder builder) {
            copyOnWrite();
            ((BoundsAndViewport) this.instance).setViewport(builder.build());
            return this;
        }

        public Builder setViewportCornersPolygon(int i2, Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((BoundsAndViewport) this.instance).setViewportCornersPolygon(i2, builder.build());
            return this;
        }

        public Builder addViewportCornersPolygon(int i2, Position.IntPosition intPosition) {
            copyOnWrite();
            ((BoundsAndViewport) this.instance).addViewportCornersPolygon(i2, intPosition);
            return this;
        }

        public Builder setViewport(RelativeViewPort relativeViewPort) {
            copyOnWrite();
            ((BoundsAndViewport) this.instance).setViewport(relativeViewPort);
            return this;
        }

        public Builder setViewportCornersPolygon(int i2, Position.IntPosition intPosition) {
            copyOnWrite();
            ((BoundsAndViewport) this.instance).setViewportCornersPolygon(i2, intPosition);
            return this;
        }

        public Builder addViewportCornersPolygon(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((BoundsAndViewport) this.instance).addViewportCornersPolygon(builder.build());
            return this;
        }

        public Builder addViewportCornersPolygon(Position.IntPosition intPosition) {
            copyOnWrite();
            ((BoundsAndViewport) this.instance).addViewportCornersPolygon(intPosition);
            return this;
        }
    }

    public static BoundsAndViewport parseFrom(byte[] bArr) {
        return (BoundsAndViewport) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BoundsAndViewport parseFrom(byte[] bArr, de deVar) {
        return (BoundsAndViewport) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
