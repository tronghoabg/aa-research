package com.waze.jni.protos.view.bottom;

import com.waze.jni.protos.view.bottom.BottomNotificationJni;
import com.waze.jni.protos.view.bottom.BottomNotificationJniKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class BottomNotificationJniKtKt {
    /* renamed from: -initializebottomNotificationJni, reason: not valid java name */
    public static final BottomNotificationJni m28434initializebottomNotificationJni(l<? super BottomNotificationJniKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        BottomNotificationJniKt.Dsl.Companion companion = BottomNotificationJniKt.Dsl.Companion;
        BottomNotificationJni.Builder builderNewBuilder = BottomNotificationJni.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        BottomNotificationJniKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final BottomNotificationJni copy(BottomNotificationJni bottomNotificationJni, l<? super BottomNotificationJniKt.Dsl, ab> lVar) {
        x.f(bottomNotificationJni, "<this>");
        x.f(lVar, "block");
        BottomNotificationJniKt.Dsl.Companion companion = BottomNotificationJniKt.Dsl.Companion;
        BottomNotificationJni.Builder builder = bottomNotificationJni.toBuilder();
        x.e(builder, "toBuilder(...)");
        BottomNotificationJniKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
