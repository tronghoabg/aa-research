package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.Hov;
import com.waze.jni.protos.navigate.HovKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class HovKtKt {
    /* renamed from: -initializehov, reason: not valid java name */
    public static final Hov m27221initializehov(l<? super HovKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        HovKt.Dsl.Companion companion = HovKt.Dsl.Companion;
        Hov.Builder builderNewBuilder = Hov.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        HovKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Hov copy(Hov hov, l<? super HovKt.Dsl, ab> lVar) {
        x.f(hov, "<this>");
        x.f(lVar, "block");
        HovKt.Dsl.Companion companion = HovKt.Dsl.Companion;
        Hov.Builder builder = hov.toBuilder();
        x.e(builder, "toBuilder(...)");
        HovKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
