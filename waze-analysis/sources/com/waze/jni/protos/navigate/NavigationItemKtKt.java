package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.NavigationItem;
import com.waze.jni.protos.navigate.NavigationItemKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationItemKtKt {
    /* renamed from: -initializenavigationItem, reason: not valid java name */
    public static final NavigationItem m27267initializenavigationItem(l<? super NavigationItemKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NavigationItemKt.Dsl.Companion companion = NavigationItemKt.Dsl.Companion;
        NavigationItem.Builder builderNewBuilder = NavigationItem.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NavigationItemKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationItem copy(NavigationItem navigationItem, l<? super NavigationItemKt.Dsl, ab> lVar) {
        x.f(navigationItem, "<this>");
        x.f(lVar, "block");
        NavigationItemKt.Dsl.Companion companion = NavigationItemKt.Dsl.Companion;
        NavigationItem.Builder builder = navigationItem.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationItemKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationRoadSign getRoadSignOrNull(NavigationItemOrBuilder navigationItemOrBuilder) {
        x.f(navigationItemOrBuilder, "<this>");
        if (navigationItemOrBuilder.hasRoadSign()) {
            return navigationItemOrBuilder.getRoadSign();
        }
        return null;
    }

    public static /* synthetic */ void getRoadSignOrNull$annotations(NavigationItemOrBuilder navigationItemOrBuilder) {
    }
}
