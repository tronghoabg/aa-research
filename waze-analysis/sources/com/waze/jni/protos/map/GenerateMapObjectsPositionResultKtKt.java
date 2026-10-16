package com.waze.jni.protos.map;

import com.waze.jni.protos.map.GenerateMapObjectsPositionResult;
import com.waze.jni.protos.map.GenerateMapObjectsPositionResultKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenerateMapObjectsPositionResultKtKt {
    /* renamed from: -initializegenerateMapObjectsPositionResult, reason: not valid java name */
    public static final GenerateMapObjectsPositionResult m26505initializegenerateMapObjectsPositionResult(l<? super GenerateMapObjectsPositionResultKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        GenerateMapObjectsPositionResultKt.Dsl.Companion companion = GenerateMapObjectsPositionResultKt.Dsl.Companion;
        GenerateMapObjectsPositionResult.Builder builderNewBuilder = GenerateMapObjectsPositionResult.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        GenerateMapObjectsPositionResultKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final GenerateMapObjectsPositionResult copy(GenerateMapObjectsPositionResult generateMapObjectsPositionResult, l<? super GenerateMapObjectsPositionResultKt.Dsl, ab> lVar) {
        x.f(generateMapObjectsPositionResult, "<this>");
        x.f(lVar, "block");
        GenerateMapObjectsPositionResultKt.Dsl.Companion companion = GenerateMapObjectsPositionResultKt.Dsl.Companion;
        GenerateMapObjectsPositionResult.Builder builder = generateMapObjectsPositionResult.toBuilder();
        x.e(builder, "toBuilder(...)");
        GenerateMapObjectsPositionResultKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
