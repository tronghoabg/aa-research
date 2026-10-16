package com.waze.jni.protos.map;

import com.waze.jni.protos.map.GenerateMapObjectsPositionRequest;
import com.waze.jni.protos.map.GenerateMapObjectsPositionRequestKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenerateMapObjectsPositionRequestKtKt {
    /* renamed from: -initializegenerateMapObjectsPositionRequest, reason: not valid java name */
    public static final GenerateMapObjectsPositionRequest m26502initializegenerateMapObjectsPositionRequest(l<? super GenerateMapObjectsPositionRequestKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        GenerateMapObjectsPositionRequestKt.Dsl.Companion companion = GenerateMapObjectsPositionRequestKt.Dsl.Companion;
        GenerateMapObjectsPositionRequest.Builder builderNewBuilder = GenerateMapObjectsPositionRequest.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        GenerateMapObjectsPositionRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final GenerateMapObjectsPositionRequest copy(GenerateMapObjectsPositionRequest generateMapObjectsPositionRequest, l<? super GenerateMapObjectsPositionRequestKt.Dsl, ab> lVar) {
        x.f(generateMapObjectsPositionRequest, "<this>");
        x.f(lVar, "block");
        GenerateMapObjectsPositionRequestKt.Dsl.Companion companion = GenerateMapObjectsPositionRequestKt.Dsl.Companion;
        GenerateMapObjectsPositionRequest.Builder builder = generateMapObjectsPositionRequest.toBuilder();
        x.e(builder, "toBuilder(...)");
        GenerateMapObjectsPositionRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
