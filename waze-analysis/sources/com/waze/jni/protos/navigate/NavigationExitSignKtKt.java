package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.NavigationExitSign;
import com.waze.jni.protos.navigate.NavigationExitSignKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationExitSignKtKt {
    /* renamed from: -initializenavigationExitSign, reason: not valid java name */
    public static final NavigationExitSign m27233initializenavigationExitSign(l<? super NavigationExitSignKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NavigationExitSignKt.Dsl.Companion companion = NavigationExitSignKt.Dsl.Companion;
        NavigationExitSign.Builder builderNewBuilder = NavigationExitSign.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NavigationExitSignKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationExitSign copy(NavigationExitSign navigationExitSign, l<? super NavigationExitSignKt.Dsl, ab> lVar) {
        x.f(navigationExitSign, "<this>");
        x.f(lVar, "block");
        NavigationExitSignKt.Dsl.Companion companion = NavigationExitSignKt.Dsl.Companion;
        NavigationExitSign.Builder builder = navigationExitSign.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationExitSignKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
