package com.waze.jni.protos.map;

import com.waze.jni.protos.map.Polyline;
import com.waze.jni.protos.map.PolylineKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PolylineKtKt {
    /* renamed from: -initializepolyline, reason: not valid java name */
    public static final Polyline m26968initializepolyline(l<? super PolylineKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PolylineKt.Dsl.Companion companion = PolylineKt.Dsl.Companion;
        Polyline.Builder builderNewBuilder = Polyline.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PolylineKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Polyline copy(Polyline polyline, l<? super PolylineKt.Dsl, ab> lVar) {
        x.f(polyline, "<this>");
        x.f(lVar, "block");
        PolylineKt.Dsl.Companion companion = PolylineKt.Dsl.Companion;
        Polyline.Builder builder = polyline.toBuilder();
        x.e(builder, "toBuilder(...)");
        PolylineKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
