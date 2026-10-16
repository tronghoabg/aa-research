package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.NavigationItemList;
import com.waze.jni.protos.navigate.NavigationItemListKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationItemListKtKt {
    /* renamed from: -initializenavigationItemList, reason: not valid java name */
    public static final NavigationItemList m27275initializenavigationItemList(l<? super NavigationItemListKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NavigationItemListKt.Dsl.Companion companion = NavigationItemListKt.Dsl.Companion;
        NavigationItemList.Builder builderNewBuilder = NavigationItemList.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NavigationItemListKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationItemList copy(NavigationItemList navigationItemList, l<? super NavigationItemListKt.Dsl, ab> lVar) {
        x.f(navigationItemList, "<this>");
        x.f(lVar, "block");
        NavigationItemListKt.Dsl.Companion companion = NavigationItemListKt.Dsl.Companion;
        NavigationItemList.Builder builder = navigationItemList.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationItemListKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
