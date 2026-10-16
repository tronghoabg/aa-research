package com.waze.jni.protos.map;

import com.waze.jni.protos.map.MapMovementChanged;
import com.waze.jni.protos.map.MapMovementChangedKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapMovementChangedKtKt {
    /* renamed from: -initializemapMovementChanged, reason: not valid java name */
    public static final MapMovementChanged m26746initializemapMovementChanged(l<? super MapMovementChangedKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapMovementChangedKt.Dsl.Companion companion = MapMovementChangedKt.Dsl.Companion;
        MapMovementChanged.Builder builderNewBuilder = MapMovementChanged.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapMovementChangedKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapMovementChanged copy(MapMovementChanged mapMovementChanged, l<? super MapMovementChangedKt.Dsl, ab> lVar) {
        x.f(mapMovementChanged, "<this>");
        x.f(lVar, "block");
        MapMovementChangedKt.Dsl.Companion companion = MapMovementChangedKt.Dsl.Companion;
        MapMovementChanged.Builder builder = mapMovementChanged.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapMovementChangedKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
