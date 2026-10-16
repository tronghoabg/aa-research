package com.waze.jni.protos.sound;

import com.waze.jni.protos.sound.GuidanceSource;
import com.waze.jni.protos.sound.GuidanceSourceKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GuidanceSourceKtKt {
    /* renamed from: -initializeguidanceSource, reason: not valid java name */
    public static final GuidanceSource m28371initializeguidanceSource(l<? super GuidanceSourceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        GuidanceSourceKt.Dsl.Companion companion = GuidanceSourceKt.Dsl.Companion;
        GuidanceSource.Builder builderNewBuilder = GuidanceSource.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        GuidanceSourceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final GuidanceSource copy(GuidanceSource guidanceSource, l<? super GuidanceSourceKt.Dsl, ab> lVar) {
        x.f(guidanceSource, "<this>");
        x.f(lVar, "block");
        GuidanceSourceKt.Dsl.Companion companion = GuidanceSourceKt.Dsl.Companion;
        GuidanceSource.Builder builder = guidanceSource.toBuilder();
        x.e(builder, "toBuilder(...)");
        GuidanceSourceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
