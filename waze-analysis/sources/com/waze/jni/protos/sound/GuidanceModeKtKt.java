package com.waze.jni.protos.sound;

import com.waze.jni.protos.sound.GuidanceMode;
import com.waze.jni.protos.sound.GuidanceModeKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GuidanceModeKtKt {
    /* renamed from: -initializeguidanceMode, reason: not valid java name */
    public static final GuidanceMode m28366initializeguidanceMode(l<? super GuidanceModeKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        GuidanceModeKt.Dsl.Companion companion = GuidanceModeKt.Dsl.Companion;
        GuidanceMode.Builder builderNewBuilder = GuidanceMode.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        GuidanceModeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final GuidanceMode copy(GuidanceMode guidanceMode, l<? super GuidanceModeKt.Dsl, ab> lVar) {
        x.f(guidanceMode, "<this>");
        x.f(lVar, "block");
        GuidanceModeKt.Dsl.Companion companion = GuidanceModeKt.Dsl.Companion;
        GuidanceMode.Builder builder = guidanceMode.toBuilder();
        x.e(builder, "toBuilder(...)");
        GuidanceModeKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
