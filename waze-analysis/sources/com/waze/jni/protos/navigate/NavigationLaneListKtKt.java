package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.NavigationLaneList;
import com.waze.jni.protos.navigate.NavigationLaneListKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationLaneListKtKt {
    /* renamed from: -initializenavigationLaneList, reason: not valid java name */
    public static final NavigationLaneList m27299initializenavigationLaneList(l<? super NavigationLaneListKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NavigationLaneListKt.Dsl.Companion companion = NavigationLaneListKt.Dsl.Companion;
        NavigationLaneList.Builder builderNewBuilder = NavigationLaneList.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NavigationLaneListKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationLaneList copy(NavigationLaneList navigationLaneList, l<? super NavigationLaneListKt.Dsl, ab> lVar) {
        x.f(navigationLaneList, "<this>");
        x.f(lVar, "block");
        NavigationLaneListKt.Dsl.Companion companion = NavigationLaneListKt.Dsl.Companion;
        NavigationLaneList.Builder builder = navigationLaneList.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationLaneListKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
