package com.waze.jni.protos.favorites;

import com.waze.jni.protos.favorites.IsHomeWorkSetResult;
import com.waze.jni.protos.favorites.IsHomeWorkSetResultKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class IsHomeWorkSetResultKtKt {
    /* renamed from: -initializeisHomeWorkSetResult, reason: not valid java name */
    public static final IsHomeWorkSetResult m26183initializeisHomeWorkSetResult(l<? super IsHomeWorkSetResultKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        IsHomeWorkSetResultKt.Dsl.Companion companion = IsHomeWorkSetResultKt.Dsl.Companion;
        IsHomeWorkSetResult.Builder builderNewBuilder = IsHomeWorkSetResult.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        IsHomeWorkSetResultKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final IsHomeWorkSetResult copy(IsHomeWorkSetResult isHomeWorkSetResult, l<? super IsHomeWorkSetResultKt.Dsl, ab> lVar) {
        x.f(isHomeWorkSetResult, "<this>");
        x.f(lVar, "block");
        IsHomeWorkSetResultKt.Dsl.Companion companion = IsHomeWorkSetResultKt.Dsl.Companion;
        IsHomeWorkSetResult.Builder builder = isHomeWorkSetResult.toBuilder();
        x.e(builder, "toBuilder(...)");
        IsHomeWorkSetResultKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
