package com.waze.jni.protos.alerters;

import com.waze.jni.protos.alerters.NativeAlertRepositoryUpdate;
import com.waze.jni.protos.alerters.NativeAlertRepositoryUpdateKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeAlertRepositoryUpdateKtKt {
    /* renamed from: -initializenativeAlertRepositoryUpdate, reason: not valid java name */
    public static final NativeAlertRepositoryUpdate m25893initializenativeAlertRepositoryUpdate(l<? super NativeAlertRepositoryUpdateKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NativeAlertRepositoryUpdateKt.Dsl.Companion companion = NativeAlertRepositoryUpdateKt.Dsl.Companion;
        NativeAlertRepositoryUpdate.Builder builderNewBuilder = NativeAlertRepositoryUpdate.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NativeAlertRepositoryUpdateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeAlertRepositoryUpdate copy(NativeAlertRepositoryUpdate nativeAlertRepositoryUpdate, l<? super NativeAlertRepositoryUpdateKt.Dsl, ab> lVar) {
        x.f(nativeAlertRepositoryUpdate, "<this>");
        x.f(lVar, "block");
        NativeAlertRepositoryUpdateKt.Dsl.Companion companion = NativeAlertRepositoryUpdateKt.Dsl.Companion;
        NativeAlertRepositoryUpdate.Builder builder = nativeAlertRepositoryUpdate.toBuilder();
        x.e(builder, "toBuilder(...)");
        NativeAlertRepositoryUpdateKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
