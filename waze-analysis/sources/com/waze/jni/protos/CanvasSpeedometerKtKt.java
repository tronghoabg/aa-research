package com.waze.jni.protos;

import com.waze.jni.protos.CanvasSpeedometer;
import com.waze.jni.protos.CanvasSpeedometerKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CanvasSpeedometerKtKt {
    /* renamed from: -initializecanvasSpeedometer, reason: not valid java name */
    public static final CanvasSpeedometer m24967initializecanvasSpeedometer(l<? super CanvasSpeedometerKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CanvasSpeedometerKt.Dsl.Companion companion = CanvasSpeedometerKt.Dsl.Companion;
        CanvasSpeedometer.Builder builderNewBuilder = CanvasSpeedometer.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CanvasSpeedometerKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CanvasSpeedometer copy(CanvasSpeedometer canvasSpeedometer, l<? super CanvasSpeedometerKt.Dsl, ab> lVar) {
        x.f(canvasSpeedometer, "<this>");
        x.f(lVar, "block");
        CanvasSpeedometerKt.Dsl.Companion companion = CanvasSpeedometerKt.Dsl.Companion;
        CanvasSpeedometer.Builder builder = canvasSpeedometer.toBuilder();
        x.e(builder, "toBuilder(...)");
        CanvasSpeedometerKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
