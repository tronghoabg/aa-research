package com.waze.jni.protos.map;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
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
public final class MapBounds extends du<MapBounds, Builder> implements MapBoundsOrBuilder {
    public static final int ANIMATED_FIELD_NUMBER = 1;
    public static final int CONTINUOUSLY_TRACK_USER_LOCATION_FIELD_NUMBER = 5;
    private static final MapBounds DEFAULT_INSTANCE;
    public static final int FIT_AREA_FIELD_NUMBER = 2;
    public static final int FIT_CONTENT_FIELD_NUMBER = 4;
    public static final int FIT_COORDINATE_FIELD_NUMBER = 3;
    public static final int NORTH_LOCK_FIELD_NUMBER = 7;
    private static volatile fo<MapBounds> PARSER = null;
    public static final int VIEW_PORT_FIELD_NUMBER = 6;
    private boolean animated_;
    private int bitField0_;
    private int mapBoundsFitCase_ = 0;
    private Object mapBoundsFit_;
    private int northLock_;
    private RelativeViewPort viewPort_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.MapBounds$1, reason: invalid class name */
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
    public interface ActivelyTrackUserOrBuilder extends fj {
        boolean getDynamicZoom();

        float getStaticZoom();

        ActivelyTrackUser.ZoomBehaviorCase getZoomBehaviorCase();

        boolean hasDynamicZoom();

        boolean hasStaticZoom();
    }

    /* compiled from: WazeSource */
    public interface ContinuouslyTrackUserLocationOrBuilder extends fj {
        boolean getDynamicZoom();

        boolean getManualZoom();

        float getStaticZoom();

        PositionPercentage getUserLocationPositionPercentage();

        ContinuouslyTrackUserLocation.ZoomCase getZoomCase();

        boolean hasDynamicZoom();

        boolean hasManualZoom();

        boolean hasStaticZoom();

        boolean hasUserLocationPositionPercentage();
    }

    /* compiled from: WazeSource */
    public enum MapBoundsFitCase {
        FIT_AREA(2),
        FIT_COORDINATE(3),
        FIT_CONTENT(4),
        CONTINUOUSLY_TRACK_USER_LOCATION(5),
        MAPBOUNDSFIT_NOT_SET(0);

        private final int value;

        MapBoundsFitCase(int i2) {
            this.value = i2;
        }

        public static MapBoundsFitCase forNumber(int i2) {
            if (i2 == 0) {
                return MAPBOUNDSFIT_NOT_SET;
            }
            if (i2 == 2) {
                return FIT_AREA;
            }
            if (i2 == 3) {
                return FIT_COORDINATE;
            }
            if (i2 == 4) {
                return FIT_CONTENT;
            }
            if (i2 != 5) {
                return null;
            }
            return CONTINUOUSLY_TRACK_USER_LOCATION;
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* compiled from: WazeSource */
    public interface MapFitAreaOrBuilder extends fj {
        float getBoundsFactor();

        Position.IntPosition getCoordinates(int i2);

        int getCoordinatesCount();

        List<Position.IntPosition> getCoordinatesList();

        MapDisplayState getDisplayState();

        int getDisplayStateValue();
    }

    /* compiled from: WazeSource */
    public interface MapFitContentOrBuilder extends fj {
        float getBoundsFactor();
    }

    /* compiled from: WazeSource */
    public interface MapFitCoordinateOrBuilder extends fj {
        Position.IntPosition getCoordinate();

        MapDisplayState getDisplayState();

        int getDisplayStateValue();

        float getOrientation();

        PositionPercentage getPositionPercentage();

        float getZoom();

        boolean hasCoordinate();

        boolean hasPositionPercentage();
    }

    /* compiled from: WazeSource */
    public interface PositionPercentageOrBuilder extends fj {
        float getXPercentage();

        float getYPercentage();
    }

    static {
        MapBounds mapBounds = new MapBounds();
        DEFAULT_INSTANCE = mapBounds;
        du.registerDefaultInstance(MapBounds.class, mapBounds);
    }

    private MapBounds() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnimated() {
        this.animated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContinuouslyTrackUserLocation() {
        if (this.mapBoundsFitCase_ == 5) {
            this.mapBoundsFitCase_ = 0;
            this.mapBoundsFit_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitArea() {
        if (this.mapBoundsFitCase_ == 2) {
            this.mapBoundsFitCase_ = 0;
            this.mapBoundsFit_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitContent() {
        if (this.mapBoundsFitCase_ == 4) {
            this.mapBoundsFitCase_ = 0;
            this.mapBoundsFit_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitCoordinate() {
        if (this.mapBoundsFitCase_ == 3) {
            this.mapBoundsFitCase_ = 0;
            this.mapBoundsFit_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapBoundsFit() {
        this.mapBoundsFitCase_ = 0;
        this.mapBoundsFit_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNorthLock() {
        this.bitField0_ &= -3;
        this.northLock_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewPort() {
        this.viewPort_ = null;
        this.bitField0_ &= -2;
    }

    public static MapBounds getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContinuouslyTrackUserLocation(ContinuouslyTrackUserLocation continuouslyTrackUserLocation) {
        Objects.requireNonNull(continuouslyTrackUserLocation);
        if (this.mapBoundsFitCase_ == 5 && this.mapBoundsFit_ != ContinuouslyTrackUserLocation.getDefaultInstance()) {
            ContinuouslyTrackUserLocation.Builder builderNewBuilder = ContinuouslyTrackUserLocation.newBuilder((ContinuouslyTrackUserLocation) this.mapBoundsFit_);
            builderNewBuilder.mergeFrom((ContinuouslyTrackUserLocation.Builder) continuouslyTrackUserLocation);
            continuouslyTrackUserLocation = builderNewBuilder.buildPartial();
        }
        this.mapBoundsFit_ = continuouslyTrackUserLocation;
        this.mapBoundsFitCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFitArea(MapFitArea mapFitArea) {
        Objects.requireNonNull(mapFitArea);
        if (this.mapBoundsFitCase_ == 2 && this.mapBoundsFit_ != MapFitArea.getDefaultInstance()) {
            MapFitArea.Builder builderNewBuilder = MapFitArea.newBuilder((MapFitArea) this.mapBoundsFit_);
            builderNewBuilder.mergeFrom((MapFitArea.Builder) mapFitArea);
            mapFitArea = builderNewBuilder.buildPartial();
        }
        this.mapBoundsFit_ = mapFitArea;
        this.mapBoundsFitCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFitContent(MapFitContent mapFitContent) {
        Objects.requireNonNull(mapFitContent);
        if (this.mapBoundsFitCase_ == 4 && this.mapBoundsFit_ != MapFitContent.getDefaultInstance()) {
            MapFitContent.Builder builderNewBuilder = MapFitContent.newBuilder((MapFitContent) this.mapBoundsFit_);
            builderNewBuilder.mergeFrom((MapFitContent.Builder) mapFitContent);
            mapFitContent = builderNewBuilder.buildPartial();
        }
        this.mapBoundsFit_ = mapFitContent;
        this.mapBoundsFitCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFitCoordinate(MapFitCoordinate mapFitCoordinate) {
        Objects.requireNonNull(mapFitCoordinate);
        if (this.mapBoundsFitCase_ == 3 && this.mapBoundsFit_ != MapFitCoordinate.getDefaultInstance()) {
            MapFitCoordinate.Builder builderNewBuilder = MapFitCoordinate.newBuilder((MapFitCoordinate) this.mapBoundsFit_);
            builderNewBuilder.mergeFrom((MapFitCoordinate.Builder) mapFitCoordinate);
            mapFitCoordinate = builderNewBuilder.buildPartial();
        }
        this.mapBoundsFit_ = mapFitCoordinate;
        this.mapBoundsFitCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViewPort(RelativeViewPort relativeViewPort) {
        Objects.requireNonNull(relativeViewPort);
        RelativeViewPort relativeViewPort2 = this.viewPort_;
        if (relativeViewPort2 != null && relativeViewPort2 != RelativeViewPort.getDefaultInstance()) {
            RelativeViewPort.Builder builderNewBuilder = RelativeViewPort.newBuilder(relativeViewPort2);
            builderNewBuilder.mergeFrom((RelativeViewPort.Builder) relativeViewPort);
            relativeViewPort = builderNewBuilder.buildPartial();
        }
        this.viewPort_ = relativeViewPort;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MapBounds parseDelimitedFrom(InputStream inputStream) {
        return (MapBounds) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapBounds parseFrom(v vVar) {
        return (MapBounds) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MapBounds> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimated(boolean z) {
        this.animated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContinuouslyTrackUserLocation(ContinuouslyTrackUserLocation continuouslyTrackUserLocation) {
        Objects.requireNonNull(continuouslyTrackUserLocation);
        this.mapBoundsFit_ = continuouslyTrackUserLocation;
        this.mapBoundsFitCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitArea(MapFitArea mapFitArea) {
        Objects.requireNonNull(mapFitArea);
        this.mapBoundsFit_ = mapFitArea;
        this.mapBoundsFitCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitContent(MapFitContent mapFitContent) {
        Objects.requireNonNull(mapFitContent);
        this.mapBoundsFit_ = mapFitContent;
        this.mapBoundsFitCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitCoordinate(MapFitCoordinate mapFitCoordinate) {
        Objects.requireNonNull(mapFitCoordinate);
        this.mapBoundsFit_ = mapFitCoordinate;
        this.mapBoundsFitCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNorthLock(NorthLockBehavior northLockBehavior) {
        this.northLock_ = northLockBehavior.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNorthLockValue(int i2) {
        this.bitField0_ |= 2;
        this.northLock_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewPort(RelativeViewPort relativeViewPort) {
        Objects.requireNonNull(relativeViewPort);
        this.viewPort_ = relativeViewPort;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0000\u0007ဌ\u0001", new Object[]{"mapBoundsFit_", "mapBoundsFitCase_", "bitField0_", "animated_", MapFitArea.class, MapFitCoordinate.class, MapFitContent.class, ContinuouslyTrackUserLocation.class, "viewPort_", "northLock_"});
        }
        if (iOrdinal == 3) {
            return new MapBounds();
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
        fo<MapBounds> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MapBounds.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public boolean getAnimated() {
        return this.animated_;
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public ContinuouslyTrackUserLocation getContinuouslyTrackUserLocation() {
        return this.mapBoundsFitCase_ == 5 ? (ContinuouslyTrackUserLocation) this.mapBoundsFit_ : ContinuouslyTrackUserLocation.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public MapFitArea getFitArea() {
        return this.mapBoundsFitCase_ == 2 ? (MapFitArea) this.mapBoundsFit_ : MapFitArea.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public MapFitContent getFitContent() {
        return this.mapBoundsFitCase_ == 4 ? (MapFitContent) this.mapBoundsFit_ : MapFitContent.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public MapFitCoordinate getFitCoordinate() {
        return this.mapBoundsFitCase_ == 3 ? (MapFitCoordinate) this.mapBoundsFit_ : MapFitCoordinate.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public MapBoundsFitCase getMapBoundsFitCase() {
        return MapBoundsFitCase.forNumber(this.mapBoundsFitCase_);
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public NorthLockBehavior getNorthLock() {
        NorthLockBehavior northLockBehaviorForNumber = NorthLockBehavior.forNumber(this.northLock_);
        return northLockBehaviorForNumber == null ? NorthLockBehavior.UNRECOGNIZED : northLockBehaviorForNumber;
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public int getNorthLockValue() {
        return this.northLock_;
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public RelativeViewPort getViewPort() {
        RelativeViewPort relativeViewPort = this.viewPort_;
        return relativeViewPort == null ? RelativeViewPort.getDefaultInstance() : relativeViewPort;
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public boolean hasContinuouslyTrackUserLocation() {
        return this.mapBoundsFitCase_ == 5;
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public boolean hasFitArea() {
        return this.mapBoundsFitCase_ == 2;
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public boolean hasFitContent() {
        return this.mapBoundsFitCase_ == 4;
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public boolean hasFitCoordinate() {
        return this.mapBoundsFitCase_ == 3;
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public boolean hasNorthLock() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
    public boolean hasViewPort() {
        return (this.bitField0_ & 1) != 0;
    }

    /* compiled from: WazeSource */
    public final class MapFitArea extends du<MapFitArea, Builder> implements MapFitAreaOrBuilder {
        public static final int BOUNDS_FACTOR_FIELD_NUMBER = 2;
        public static final int COORDINATES_FIELD_NUMBER = 1;
        private static final MapFitArea DEFAULT_INSTANCE;
        public static final int DISPLAY_STATE_FIELD_NUMBER = 3;
        private static volatile fo<MapFitArea> PARSER;
        private float boundsFactor_;
        private eo<Position.IntPosition> coordinates_ = emptyProtobufList();
        private int displayState_;

        static {
            MapFitArea mapFitArea = new MapFitArea();
            DEFAULT_INSTANCE = mapFitArea;
            du.registerDefaultInstance(MapFitArea.class, mapFitArea);
        }

        private MapFitArea() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCoordinates(Iterable<? extends Position.IntPosition> iterable) {
            ensureCoordinatesIsMutable();
            c.addAll(iterable, this.coordinates_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCoordinates(int i2, Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            ensureCoordinatesIsMutable();
            this.coordinates_.add(i2, intPosition);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoundsFactor() {
            this.boundsFactor_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoordinates() {
            this.coordinates_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisplayState() {
            this.displayState_ = 0;
        }

        private void ensureCoordinatesIsMutable() {
            eo<Position.IntPosition> eoVar = this.coordinates_;
            if (eoVar.c()) {
                return;
            }
            this.coordinates_ = du.mutableCopy(eoVar);
        }

        public static MapFitArea getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MapFitArea parseDelimitedFrom(InputStream inputStream) {
            return (MapFitArea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MapFitArea parseFrom(v vVar) {
            return (MapFitArea) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<MapFitArea> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCoordinates(int i2) {
            ensureCoordinatesIsMutable();
            this.coordinates_.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoundsFactor(float f2) {
            this.boundsFactor_ = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoordinates(int i2, Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            ensureCoordinatesIsMutable();
            this.coordinates_.set(i2, intPosition);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplayState(MapDisplayState mapDisplayState) {
            this.displayState_ = mapDisplayState.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplayStateValue(int i2) {
            this.displayState_ = i2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0001\u0003\f", new Object[]{"coordinates_", Position.IntPosition.class, "boundsFactor_", "displayState_"});
            }
            if (iOrdinal == 3) {
                return new MapFitArea();
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
            fo<MapFitArea> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (MapFitArea.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitAreaOrBuilder
        public float getBoundsFactor() {
            return this.boundsFactor_;
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitAreaOrBuilder
        public Position.IntPosition getCoordinates(int i2) {
            return this.coordinates_.get(i2);
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitAreaOrBuilder
        public int getCoordinatesCount() {
            return this.coordinates_.size();
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitAreaOrBuilder
        public List<Position.IntPosition> getCoordinatesList() {
            return this.coordinates_;
        }

        public Position.IntPositionOrBuilder getCoordinatesOrBuilder(int i2) {
            return this.coordinates_.get(i2);
        }

        public List<? extends Position.IntPositionOrBuilder> getCoordinatesOrBuilderList() {
            return this.coordinates_;
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitAreaOrBuilder
        public MapDisplayState getDisplayState() {
            MapDisplayState mapDisplayStateForNumber = MapDisplayState.forNumber(this.displayState_);
            return mapDisplayStateForNumber == null ? MapDisplayState.UNRECOGNIZED : mapDisplayStateForNumber;
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitAreaOrBuilder
        public int getDisplayStateValue() {
            return this.displayState_;
        }

        public static Builder newBuilder(MapFitArea mapFitArea) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(mapFitArea);
        }

        public static MapFitArea parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (MapFitArea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static MapFitArea parseFrom(v vVar, de deVar) {
            return (MapFitArea) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static MapFitArea parseFrom(z zVar) {
            return (MapFitArea) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static MapFitArea parseFrom(z zVar, de deVar) {
            return (MapFitArea) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCoordinates(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            ensureCoordinatesIsMutable();
            this.coordinates_.add(intPosition);
        }

        public static MapFitArea parseFrom(InputStream inputStream) {
            return (MapFitArea) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MapFitArea parseFrom(InputStream inputStream, de deVar) {
            return (MapFitArea) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static MapFitArea parseFrom(ByteBuffer byteBuffer) {
            return (MapFitArea) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MapFitArea parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (MapFitArea) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<MapFitArea, Builder> implements MapFitAreaOrBuilder {
            private Builder() {
                super(MapFitArea.DEFAULT_INSTANCE);
            }

            public Builder addAllCoordinates(Iterable<? extends Position.IntPosition> iterable) {
                copyOnWrite();
                ((MapFitArea) this.instance).addAllCoordinates(iterable);
                return this;
            }

            public Builder addCoordinates(int i2, Position.IntPosition.Builder builder) {
                copyOnWrite();
                ((MapFitArea) this.instance).addCoordinates(i2, builder.build());
                return this;
            }

            public Builder clearBoundsFactor() {
                copyOnWrite();
                ((MapFitArea) this.instance).clearBoundsFactor();
                return this;
            }

            public Builder clearCoordinates() {
                copyOnWrite();
                ((MapFitArea) this.instance).clearCoordinates();
                return this;
            }

            public Builder clearDisplayState() {
                copyOnWrite();
                ((MapFitArea) this.instance).clearDisplayState();
                return this;
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitAreaOrBuilder
            public float getBoundsFactor() {
                return ((MapFitArea) this.instance).getBoundsFactor();
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitAreaOrBuilder
            public Position.IntPosition getCoordinates(int i2) {
                return ((MapFitArea) this.instance).getCoordinates(i2);
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitAreaOrBuilder
            public int getCoordinatesCount() {
                return ((MapFitArea) this.instance).getCoordinatesCount();
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitAreaOrBuilder
            public List<Position.IntPosition> getCoordinatesList() {
                return DesugarCollections.unmodifiableList(((MapFitArea) this.instance).getCoordinatesList());
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitAreaOrBuilder
            public MapDisplayState getDisplayState() {
                return ((MapFitArea) this.instance).getDisplayState();
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitAreaOrBuilder
            public int getDisplayStateValue() {
                return ((MapFitArea) this.instance).getDisplayStateValue();
            }

            public Builder removeCoordinates(int i2) {
                copyOnWrite();
                ((MapFitArea) this.instance).removeCoordinates(i2);
                return this;
            }

            public Builder setBoundsFactor(float f2) {
                copyOnWrite();
                ((MapFitArea) this.instance).setBoundsFactor(f2);
                return this;
            }

            public Builder setCoordinates(int i2, Position.IntPosition.Builder builder) {
                copyOnWrite();
                ((MapFitArea) this.instance).setCoordinates(i2, builder.build());
                return this;
            }

            public Builder setDisplayState(MapDisplayState mapDisplayState) {
                copyOnWrite();
                ((MapFitArea) this.instance).setDisplayState(mapDisplayState);
                return this;
            }

            public Builder setDisplayStateValue(int i2) {
                copyOnWrite();
                ((MapFitArea) this.instance).setDisplayStateValue(i2);
                return this;
            }

            public Builder addCoordinates(int i2, Position.IntPosition intPosition) {
                copyOnWrite();
                ((MapFitArea) this.instance).addCoordinates(i2, intPosition);
                return this;
            }

            public Builder setCoordinates(int i2, Position.IntPosition intPosition) {
                copyOnWrite();
                ((MapFitArea) this.instance).setCoordinates(i2, intPosition);
                return this;
            }

            public Builder addCoordinates(Position.IntPosition.Builder builder) {
                copyOnWrite();
                ((MapFitArea) this.instance).addCoordinates(builder.build());
                return this;
            }

            public Builder addCoordinates(Position.IntPosition intPosition) {
                copyOnWrite();
                ((MapFitArea) this.instance).addCoordinates(intPosition);
                return this;
            }
        }

        public static MapFitArea parseFrom(byte[] bArr) {
            return (MapFitArea) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MapFitArea parseFrom(byte[] bArr, de deVar) {
            return (MapFitArea) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class ActivelyTrackUser extends du<ActivelyTrackUser, Builder> implements ActivelyTrackUserOrBuilder {
        private static final ActivelyTrackUser DEFAULT_INSTANCE;
        public static final int DYNAMIC_ZOOM_FIELD_NUMBER = 1;
        private static volatile fo<ActivelyTrackUser> PARSER = null;
        public static final int STATIC_ZOOM_FIELD_NUMBER = 2;
        private int zoomBehaviorCase_ = 0;
        private Object zoomBehavior_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<ActivelyTrackUser, Builder> implements ActivelyTrackUserOrBuilder {
            private Builder() {
                super(ActivelyTrackUser.DEFAULT_INSTANCE);
            }

            public Builder clearDynamicZoom() {
                copyOnWrite();
                ((ActivelyTrackUser) this.instance).clearDynamicZoom();
                return this;
            }

            public Builder clearStaticZoom() {
                copyOnWrite();
                ((ActivelyTrackUser) this.instance).clearStaticZoom();
                return this;
            }

            public Builder clearZoomBehavior() {
                copyOnWrite();
                ((ActivelyTrackUser) this.instance).clearZoomBehavior();
                return this;
            }

            @Override // com.waze.jni.protos.map.MapBounds.ActivelyTrackUserOrBuilder
            public boolean getDynamicZoom() {
                return ((ActivelyTrackUser) this.instance).getDynamicZoom();
            }

            @Override // com.waze.jni.protos.map.MapBounds.ActivelyTrackUserOrBuilder
            public float getStaticZoom() {
                return ((ActivelyTrackUser) this.instance).getStaticZoom();
            }

            @Override // com.waze.jni.protos.map.MapBounds.ActivelyTrackUserOrBuilder
            public ZoomBehaviorCase getZoomBehaviorCase() {
                return ((ActivelyTrackUser) this.instance).getZoomBehaviorCase();
            }

            @Override // com.waze.jni.protos.map.MapBounds.ActivelyTrackUserOrBuilder
            public boolean hasDynamicZoom() {
                return ((ActivelyTrackUser) this.instance).hasDynamicZoom();
            }

            @Override // com.waze.jni.protos.map.MapBounds.ActivelyTrackUserOrBuilder
            public boolean hasStaticZoom() {
                return ((ActivelyTrackUser) this.instance).hasStaticZoom();
            }

            public Builder setDynamicZoom(boolean z) {
                copyOnWrite();
                ((ActivelyTrackUser) this.instance).setDynamicZoom(z);
                return this;
            }

            public Builder setStaticZoom(float f2) {
                copyOnWrite();
                ((ActivelyTrackUser) this.instance).setStaticZoom(f2);
                return this;
            }
        }

        /* compiled from: WazeSource */
        public enum ZoomBehaviorCase {
            DYNAMIC_ZOOM(1),
            STATIC_ZOOM(2),
            ZOOMBEHAVIOR_NOT_SET(0);

            private final int value;

            ZoomBehaviorCase(int i2) {
                this.value = i2;
            }

            public static ZoomBehaviorCase forNumber(int i2) {
                if (i2 == 0) {
                    return ZOOMBEHAVIOR_NOT_SET;
                }
                if (i2 == 1) {
                    return DYNAMIC_ZOOM;
                }
                if (i2 != 2) {
                    return null;
                }
                return STATIC_ZOOM;
            }

            public int getNumber() {
                return this.value;
            }
        }

        static {
            ActivelyTrackUser activelyTrackUser = new ActivelyTrackUser();
            DEFAULT_INSTANCE = activelyTrackUser;
            du.registerDefaultInstance(ActivelyTrackUser.class, activelyTrackUser);
        }

        private ActivelyTrackUser() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicZoom() {
            if (this.zoomBehaviorCase_ == 1) {
                this.zoomBehaviorCase_ = 0;
                this.zoomBehavior_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticZoom() {
            if (this.zoomBehaviorCase_ == 2) {
                this.zoomBehaviorCase_ = 0;
                this.zoomBehavior_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearZoomBehavior() {
            this.zoomBehaviorCase_ = 0;
            this.zoomBehavior_ = null;
        }

        public static ActivelyTrackUser getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ActivelyTrackUser parseDelimitedFrom(InputStream inputStream) {
            return (ActivelyTrackUser) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ActivelyTrackUser parseFrom(v vVar) {
            return (ActivelyTrackUser) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<ActivelyTrackUser> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicZoom(boolean z) {
            this.zoomBehaviorCase_ = 1;
            this.zoomBehavior_ = Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticZoom(float f2) {
            this.zoomBehaviorCase_ = 2;
            this.zoomBehavior_ = Float.valueOf(f2);
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u00024\u0000", new Object[]{"zoomBehavior_", "zoomBehaviorCase_"});
            }
            if (iOrdinal == 3) {
                return new ActivelyTrackUser();
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
            fo<ActivelyTrackUser> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (ActivelyTrackUser.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.MapBounds.ActivelyTrackUserOrBuilder
        public boolean getDynamicZoom() {
            if (this.zoomBehaviorCase_ == 1) {
                return ((Boolean) this.zoomBehavior_).booleanValue();
            }
            return false;
        }

        @Override // com.waze.jni.protos.map.MapBounds.ActivelyTrackUserOrBuilder
        public float getStaticZoom() {
            if (this.zoomBehaviorCase_ == 2) {
                return ((Float) this.zoomBehavior_).floatValue();
            }
            return 0.0f;
        }

        @Override // com.waze.jni.protos.map.MapBounds.ActivelyTrackUserOrBuilder
        public ZoomBehaviorCase getZoomBehaviorCase() {
            return ZoomBehaviorCase.forNumber(this.zoomBehaviorCase_);
        }

        @Override // com.waze.jni.protos.map.MapBounds.ActivelyTrackUserOrBuilder
        public boolean hasDynamicZoom() {
            return this.zoomBehaviorCase_ == 1;
        }

        @Override // com.waze.jni.protos.map.MapBounds.ActivelyTrackUserOrBuilder
        public boolean hasStaticZoom() {
            return this.zoomBehaviorCase_ == 2;
        }

        public static Builder newBuilder(ActivelyTrackUser activelyTrackUser) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(activelyTrackUser);
        }

        public static ActivelyTrackUser parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (ActivelyTrackUser) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static ActivelyTrackUser parseFrom(v vVar, de deVar) {
            return (ActivelyTrackUser) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static ActivelyTrackUser parseFrom(z zVar) {
            return (ActivelyTrackUser) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static ActivelyTrackUser parseFrom(z zVar, de deVar) {
            return (ActivelyTrackUser) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static ActivelyTrackUser parseFrom(InputStream inputStream) {
            return (ActivelyTrackUser) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ActivelyTrackUser parseFrom(InputStream inputStream, de deVar) {
            return (ActivelyTrackUser) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static ActivelyTrackUser parseFrom(ByteBuffer byteBuffer) {
            return (ActivelyTrackUser) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ActivelyTrackUser parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (ActivelyTrackUser) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static ActivelyTrackUser parseFrom(byte[] bArr) {
            return (ActivelyTrackUser) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ActivelyTrackUser parseFrom(byte[] bArr, de deVar) {
            return (ActivelyTrackUser) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class ContinuouslyTrackUserLocation extends du<ContinuouslyTrackUserLocation, Builder> implements ContinuouslyTrackUserLocationOrBuilder {
        private static final ContinuouslyTrackUserLocation DEFAULT_INSTANCE;
        public static final int DYNAMIC_ZOOM_FIELD_NUMBER = 2;
        public static final int MANUAL_ZOOM_FIELD_NUMBER = 3;
        private static volatile fo<ContinuouslyTrackUserLocation> PARSER = null;
        public static final int STATIC_ZOOM_FIELD_NUMBER = 1;
        public static final int USER_LOCATION_POSITION_PERCENTAGE_FIELD_NUMBER = 4;
        private int bitField0_;
        private PositionPercentage userLocationPositionPercentage_;
        private int zoomCase_ = 0;
        private Object zoom_;

        /* compiled from: WazeSource */
        public enum ZoomCase {
            STATIC_ZOOM(1),
            DYNAMIC_ZOOM(2),
            MANUAL_ZOOM(3),
            ZOOM_NOT_SET(0);

            private final int value;

            ZoomCase(int i2) {
                this.value = i2;
            }

            public static ZoomCase forNumber(int i2) {
                if (i2 == 0) {
                    return ZOOM_NOT_SET;
                }
                if (i2 == 1) {
                    return STATIC_ZOOM;
                }
                if (i2 == 2) {
                    return DYNAMIC_ZOOM;
                }
                if (i2 != 3) {
                    return null;
                }
                return MANUAL_ZOOM;
            }

            public int getNumber() {
                return this.value;
            }
        }

        static {
            ContinuouslyTrackUserLocation continuouslyTrackUserLocation = new ContinuouslyTrackUserLocation();
            DEFAULT_INSTANCE = continuouslyTrackUserLocation;
            du.registerDefaultInstance(ContinuouslyTrackUserLocation.class, continuouslyTrackUserLocation);
        }

        private ContinuouslyTrackUserLocation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicZoom() {
            if (this.zoomCase_ == 2) {
                this.zoomCase_ = 0;
                this.zoom_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearManualZoom() {
            if (this.zoomCase_ == 3) {
                this.zoomCase_ = 0;
                this.zoom_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticZoom() {
            if (this.zoomCase_ == 1) {
                this.zoomCase_ = 0;
                this.zoom_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserLocationPositionPercentage() {
            this.userLocationPositionPercentage_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearZoom() {
            this.zoomCase_ = 0;
            this.zoom_ = null;
        }

        public static ContinuouslyTrackUserLocation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUserLocationPositionPercentage(PositionPercentage positionPercentage) {
            Objects.requireNonNull(positionPercentage);
            PositionPercentage positionPercentage2 = this.userLocationPositionPercentage_;
            if (positionPercentage2 != null && positionPercentage2 != PositionPercentage.getDefaultInstance()) {
                PositionPercentage.Builder builderNewBuilder = PositionPercentage.newBuilder(positionPercentage2);
                builderNewBuilder.mergeFrom((PositionPercentage.Builder) positionPercentage);
                positionPercentage = builderNewBuilder.buildPartial();
            }
            this.userLocationPositionPercentage_ = positionPercentage;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ContinuouslyTrackUserLocation parseDelimitedFrom(InputStream inputStream) {
            return (ContinuouslyTrackUserLocation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContinuouslyTrackUserLocation parseFrom(v vVar) {
            return (ContinuouslyTrackUserLocation) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<ContinuouslyTrackUserLocation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicZoom(boolean z) {
            this.zoomCase_ = 2;
            this.zoom_ = Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setManualZoom(boolean z) {
            this.zoomCase_ = 3;
            this.zoom_ = Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticZoom(float f2) {
            this.zoomCase_ = 1;
            this.zoom_ = Float.valueOf(f2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserLocationPositionPercentage(PositionPercentage positionPercentage) {
            Objects.requireNonNull(positionPercentage);
            this.userLocationPositionPercentage_ = positionPercentage;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u00014\u0000\u0002:\u0000\u0003:\u0000\u0004ဉ\u0000", new Object[]{"zoom_", "zoomCase_", "bitField0_", "userLocationPositionPercentage_"});
            }
            if (iOrdinal == 3) {
                return new ContinuouslyTrackUserLocation();
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
            fo<ContinuouslyTrackUserLocation> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (ContinuouslyTrackUserLocation.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
        public boolean getDynamicZoom() {
            if (this.zoomCase_ == 2) {
                return ((Boolean) this.zoom_).booleanValue();
            }
            return false;
        }

        @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
        public boolean getManualZoom() {
            if (this.zoomCase_ == 3) {
                return ((Boolean) this.zoom_).booleanValue();
            }
            return false;
        }

        @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
        public float getStaticZoom() {
            if (this.zoomCase_ == 1) {
                return ((Float) this.zoom_).floatValue();
            }
            return 0.0f;
        }

        @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
        public PositionPercentage getUserLocationPositionPercentage() {
            PositionPercentage positionPercentage = this.userLocationPositionPercentage_;
            return positionPercentage == null ? PositionPercentage.getDefaultInstance() : positionPercentage;
        }

        @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
        public ZoomCase getZoomCase() {
            return ZoomCase.forNumber(this.zoomCase_);
        }

        @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
        public boolean hasDynamicZoom() {
            return this.zoomCase_ == 2;
        }

        @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
        public boolean hasManualZoom() {
            return this.zoomCase_ == 3;
        }

        @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
        public boolean hasStaticZoom() {
            return this.zoomCase_ == 1;
        }

        @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
        public boolean hasUserLocationPositionPercentage() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ContinuouslyTrackUserLocation continuouslyTrackUserLocation) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(continuouslyTrackUserLocation);
        }

        public static ContinuouslyTrackUserLocation parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (ContinuouslyTrackUserLocation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static ContinuouslyTrackUserLocation parseFrom(v vVar, de deVar) {
            return (ContinuouslyTrackUserLocation) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static ContinuouslyTrackUserLocation parseFrom(z zVar) {
            return (ContinuouslyTrackUserLocation) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static ContinuouslyTrackUserLocation parseFrom(z zVar, de deVar) {
            return (ContinuouslyTrackUserLocation) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static ContinuouslyTrackUserLocation parseFrom(InputStream inputStream) {
            return (ContinuouslyTrackUserLocation) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContinuouslyTrackUserLocation parseFrom(InputStream inputStream, de deVar) {
            return (ContinuouslyTrackUserLocation) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static ContinuouslyTrackUserLocation parseFrom(ByteBuffer byteBuffer) {
            return (ContinuouslyTrackUserLocation) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ContinuouslyTrackUserLocation parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (ContinuouslyTrackUserLocation) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<ContinuouslyTrackUserLocation, Builder> implements ContinuouslyTrackUserLocationOrBuilder {
            private Builder() {
                super(ContinuouslyTrackUserLocation.DEFAULT_INSTANCE);
            }

            public Builder clearDynamicZoom() {
                copyOnWrite();
                ((ContinuouslyTrackUserLocation) this.instance).clearDynamicZoom();
                return this;
            }

            public Builder clearManualZoom() {
                copyOnWrite();
                ((ContinuouslyTrackUserLocation) this.instance).clearManualZoom();
                return this;
            }

            public Builder clearStaticZoom() {
                copyOnWrite();
                ((ContinuouslyTrackUserLocation) this.instance).clearStaticZoom();
                return this;
            }

            public Builder clearUserLocationPositionPercentage() {
                copyOnWrite();
                ((ContinuouslyTrackUserLocation) this.instance).clearUserLocationPositionPercentage();
                return this;
            }

            public Builder clearZoom() {
                copyOnWrite();
                ((ContinuouslyTrackUserLocation) this.instance).clearZoom();
                return this;
            }

            @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
            public boolean getDynamicZoom() {
                return ((ContinuouslyTrackUserLocation) this.instance).getDynamicZoom();
            }

            @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
            public boolean getManualZoom() {
                return ((ContinuouslyTrackUserLocation) this.instance).getManualZoom();
            }

            @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
            public float getStaticZoom() {
                return ((ContinuouslyTrackUserLocation) this.instance).getStaticZoom();
            }

            @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
            public PositionPercentage getUserLocationPositionPercentage() {
                return ((ContinuouslyTrackUserLocation) this.instance).getUserLocationPositionPercentage();
            }

            @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
            public ZoomCase getZoomCase() {
                return ((ContinuouslyTrackUserLocation) this.instance).getZoomCase();
            }

            @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
            public boolean hasDynamicZoom() {
                return ((ContinuouslyTrackUserLocation) this.instance).hasDynamicZoom();
            }

            @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
            public boolean hasManualZoom() {
                return ((ContinuouslyTrackUserLocation) this.instance).hasManualZoom();
            }

            @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
            public boolean hasStaticZoom() {
                return ((ContinuouslyTrackUserLocation) this.instance).hasStaticZoom();
            }

            @Override // com.waze.jni.protos.map.MapBounds.ContinuouslyTrackUserLocationOrBuilder
            public boolean hasUserLocationPositionPercentage() {
                return ((ContinuouslyTrackUserLocation) this.instance).hasUserLocationPositionPercentage();
            }

            public Builder mergeUserLocationPositionPercentage(PositionPercentage positionPercentage) {
                copyOnWrite();
                ((ContinuouslyTrackUserLocation) this.instance).mergeUserLocationPositionPercentage(positionPercentage);
                return this;
            }

            public Builder setDynamicZoom(boolean z) {
                copyOnWrite();
                ((ContinuouslyTrackUserLocation) this.instance).setDynamicZoom(z);
                return this;
            }

            public Builder setManualZoom(boolean z) {
                copyOnWrite();
                ((ContinuouslyTrackUserLocation) this.instance).setManualZoom(z);
                return this;
            }

            public Builder setStaticZoom(float f2) {
                copyOnWrite();
                ((ContinuouslyTrackUserLocation) this.instance).setStaticZoom(f2);
                return this;
            }

            public Builder setUserLocationPositionPercentage(PositionPercentage.Builder builder) {
                copyOnWrite();
                ((ContinuouslyTrackUserLocation) this.instance).setUserLocationPositionPercentage(builder.build());
                return this;
            }

            public Builder setUserLocationPositionPercentage(PositionPercentage positionPercentage) {
                copyOnWrite();
                ((ContinuouslyTrackUserLocation) this.instance).setUserLocationPositionPercentage(positionPercentage);
                return this;
            }
        }

        public static ContinuouslyTrackUserLocation parseFrom(byte[] bArr) {
            return (ContinuouslyTrackUserLocation) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContinuouslyTrackUserLocation parseFrom(byte[] bArr, de deVar) {
            return (ContinuouslyTrackUserLocation) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class MapFitContent extends du<MapFitContent, Builder> implements MapFitContentOrBuilder {
        public static final int BOUNDS_FACTOR_FIELD_NUMBER = 1;
        private static final MapFitContent DEFAULT_INSTANCE;
        private static volatile fo<MapFitContent> PARSER;
        private float boundsFactor_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<MapFitContent, Builder> implements MapFitContentOrBuilder {
            private Builder() {
                super(MapFitContent.DEFAULT_INSTANCE);
            }

            public Builder clearBoundsFactor() {
                copyOnWrite();
                ((MapFitContent) this.instance).clearBoundsFactor();
                return this;
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitContentOrBuilder
            public float getBoundsFactor() {
                return ((MapFitContent) this.instance).getBoundsFactor();
            }

            public Builder setBoundsFactor(float f2) {
                copyOnWrite();
                ((MapFitContent) this.instance).setBoundsFactor(f2);
                return this;
            }
        }

        static {
            MapFitContent mapFitContent = new MapFitContent();
            DEFAULT_INSTANCE = mapFitContent;
            du.registerDefaultInstance(MapFitContent.class, mapFitContent);
        }

        private MapFitContent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoundsFactor() {
            this.boundsFactor_ = 0.0f;
        }

        public static MapFitContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MapFitContent parseDelimitedFrom(InputStream inputStream) {
            return (MapFitContent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MapFitContent parseFrom(v vVar) {
            return (MapFitContent) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<MapFitContent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoundsFactor(float f2) {
            this.boundsFactor_ = f2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"boundsFactor_"});
            }
            if (iOrdinal == 3) {
                return new MapFitContent();
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
            fo<MapFitContent> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (MapFitContent.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitContentOrBuilder
        public float getBoundsFactor() {
            return this.boundsFactor_;
        }

        public static Builder newBuilder(MapFitContent mapFitContent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(mapFitContent);
        }

        public static MapFitContent parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (MapFitContent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static MapFitContent parseFrom(v vVar, de deVar) {
            return (MapFitContent) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static MapFitContent parseFrom(z zVar) {
            return (MapFitContent) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static MapFitContent parseFrom(z zVar, de deVar) {
            return (MapFitContent) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static MapFitContent parseFrom(InputStream inputStream) {
            return (MapFitContent) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MapFitContent parseFrom(InputStream inputStream, de deVar) {
            return (MapFitContent) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static MapFitContent parseFrom(ByteBuffer byteBuffer) {
            return (MapFitContent) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MapFitContent parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (MapFitContent) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static MapFitContent parseFrom(byte[] bArr) {
            return (MapFitContent) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MapFitContent parseFrom(byte[] bArr, de deVar) {
            return (MapFitContent) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class MapFitCoordinate extends du<MapFitCoordinate, Builder> implements MapFitCoordinateOrBuilder {
        public static final int COORDINATE_FIELD_NUMBER = 1;
        private static final MapFitCoordinate DEFAULT_INSTANCE;
        public static final int DISPLAY_STATE_FIELD_NUMBER = 3;
        public static final int ORIENTATION_FIELD_NUMBER = 4;
        private static volatile fo<MapFitCoordinate> PARSER = null;
        public static final int POSITION_PERCENTAGE_FIELD_NUMBER = 5;
        public static final int ZOOM_FIELD_NUMBER = 2;
        private int bitField0_;
        private Position.IntPosition coordinate_;
        private int displayState_;
        private float orientation_;
        private PositionPercentage positionPercentage_;
        private float zoom_;

        static {
            MapFitCoordinate mapFitCoordinate = new MapFitCoordinate();
            DEFAULT_INSTANCE = mapFitCoordinate;
            du.registerDefaultInstance(MapFitCoordinate.class, mapFitCoordinate);
        }

        private MapFitCoordinate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoordinate() {
            this.coordinate_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisplayState() {
            this.displayState_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrientation() {
            this.orientation_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPositionPercentage() {
            this.positionPercentage_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearZoom() {
            this.zoom_ = 0.0f;
        }

        public static MapFitCoordinate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCoordinate(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            Position.IntPosition intPosition2 = this.coordinate_;
            if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
                Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
                builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
                intPosition = builderNewBuilder.buildPartial();
            }
            this.coordinate_ = intPosition;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePositionPercentage(PositionPercentage positionPercentage) {
            Objects.requireNonNull(positionPercentage);
            PositionPercentage positionPercentage2 = this.positionPercentage_;
            if (positionPercentage2 != null && positionPercentage2 != PositionPercentage.getDefaultInstance()) {
                PositionPercentage.Builder builderNewBuilder = PositionPercentage.newBuilder(positionPercentage2);
                builderNewBuilder.mergeFrom((PositionPercentage.Builder) positionPercentage);
                positionPercentage = builderNewBuilder.buildPartial();
            }
            this.positionPercentage_ = positionPercentage;
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MapFitCoordinate parseDelimitedFrom(InputStream inputStream) {
            return (MapFitCoordinate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MapFitCoordinate parseFrom(v vVar) {
            return (MapFitCoordinate) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<MapFitCoordinate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoordinate(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            this.coordinate_ = intPosition;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplayState(MapDisplayState mapDisplayState) {
            this.displayState_ = mapDisplayState.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplayStateValue(int i2) {
            this.displayState_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrientation(float f2) {
            this.orientation_ = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPositionPercentage(PositionPercentage positionPercentage) {
            Objects.requireNonNull(positionPercentage);
            this.positionPercentage_ = positionPercentage;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZoom(float f2) {
            this.zoom_ = f2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0001\u0003\f\u0004\u0001\u0005ဉ\u0001", new Object[]{"bitField0_", "coordinate_", "zoom_", "displayState_", "orientation_", "positionPercentage_"});
            }
            if (iOrdinal == 3) {
                return new MapFitCoordinate();
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
            fo<MapFitCoordinate> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (MapFitCoordinate.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
        public Position.IntPosition getCoordinate() {
            Position.IntPosition intPosition = this.coordinate_;
            return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
        public MapDisplayState getDisplayState() {
            MapDisplayState mapDisplayStateForNumber = MapDisplayState.forNumber(this.displayState_);
            return mapDisplayStateForNumber == null ? MapDisplayState.UNRECOGNIZED : mapDisplayStateForNumber;
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
        public int getDisplayStateValue() {
            return this.displayState_;
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
        public float getOrientation() {
            return this.orientation_;
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
        public PositionPercentage getPositionPercentage() {
            PositionPercentage positionPercentage = this.positionPercentage_;
            return positionPercentage == null ? PositionPercentage.getDefaultInstance() : positionPercentage;
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
        public float getZoom() {
            return this.zoom_;
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
        public boolean hasCoordinate() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
        public boolean hasPositionPercentage() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(MapFitCoordinate mapFitCoordinate) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(mapFitCoordinate);
        }

        public static MapFitCoordinate parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (MapFitCoordinate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static MapFitCoordinate parseFrom(v vVar, de deVar) {
            return (MapFitCoordinate) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static MapFitCoordinate parseFrom(z zVar) {
            return (MapFitCoordinate) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static MapFitCoordinate parseFrom(z zVar, de deVar) {
            return (MapFitCoordinate) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static MapFitCoordinate parseFrom(InputStream inputStream) {
            return (MapFitCoordinate) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MapFitCoordinate parseFrom(InputStream inputStream, de deVar) {
            return (MapFitCoordinate) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static MapFitCoordinate parseFrom(ByteBuffer byteBuffer) {
            return (MapFitCoordinate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MapFitCoordinate parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (MapFitCoordinate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<MapFitCoordinate, Builder> implements MapFitCoordinateOrBuilder {
            private Builder() {
                super(MapFitCoordinate.DEFAULT_INSTANCE);
            }

            public Builder clearCoordinate() {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).clearCoordinate();
                return this;
            }

            public Builder clearDisplayState() {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).clearDisplayState();
                return this;
            }

            public Builder clearOrientation() {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).clearOrientation();
                return this;
            }

            public Builder clearPositionPercentage() {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).clearPositionPercentage();
                return this;
            }

            public Builder clearZoom() {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).clearZoom();
                return this;
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
            public Position.IntPosition getCoordinate() {
                return ((MapFitCoordinate) this.instance).getCoordinate();
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
            public MapDisplayState getDisplayState() {
                return ((MapFitCoordinate) this.instance).getDisplayState();
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
            public int getDisplayStateValue() {
                return ((MapFitCoordinate) this.instance).getDisplayStateValue();
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
            public float getOrientation() {
                return ((MapFitCoordinate) this.instance).getOrientation();
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
            public PositionPercentage getPositionPercentage() {
                return ((MapFitCoordinate) this.instance).getPositionPercentage();
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
            public float getZoom() {
                return ((MapFitCoordinate) this.instance).getZoom();
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
            public boolean hasCoordinate() {
                return ((MapFitCoordinate) this.instance).hasCoordinate();
            }

            @Override // com.waze.jni.protos.map.MapBounds.MapFitCoordinateOrBuilder
            public boolean hasPositionPercentage() {
                return ((MapFitCoordinate) this.instance).hasPositionPercentage();
            }

            public Builder mergeCoordinate(Position.IntPosition intPosition) {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).mergeCoordinate(intPosition);
                return this;
            }

            public Builder mergePositionPercentage(PositionPercentage positionPercentage) {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).mergePositionPercentage(positionPercentage);
                return this;
            }

            public Builder setCoordinate(Position.IntPosition.Builder builder) {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).setCoordinate(builder.build());
                return this;
            }

            public Builder setDisplayState(MapDisplayState mapDisplayState) {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).setDisplayState(mapDisplayState);
                return this;
            }

            public Builder setDisplayStateValue(int i2) {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).setDisplayStateValue(i2);
                return this;
            }

            public Builder setOrientation(float f2) {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).setOrientation(f2);
                return this;
            }

            public Builder setPositionPercentage(PositionPercentage.Builder builder) {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).setPositionPercentage(builder.build());
                return this;
            }

            public Builder setZoom(float f2) {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).setZoom(f2);
                return this;
            }

            public Builder setCoordinate(Position.IntPosition intPosition) {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).setCoordinate(intPosition);
                return this;
            }

            public Builder setPositionPercentage(PositionPercentage positionPercentage) {
                copyOnWrite();
                ((MapFitCoordinate) this.instance).setPositionPercentage(positionPercentage);
                return this;
            }
        }

        public static MapFitCoordinate parseFrom(byte[] bArr) {
            return (MapFitCoordinate) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MapFitCoordinate parseFrom(byte[] bArr, de deVar) {
            return (MapFitCoordinate) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class PositionPercentage extends du<PositionPercentage, Builder> implements PositionPercentageOrBuilder {
        private static final PositionPercentage DEFAULT_INSTANCE;
        private static volatile fo<PositionPercentage> PARSER = null;
        public static final int X_PERCENTAGE_FIELD_NUMBER = 1;
        public static final int Y_PERCENTAGE_FIELD_NUMBER = 2;
        private float xPercentage_;
        private float yPercentage_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<PositionPercentage, Builder> implements PositionPercentageOrBuilder {
            private Builder() {
                super(PositionPercentage.DEFAULT_INSTANCE);
            }

            public Builder clearXPercentage() {
                copyOnWrite();
                ((PositionPercentage) this.instance).clearXPercentage();
                return this;
            }

            public Builder clearYPercentage() {
                copyOnWrite();
                ((PositionPercentage) this.instance).clearYPercentage();
                return this;
            }

            @Override // com.waze.jni.protos.map.MapBounds.PositionPercentageOrBuilder
            public float getXPercentage() {
                return ((PositionPercentage) this.instance).getXPercentage();
            }

            @Override // com.waze.jni.protos.map.MapBounds.PositionPercentageOrBuilder
            public float getYPercentage() {
                return ((PositionPercentage) this.instance).getYPercentage();
            }

            public Builder setXPercentage(float f2) {
                copyOnWrite();
                ((PositionPercentage) this.instance).setXPercentage(f2);
                return this;
            }

            public Builder setYPercentage(float f2) {
                copyOnWrite();
                ((PositionPercentage) this.instance).setYPercentage(f2);
                return this;
            }
        }

        static {
            PositionPercentage positionPercentage = new PositionPercentage();
            DEFAULT_INSTANCE = positionPercentage;
            du.registerDefaultInstance(PositionPercentage.class, positionPercentage);
        }

        private PositionPercentage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXPercentage() {
            this.xPercentage_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearYPercentage() {
            this.yPercentage_ = 0.0f;
        }

        public static PositionPercentage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PositionPercentage parseDelimitedFrom(InputStream inputStream) {
            return (PositionPercentage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PositionPercentage parseFrom(v vVar) {
            return (PositionPercentage) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<PositionPercentage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXPercentage(float f2) {
            this.xPercentage_ = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setYPercentage(float f2) {
            this.yPercentage_ = f2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"xPercentage_", "yPercentage_"});
            }
            if (iOrdinal == 3) {
                return new PositionPercentage();
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
            fo<PositionPercentage> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (PositionPercentage.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.MapBounds.PositionPercentageOrBuilder
        public float getXPercentage() {
            return this.xPercentage_;
        }

        @Override // com.waze.jni.protos.map.MapBounds.PositionPercentageOrBuilder
        public float getYPercentage() {
            return this.yPercentage_;
        }

        public static Builder newBuilder(PositionPercentage positionPercentage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(positionPercentage);
        }

        public static PositionPercentage parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (PositionPercentage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PositionPercentage parseFrom(v vVar, de deVar) {
            return (PositionPercentage) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static PositionPercentage parseFrom(z zVar) {
            return (PositionPercentage) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static PositionPercentage parseFrom(z zVar, de deVar) {
            return (PositionPercentage) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static PositionPercentage parseFrom(InputStream inputStream) {
            return (PositionPercentage) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PositionPercentage parseFrom(InputStream inputStream, de deVar) {
            return (PositionPercentage) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PositionPercentage parseFrom(ByteBuffer byteBuffer) {
            return (PositionPercentage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PositionPercentage parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (PositionPercentage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static PositionPercentage parseFrom(byte[] bArr) {
            return (PositionPercentage) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PositionPercentage parseFrom(byte[] bArr, de deVar) {
            return (PositionPercentage) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(MapBounds mapBounds) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mapBounds);
    }

    public static MapBounds parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MapBounds) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapBounds parseFrom(v vVar, de deVar) {
        return (MapBounds) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MapBounds parseFrom(z zVar) {
        return (MapBounds) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MapBounds parseFrom(z zVar, de deVar) {
        return (MapBounds) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MapBounds parseFrom(InputStream inputStream) {
        return (MapBounds) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapBounds parseFrom(InputStream inputStream, de deVar) {
        return (MapBounds) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapBounds parseFrom(ByteBuffer byteBuffer) {
        return (MapBounds) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MapBounds parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MapBounds) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<MapBounds, Builder> implements MapBoundsOrBuilder {
        private Builder() {
            super(MapBounds.DEFAULT_INSTANCE);
        }

        public Builder clearAnimated() {
            copyOnWrite();
            ((MapBounds) this.instance).clearAnimated();
            return this;
        }

        public Builder clearContinuouslyTrackUserLocation() {
            copyOnWrite();
            ((MapBounds) this.instance).clearContinuouslyTrackUserLocation();
            return this;
        }

        public Builder clearFitArea() {
            copyOnWrite();
            ((MapBounds) this.instance).clearFitArea();
            return this;
        }

        public Builder clearFitContent() {
            copyOnWrite();
            ((MapBounds) this.instance).clearFitContent();
            return this;
        }

        public Builder clearFitCoordinate() {
            copyOnWrite();
            ((MapBounds) this.instance).clearFitCoordinate();
            return this;
        }

        public Builder clearMapBoundsFit() {
            copyOnWrite();
            ((MapBounds) this.instance).clearMapBoundsFit();
            return this;
        }

        public Builder clearNorthLock() {
            copyOnWrite();
            ((MapBounds) this.instance).clearNorthLock();
            return this;
        }

        public Builder clearViewPort() {
            copyOnWrite();
            ((MapBounds) this.instance).clearViewPort();
            return this;
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public boolean getAnimated() {
            return ((MapBounds) this.instance).getAnimated();
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public ContinuouslyTrackUserLocation getContinuouslyTrackUserLocation() {
            return ((MapBounds) this.instance).getContinuouslyTrackUserLocation();
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public MapFitArea getFitArea() {
            return ((MapBounds) this.instance).getFitArea();
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public MapFitContent getFitContent() {
            return ((MapBounds) this.instance).getFitContent();
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public MapFitCoordinate getFitCoordinate() {
            return ((MapBounds) this.instance).getFitCoordinate();
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public MapBoundsFitCase getMapBoundsFitCase() {
            return ((MapBounds) this.instance).getMapBoundsFitCase();
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public NorthLockBehavior getNorthLock() {
            return ((MapBounds) this.instance).getNorthLock();
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public int getNorthLockValue() {
            return ((MapBounds) this.instance).getNorthLockValue();
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public RelativeViewPort getViewPort() {
            return ((MapBounds) this.instance).getViewPort();
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public boolean hasContinuouslyTrackUserLocation() {
            return ((MapBounds) this.instance).hasContinuouslyTrackUserLocation();
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public boolean hasFitArea() {
            return ((MapBounds) this.instance).hasFitArea();
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public boolean hasFitContent() {
            return ((MapBounds) this.instance).hasFitContent();
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public boolean hasFitCoordinate() {
            return ((MapBounds) this.instance).hasFitCoordinate();
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public boolean hasNorthLock() {
            return ((MapBounds) this.instance).hasNorthLock();
        }

        @Override // com.waze.jni.protos.map.MapBoundsOrBuilder
        public boolean hasViewPort() {
            return ((MapBounds) this.instance).hasViewPort();
        }

        public Builder mergeContinuouslyTrackUserLocation(ContinuouslyTrackUserLocation continuouslyTrackUserLocation) {
            copyOnWrite();
            ((MapBounds) this.instance).mergeContinuouslyTrackUserLocation(continuouslyTrackUserLocation);
            return this;
        }

        public Builder mergeFitArea(MapFitArea mapFitArea) {
            copyOnWrite();
            ((MapBounds) this.instance).mergeFitArea(mapFitArea);
            return this;
        }

        public Builder mergeFitContent(MapFitContent mapFitContent) {
            copyOnWrite();
            ((MapBounds) this.instance).mergeFitContent(mapFitContent);
            return this;
        }

        public Builder mergeFitCoordinate(MapFitCoordinate mapFitCoordinate) {
            copyOnWrite();
            ((MapBounds) this.instance).mergeFitCoordinate(mapFitCoordinate);
            return this;
        }

        public Builder mergeViewPort(RelativeViewPort relativeViewPort) {
            copyOnWrite();
            ((MapBounds) this.instance).mergeViewPort(relativeViewPort);
            return this;
        }

        public Builder setAnimated(boolean z) {
            copyOnWrite();
            ((MapBounds) this.instance).setAnimated(z);
            return this;
        }

        public Builder setContinuouslyTrackUserLocation(ContinuouslyTrackUserLocation.Builder builder) {
            copyOnWrite();
            ((MapBounds) this.instance).setContinuouslyTrackUserLocation(builder.build());
            return this;
        }

        public Builder setFitArea(MapFitArea.Builder builder) {
            copyOnWrite();
            ((MapBounds) this.instance).setFitArea(builder.build());
            return this;
        }

        public Builder setFitContent(MapFitContent.Builder builder) {
            copyOnWrite();
            ((MapBounds) this.instance).setFitContent(builder.build());
            return this;
        }

        public Builder setFitCoordinate(MapFitCoordinate.Builder builder) {
            copyOnWrite();
            ((MapBounds) this.instance).setFitCoordinate(builder.build());
            return this;
        }

        public Builder setNorthLock(NorthLockBehavior northLockBehavior) {
            copyOnWrite();
            ((MapBounds) this.instance).setNorthLock(northLockBehavior);
            return this;
        }

        public Builder setNorthLockValue(int i2) {
            copyOnWrite();
            ((MapBounds) this.instance).setNorthLockValue(i2);
            return this;
        }

        public Builder setViewPort(RelativeViewPort.Builder builder) {
            copyOnWrite();
            ((MapBounds) this.instance).setViewPort(builder.build());
            return this;
        }

        public Builder setContinuouslyTrackUserLocation(ContinuouslyTrackUserLocation continuouslyTrackUserLocation) {
            copyOnWrite();
            ((MapBounds) this.instance).setContinuouslyTrackUserLocation(continuouslyTrackUserLocation);
            return this;
        }

        public Builder setFitArea(MapFitArea mapFitArea) {
            copyOnWrite();
            ((MapBounds) this.instance).setFitArea(mapFitArea);
            return this;
        }

        public Builder setFitContent(MapFitContent mapFitContent) {
            copyOnWrite();
            ((MapBounds) this.instance).setFitContent(mapFitContent);
            return this;
        }

        public Builder setFitCoordinate(MapFitCoordinate mapFitCoordinate) {
            copyOnWrite();
            ((MapBounds) this.instance).setFitCoordinate(mapFitCoordinate);
            return this;
        }

        public Builder setViewPort(RelativeViewPort relativeViewPort) {
            copyOnWrite();
            ((MapBounds) this.instance).setViewPort(relativeViewPort);
            return this;
        }
    }

    public static MapBounds parseFrom(byte[] bArr) {
        return (MapBounds) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MapBounds parseFrom(byte[] bArr, de deVar) {
        return (MapBounds) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
