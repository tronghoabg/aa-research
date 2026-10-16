package com.waze.jni.protos.map;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.MapLine;
import com.waze.jni.protos.map.MapLineKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapLineKtKt {
    /* renamed from: -initializemapLine, reason: not valid java name */
    public static final MapLine m26741initializemapLine(l<? super MapLineKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapLineKt.Dsl.Companion companion = MapLineKt.Dsl.Companion;
        MapLine.Builder builderNewBuilder = MapLine.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapLineKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapLine copy(MapLine mapLine, l<? super MapLineKt.Dsl, ab> lVar) {
        x.f(mapLine, "<this>");
        x.f(lVar, "block");
        MapLineKt.Dsl.Companion companion = MapLineKt.Dsl.Companion;
        MapLine.Builder builder = mapLine.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapLineKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition getCenterPositionOrNull(MapLineOrBuilder mapLineOrBuilder) {
        x.f(mapLineOrBuilder, "<this>");
        if (mapLineOrBuilder.hasCenterPosition()) {
            return mapLineOrBuilder.getCenterPosition();
        }
        return null;
    }

    public static /* synthetic */ void getCenterPositionOrNull$annotations(MapLineOrBuilder mapLineOrBuilder) {
    }
}
