package com.waze.jni.protos.map;

import com.waze.jni.protos.map.DisplayRects;
import com.waze.jni.protos.map.DisplayRectsKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DisplayRectsKtKt {
    /* renamed from: -initializedisplayRects, reason: not valid java name */
    public static final DisplayRects m26421initializedisplayRects(l<? super DisplayRectsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        DisplayRectsKt.Dsl.Companion companion = DisplayRectsKt.Dsl.Companion;
        DisplayRects.Builder builderNewBuilder = DisplayRects.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        DisplayRectsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DisplayRects copy(DisplayRects displayRects, l<? super DisplayRectsKt.Dsl, ab> lVar) {
        x.f(displayRects, "<this>");
        x.f(lVar, "block");
        DisplayRectsKt.Dsl.Companion companion = DisplayRectsKt.Dsl.Companion;
        DisplayRects.Builder builder = displayRects.toBuilder();
        x.e(builder, "toBuilder(...)");
        DisplayRectsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
