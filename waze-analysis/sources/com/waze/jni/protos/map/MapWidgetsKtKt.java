package com.waze.jni.protos.map;

import com.waze.jni.protos.NativeBitmap;
import com.waze.jni.protos.map.MapWidgets;
import com.waze.jni.protos.map.MapWidgetsKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapWidgetsKtKt {
    /* renamed from: -initializemapWidgets, reason: not valid java name */
    public static final MapWidgets m26883initializemapWidgets(l<? super MapWidgetsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapWidgetsKt.Dsl.Companion companion = MapWidgetsKt.Dsl.Companion;
        MapWidgets.Builder builderNewBuilder = MapWidgets.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapWidgetsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapWidgets.Pill copy(MapWidgets.Pill pill, l<? super MapWidgetsKt.PillKt.Dsl, ab> lVar) {
        x.f(pill, "<this>");
        x.f(lVar, "block");
        MapWidgetsKt.PillKt.Dsl.Companion companion = MapWidgetsKt.PillKt.Dsl.Companion;
        MapWidgets.Pill.Builder builder = pill.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapWidgetsKt.PillKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapWidgets.Pill getActivePillOrNull(MapWidgetsOrBuilder mapWidgetsOrBuilder) {
        x.f(mapWidgetsOrBuilder, "<this>");
        if (mapWidgetsOrBuilder.hasActivePill()) {
            return mapWidgetsOrBuilder.getActivePill();
        }
        return null;
    }

    public static /* synthetic */ void getActivePillOrNull$annotations(MapWidgetsOrBuilder mapWidgetsOrBuilder) {
    }

    public static final NativeBitmap getImageOrNull(MapWidgets.PillOrBuilder pillOrBuilder) {
        x.f(pillOrBuilder, "<this>");
        if (pillOrBuilder.hasImage()) {
            return pillOrBuilder.getImage();
        }
        return null;
    }

    public static /* synthetic */ void getImageOrNull$annotations(MapWidgets.PillOrBuilder pillOrBuilder) {
    }

    public static final MapWidgets copy(MapWidgets mapWidgets, l<? super MapWidgetsKt.Dsl, ab> lVar) {
        x.f(mapWidgets, "<this>");
        x.f(lVar, "block");
        MapWidgetsKt.Dsl.Companion companion = MapWidgetsKt.Dsl.Companion;
        MapWidgets.Builder builder = mapWidgets.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapWidgetsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
