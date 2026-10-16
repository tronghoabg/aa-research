package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.NavigationLane;
import com.waze.jni.protos.navigate.NavigationLaneKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationLaneKtKt {
    /* renamed from: -initializenavigationLane, reason: not valid java name */
    public static final NavigationLane m27291initializenavigationLane(l<? super NavigationLaneKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NavigationLaneKt.Dsl.Companion companion = NavigationLaneKt.Dsl.Companion;
        NavigationLane.Builder builderNewBuilder = NavigationLane.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NavigationLaneKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationLane copy(NavigationLane navigationLane, l<? super NavigationLaneKt.Dsl, ab> lVar) {
        x.f(navigationLane, "<this>");
        x.f(lVar, "block");
        NavigationLaneKt.Dsl.Companion companion = NavigationLaneKt.Dsl.Companion;
        NavigationLane.Builder builder = navigationLane.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationLaneKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
