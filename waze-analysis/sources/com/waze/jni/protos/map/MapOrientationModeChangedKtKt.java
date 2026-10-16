package com.waze.jni.protos.map;

import com.waze.jni.protos.map.MapOrientationModeChanged;
import com.waze.jni.protos.map.MapOrientationModeChangedKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapOrientationModeChangedKtKt {
    /* renamed from: -initializemapOrientationModeChanged, reason: not valid java name */
    public static final MapOrientationModeChanged m26756initializemapOrientationModeChanged(l<? super MapOrientationModeChangedKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapOrientationModeChangedKt.Dsl.Companion companion = MapOrientationModeChangedKt.Dsl.Companion;
        MapOrientationModeChanged.Builder builderNewBuilder = MapOrientationModeChanged.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapOrientationModeChangedKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapOrientationModeChanged copy(MapOrientationModeChanged mapOrientationModeChanged, l<? super MapOrientationModeChangedKt.Dsl, ab> lVar) {
        x.f(mapOrientationModeChanged, "<this>");
        x.f(lVar, "block");
        MapOrientationModeChangedKt.Dsl.Companion companion = MapOrientationModeChangedKt.Dsl.Companion;
        MapOrientationModeChanged.Builder builder = mapOrientationModeChanged.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapOrientationModeChangedKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
