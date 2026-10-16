package com.waze.jni.protos;

import com.waze.jni.protos.LightingInfo;
import com.waze.jni.protos.LightingInfoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LightingInfoKtKt {
    /* renamed from: -initializelightingInfo, reason: not valid java name */
    public static final LightingInfo m25205initializelightingInfo(l<? super LightingInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        LightingInfoKt.Dsl.Companion companion = LightingInfoKt.Dsl.Companion;
        LightingInfo.Builder builderNewBuilder = LightingInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        LightingInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final LightingInfo copy(LightingInfo lightingInfo, l<? super LightingInfoKt.Dsl, ab> lVar) {
        x.f(lightingInfo, "<this>");
        x.f(lVar, "block");
        LightingInfoKt.Dsl.Companion companion = LightingInfoKt.Dsl.Companion;
        LightingInfo.Builder builder = lightingInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        LightingInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
