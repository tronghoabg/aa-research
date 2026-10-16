package com.waze.jni.protos.map;

import com.waze.jni.protos.map.AnimationParams;
import com.waze.jni.protos.map.AnimationParamsKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AnimationParamsKtKt {
    /* renamed from: -initializeanimationParams, reason: not valid java name */
    public static final AnimationParams m26400initializeanimationParams(l<? super AnimationParamsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AnimationParamsKt.Dsl.Companion companion = AnimationParamsKt.Dsl.Companion;
        AnimationParams.Builder builderNewBuilder = AnimationParams.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AnimationParamsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AnimationParams copy(AnimationParams animationParams, l<? super AnimationParamsKt.Dsl, ab> lVar) {
        x.f(animationParams, "<this>");
        x.f(lVar, "block");
        AnimationParamsKt.Dsl.Companion companion = AnimationParamsKt.Dsl.Companion;
        AnimationParams.Builder builder = animationParams.toBuilder();
        x.e(builder, "toBuilder(...)");
        AnimationParamsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
