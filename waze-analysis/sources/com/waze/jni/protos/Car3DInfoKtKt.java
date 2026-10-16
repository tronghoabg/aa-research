package com.waze.jni.protos;

import com.waze.jni.protos.Car3DInfo;
import com.waze.jni.protos.Car3DInfoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Car3DInfoKtKt {
    /* renamed from: -initializecar3DInfo, reason: not valid java name */
    public static final Car3DInfo m24980initializecar3DInfo(l<? super Car3DInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        Car3DInfoKt.Dsl.Companion companion = Car3DInfoKt.Dsl.Companion;
        Car3DInfo.Builder builderNewBuilder = Car3DInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        Car3DInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Car3DInfo copy(Car3DInfo car3DInfo, l<? super Car3DInfoKt.Dsl, ab> lVar) {
        x.f(car3DInfo, "<this>");
        x.f(lVar, "block");
        Car3DInfoKt.Dsl.Companion companion = Car3DInfoKt.Dsl.Companion;
        Car3DInfo.Builder builder = car3DInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        Car3DInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final LightingInfo getLightingInfoOrNull(Car3DInfoOrBuilder car3DInfoOrBuilder) {
        x.f(car3DInfoOrBuilder, "<this>");
        if (car3DInfoOrBuilder.hasLightingInfo()) {
            return car3DInfoOrBuilder.getLightingInfo();
        }
        return null;
    }

    public static /* synthetic */ void getLightingInfoOrNull$annotations(Car3DInfoOrBuilder car3DInfoOrBuilder) {
    }
}
