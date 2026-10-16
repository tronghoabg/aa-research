package com.waze.jni.protos;

import com.waze.jni.protos.FirebaseEvent;
import com.waze.jni.protos.FirebaseEventKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FirebaseEventKtKt {
    /* renamed from: -initializefirebaseEvent, reason: not valid java name */
    public static final FirebaseEvent m25148initializefirebaseEvent(l<? super FirebaseEventKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        FirebaseEventKt.Dsl.Companion companion = FirebaseEventKt.Dsl.Companion;
        FirebaseEvent.Builder builderNewBuilder = FirebaseEvent.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        FirebaseEventKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FirebaseEvent.Param copy(FirebaseEvent.Param param, l<? super FirebaseEventKt.ParamKt.Dsl, ab> lVar) {
        x.f(param, "<this>");
        x.f(lVar, "block");
        FirebaseEventKt.ParamKt.Dsl.Companion companion = FirebaseEventKt.ParamKt.Dsl.Companion;
        FirebaseEvent.Param.Builder builder = param.toBuilder();
        x.e(builder, "toBuilder(...)");
        FirebaseEventKt.ParamKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FirebaseEvent copy(FirebaseEvent firebaseEvent, l<? super FirebaseEventKt.Dsl, ab> lVar) {
        x.f(firebaseEvent, "<this>");
        x.f(lVar, "block");
        FirebaseEventKt.Dsl.Companion companion = FirebaseEventKt.Dsl.Companion;
        FirebaseEvent.Builder builder = firebaseEvent.toBuilder();
        x.e(builder, "toBuilder(...)");
        FirebaseEventKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
