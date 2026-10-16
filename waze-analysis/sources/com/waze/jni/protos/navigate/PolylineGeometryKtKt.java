package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.PolylineGeometry;
import com.waze.jni.protos.navigate.PolylineGeometryKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PolylineGeometryKtKt {
    /* renamed from: -initializepolylineGeometry, reason: not valid java name */
    public static final PolylineGeometry m27461initializepolylineGeometry(l<? super PolylineGeometryKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PolylineGeometryKt.Dsl.Companion companion = PolylineGeometryKt.Dsl.Companion;
        PolylineGeometry.Builder builderNewBuilder = PolylineGeometry.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PolylineGeometryKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PolylineGeometry copy(PolylineGeometry polylineGeometry, l<? super PolylineGeometryKt.Dsl, ab> lVar) {
        x.f(polylineGeometry, "<this>");
        x.f(lVar, "block");
        PolylineGeometryKt.Dsl.Companion companion = PolylineGeometryKt.Dsl.Companion;
        PolylineGeometry.Builder builder = polylineGeometry.toBuilder();
        x.e(builder, "toBuilder(...)");
        PolylineGeometryKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
