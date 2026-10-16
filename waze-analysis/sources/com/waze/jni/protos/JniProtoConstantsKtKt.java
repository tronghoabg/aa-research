package com.waze.jni.protos;

import com.waze.jni.protos.JniProtoConstants;
import com.waze.jni.protos.JniProtoConstantsKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class JniProtoConstantsKtKt {
    /* renamed from: -initializejniProtoConstants, reason: not valid java name */
    public static final JniProtoConstants m25199initializejniProtoConstants(l<? super JniProtoConstantsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        JniProtoConstantsKt.Dsl.Companion companion = JniProtoConstantsKt.Dsl.Companion;
        JniProtoConstants.Builder builderNewBuilder = JniProtoConstants.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        JniProtoConstantsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final JniProtoConstants copy(JniProtoConstants jniProtoConstants, l<? super JniProtoConstantsKt.Dsl, ab> lVar) {
        x.f(jniProtoConstants, "<this>");
        x.f(lVar, "block");
        JniProtoConstantsKt.Dsl.Companion companion = JniProtoConstantsKt.Dsl.Companion;
        JniProtoConstants.Builder builder = jniProtoConstants.toBuilder();
        x.e(builder, "toBuilder(...)");
        JniProtoConstantsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
