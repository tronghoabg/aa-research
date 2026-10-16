package com.waze.jni.protos.map;

import com.waze.jni.protos.map.Polygon;
import com.waze.jni.protos.map.PolygonKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PolygonKtKt {
    /* renamed from: -initializepolygon, reason: not valid java name */
    public static final Polygon m26958initializepolygon(l<? super PolygonKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PolygonKt.Dsl.Companion companion = PolygonKt.Dsl.Companion;
        Polygon.Builder builderNewBuilder = Polygon.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PolygonKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Polygon copy(Polygon polygon, l<? super PolygonKt.Dsl, ab> lVar) {
        x.f(polygon, "<this>");
        x.f(lVar, "block");
        PolygonKt.Dsl.Companion companion = PolygonKt.Dsl.Companion;
        Polygon.Builder builder = polygon.toBuilder();
        x.e(builder, "toBuilder(...)");
        PolygonKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
