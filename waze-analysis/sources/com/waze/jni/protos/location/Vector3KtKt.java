package com.waze.jni.protos.location;

import com.waze.jni.protos.location.Vector3;
import com.waze.jni.protos.location.Vector3Kt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Vector3KtKt {
    /* renamed from: -initializevector3, reason: not valid java name */
    public static final Vector3 m26380initializevector3(l<? super Vector3Kt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        Vector3Kt.Dsl.Companion companion = Vector3Kt.Dsl.Companion;
        Vector3.Builder builderNewBuilder = Vector3.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        Vector3Kt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Vector3 copy(Vector3 vector3, l<? super Vector3Kt.Dsl, ab> lVar) {
        x.f(vector3, "<this>");
        x.f(lVar, "block");
        Vector3Kt.Dsl.Companion companion = Vector3Kt.Dsl.Companion;
        Vector3.Builder builder = vector3.toBuilder();
        x.e(builder, "toBuilder(...)");
        Vector3Kt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
