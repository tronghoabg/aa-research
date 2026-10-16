package com.waze.jni.protos.copilot.data;

import com.waze.jni.protos.copilot.data.CarRenderingInfo;
import com.waze.jni.protos.copilot.data.CarRenderingInfoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CarRenderingInfoKtKt {
    /* renamed from: -initializecarRenderingInfo, reason: not valid java name */
    public static final CarRenderingInfo m26111initializecarRenderingInfo(l<? super CarRenderingInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CarRenderingInfoKt.Dsl.Companion companion = CarRenderingInfoKt.Dsl.Companion;
        CarRenderingInfo.Builder builderNewBuilder = CarRenderingInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CarRenderingInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CarRenderingInfo copy(CarRenderingInfo carRenderingInfo, l<? super CarRenderingInfoKt.Dsl, ab> lVar) {
        x.f(carRenderingInfo, "<this>");
        x.f(lVar, "block");
        CarRenderingInfoKt.Dsl.Companion companion = CarRenderingInfoKt.Dsl.Companion;
        CarRenderingInfo.Builder builder = carRenderingInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        CarRenderingInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final LightingRenderingInfo getLightingInfoOrNull(CarRenderingInfoOrBuilder carRenderingInfoOrBuilder) {
        x.f(carRenderingInfoOrBuilder, "<this>");
        if (carRenderingInfoOrBuilder.hasLightingInfo()) {
            return carRenderingInfoOrBuilder.getLightingInfo();
        }
        return null;
    }

    public static /* synthetic */ void getLightingInfoOrNull$annotations(CarRenderingInfoOrBuilder carRenderingInfoOrBuilder) {
    }
}
