package com.waze.jni.protos.map;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.MapBounds;
import com.waze.jni.protos.map.MapBoundsKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapBoundsKtKt {
    /* renamed from: -initializemapBounds, reason: not valid java name */
    public static final MapBounds m26585initializemapBounds(l<? super MapBoundsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapBoundsKt.Dsl.Companion companion = MapBoundsKt.Dsl.Companion;
        MapBounds.Builder builderNewBuilder = MapBounds.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapBoundsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapBounds.ActivelyTrackUser copy(MapBounds.ActivelyTrackUser activelyTrackUser, l<? super MapBoundsKt.ActivelyTrackUserKt.Dsl, ab> lVar) {
        x.f(activelyTrackUser, "<this>");
        x.f(lVar, "block");
        MapBoundsKt.ActivelyTrackUserKt.Dsl.Companion companion = MapBoundsKt.ActivelyTrackUserKt.Dsl.Companion;
        MapBounds.ActivelyTrackUser.Builder builder = activelyTrackUser.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapBoundsKt.ActivelyTrackUserKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapBounds.ContinuouslyTrackUserLocation getContinuouslyTrackUserLocationOrNull(MapBoundsOrBuilder mapBoundsOrBuilder) {
        x.f(mapBoundsOrBuilder, "<this>");
        if (mapBoundsOrBuilder.hasContinuouslyTrackUserLocation()) {
            return mapBoundsOrBuilder.getContinuouslyTrackUserLocation();
        }
        return null;
    }

    public static /* synthetic */ void getContinuouslyTrackUserLocationOrNull$annotations(MapBoundsOrBuilder mapBoundsOrBuilder) {
    }

    public static final Position.IntPosition getCoordinateOrNull(MapBounds.MapFitCoordinateOrBuilder mapFitCoordinateOrBuilder) {
        x.f(mapFitCoordinateOrBuilder, "<this>");
        if (mapFitCoordinateOrBuilder.hasCoordinate()) {
            return mapFitCoordinateOrBuilder.getCoordinate();
        }
        return null;
    }

    public static /* synthetic */ void getCoordinateOrNull$annotations(MapBounds.MapFitCoordinateOrBuilder mapFitCoordinateOrBuilder) {
    }

    public static final MapBounds.MapFitArea getFitAreaOrNull(MapBoundsOrBuilder mapBoundsOrBuilder) {
        x.f(mapBoundsOrBuilder, "<this>");
        if (mapBoundsOrBuilder.hasFitArea()) {
            return mapBoundsOrBuilder.getFitArea();
        }
        return null;
    }

    public static /* synthetic */ void getFitAreaOrNull$annotations(MapBoundsOrBuilder mapBoundsOrBuilder) {
    }

    public static final MapBounds.MapFitContent getFitContentOrNull(MapBoundsOrBuilder mapBoundsOrBuilder) {
        x.f(mapBoundsOrBuilder, "<this>");
        if (mapBoundsOrBuilder.hasFitContent()) {
            return mapBoundsOrBuilder.getFitContent();
        }
        return null;
    }

    public static /* synthetic */ void getFitContentOrNull$annotations(MapBoundsOrBuilder mapBoundsOrBuilder) {
    }

    public static final MapBounds.MapFitCoordinate getFitCoordinateOrNull(MapBoundsOrBuilder mapBoundsOrBuilder) {
        x.f(mapBoundsOrBuilder, "<this>");
        if (mapBoundsOrBuilder.hasFitCoordinate()) {
            return mapBoundsOrBuilder.getFitCoordinate();
        }
        return null;
    }

    public static /* synthetic */ void getFitCoordinateOrNull$annotations(MapBoundsOrBuilder mapBoundsOrBuilder) {
    }

    public static final MapBounds.PositionPercentage getPositionPercentageOrNull(MapBounds.MapFitCoordinateOrBuilder mapFitCoordinateOrBuilder) {
        x.f(mapFitCoordinateOrBuilder, "<this>");
        if (mapFitCoordinateOrBuilder.hasPositionPercentage()) {
            return mapFitCoordinateOrBuilder.getPositionPercentage();
        }
        return null;
    }

    public static /* synthetic */ void getPositionPercentageOrNull$annotations(MapBounds.MapFitCoordinateOrBuilder mapFitCoordinateOrBuilder) {
    }

    public static final MapBounds.PositionPercentage getUserLocationPositionPercentageOrNull(MapBounds.ContinuouslyTrackUserLocationOrBuilder continuouslyTrackUserLocationOrBuilder) {
        x.f(continuouslyTrackUserLocationOrBuilder, "<this>");
        if (continuouslyTrackUserLocationOrBuilder.hasUserLocationPositionPercentage()) {
            return continuouslyTrackUserLocationOrBuilder.getUserLocationPositionPercentage();
        }
        return null;
    }

    public static /* synthetic */ void getUserLocationPositionPercentageOrNull$annotations(MapBounds.ContinuouslyTrackUserLocationOrBuilder continuouslyTrackUserLocationOrBuilder) {
    }

    public static final RelativeViewPort getViewPortOrNull(MapBoundsOrBuilder mapBoundsOrBuilder) {
        x.f(mapBoundsOrBuilder, "<this>");
        if (mapBoundsOrBuilder.hasViewPort()) {
            return mapBoundsOrBuilder.getViewPort();
        }
        return null;
    }

    public static /* synthetic */ void getViewPortOrNull$annotations(MapBoundsOrBuilder mapBoundsOrBuilder) {
    }

    public static final MapBounds.ContinuouslyTrackUserLocation copy(MapBounds.ContinuouslyTrackUserLocation continuouslyTrackUserLocation, l<? super MapBoundsKt.ContinuouslyTrackUserLocationKt.Dsl, ab> lVar) {
        x.f(continuouslyTrackUserLocation, "<this>");
        x.f(lVar, "block");
        MapBoundsKt.ContinuouslyTrackUserLocationKt.Dsl.Companion companion = MapBoundsKt.ContinuouslyTrackUserLocationKt.Dsl.Companion;
        MapBounds.ContinuouslyTrackUserLocation.Builder builder = continuouslyTrackUserLocation.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapBoundsKt.ContinuouslyTrackUserLocationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapBounds.MapFitArea copy(MapBounds.MapFitArea mapFitArea, l<? super MapBoundsKt.MapFitAreaKt.Dsl, ab> lVar) {
        x.f(mapFitArea, "<this>");
        x.f(lVar, "block");
        MapBoundsKt.MapFitAreaKt.Dsl.Companion companion = MapBoundsKt.MapFitAreaKt.Dsl.Companion;
        MapBounds.MapFitArea.Builder builder = mapFitArea.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapBoundsKt.MapFitAreaKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapBounds.MapFitContent copy(MapBounds.MapFitContent mapFitContent, l<? super MapBoundsKt.MapFitContentKt.Dsl, ab> lVar) {
        x.f(mapFitContent, "<this>");
        x.f(lVar, "block");
        MapBoundsKt.MapFitContentKt.Dsl.Companion companion = MapBoundsKt.MapFitContentKt.Dsl.Companion;
        MapBounds.MapFitContent.Builder builder = mapFitContent.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapBoundsKt.MapFitContentKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapBounds.MapFitCoordinate copy(MapBounds.MapFitCoordinate mapFitCoordinate, l<? super MapBoundsKt.MapFitCoordinateKt.Dsl, ab> lVar) {
        x.f(mapFitCoordinate, "<this>");
        x.f(lVar, "block");
        MapBoundsKt.MapFitCoordinateKt.Dsl.Companion companion = MapBoundsKt.MapFitCoordinateKt.Dsl.Companion;
        MapBounds.MapFitCoordinate.Builder builder = mapFitCoordinate.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapBoundsKt.MapFitCoordinateKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapBounds.PositionPercentage copy(MapBounds.PositionPercentage positionPercentage, l<? super MapBoundsKt.PositionPercentageKt.Dsl, ab> lVar) {
        x.f(positionPercentage, "<this>");
        x.f(lVar, "block");
        MapBoundsKt.PositionPercentageKt.Dsl.Companion companion = MapBoundsKt.PositionPercentageKt.Dsl.Companion;
        MapBounds.PositionPercentage.Builder builder = positionPercentage.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapBoundsKt.PositionPercentageKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapBounds copy(MapBounds mapBounds, l<? super MapBoundsKt.Dsl, ab> lVar) {
        x.f(mapBounds, "<this>");
        x.f(lVar, "block");
        MapBoundsKt.Dsl.Companion companion = MapBoundsKt.Dsl.Companion;
        MapBounds.Builder builder = mapBounds.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapBoundsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
