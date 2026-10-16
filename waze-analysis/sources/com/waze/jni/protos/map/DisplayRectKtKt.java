package com.waze.jni.protos.map;

import com.waze.jni.protos.map.DisplayRect;
import com.waze.jni.protos.map.DisplayRectKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DisplayRectKtKt {
    /* renamed from: -initializedisplayRect, reason: not valid java name */
    public static final DisplayRect m26413initializedisplayRect(l<? super DisplayRectKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        DisplayRectKt.Dsl.Companion companion = DisplayRectKt.Dsl.Companion;
        DisplayRect.Builder builderNewBuilder = DisplayRect.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        DisplayRectKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DisplayRect copy(DisplayRect displayRect, l<? super DisplayRectKt.Dsl, ab> lVar) {
        x.f(displayRect, "<this>");
        x.f(lVar, "block");
        DisplayRectKt.Dsl.Companion companion = DisplayRectKt.Dsl.Companion;
        DisplayRect.Builder builder = displayRect.toBuilder();
        x.e(builder, "toBuilder(...)");
        DisplayRectKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
