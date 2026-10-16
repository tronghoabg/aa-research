package com.waze.jni.protos.copilot.data;

import com.waze.jni.protos.copilot.data.LightingRenderingInfo;
import com.waze.jni.protos.copilot.data.LightingRenderingInfoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LightingRenderingInfoKtKt {
    /* renamed from: -initializelightingRenderingInfo, reason: not valid java name */
    public static final LightingRenderingInfo m26117initializelightingRenderingInfo(l<? super LightingRenderingInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        LightingRenderingInfoKt.Dsl.Companion companion = LightingRenderingInfoKt.Dsl.Companion;
        LightingRenderingInfo.Builder builderNewBuilder = LightingRenderingInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        LightingRenderingInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final LightingRenderingInfo copy(LightingRenderingInfo lightingRenderingInfo, l<? super LightingRenderingInfoKt.Dsl, ab> lVar) {
        x.f(lightingRenderingInfo, "<this>");
        x.f(lVar, "block");
        LightingRenderingInfoKt.Dsl.Companion companion = LightingRenderingInfoKt.Dsl.Companion;
        LightingRenderingInfo.Builder builder = lightingRenderingInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        LightingRenderingInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
