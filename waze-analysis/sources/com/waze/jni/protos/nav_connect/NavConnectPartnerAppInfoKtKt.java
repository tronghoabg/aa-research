package com.waze.jni.protos.nav_connect;

import com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfo;
import com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavConnectPartnerAppInfoKtKt {
    /* renamed from: -initializenavConnectPartnerAppInfo, reason: not valid java name */
    public static final NavConnectPartnerAppInfo m27080initializenavConnectPartnerAppInfo(l<? super NavConnectPartnerAppInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NavConnectPartnerAppInfoKt.Dsl.Companion companion = NavConnectPartnerAppInfoKt.Dsl.Companion;
        NavConnectPartnerAppInfo.Builder builderNewBuilder = NavConnectPartnerAppInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NavConnectPartnerAppInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavConnectPartnerAppInfo copy(NavConnectPartnerAppInfo navConnectPartnerAppInfo, l<? super NavConnectPartnerAppInfoKt.Dsl, ab> lVar) {
        x.f(navConnectPartnerAppInfo, "<this>");
        x.f(lVar, "block");
        NavConnectPartnerAppInfoKt.Dsl.Companion companion = NavConnectPartnerAppInfoKt.Dsl.Companion;
        NavConnectPartnerAppInfo.Builder builder = navConnectPartnerAppInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavConnectPartnerAppInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
