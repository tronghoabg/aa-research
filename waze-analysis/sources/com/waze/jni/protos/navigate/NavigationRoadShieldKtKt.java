package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.NavigationRoadShield;
import com.waze.jni.protos.navigate.NavigationRoadShieldKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationRoadShieldKtKt {
    /* renamed from: -initializenavigationRoadShield, reason: not valid java name */
    public static final NavigationRoadShield m27312initializenavigationRoadShield(l<? super NavigationRoadShieldKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NavigationRoadShieldKt.Dsl.Companion companion = NavigationRoadShieldKt.Dsl.Companion;
        NavigationRoadShield.Builder builderNewBuilder = NavigationRoadShield.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NavigationRoadShieldKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationRoadShield copy(NavigationRoadShield navigationRoadShield, l<? super NavigationRoadShieldKt.Dsl, ab> lVar) {
        x.f(navigationRoadShield, "<this>");
        x.f(lVar, "block");
        NavigationRoadShieldKt.Dsl.Companion companion = NavigationRoadShieldKt.Dsl.Companion;
        NavigationRoadShield.Builder builder = navigationRoadShield.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationRoadShieldKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
