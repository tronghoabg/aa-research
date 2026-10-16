package com.waze.jni.protos.common;

import com.waze.jni.protos.common.RawImage;
import com.waze.jni.protos.common.RawImageKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RawImageKtKt {
    /* renamed from: -initializerawImage, reason: not valid java name */
    public static final RawImage m26082initializerawImage(l<? super RawImageKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RawImageKt.Dsl.Companion companion = RawImageKt.Dsl.Companion;
        RawImage.Builder builderNewBuilder = RawImage.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RawImageKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RawImage copy(RawImage rawImage, l<? super RawImageKt.Dsl, ab> lVar) {
        x.f(rawImage, "<this>");
        x.f(lVar, "block");
        RawImageKt.Dsl.Companion companion = RawImageKt.Dsl.Companion;
        RawImage.Builder builder = rawImage.toBuilder();
        x.e(builder, "toBuilder(...)");
        RawImageKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
