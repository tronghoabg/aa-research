package com.waze.jni.protos.map;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.MapBounds;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapBoundsKt {
    public static final MapBoundsKt INSTANCE = new MapBoundsKt();

    private MapBoundsKt() {
    }

    /* renamed from: -initializeactivelyTrackUser, reason: not valid java name */
    public final MapBounds.ActivelyTrackUser m26579initializeactivelyTrackUser(l<? super ActivelyTrackUserKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ActivelyTrackUserKt.Dsl.Companion companion = ActivelyTrackUserKt.Dsl.Companion;
        MapBounds.ActivelyTrackUser.Builder builderNewBuilder = MapBounds.ActivelyTrackUser.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ActivelyTrackUserKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializecontinuouslyTrackUserLocation, reason: not valid java name */
    public final MapBounds.ContinuouslyTrackUserLocation m26580initializecontinuouslyTrackUserLocation(l<? super ContinuouslyTrackUserLocationKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ContinuouslyTrackUserLocationKt.Dsl.Companion companion = ContinuouslyTrackUserLocationKt.Dsl.Companion;
        MapBounds.ContinuouslyTrackUserLocation.Builder builderNewBuilder = MapBounds.ContinuouslyTrackUserLocation.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ContinuouslyTrackUserLocationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializemapFitArea, reason: not valid java name */
    public final MapBounds.MapFitArea m26581initializemapFitArea(l<? super MapFitAreaKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapFitAreaKt.Dsl.Companion companion = MapFitAreaKt.Dsl.Companion;
        MapBounds.MapFitArea.Builder builderNewBuilder = MapBounds.MapFitArea.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapFitAreaKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializemapFitContent, reason: not valid java name */
    public final MapBounds.MapFitContent m26582initializemapFitContent(l<? super MapFitContentKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapFitContentKt.Dsl.Companion companion = MapFitContentKt.Dsl.Companion;
        MapBounds.MapFitContent.Builder builderNewBuilder = MapBounds.MapFitContent.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapFitContentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializemapFitCoordinate, reason: not valid java name */
    public final MapBounds.MapFitCoordinate m26583initializemapFitCoordinate(l<? super MapFitCoordinateKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapFitCoordinateKt.Dsl.Companion companion = MapFitCoordinateKt.Dsl.Companion;
        MapBounds.MapFitCoordinate.Builder builderNewBuilder = MapBounds.MapFitCoordinate.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapFitCoordinateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializepositionPercentage, reason: not valid java name */
    public final MapBounds.PositionPercentage m26584initializepositionPercentage(l<? super PositionPercentageKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PositionPercentageKt.Dsl.Companion companion = PositionPercentageKt.Dsl.Companion;
        MapBounds.PositionPercentage.Builder builderNewBuilder = MapBounds.PositionPercentage.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PositionPercentageKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class ActivelyTrackUserKt {
        public static final ActivelyTrackUserKt INSTANCE = new ActivelyTrackUserKt();

        private ActivelyTrackUserKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final MapBounds.ActivelyTrackUser.Builder _builder;

            private Dsl(MapBounds.ActivelyTrackUser.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ MapBounds.ActivelyTrackUser _build() {
                MapBounds.ActivelyTrackUser activelyTrackUserBuild = this._builder.build();
                x.e(activelyTrackUserBuild, "build(...)");
                return activelyTrackUserBuild;
            }

            public final void clearDynamicZoom() {
                this._builder.clearDynamicZoom();
            }

            public final void clearStaticZoom() {
                this._builder.clearStaticZoom();
            }

            public final void clearZoomBehavior() {
                this._builder.clearZoomBehavior();
            }

            public final boolean getDynamicZoom() {
                return this._builder.getDynamicZoom();
            }

            public final float getStaticZoom() {
                return this._builder.getStaticZoom();
            }

            public final MapBounds.ActivelyTrackUser.ZoomBehaviorCase getZoomBehaviorCase() {
                MapBounds.ActivelyTrackUser.ZoomBehaviorCase zoomBehaviorCase = this._builder.getZoomBehaviorCase();
                x.e(zoomBehaviorCase, "getZoomBehaviorCase(...)");
                return zoomBehaviorCase;
            }

            public final boolean hasDynamicZoom() {
                return this._builder.hasDynamicZoom();
            }

            public final boolean hasStaticZoom() {
                return this._builder.hasStaticZoom();
            }

            public final void setDynamicZoom(boolean z) {
                this._builder.setDynamicZoom(z);
            }

            public final void setStaticZoom(float f2) {
                this._builder.setStaticZoom(f2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(MapBounds.ActivelyTrackUser.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(MapBounds.ActivelyTrackUser.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class ContinuouslyTrackUserLocationKt {
        public static final ContinuouslyTrackUserLocationKt INSTANCE = new ContinuouslyTrackUserLocationKt();

        private ContinuouslyTrackUserLocationKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final MapBounds.ContinuouslyTrackUserLocation.Builder _builder;

            private Dsl(MapBounds.ContinuouslyTrackUserLocation.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ MapBounds.ContinuouslyTrackUserLocation _build() {
                MapBounds.ContinuouslyTrackUserLocation continuouslyTrackUserLocationBuild = this._builder.build();
                x.e(continuouslyTrackUserLocationBuild, "build(...)");
                return continuouslyTrackUserLocationBuild;
            }

            public final void clearDynamicZoom() {
                this._builder.clearDynamicZoom();
            }

            public final void clearManualZoom() {
                this._builder.clearManualZoom();
            }

            public final void clearStaticZoom() {
                this._builder.clearStaticZoom();
            }

            public final void clearUserLocationPositionPercentage() {
                this._builder.clearUserLocationPositionPercentage();
            }

            public final void clearZoom() {
                this._builder.clearZoom();
            }

            public final boolean getDynamicZoom() {
                return this._builder.getDynamicZoom();
            }

            public final boolean getManualZoom() {
                return this._builder.getManualZoom();
            }

            public final float getStaticZoom() {
                return this._builder.getStaticZoom();
            }

            public final MapBounds.PositionPercentage getUserLocationPositionPercentage() {
                MapBounds.PositionPercentage userLocationPositionPercentage = this._builder.getUserLocationPositionPercentage();
                x.e(userLocationPositionPercentage, "getUserLocationPositionPercentage(...)");
                return userLocationPositionPercentage;
            }

            public final MapBounds.PositionPercentage getUserLocationPositionPercentageOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapBoundsKtKt.getUserLocationPositionPercentageOrNull(dsl._builder);
            }

            public final MapBounds.ContinuouslyTrackUserLocation.ZoomCase getZoomCase() {
                MapBounds.ContinuouslyTrackUserLocation.ZoomCase zoomCase = this._builder.getZoomCase();
                x.e(zoomCase, "getZoomCase(...)");
                return zoomCase;
            }

            public final boolean hasDynamicZoom() {
                return this._builder.hasDynamicZoom();
            }

            public final boolean hasManualZoom() {
                return this._builder.hasManualZoom();
            }

            public final boolean hasStaticZoom() {
                return this._builder.hasStaticZoom();
            }

            public final boolean hasUserLocationPositionPercentage() {
                return this._builder.hasUserLocationPositionPercentage();
            }

            public final void setDynamicZoom(boolean z) {
                this._builder.setDynamicZoom(z);
            }

            public final void setManualZoom(boolean z) {
                this._builder.setManualZoom(z);
            }

            public final void setStaticZoom(float f2) {
                this._builder.setStaticZoom(f2);
            }

            public final void setUserLocationPositionPercentage(MapBounds.PositionPercentage positionPercentage) {
                x.f(positionPercentage, "value");
                this._builder.setUserLocationPositionPercentage(positionPercentage);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(MapBounds.ContinuouslyTrackUserLocation.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(MapBounds.ContinuouslyTrackUserLocation.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class MapFitAreaKt {
        public static final MapFitAreaKt INSTANCE = new MapFitAreaKt();

        private MapFitAreaKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final MapBounds.MapFitArea.Builder _builder;

            /* compiled from: WazeSource */
            public final class CoordinatesProxy extends c {
                private CoordinatesProxy() {
                }
            }

            private Dsl(MapBounds.MapFitArea.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ MapBounds.MapFitArea _build() {
                MapBounds.MapFitArea mapFitAreaBuild = this._builder.build();
                x.e(mapFitAreaBuild, "build(...)");
                return mapFitAreaBuild;
            }

            public final /* synthetic */ void addAllCoordinates(a aVar, Iterable iterable) {
                x.f(aVar, "<this>");
                x.f(iterable, "values");
                this._builder.addAllCoordinates(iterable);
            }

            public final /* synthetic */ void addCoordinates(a aVar, Position.IntPosition intPosition) {
                x.f(aVar, "<this>");
                x.f(intPosition, "value");
                this._builder.addCoordinates(intPosition);
            }

            public final void clearBoundsFactor() {
                this._builder.clearBoundsFactor();
            }

            public final /* synthetic */ void clearCoordinates(a aVar) {
                x.f(aVar, "<this>");
                this._builder.clearCoordinates();
            }

            public final void clearDisplayState() {
                this._builder.clearDisplayState();
            }

            public final float getBoundsFactor() {
                return this._builder.getBoundsFactor();
            }

            public final /* synthetic */ a getCoordinates() {
                List<Position.IntPosition> coordinatesList = this._builder.getCoordinatesList();
                x.e(coordinatesList, "getCoordinatesList(...)");
                return new a(coordinatesList);
            }

            public final MapDisplayState getDisplayState() {
                MapDisplayState displayState = this._builder.getDisplayState();
                x.e(displayState, "getDisplayState(...)");
                return displayState;
            }

            public final int getDisplayStateValue() {
                return this._builder.getDisplayStateValue();
            }

            public final /* synthetic */ void plusAssignAllCoordinates(a<Position.IntPosition, CoordinatesProxy> aVar, Iterable<Position.IntPosition> iterable) {
                x.f(aVar, "<this>");
                x.f(iterable, "values");
                addAllCoordinates(aVar, iterable);
            }

            public final /* synthetic */ void plusAssignCoordinates(a<Position.IntPosition, CoordinatesProxy> aVar, Position.IntPosition intPosition) {
                x.f(aVar, "<this>");
                x.f(intPosition, "value");
                addCoordinates(aVar, intPosition);
            }

            public final void setBoundsFactor(float f2) {
                this._builder.setBoundsFactor(f2);
            }

            public final /* synthetic */ void setCoordinates(a aVar, int i2, Position.IntPosition intPosition) {
                x.f(aVar, "<this>");
                x.f(intPosition, "value");
                this._builder.setCoordinates(i2, intPosition);
            }

            public final void setDisplayState(MapDisplayState mapDisplayState) {
                x.f(mapDisplayState, "value");
                this._builder.setDisplayState(mapDisplayState);
            }

            public final void setDisplayStateValue(int i2) {
                this._builder.setDisplayStateValue(i2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(MapBounds.MapFitArea.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(MapBounds.MapFitArea.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class MapFitContentKt {
        public static final MapFitContentKt INSTANCE = new MapFitContentKt();

        private MapFitContentKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final MapBounds.MapFitContent.Builder _builder;

            private Dsl(MapBounds.MapFitContent.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ MapBounds.MapFitContent _build() {
                MapBounds.MapFitContent mapFitContentBuild = this._builder.build();
                x.e(mapFitContentBuild, "build(...)");
                return mapFitContentBuild;
            }

            public final void clearBoundsFactor() {
                this._builder.clearBoundsFactor();
            }

            public final float getBoundsFactor() {
                return this._builder.getBoundsFactor();
            }

            public final void setBoundsFactor(float f2) {
                this._builder.setBoundsFactor(f2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(MapBounds.MapFitContent.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(MapBounds.MapFitContent.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class MapFitCoordinateKt {
        public static final MapFitCoordinateKt INSTANCE = new MapFitCoordinateKt();

        private MapFitCoordinateKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final MapBounds.MapFitCoordinate.Builder _builder;

            private Dsl(MapBounds.MapFitCoordinate.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ MapBounds.MapFitCoordinate _build() {
                MapBounds.MapFitCoordinate mapFitCoordinateBuild = this._builder.build();
                x.e(mapFitCoordinateBuild, "build(...)");
                return mapFitCoordinateBuild;
            }

            public final void clearCoordinate() {
                this._builder.clearCoordinate();
            }

            public final void clearDisplayState() {
                this._builder.clearDisplayState();
            }

            public final void clearOrientation() {
                this._builder.clearOrientation();
            }

            public final void clearPositionPercentage() {
                this._builder.clearPositionPercentage();
            }

            public final void clearZoom() {
                this._builder.clearZoom();
            }

            public final Position.IntPosition getCoordinate() {
                Position.IntPosition coordinate = this._builder.getCoordinate();
                x.e(coordinate, "getCoordinate(...)");
                return coordinate;
            }

            public final Position.IntPosition getCoordinateOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapBoundsKtKt.getCoordinateOrNull(dsl._builder);
            }

            public final MapDisplayState getDisplayState() {
                MapDisplayState displayState = this._builder.getDisplayState();
                x.e(displayState, "getDisplayState(...)");
                return displayState;
            }

            public final int getDisplayStateValue() {
                return this._builder.getDisplayStateValue();
            }

            public final float getOrientation() {
                return this._builder.getOrientation();
            }

            public final MapBounds.PositionPercentage getPositionPercentage() {
                MapBounds.PositionPercentage positionPercentage = this._builder.getPositionPercentage();
                x.e(positionPercentage, "getPositionPercentage(...)");
                return positionPercentage;
            }

            public final MapBounds.PositionPercentage getPositionPercentageOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapBoundsKtKt.getPositionPercentageOrNull(dsl._builder);
            }

            public final float getZoom() {
                return this._builder.getZoom();
            }

            public final boolean hasCoordinate() {
                return this._builder.hasCoordinate();
            }

            public final boolean hasPositionPercentage() {
                return this._builder.hasPositionPercentage();
            }

            public final void setCoordinate(Position.IntPosition intPosition) {
                x.f(intPosition, "value");
                this._builder.setCoordinate(intPosition);
            }

            public final void setDisplayState(MapDisplayState mapDisplayState) {
                x.f(mapDisplayState, "value");
                this._builder.setDisplayState(mapDisplayState);
            }

            public final void setDisplayStateValue(int i2) {
                this._builder.setDisplayStateValue(i2);
            }

            public final void setOrientation(float f2) {
                this._builder.setOrientation(f2);
            }

            public final void setPositionPercentage(MapBounds.PositionPercentage positionPercentage) {
                x.f(positionPercentage, "value");
                this._builder.setPositionPercentage(positionPercentage);
            }

            public final void setZoom(float f2) {
                this._builder.setZoom(f2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(MapBounds.MapFitCoordinate.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(MapBounds.MapFitCoordinate.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class PositionPercentageKt {
        public static final PositionPercentageKt INSTANCE = new PositionPercentageKt();

        private PositionPercentageKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final MapBounds.PositionPercentage.Builder _builder;

            private Dsl(MapBounds.PositionPercentage.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ MapBounds.PositionPercentage _build() {
                MapBounds.PositionPercentage positionPercentageBuild = this._builder.build();
                x.e(positionPercentageBuild, "build(...)");
                return positionPercentageBuild;
            }

            public final void clearXPercentage() {
                this._builder.clearXPercentage();
            }

            public final void clearYPercentage() {
                this._builder.clearYPercentage();
            }

            public final float getXPercentage() {
                return this._builder.getXPercentage();
            }

            public final float getYPercentage() {
                return this._builder.getYPercentage();
            }

            public final void setXPercentage(float f2) {
                this._builder.setXPercentage(f2);
            }

            public final void setYPercentage(float f2) {
                this._builder.setYPercentage(f2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(MapBounds.PositionPercentage.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(MapBounds.PositionPercentage.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MapBounds.Builder _builder;

        private Dsl(MapBounds.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MapBounds _build() {
            MapBounds mapBoundsBuild = this._builder.build();
            x.e(mapBoundsBuild, "build(...)");
            return mapBoundsBuild;
        }

        public final void clearAnimated() {
            this._builder.clearAnimated();
        }

        public final void clearContinuouslyTrackUserLocation() {
            this._builder.clearContinuouslyTrackUserLocation();
        }

        public final void clearFitArea() {
            this._builder.clearFitArea();
        }

        public final void clearFitContent() {
            this._builder.clearFitContent();
        }

        public final void clearFitCoordinate() {
            this._builder.clearFitCoordinate();
        }

        public final void clearMapBoundsFit() {
            this._builder.clearMapBoundsFit();
        }

        public final void clearNorthLock() {
            this._builder.clearNorthLock();
        }

        public final void clearViewPort() {
            this._builder.clearViewPort();
        }

        public final boolean getAnimated() {
            return this._builder.getAnimated();
        }

        public final MapBounds.ContinuouslyTrackUserLocation getContinuouslyTrackUserLocation() {
            MapBounds.ContinuouslyTrackUserLocation continuouslyTrackUserLocation = this._builder.getContinuouslyTrackUserLocation();
            x.e(continuouslyTrackUserLocation, "getContinuouslyTrackUserLocation(...)");
            return continuouslyTrackUserLocation;
        }

        public final MapBounds.MapFitArea getFitArea() {
            MapBounds.MapFitArea fitArea = this._builder.getFitArea();
            x.e(fitArea, "getFitArea(...)");
            return fitArea;
        }

        public final MapBounds.MapFitContent getFitContent() {
            MapBounds.MapFitContent fitContent = this._builder.getFitContent();
            x.e(fitContent, "getFitContent(...)");
            return fitContent;
        }

        public final MapBounds.MapFitCoordinate getFitCoordinate() {
            MapBounds.MapFitCoordinate fitCoordinate = this._builder.getFitCoordinate();
            x.e(fitCoordinate, "getFitCoordinate(...)");
            return fitCoordinate;
        }

        public final MapBounds.MapBoundsFitCase getMapBoundsFitCase() {
            MapBounds.MapBoundsFitCase mapBoundsFitCase = this._builder.getMapBoundsFitCase();
            x.e(mapBoundsFitCase, "getMapBoundsFitCase(...)");
            return mapBoundsFitCase;
        }

        public final NorthLockBehavior getNorthLock() {
            NorthLockBehavior northLock = this._builder.getNorthLock();
            x.e(northLock, "getNorthLock(...)");
            return northLock;
        }

        public final int getNorthLockValue() {
            return this._builder.getNorthLockValue();
        }

        public final RelativeViewPort getViewPort() {
            RelativeViewPort viewPort = this._builder.getViewPort();
            x.e(viewPort, "getViewPort(...)");
            return viewPort;
        }

        public final RelativeViewPort getViewPortOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MapBoundsKtKt.getViewPortOrNull(dsl._builder);
        }

        public final boolean hasContinuouslyTrackUserLocation() {
            return this._builder.hasContinuouslyTrackUserLocation();
        }

        public final boolean hasFitArea() {
            return this._builder.hasFitArea();
        }

        public final boolean hasFitContent() {
            return this._builder.hasFitContent();
        }

        public final boolean hasFitCoordinate() {
            return this._builder.hasFitCoordinate();
        }

        public final boolean hasNorthLock() {
            return this._builder.hasNorthLock();
        }

        public final boolean hasViewPort() {
            return this._builder.hasViewPort();
        }

        public final void setAnimated(boolean z) {
            this._builder.setAnimated(z);
        }

        public final void setContinuouslyTrackUserLocation(MapBounds.ContinuouslyTrackUserLocation continuouslyTrackUserLocation) {
            x.f(continuouslyTrackUserLocation, "value");
            this._builder.setContinuouslyTrackUserLocation(continuouslyTrackUserLocation);
        }

        public final void setFitArea(MapBounds.MapFitArea mapFitArea) {
            x.f(mapFitArea, "value");
            this._builder.setFitArea(mapFitArea);
        }

        public final void setFitContent(MapBounds.MapFitContent mapFitContent) {
            x.f(mapFitContent, "value");
            this._builder.setFitContent(mapFitContent);
        }

        public final void setFitCoordinate(MapBounds.MapFitCoordinate mapFitCoordinate) {
            x.f(mapFitCoordinate, "value");
            this._builder.setFitCoordinate(mapFitCoordinate);
        }

        public final void setNorthLock(NorthLockBehavior northLockBehavior) {
            x.f(northLockBehavior, "value");
            this._builder.setNorthLock(northLockBehavior);
        }

        public final void setNorthLockValue(int i2) {
            this._builder.setNorthLockValue(i2);
        }

        public final void setViewPort(RelativeViewPort relativeViewPort) {
            x.f(relativeViewPort, "value");
            this._builder.setViewPort(relativeViewPort);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MapBounds.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MapBounds.Builder builder, o oVar) {
            this(builder);
        }
    }
}
