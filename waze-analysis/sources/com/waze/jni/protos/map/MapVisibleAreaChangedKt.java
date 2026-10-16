package com.waze.jni.protos.map;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.MapVisibleAreaChanged;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapVisibleAreaChangedKt {
    public static final MapVisibleAreaChangedKt INSTANCE = new MapVisibleAreaChangedKt();

    private MapVisibleAreaChangedKt() {
    }

    /* renamed from: -initializecornersPolygon, reason: not valid java name */
    public final MapVisibleAreaChanged.CornersPolygon m26864initializecornersPolygon(l<? super CornersPolygonKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CornersPolygonKt.Dsl.Companion companion = CornersPolygonKt.Dsl.Companion;
        MapVisibleAreaChanged.CornersPolygon.Builder builderNewBuilder = MapVisibleAreaChanged.CornersPolygon.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CornersPolygonKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializemapVisibleArea, reason: not valid java name */
    public final MapVisibleAreaChanged.MapVisibleArea m26865initializemapVisibleArea(l<? super MapVisibleAreaKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapVisibleAreaKt.Dsl.Companion companion = MapVisibleAreaKt.Dsl.Companion;
        MapVisibleAreaChanged.MapVisibleArea.Builder builderNewBuilder = MapVisibleAreaChanged.MapVisibleArea.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapVisibleAreaKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class CornersPolygonKt {
        public static final CornersPolygonKt INSTANCE = new CornersPolygonKt();

        private CornersPolygonKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final MapVisibleAreaChanged.CornersPolygon.Builder _builder;

            private Dsl(MapVisibleAreaChanged.CornersPolygon.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ MapVisibleAreaChanged.CornersPolygon _build() {
                MapVisibleAreaChanged.CornersPolygon cornersPolygonBuild = this._builder.build();
                x.e(cornersPolygonBuild, "build(...)");
                return cornersPolygonBuild;
            }

            public final void clearBottomLeft() {
                this._builder.clearBottomLeft();
            }

            public final void clearBottomRight() {
                this._builder.clearBottomRight();
            }

            public final void clearTopLeft() {
                this._builder.clearTopLeft();
            }

            public final void clearTopRight() {
                this._builder.clearTopRight();
            }

            public final Position.IntPosition getBottomLeft() {
                Position.IntPosition bottomLeft = this._builder.getBottomLeft();
                x.e(bottomLeft, "getBottomLeft(...)");
                return bottomLeft;
            }

            public final Position.IntPosition getBottomLeftOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapVisibleAreaChangedKtKt.getBottomLeftOrNull(dsl._builder);
            }

            public final Position.IntPosition getBottomRight() {
                Position.IntPosition bottomRight = this._builder.getBottomRight();
                x.e(bottomRight, "getBottomRight(...)");
                return bottomRight;
            }

            public final Position.IntPosition getBottomRightOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapVisibleAreaChangedKtKt.getBottomRightOrNull(dsl._builder);
            }

            public final Position.IntPosition getTopLeft() {
                Position.IntPosition topLeft = this._builder.getTopLeft();
                x.e(topLeft, "getTopLeft(...)");
                return topLeft;
            }

            public final Position.IntPosition getTopLeftOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapVisibleAreaChangedKtKt.getTopLeftOrNull(dsl._builder);
            }

            public final Position.IntPosition getTopRight() {
                Position.IntPosition topRight = this._builder.getTopRight();
                x.e(topRight, "getTopRight(...)");
                return topRight;
            }

            public final Position.IntPosition getTopRightOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapVisibleAreaChangedKtKt.getTopRightOrNull(dsl._builder);
            }

            public final boolean hasBottomLeft() {
                return this._builder.hasBottomLeft();
            }

            public final boolean hasBottomRight() {
                return this._builder.hasBottomRight();
            }

            public final boolean hasTopLeft() {
                return this._builder.hasTopLeft();
            }

            public final boolean hasTopRight() {
                return this._builder.hasTopRight();
            }

            public final void setBottomLeft(Position.IntPosition intPosition) {
                x.f(intPosition, "value");
                this._builder.setBottomLeft(intPosition);
            }

            public final void setBottomRight(Position.IntPosition intPosition) {
                x.f(intPosition, "value");
                this._builder.setBottomRight(intPosition);
            }

            public final void setTopLeft(Position.IntPosition intPosition) {
                x.f(intPosition, "value");
                this._builder.setTopLeft(intPosition);
            }

            public final void setTopRight(Position.IntPosition intPosition) {
                x.f(intPosition, "value");
                this._builder.setTopRight(intPosition);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(MapVisibleAreaChanged.CornersPolygon.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(MapVisibleAreaChanged.CornersPolygon.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class MapVisibleAreaKt {
        public static final MapVisibleAreaKt INSTANCE = new MapVisibleAreaKt();

        private MapVisibleAreaKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final MapVisibleAreaChanged.MapVisibleArea.Builder _builder;

            private Dsl(MapVisibleAreaChanged.MapVisibleArea.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ MapVisibleAreaChanged.MapVisibleArea _build() {
                MapVisibleAreaChanged.MapVisibleArea mapVisibleAreaBuild = this._builder.build();
                x.e(mapVisibleAreaBuild, "build(...)");
                return mapVisibleAreaBuild;
            }

            public final void clearCameraAngleDegrees() {
                this._builder.clearCameraAngleDegrees();
            }

            public final void clearFullscreenCornersPolygon() {
                this._builder.clearFullscreenCornersPolygon();
            }

            public final void clearOrientationDegrees() {
                this._builder.clearOrientationDegrees();
            }

            public final void clearViewportCenter() {
                this._builder.clearViewportCenter();
            }

            public final void clearViewportCornersPolygon() {
                this._builder.clearViewportCornersPolygon();
            }

            public final void clearZoomNormalized() {
                this._builder.clearZoomNormalized();
            }

            public final float getCameraAngleDegrees() {
                return this._builder.getCameraAngleDegrees();
            }

            public final MapVisibleAreaChanged.CornersPolygon getFullscreenCornersPolygon() {
                MapVisibleAreaChanged.CornersPolygon fullscreenCornersPolygon = this._builder.getFullscreenCornersPolygon();
                x.e(fullscreenCornersPolygon, "getFullscreenCornersPolygon(...)");
                return fullscreenCornersPolygon;
            }

            public final MapVisibleAreaChanged.CornersPolygon getFullscreenCornersPolygonOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapVisibleAreaChangedKtKt.getFullscreenCornersPolygonOrNull(dsl._builder);
            }

            public final float getOrientationDegrees() {
                return this._builder.getOrientationDegrees();
            }

            public final Position.IntPosition getViewportCenter() {
                Position.IntPosition viewportCenter = this._builder.getViewportCenter();
                x.e(viewportCenter, "getViewportCenter(...)");
                return viewportCenter;
            }

            public final Position.IntPosition getViewportCenterOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapVisibleAreaChangedKtKt.getViewportCenterOrNull(dsl._builder);
            }

            public final MapVisibleAreaChanged.CornersPolygon getViewportCornersPolygon() {
                MapVisibleAreaChanged.CornersPolygon viewportCornersPolygon = this._builder.getViewportCornersPolygon();
                x.e(viewportCornersPolygon, "getViewportCornersPolygon(...)");
                return viewportCornersPolygon;
            }

            public final MapVisibleAreaChanged.CornersPolygon getViewportCornersPolygonOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapVisibleAreaChangedKtKt.getViewportCornersPolygonOrNull(dsl._builder);
            }

            public final float getZoomNormalized() {
                return this._builder.getZoomNormalized();
            }

            public final boolean hasFullscreenCornersPolygon() {
                return this._builder.hasFullscreenCornersPolygon();
            }

            public final boolean hasViewportCenter() {
                return this._builder.hasViewportCenter();
            }

            public final boolean hasViewportCornersPolygon() {
                return this._builder.hasViewportCornersPolygon();
            }

            public final void setCameraAngleDegrees(float f2) {
                this._builder.setCameraAngleDegrees(f2);
            }

            public final void setFullscreenCornersPolygon(MapVisibleAreaChanged.CornersPolygon cornersPolygon) {
                x.f(cornersPolygon, "value");
                this._builder.setFullscreenCornersPolygon(cornersPolygon);
            }

            public final void setOrientationDegrees(float f2) {
                this._builder.setOrientationDegrees(f2);
            }

            public final void setViewportCenter(Position.IntPosition intPosition) {
                x.f(intPosition, "value");
                this._builder.setViewportCenter(intPosition);
            }

            public final void setViewportCornersPolygon(MapVisibleAreaChanged.CornersPolygon cornersPolygon) {
                x.f(cornersPolygon, "value");
                this._builder.setViewportCornersPolygon(cornersPolygon);
            }

            public final void setZoomNormalized(float f2) {
                this._builder.setZoomNormalized(f2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(MapVisibleAreaChanged.MapVisibleArea.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(MapVisibleAreaChanged.MapVisibleArea.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MapVisibleAreaChanged.Builder _builder;

        private Dsl(MapVisibleAreaChanged.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MapVisibleAreaChanged _build() {
            MapVisibleAreaChanged mapVisibleAreaChangedBuild = this._builder.build();
            x.e(mapVisibleAreaChangedBuild, "build(...)");
            return mapVisibleAreaChangedBuild;
        }

        public final void clearNewArea() {
            this._builder.clearNewArea();
        }

        public final MapVisibleAreaChanged.MapVisibleArea getNewArea() {
            MapVisibleAreaChanged.MapVisibleArea newArea = this._builder.getNewArea();
            x.e(newArea, "getNewArea(...)");
            return newArea;
        }

        public final MapVisibleAreaChanged.MapVisibleArea getNewAreaOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MapVisibleAreaChangedKtKt.getNewAreaOrNull(dsl._builder);
        }

        public final boolean hasNewArea() {
            return this._builder.hasNewArea();
        }

        public final void setNewArea(MapVisibleAreaChanged.MapVisibleArea mapVisibleArea) {
            x.f(mapVisibleArea, "value");
            this._builder.setNewArea(mapVisibleArea);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MapVisibleAreaChanged.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MapVisibleAreaChanged.Builder builder, o oVar) {
            this(builder);
        }
    }
}
