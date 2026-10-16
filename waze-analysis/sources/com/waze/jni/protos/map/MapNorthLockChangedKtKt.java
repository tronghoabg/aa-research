package com.waze.jni.protos.map;

import com.waze.jni.protos.map.MapNorthLockChanged;
import com.waze.jni.protos.map.MapNorthLockChangedKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapNorthLockChangedKtKt {
    /* renamed from: -initializemapNorthLockChanged, reason: not valid java name */
    public static final MapNorthLockChanged m26751initializemapNorthLockChanged(l<? super MapNorthLockChangedKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapNorthLockChangedKt.Dsl.Companion companion = MapNorthLockChangedKt.Dsl.Companion;
        MapNorthLockChanged.Builder builderNewBuilder = MapNorthLockChanged.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapNorthLockChangedKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapNorthLockChanged copy(MapNorthLockChanged mapNorthLockChanged, l<? super MapNorthLockChangedKt.Dsl, ab> lVar) {
        x.f(mapNorthLockChanged, "<this>");
        x.f(lVar, "block");
        MapNorthLockChangedKt.Dsl.Companion companion = MapNorthLockChangedKt.Dsl.Companion;
        MapNorthLockChanged.Builder builder = mapNorthLockChanged.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapNorthLockChangedKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
