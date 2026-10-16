package com.waze.jni.protos.map.canvas;

import com.waze.jni.protos.map.canvas.MainCanvasStateChanged;
import com.waze.jni.protos.map.canvas.MainCanvasStateChangedKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MainCanvasStateChangedKtKt {
    /* renamed from: -initializemainCanvasStateChanged, reason: not valid java name */
    public static final MainCanvasStateChanged m27036initializemainCanvasStateChanged(l<? super MainCanvasStateChangedKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MainCanvasStateChangedKt.Dsl.Companion companion = MainCanvasStateChangedKt.Dsl.Companion;
        MainCanvasStateChanged.Builder builderNewBuilder = MainCanvasStateChanged.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MainCanvasStateChangedKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MainCanvasStateChanged copy(MainCanvasStateChanged mainCanvasStateChanged, l<? super MainCanvasStateChangedKt.Dsl, ab> lVar) {
        x.f(mainCanvasStateChanged, "<this>");
        x.f(lVar, "block");
        MainCanvasStateChangedKt.Dsl.Companion companion = MainCanvasStateChangedKt.Dsl.Companion;
        MainCanvasStateChanged.Builder builder = mainCanvasStateChanged.toBuilder();
        x.e(builder, "toBuilder(...)");
        MainCanvasStateChangedKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
