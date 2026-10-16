package com.waze.jni.protos.location;

import com.waze.jni.protos.location.Quaternion;
import com.waze.jni.protos.location.QuaternionKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class QuaternionKtKt {
    /* renamed from: -initializequaternion, reason: not valid java name */
    public static final Quaternion m26372initializequaternion(l<? super QuaternionKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        QuaternionKt.Dsl.Companion companion = QuaternionKt.Dsl.Companion;
        Quaternion.Builder builderNewBuilder = Quaternion.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        QuaternionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Quaternion copy(Quaternion quaternion, l<? super QuaternionKt.Dsl, ab> lVar) {
        x.f(quaternion, "<this>");
        x.f(lVar, "block");
        QuaternionKt.Dsl.Companion companion = QuaternionKt.Dsl.Companion;
        Quaternion.Builder builder = quaternion.toBuilder();
        x.e(builder, "toBuilder(...)");
        QuaternionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
