package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.NavigationRoadSign;
import com.waze.jni.protos.navigate.NavigationRoadSignKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationRoadSignKtKt {
    /* renamed from: -initializenavigationRoadSign, reason: not valid java name */
    public static final NavigationRoadSign m27335initializenavigationRoadSign(l<? super NavigationRoadSignKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NavigationRoadSignKt.Dsl.Companion companion = NavigationRoadSignKt.Dsl.Companion;
        NavigationRoadSign.Builder builderNewBuilder = NavigationRoadSign.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NavigationRoadSignKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationRoadSign copy(NavigationRoadSign navigationRoadSign, l<? super NavigationRoadSignKt.Dsl, ab> lVar) {
        x.f(navigationRoadSign, "<this>");
        x.f(lVar, "block");
        NavigationRoadSignKt.Dsl.Companion companion = NavigationRoadSignKt.Dsl.Companion;
        NavigationRoadSign.Builder builder = navigationRoadSign.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationRoadSignKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
