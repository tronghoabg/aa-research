package com.waze.jni.protos.map;

import com.waze.jni.protos.map.RelativeViewPort;
import com.waze.jni.protos.map.RelativeViewPortKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RelativeViewPortKtKt {
    /* renamed from: -initializerelativeViewPort, reason: not valid java name */
    public static final RelativeViewPort m26978initializerelativeViewPort(l<? super RelativeViewPortKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RelativeViewPortKt.Dsl.Companion companion = RelativeViewPortKt.Dsl.Companion;
        RelativeViewPort.Builder builderNewBuilder = RelativeViewPort.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RelativeViewPortKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RelativeViewPort copy(RelativeViewPort relativeViewPort, l<? super RelativeViewPortKt.Dsl, ab> lVar) {
        x.f(relativeViewPort, "<this>");
        x.f(lVar, "block");
        RelativeViewPortKt.Dsl.Companion companion = RelativeViewPortKt.Dsl.Companion;
        RelativeViewPort.Builder builder = relativeViewPort.toBuilder();
        x.e(builder, "toBuilder(...)");
        RelativeViewPortKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
