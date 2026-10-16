package com.waze.jni.protos.map;

import com.waze.jni.protos.map.ExtendedPolygon;
import com.waze.jni.protos.map.ExtendedPolygonKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ExtendedPolygonKtKt {
    /* renamed from: -initializeextendedPolygon, reason: not valid java name */
    public static final ExtendedPolygon m26449initializeextendedPolygon(l<? super ExtendedPolygonKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ExtendedPolygonKt.Dsl.Companion companion = ExtendedPolygonKt.Dsl.Companion;
        ExtendedPolygon.Builder builderNewBuilder = ExtendedPolygon.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ExtendedPolygonKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ExtendedPolygon copy(ExtendedPolygon extendedPolygon, l<? super ExtendedPolygonKt.Dsl, ab> lVar) {
        x.f(extendedPolygon, "<this>");
        x.f(lVar, "block");
        ExtendedPolygonKt.Dsl.Companion companion = ExtendedPolygonKt.Dsl.Companion;
        ExtendedPolygon.Builder builder = extendedPolygon.toBuilder();
        x.e(builder, "toBuilder(...)");
        ExtendedPolygonKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Polygon getPolygonOrNull(ExtendedPolygonOrBuilder extendedPolygonOrBuilder) {
        x.f(extendedPolygonOrBuilder, "<this>");
        if (extendedPolygonOrBuilder.hasPolygon()) {
            return extendedPolygonOrBuilder.getPolygon();
        }
        return null;
    }

    public static /* synthetic */ void getPolygonOrNull$annotations(ExtendedPolygonOrBuilder extendedPolygonOrBuilder) {
    }
}
