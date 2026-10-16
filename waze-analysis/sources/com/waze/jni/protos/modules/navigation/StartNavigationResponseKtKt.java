package com.waze.jni.protos.modules.navigation;

import com.waze.jni.protos.modules.navigation.StartNavigationResponse;
import com.waze.jni.protos.modules.navigation.StartNavigationResponseKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class StartNavigationResponseKtKt {
    /* renamed from: -initializestartNavigationResponse, reason: not valid java name */
    public static final StartNavigationResponse m27061initializestartNavigationResponse(l<? super StartNavigationResponseKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        StartNavigationResponseKt.Dsl.Companion companion = StartNavigationResponseKt.Dsl.Companion;
        StartNavigationResponse.Builder builderNewBuilder = StartNavigationResponse.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        StartNavigationResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final StartNavigationResponse copy(StartNavigationResponse startNavigationResponse, l<? super StartNavigationResponseKt.Dsl, ab> lVar) {
        x.f(startNavigationResponse, "<this>");
        x.f(lVar, "block");
        StartNavigationResponseKt.Dsl.Companion companion = StartNavigationResponseKt.Dsl.Companion;
        StartNavigationResponse.Builder builder = startNavigationResponse.toBuilder();
        x.e(builder, "toBuilder(...)");
        StartNavigationResponseKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
