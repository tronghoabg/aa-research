package com.waze.jni.protos.map;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.MapLineIntersectionMetadata;
import com.waze.jni.protos.map.MapLineIntersectionMetadataKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapLineIntersectionMetadataKtKt {
    /* renamed from: -initializemapLineIntersectionMetadata, reason: not valid java name */
    public static final MapLineIntersectionMetadata m26740initializemapLineIntersectionMetadata(l<? super MapLineIntersectionMetadataKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapLineIntersectionMetadataKt.Dsl.Companion companion = MapLineIntersectionMetadataKt.Dsl.Companion;
        MapLineIntersectionMetadata.Builder builderNewBuilder = MapLineIntersectionMetadata.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapLineIntersectionMetadataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapLineIntersectionMetadata copy(MapLineIntersectionMetadata mapLineIntersectionMetadata, l<? super MapLineIntersectionMetadataKt.Dsl, ab> lVar) {
        x.f(mapLineIntersectionMetadata, "<this>");
        x.f(lVar, "block");
        MapLineIntersectionMetadataKt.Dsl.Companion companion = MapLineIntersectionMetadataKt.Dsl.Companion;
        MapLineIntersectionMetadata.Builder builder = mapLineIntersectionMetadata.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapLineIntersectionMetadataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition getCoordinateOrNull(MapLineIntersectionMetadataOrBuilder mapLineIntersectionMetadataOrBuilder) {
        x.f(mapLineIntersectionMetadataOrBuilder, "<this>");
        if (mapLineIntersectionMetadataOrBuilder.hasCoordinate()) {
            return mapLineIntersectionMetadataOrBuilder.getCoordinate();
        }
        return null;
    }

    public static /* synthetic */ void getCoordinateOrNull$annotations(MapLineIntersectionMetadataOrBuilder mapLineIntersectionMetadataOrBuilder) {
    }

    public static final MapLine getMapLineOrNull(MapLineIntersectionMetadataOrBuilder mapLineIntersectionMetadataOrBuilder) {
        x.f(mapLineIntersectionMetadataOrBuilder, "<this>");
        if (mapLineIntersectionMetadataOrBuilder.hasMapLine()) {
            return mapLineIntersectionMetadataOrBuilder.getMapLine();
        }
        return null;
    }

    public static /* synthetic */ void getMapLineOrNull$annotations(MapLineIntersectionMetadataOrBuilder mapLineIntersectionMetadataOrBuilder) {
    }
}
