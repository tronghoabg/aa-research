package com.waze.jni.protos.map;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.MapVisibleAreaChanged;
import com.waze.jni.protos.map.MapVisibleAreaChangedKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapVisibleAreaChangedKtKt {
    /* renamed from: -initializemapVisibleAreaChanged, reason: not valid java name */
    public static final MapVisibleAreaChanged m26866initializemapVisibleAreaChanged(l<? super MapVisibleAreaChangedKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapVisibleAreaChangedKt.Dsl.Companion companion = MapVisibleAreaChangedKt.Dsl.Companion;
        MapVisibleAreaChanged.Builder builderNewBuilder = MapVisibleAreaChanged.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapVisibleAreaChangedKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapVisibleAreaChanged.CornersPolygon copy(MapVisibleAreaChanged.CornersPolygon cornersPolygon, l<? super MapVisibleAreaChangedKt.CornersPolygonKt.Dsl, ab> lVar) {
        x.f(cornersPolygon, "<this>");
        x.f(lVar, "block");
        MapVisibleAreaChangedKt.CornersPolygonKt.Dsl.Companion companion = MapVisibleAreaChangedKt.CornersPolygonKt.Dsl.Companion;
        MapVisibleAreaChanged.CornersPolygon.Builder builder = cornersPolygon.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapVisibleAreaChangedKt.CornersPolygonKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition getBottomLeftOrNull(MapVisibleAreaChanged.CornersPolygonOrBuilder cornersPolygonOrBuilder) {
        x.f(cornersPolygonOrBuilder, "<this>");
        if (cornersPolygonOrBuilder.hasBottomLeft()) {
            return cornersPolygonOrBuilder.getBottomLeft();
        }
        return null;
    }

    public static /* synthetic */ void getBottomLeftOrNull$annotations(MapVisibleAreaChanged.CornersPolygonOrBuilder cornersPolygonOrBuilder) {
    }

    public static final Position.IntPosition getBottomRightOrNull(MapVisibleAreaChanged.CornersPolygonOrBuilder cornersPolygonOrBuilder) {
        x.f(cornersPolygonOrBuilder, "<this>");
        if (cornersPolygonOrBuilder.hasBottomRight()) {
            return cornersPolygonOrBuilder.getBottomRight();
        }
        return null;
    }

    public static /* synthetic */ void getBottomRightOrNull$annotations(MapVisibleAreaChanged.CornersPolygonOrBuilder cornersPolygonOrBuilder) {
    }

    public static final MapVisibleAreaChanged.CornersPolygon getFullscreenCornersPolygonOrNull(MapVisibleAreaChanged.MapVisibleAreaOrBuilder mapVisibleAreaOrBuilder) {
        x.f(mapVisibleAreaOrBuilder, "<this>");
        if (mapVisibleAreaOrBuilder.hasFullscreenCornersPolygon()) {
            return mapVisibleAreaOrBuilder.getFullscreenCornersPolygon();
        }
        return null;
    }

    public static /* synthetic */ void getFullscreenCornersPolygonOrNull$annotations(MapVisibleAreaChanged.MapVisibleAreaOrBuilder mapVisibleAreaOrBuilder) {
    }

    public static final MapVisibleAreaChanged.MapVisibleArea getNewAreaOrNull(MapVisibleAreaChangedOrBuilder mapVisibleAreaChangedOrBuilder) {
        x.f(mapVisibleAreaChangedOrBuilder, "<this>");
        if (mapVisibleAreaChangedOrBuilder.hasNewArea()) {
            return mapVisibleAreaChangedOrBuilder.getNewArea();
        }
        return null;
    }

    public static /* synthetic */ void getNewAreaOrNull$annotations(MapVisibleAreaChangedOrBuilder mapVisibleAreaChangedOrBuilder) {
    }

    public static final Position.IntPosition getTopLeftOrNull(MapVisibleAreaChanged.CornersPolygonOrBuilder cornersPolygonOrBuilder) {
        x.f(cornersPolygonOrBuilder, "<this>");
        if (cornersPolygonOrBuilder.hasTopLeft()) {
            return cornersPolygonOrBuilder.getTopLeft();
        }
        return null;
    }

    public static /* synthetic */ void getTopLeftOrNull$annotations(MapVisibleAreaChanged.CornersPolygonOrBuilder cornersPolygonOrBuilder) {
    }

    public static final Position.IntPosition getTopRightOrNull(MapVisibleAreaChanged.CornersPolygonOrBuilder cornersPolygonOrBuilder) {
        x.f(cornersPolygonOrBuilder, "<this>");
        if (cornersPolygonOrBuilder.hasTopRight()) {
            return cornersPolygonOrBuilder.getTopRight();
        }
        return null;
    }

    public static /* synthetic */ void getTopRightOrNull$annotations(MapVisibleAreaChanged.CornersPolygonOrBuilder cornersPolygonOrBuilder) {
    }

    public static final Position.IntPosition getViewportCenterOrNull(MapVisibleAreaChanged.MapVisibleAreaOrBuilder mapVisibleAreaOrBuilder) {
        x.f(mapVisibleAreaOrBuilder, "<this>");
        if (mapVisibleAreaOrBuilder.hasViewportCenter()) {
            return mapVisibleAreaOrBuilder.getViewportCenter();
        }
        return null;
    }

    public static /* synthetic */ void getViewportCenterOrNull$annotations(MapVisibleAreaChanged.MapVisibleAreaOrBuilder mapVisibleAreaOrBuilder) {
    }

    public static final MapVisibleAreaChanged.CornersPolygon getViewportCornersPolygonOrNull(MapVisibleAreaChanged.MapVisibleAreaOrBuilder mapVisibleAreaOrBuilder) {
        x.f(mapVisibleAreaOrBuilder, "<this>");
        if (mapVisibleAreaOrBuilder.hasViewportCornersPolygon()) {
            return mapVisibleAreaOrBuilder.getViewportCornersPolygon();
        }
        return null;
    }

    public static /* synthetic */ void getViewportCornersPolygonOrNull$annotations(MapVisibleAreaChanged.MapVisibleAreaOrBuilder mapVisibleAreaOrBuilder) {
    }

    public static final MapVisibleAreaChanged.MapVisibleArea copy(MapVisibleAreaChanged.MapVisibleArea mapVisibleArea, l<? super MapVisibleAreaChangedKt.MapVisibleAreaKt.Dsl, ab> lVar) {
        x.f(mapVisibleArea, "<this>");
        x.f(lVar, "block");
        MapVisibleAreaChangedKt.MapVisibleAreaKt.Dsl.Companion companion = MapVisibleAreaChangedKt.MapVisibleAreaKt.Dsl.Companion;
        MapVisibleAreaChanged.MapVisibleArea.Builder builder = mapVisibleArea.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapVisibleAreaChangedKt.MapVisibleAreaKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapVisibleAreaChanged copy(MapVisibleAreaChanged mapVisibleAreaChanged, l<? super MapVisibleAreaChangedKt.Dsl, ab> lVar) {
        x.f(mapVisibleAreaChanged, "<this>");
        x.f(lVar, "block");
        MapVisibleAreaChangedKt.Dsl.Companion companion = MapVisibleAreaChangedKt.Dsl.Companion;
        MapVisibleAreaChanged.Builder builder = mapVisibleAreaChanged.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapVisibleAreaChangedKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
