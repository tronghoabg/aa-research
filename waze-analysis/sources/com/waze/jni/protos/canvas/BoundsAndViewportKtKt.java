package com.waze.jni.protos.canvas;

import com.waze.jni.protos.canvas.BoundsAndViewport;
import com.waze.jni.protos.canvas.BoundsAndViewportKt;
import com.waze.jni.protos.map.RelativeViewPort;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class BoundsAndViewportKtKt {
    /* renamed from: -initializeboundsAndViewport, reason: not valid java name */
    public static final BoundsAndViewport m26065initializeboundsAndViewport(l<? super BoundsAndViewportKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        BoundsAndViewportKt.Dsl.Companion companion = BoundsAndViewportKt.Dsl.Companion;
        BoundsAndViewport.Builder builderNewBuilder = BoundsAndViewport.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        BoundsAndViewportKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final BoundsAndViewport copy(BoundsAndViewport boundsAndViewport, l<? super BoundsAndViewportKt.Dsl, ab> lVar) {
        x.f(boundsAndViewport, "<this>");
        x.f(lVar, "block");
        BoundsAndViewportKt.Dsl.Companion companion = BoundsAndViewportKt.Dsl.Companion;
        BoundsAndViewport.Builder builder = boundsAndViewport.toBuilder();
        x.e(builder, "toBuilder(...)");
        BoundsAndViewportKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RelativeViewPort getViewportOrNull(BoundsAndViewportOrBuilder boundsAndViewportOrBuilder) {
        x.f(boundsAndViewportOrBuilder, "<this>");
        if (boundsAndViewportOrBuilder.hasViewport()) {
            return boundsAndViewportOrBuilder.getViewport();
        }
        return null;
    }

    public static /* synthetic */ void getViewportOrNull$annotations(BoundsAndViewportOrBuilder boundsAndViewportOrBuilder) {
    }
}
