package com.waze.jni.protos.main_canvas;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.main_canvas.CenterOnPositionRequest;
import com.waze.jni.protos.main_canvas.CenterOnPositionRequestKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CenterOnPositionRequestKtKt {
    /* renamed from: -initializecenterOnPositionRequest, reason: not valid java name */
    public static final CenterOnPositionRequest m26391initializecenterOnPositionRequest(l<? super CenterOnPositionRequestKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CenterOnPositionRequestKt.Dsl.Companion companion = CenterOnPositionRequestKt.Dsl.Companion;
        CenterOnPositionRequest.Builder builderNewBuilder = CenterOnPositionRequest.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CenterOnPositionRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CenterOnPositionRequest copy(CenterOnPositionRequest centerOnPositionRequest, l<? super CenterOnPositionRequestKt.Dsl, ab> lVar) {
        x.f(centerOnPositionRequest, "<this>");
        x.f(lVar, "block");
        CenterOnPositionRequestKt.Dsl.Companion companion = CenterOnPositionRequestKt.Dsl.Companion;
        CenterOnPositionRequest.Builder builder = centerOnPositionRequest.toBuilder();
        x.e(builder, "toBuilder(...)");
        CenterOnPositionRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition getPositionOrNull(CenterOnPositionRequestOrBuilder centerOnPositionRequestOrBuilder) {
        x.f(centerOnPositionRequestOrBuilder, "<this>");
        if (centerOnPositionRequestOrBuilder.hasPosition()) {
            return centerOnPositionRequestOrBuilder.getPosition();
        }
        return null;
    }

    public static /* synthetic */ void getPositionOrNull$annotations(CenterOnPositionRequestOrBuilder centerOnPositionRequestOrBuilder) {
    }
}
