package com.waze.jni.protos.map;

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
public final class MapVisibleAreaChanged extends du<MapVisibleAreaChanged, Builder> implements MapVisibleAreaChangedOrBuilder {
    private static final MapVisibleAreaChanged DEFAULT_INSTANCE;
    public static final int NEW_AREA_FIELD_NUMBER = 1;
    private static volatile fo<MapVisibleAreaChanged> PARSER;
    private int bitField0_;
    private MapVisibleArea newArea_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.MapVisibleAreaChanged$1, reason: invalid class name */
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
    public interface CornersPolygonOrBuilder extends fj {
        Position.IntPosition getBottomLeft();

        Position.IntPosition getBottomRight();

        Position.IntPosition getTopLeft();

        Position.IntPosition getTopRight();

        boolean hasBottomLeft();

        boolean hasBottomRight();

        boolean hasTopLeft();

        boolean hasTopRight();
    }

    /* compiled from: WazeSource */
    public interface MapVisibleAreaOrBuilder extends fj {
        float getCameraAngleDegrees();

        CornersPolygon getFullscreenCornersPolygon();

        float getOrientationDegrees();

        Position.IntPosition getViewportCenter();

        CornersPolygon getViewportCornersPolygon();

        float getZoomNormalized();

        boolean hasFullscreenCornersPolygon();

        boolean hasViewportCenter();

        boolean hasViewportCornersPolygon();
    }

    static {
        MapVisibleAreaChanged mapVisibleAreaChanged = new MapVisibleAreaChanged();
        DEFAULT_INSTANCE = mapVisibleAreaChanged;
        du.registerDefaultInstance(MapVisibleAreaChanged.class, mapVisibleAreaChanged);
    }

    private MapVisibleAreaChanged() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewArea() {
        this.newArea_ = null;
        this.bitField0_ &= -2;
    }

    public static MapVisibleAreaChanged getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNewArea(MapVisibleArea mapVisibleArea) {
        Objects.requireNonNull(mapVisibleArea);
        MapVisibleArea mapVisibleArea2 = this.newArea_;
        if (mapVisibleArea2 != null && mapVisibleArea2 != MapVisibleArea.getDefaultInstance()) {
            MapVisibleArea.Builder builderNewBuilder = MapVisibleArea.newBuilder(mapVisibleArea2);
            builderNewBuilder.mergeFrom((MapVisibleArea.Builder) mapVisibleArea);
            mapVisibleArea = builderNewBuilder.buildPartial();
        }
        this.newArea_ = mapVisibleArea;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MapVisibleAreaChanged parseDelimitedFrom(InputStream inputStream) {
        return (MapVisibleAreaChanged) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapVisibleAreaChanged parseFrom(v vVar) {
        return (MapVisibleAreaChanged) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MapVisibleAreaChanged> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewArea(MapVisibleArea mapVisibleArea) {
        Objects.requireNonNull(mapVisibleArea);
        this.newArea_ = mapVisibleArea;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "newArea_"});
        }
        if (iOrdinal == 3) {
            return new MapVisibleAreaChanged();
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
        fo<MapVisibleAreaChanged> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MapVisibleAreaChanged.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.MapVisibleAreaChangedOrBuilder
    public MapVisibleArea getNewArea() {
        MapVisibleArea mapVisibleArea = this.newArea_;
        return mapVisibleArea == null ? MapVisibleArea.getDefaultInstance() : mapVisibleArea;
    }

    @Override // com.waze.jni.protos.map.MapVisibleAreaChangedOrBuilder
    public boolean hasNewArea() {
        return (this.bitField0_ & 1) != 0;
    }

    /* compiled from: WazeSource */
    public final class CornersPolygon extends du<CornersPolygon, Builder> implements CornersPolygonOrBuilder {
        public static final int BOTTOMLEFT_FIELD_NUMBER = 4;
        public static final int BOTTOMRIGHT_FIELD_NUMBER = 3;
        private static final CornersPolygon DEFAULT_INSTANCE;
        private static volatile fo<CornersPolygon> PARSER = null;
        public static final int TOPLEFT_FIELD_NUMBER = 1;
        public static final int TOPRIGHT_FIELD_NUMBER = 2;
        private int bitField0_;
        private Position.IntPosition bottomLeft_;
        private Position.IntPosition bottomRight_;
        private Position.IntPosition topLeft_;
        private Position.IntPosition topRight_;

        static {
            CornersPolygon cornersPolygon = new CornersPolygon();
            DEFAULT_INSTANCE = cornersPolygon;
            du.registerDefaultInstance(CornersPolygon.class, cornersPolygon);
        }

        private CornersPolygon() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBottomLeft() {
            this.bottomLeft_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBottomRight() {
            this.bottomRight_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTopLeft() {
            this.topLeft_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTopRight() {
            this.topRight_ = null;
            this.bitField0_ &= -3;
        }

        public static CornersPolygon getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBottomLeft(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            Position.IntPosition intPosition2 = this.bottomLeft_;
            if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
                Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
                builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
                intPosition = builderNewBuilder.buildPartial();
            }
            this.bottomLeft_ = intPosition;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBottomRight(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            Position.IntPosition intPosition2 = this.bottomRight_;
            if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
                Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
                builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
                intPosition = builderNewBuilder.buildPartial();
            }
            this.bottomRight_ = intPosition;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTopLeft(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            Position.IntPosition intPosition2 = this.topLeft_;
            if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
                Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
                builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
                intPosition = builderNewBuilder.buildPartial();
            }
            this.topLeft_ = intPosition;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTopRight(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            Position.IntPosition intPosition2 = this.topRight_;
            if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
                Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
                builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
                intPosition = builderNewBuilder.buildPartial();
            }
            this.topRight_ = intPosition;
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CornersPolygon parseDelimitedFrom(InputStream inputStream) {
            return (CornersPolygon) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CornersPolygon parseFrom(v vVar) {
            return (CornersPolygon) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<CornersPolygon> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBottomLeft(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            this.bottomLeft_ = intPosition;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBottomRight(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            this.bottomRight_ = intPosition;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopLeft(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            this.topLeft_ = intPosition;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopRight(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            this.topRight_ = intPosition;
            this.bitField0_ |= 2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "topLeft_", "topRight_", "bottomRight_", "bottomLeft_"});
            }
            if (iOrdinal == 3) {
                return new CornersPolygon();
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
            fo<CornersPolygon> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (CornersPolygon.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
        public Position.IntPosition getBottomLeft() {
            Position.IntPosition intPosition = this.bottomLeft_;
            return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
        public Position.IntPosition getBottomRight() {
            Position.IntPosition intPosition = this.bottomRight_;
            return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
        public Position.IntPosition getTopLeft() {
            Position.IntPosition intPosition = this.topLeft_;
            return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
        public Position.IntPosition getTopRight() {
            Position.IntPosition intPosition = this.topRight_;
            return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
        public boolean hasBottomLeft() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
        public boolean hasBottomRight() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
        public boolean hasTopLeft() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
        public boolean hasTopRight() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(CornersPolygon cornersPolygon) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(cornersPolygon);
        }

        public static CornersPolygon parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (CornersPolygon) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static CornersPolygon parseFrom(v vVar, de deVar) {
            return (CornersPolygon) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static CornersPolygon parseFrom(z zVar) {
            return (CornersPolygon) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static CornersPolygon parseFrom(z zVar, de deVar) {
            return (CornersPolygon) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static CornersPolygon parseFrom(InputStream inputStream) {
            return (CornersPolygon) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CornersPolygon parseFrom(InputStream inputStream, de deVar) {
            return (CornersPolygon) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static CornersPolygon parseFrom(ByteBuffer byteBuffer) {
            return (CornersPolygon) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CornersPolygon parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (CornersPolygon) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<CornersPolygon, Builder> implements CornersPolygonOrBuilder {
            private Builder() {
                super(CornersPolygon.DEFAULT_INSTANCE);
            }

            public Builder clearBottomLeft() {
                copyOnWrite();
                ((CornersPolygon) this.instance).clearBottomLeft();
                return this;
            }

            public Builder clearBottomRight() {
                copyOnWrite();
                ((CornersPolygon) this.instance).clearBottomRight();
                return this;
            }

            public Builder clearTopLeft() {
                copyOnWrite();
                ((CornersPolygon) this.instance).clearTopLeft();
                return this;
            }

            public Builder clearTopRight() {
                copyOnWrite();
                ((CornersPolygon) this.instance).clearTopRight();
                return this;
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
            public Position.IntPosition getBottomLeft() {
                return ((CornersPolygon) this.instance).getBottomLeft();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
            public Position.IntPosition getBottomRight() {
                return ((CornersPolygon) this.instance).getBottomRight();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
            public Position.IntPosition getTopLeft() {
                return ((CornersPolygon) this.instance).getTopLeft();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
            public Position.IntPosition getTopRight() {
                return ((CornersPolygon) this.instance).getTopRight();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
            public boolean hasBottomLeft() {
                return ((CornersPolygon) this.instance).hasBottomLeft();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
            public boolean hasBottomRight() {
                return ((CornersPolygon) this.instance).hasBottomRight();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
            public boolean hasTopLeft() {
                return ((CornersPolygon) this.instance).hasTopLeft();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.CornersPolygonOrBuilder
            public boolean hasTopRight() {
                return ((CornersPolygon) this.instance).hasTopRight();
            }

            public Builder mergeBottomLeft(Position.IntPosition intPosition) {
                copyOnWrite();
                ((CornersPolygon) this.instance).mergeBottomLeft(intPosition);
                return this;
            }

            public Builder mergeBottomRight(Position.IntPosition intPosition) {
                copyOnWrite();
                ((CornersPolygon) this.instance).mergeBottomRight(intPosition);
                return this;
            }

            public Builder mergeTopLeft(Position.IntPosition intPosition) {
                copyOnWrite();
                ((CornersPolygon) this.instance).mergeTopLeft(intPosition);
                return this;
            }

            public Builder mergeTopRight(Position.IntPosition intPosition) {
                copyOnWrite();
                ((CornersPolygon) this.instance).mergeTopRight(intPosition);
                return this;
            }

            public Builder setBottomLeft(Position.IntPosition.Builder builder) {
                copyOnWrite();
                ((CornersPolygon) this.instance).setBottomLeft(builder.build());
                return this;
            }

            public Builder setBottomRight(Position.IntPosition.Builder builder) {
                copyOnWrite();
                ((CornersPolygon) this.instance).setBottomRight(builder.build());
                return this;
            }

            public Builder setTopLeft(Position.IntPosition.Builder builder) {
                copyOnWrite();
                ((CornersPolygon) this.instance).setTopLeft(builder.build());
                return this;
            }

            public Builder setTopRight(Position.IntPosition.Builder builder) {
                copyOnWrite();
                ((CornersPolygon) this.instance).setTopRight(builder.build());
                return this;
            }

            public Builder setBottomLeft(Position.IntPosition intPosition) {
                copyOnWrite();
                ((CornersPolygon) this.instance).setBottomLeft(intPosition);
                return this;
            }

            public Builder setBottomRight(Position.IntPosition intPosition) {
                copyOnWrite();
                ((CornersPolygon) this.instance).setBottomRight(intPosition);
                return this;
            }

            public Builder setTopLeft(Position.IntPosition intPosition) {
                copyOnWrite();
                ((CornersPolygon) this.instance).setTopLeft(intPosition);
                return this;
            }

            public Builder setTopRight(Position.IntPosition intPosition) {
                copyOnWrite();
                ((CornersPolygon) this.instance).setTopRight(intPosition);
                return this;
            }
        }

        public static CornersPolygon parseFrom(byte[] bArr) {
            return (CornersPolygon) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CornersPolygon parseFrom(byte[] bArr, de deVar) {
            return (CornersPolygon) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class MapVisibleArea extends du<MapVisibleArea, Builder> implements MapVisibleAreaOrBuilder {
        public static final int CAMERA_ANGLE_DEGREES_FIELD_NUMBER = 6;
        private static final MapVisibleArea DEFAULT_INSTANCE;
        public static final int FULLSCREENCORNERSPOLYGON_FIELD_NUMBER = 2;
        public static final int ORIENTATION_DEGREES_FIELD_NUMBER = 3;
        private static volatile fo<MapVisibleArea> PARSER = null;
        public static final int VIEWPORTCORNERSPOLYGON_FIELD_NUMBER = 1;
        public static final int VIEWPORT_CENTER_FIELD_NUMBER = 5;
        public static final int ZOOM_NORMALIZED_FIELD_NUMBER = 4;
        private int bitField0_;
        private float cameraAngleDegrees_;
        private CornersPolygon fullscreenCornersPolygon_;
        private float orientationDegrees_;
        private Position.IntPosition viewportCenter_;
        private CornersPolygon viewportCornersPolygon_;
        private float zoomNormalized_;

        static {
            MapVisibleArea mapVisibleArea = new MapVisibleArea();
            DEFAULT_INSTANCE = mapVisibleArea;
            du.registerDefaultInstance(MapVisibleArea.class, mapVisibleArea);
        }

        private MapVisibleArea() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCameraAngleDegrees() {
            this.cameraAngleDegrees_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFullscreenCornersPolygon() {
            this.fullscreenCornersPolygon_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrientationDegrees() {
            this.orientationDegrees_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearViewportCenter() {
            this.viewportCenter_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearViewportCornersPolygon() {
            this.viewportCornersPolygon_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearZoomNormalized() {
            this.zoomNormalized_ = 0.0f;
        }

        public static MapVisibleArea getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFullscreenCornersPolygon(CornersPolygon cornersPolygon) {
            Objects.requireNonNull(cornersPolygon);
            CornersPolygon cornersPolygon2 = this.fullscreenCornersPolygon_;
            if (cornersPolygon2 != null && cornersPolygon2 != CornersPolygon.getDefaultInstance()) {
                CornersPolygon.Builder builderNewBuilder = CornersPolygon.newBuilder(cornersPolygon2);
                builderNewBuilder.mergeFrom((CornersPolygon.Builder) cornersPolygon);
                cornersPolygon = builderNewBuilder.buildPartial();
            }
            this.fullscreenCornersPolygon_ = cornersPolygon;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeViewportCenter(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            Position.IntPosition intPosition2 = this.viewportCenter_;
            if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
                Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
                builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
                intPosition = builderNewBuilder.buildPartial();
            }
            this.viewportCenter_ = intPosition;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeViewportCornersPolygon(CornersPolygon cornersPolygon) {
            Objects.requireNonNull(cornersPolygon);
            CornersPolygon cornersPolygon2 = this.viewportCornersPolygon_;
            if (cornersPolygon2 != null && cornersPolygon2 != CornersPolygon.getDefaultInstance()) {
                CornersPolygon.Builder builderNewBuilder = CornersPolygon.newBuilder(cornersPolygon2);
                builderNewBuilder.mergeFrom((CornersPolygon.Builder) cornersPolygon);
                cornersPolygon = builderNewBuilder.buildPartial();
            }
            this.viewportCornersPolygon_ = cornersPolygon;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MapVisibleArea parseDelimitedFrom(InputStream inputStream) {
            return (MapVisibleArea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MapVisibleArea parseFrom(v vVar) {
            return (MapVisibleArea) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<MapVisibleArea> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCameraAngleDegrees(float f2) {
            this.cameraAngleDegrees_ = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFullscreenCornersPolygon(CornersPolygon cornersPolygon) {
            Objects.requireNonNull(cornersPolygon);
            this.fullscreenCornersPolygon_ = cornersPolygon;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrientationDegrees(float f2) {
            this.orientationDegrees_ = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setViewportCenter(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            this.viewportCenter_ = intPosition;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setViewportCornersPolygon(CornersPolygon cornersPolygon) {
            Objects.requireNonNull(cornersPolygon);
            this.viewportCornersPolygon_ = cornersPolygon;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZoomNormalized(float f2) {
            this.zoomNormalized_ = f2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0001\u0004\u0001\u0005ဉ\u0002\u0006\u0001", new Object[]{"bitField0_", "viewportCornersPolygon_", "fullscreenCornersPolygon_", "orientationDegrees_", "zoomNormalized_", "viewportCenter_", "cameraAngleDegrees_"});
            }
            if (iOrdinal == 3) {
                return new MapVisibleArea();
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
            fo<MapVisibleArea> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (MapVisibleArea.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
        public float getCameraAngleDegrees() {
            return this.cameraAngleDegrees_;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
        public CornersPolygon getFullscreenCornersPolygon() {
            CornersPolygon cornersPolygon = this.fullscreenCornersPolygon_;
            return cornersPolygon == null ? CornersPolygon.getDefaultInstance() : cornersPolygon;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
        public float getOrientationDegrees() {
            return this.orientationDegrees_;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
        public Position.IntPosition getViewportCenter() {
            Position.IntPosition intPosition = this.viewportCenter_;
            return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
        public CornersPolygon getViewportCornersPolygon() {
            CornersPolygon cornersPolygon = this.viewportCornersPolygon_;
            return cornersPolygon == null ? CornersPolygon.getDefaultInstance() : cornersPolygon;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
        public float getZoomNormalized() {
            return this.zoomNormalized_;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
        public boolean hasFullscreenCornersPolygon() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
        public boolean hasViewportCenter() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
        public boolean hasViewportCornersPolygon() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(MapVisibleArea mapVisibleArea) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(mapVisibleArea);
        }

        public static MapVisibleArea parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (MapVisibleArea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static MapVisibleArea parseFrom(v vVar, de deVar) {
            return (MapVisibleArea) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static MapVisibleArea parseFrom(z zVar) {
            return (MapVisibleArea) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static MapVisibleArea parseFrom(z zVar, de deVar) {
            return (MapVisibleArea) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static MapVisibleArea parseFrom(InputStream inputStream) {
            return (MapVisibleArea) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MapVisibleArea parseFrom(InputStream inputStream, de deVar) {
            return (MapVisibleArea) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static MapVisibleArea parseFrom(ByteBuffer byteBuffer) {
            return (MapVisibleArea) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MapVisibleArea parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (MapVisibleArea) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<MapVisibleArea, Builder> implements MapVisibleAreaOrBuilder {
            private Builder() {
                super(MapVisibleArea.DEFAULT_INSTANCE);
            }

            public Builder clearCameraAngleDegrees() {
                copyOnWrite();
                ((MapVisibleArea) this.instance).clearCameraAngleDegrees();
                return this;
            }

            public Builder clearFullscreenCornersPolygon() {
                copyOnWrite();
                ((MapVisibleArea) this.instance).clearFullscreenCornersPolygon();
                return this;
            }

            public Builder clearOrientationDegrees() {
                copyOnWrite();
                ((MapVisibleArea) this.instance).clearOrientationDegrees();
                return this;
            }

            public Builder clearViewportCenter() {
                copyOnWrite();
                ((MapVisibleArea) this.instance).clearViewportCenter();
                return this;
            }

            public Builder clearViewportCornersPolygon() {
                copyOnWrite();
                ((MapVisibleArea) this.instance).clearViewportCornersPolygon();
                return this;
            }

            public Builder clearZoomNormalized() {
                copyOnWrite();
                ((MapVisibleArea) this.instance).clearZoomNormalized();
                return this;
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
            public float getCameraAngleDegrees() {
                return ((MapVisibleArea) this.instance).getCameraAngleDegrees();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
            public CornersPolygon getFullscreenCornersPolygon() {
                return ((MapVisibleArea) this.instance).getFullscreenCornersPolygon();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
            public float getOrientationDegrees() {
                return ((MapVisibleArea) this.instance).getOrientationDegrees();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
            public Position.IntPosition getViewportCenter() {
                return ((MapVisibleArea) this.instance).getViewportCenter();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
            public CornersPolygon getViewportCornersPolygon() {
                return ((MapVisibleArea) this.instance).getViewportCornersPolygon();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
            public float getZoomNormalized() {
                return ((MapVisibleArea) this.instance).getZoomNormalized();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
            public boolean hasFullscreenCornersPolygon() {
                return ((MapVisibleArea) this.instance).hasFullscreenCornersPolygon();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
            public boolean hasViewportCenter() {
                return ((MapVisibleArea) this.instance).hasViewportCenter();
            }

            @Override // com.waze.jni.protos.map.MapVisibleAreaChanged.MapVisibleAreaOrBuilder
            public boolean hasViewportCornersPolygon() {
                return ((MapVisibleArea) this.instance).hasViewportCornersPolygon();
            }

            public Builder mergeFullscreenCornersPolygon(CornersPolygon cornersPolygon) {
                copyOnWrite();
                ((MapVisibleArea) this.instance).mergeFullscreenCornersPolygon(cornersPolygon);
                return this;
            }

            public Builder mergeViewportCenter(Position.IntPosition intPosition) {
                copyOnWrite();
                ((MapVisibleArea) this.instance).mergeViewportCenter(intPosition);
                return this;
            }

            public Builder mergeViewportCornersPolygon(CornersPolygon cornersPolygon) {
                copyOnWrite();
                ((MapVisibleArea) this.instance).mergeViewportCornersPolygon(cornersPolygon);
                return this;
            }

            public Builder setCameraAngleDegrees(float f2) {
                copyOnWrite();
                ((MapVisibleArea) this.instance).setCameraAngleDegrees(f2);
                return this;
            }

            public Builder setFullscreenCornersPolygon(CornersPolygon.Builder builder) {
                copyOnWrite();
                ((MapVisibleArea) this.instance).setFullscreenCornersPolygon(builder.build());
                return this;
            }

            public Builder setOrientationDegrees(float f2) {
                copyOnWrite();
                ((MapVisibleArea) this.instance).setOrientationDegrees(f2);
                return this;
            }

            public Builder setViewportCenter(Position.IntPosition.Builder builder) {
                copyOnWrite();
                ((MapVisibleArea) this.instance).setViewportCenter(builder.build());
                return this;
            }

            public Builder setViewportCornersPolygon(CornersPolygon.Builder builder) {
                copyOnWrite();
                ((MapVisibleArea) this.instance).setViewportCornersPolygon(builder.build());
                return this;
            }

            public Builder setZoomNormalized(float f2) {
                copyOnWrite();
                ((MapVisibleArea) this.instance).setZoomNormalized(f2);
                return this;
            }

            public Builder setFullscreenCornersPolygon(CornersPolygon cornersPolygon) {
                copyOnWrite();
                ((MapVisibleArea) this.instance).setFullscreenCornersPolygon(cornersPolygon);
                return this;
            }

            public Builder setViewportCenter(Position.IntPosition intPosition) {
                copyOnWrite();
                ((MapVisibleArea) this.instance).setViewportCenter(intPosition);
                return this;
            }

            public Builder setViewportCornersPolygon(CornersPolygon cornersPolygon) {
                copyOnWrite();
                ((MapVisibleArea) this.instance).setViewportCornersPolygon(cornersPolygon);
                return this;
            }
        }

        public static MapVisibleArea parseFrom(byte[] bArr) {
            return (MapVisibleArea) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MapVisibleArea parseFrom(byte[] bArr, de deVar) {
            return (MapVisibleArea) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(MapVisibleAreaChanged mapVisibleAreaChanged) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mapVisibleAreaChanged);
    }

    public static MapVisibleAreaChanged parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MapVisibleAreaChanged) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapVisibleAreaChanged parseFrom(v vVar, de deVar) {
        return (MapVisibleAreaChanged) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MapVisibleAreaChanged parseFrom(z zVar) {
        return (MapVisibleAreaChanged) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MapVisibleAreaChanged parseFrom(z zVar, de deVar) {
        return (MapVisibleAreaChanged) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MapVisibleAreaChanged parseFrom(InputStream inputStream) {
        return (MapVisibleAreaChanged) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapVisibleAreaChanged parseFrom(InputStream inputStream, de deVar) {
        return (MapVisibleAreaChanged) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapVisibleAreaChanged parseFrom(ByteBuffer byteBuffer) {
        return (MapVisibleAreaChanged) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MapVisibleAreaChanged parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MapVisibleAreaChanged) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<MapVisibleAreaChanged, Builder> implements MapVisibleAreaChangedOrBuilder {
        private Builder() {
            super(MapVisibleAreaChanged.DEFAULT_INSTANCE);
        }

        public Builder clearNewArea() {
            copyOnWrite();
            ((MapVisibleAreaChanged) this.instance).clearNewArea();
            return this;
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChangedOrBuilder
        public MapVisibleArea getNewArea() {
            return ((MapVisibleAreaChanged) this.instance).getNewArea();
        }

        @Override // com.waze.jni.protos.map.MapVisibleAreaChangedOrBuilder
        public boolean hasNewArea() {
            return ((MapVisibleAreaChanged) this.instance).hasNewArea();
        }

        public Builder mergeNewArea(MapVisibleArea mapVisibleArea) {
            copyOnWrite();
            ((MapVisibleAreaChanged) this.instance).mergeNewArea(mapVisibleArea);
            return this;
        }

        public Builder setNewArea(MapVisibleArea.Builder builder) {
            copyOnWrite();
            ((MapVisibleAreaChanged) this.instance).setNewArea(builder.build());
            return this;
        }

        public Builder setNewArea(MapVisibleArea mapVisibleArea) {
            copyOnWrite();
            ((MapVisibleAreaChanged) this.instance).setNewArea(mapVisibleArea);
            return this;
        }
    }

    public static MapVisibleAreaChanged parseFrom(byte[] bArr) {
        return (MapVisibleAreaChanged) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MapVisibleAreaChanged parseFrom(byte[] bArr, de deVar) {
        return (MapVisibleAreaChanged) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
