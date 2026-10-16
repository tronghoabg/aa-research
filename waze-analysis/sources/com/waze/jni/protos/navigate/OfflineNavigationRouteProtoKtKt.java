package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.OfflineNavigationRouteProto;
import com.waze.jni.protos.navigate.OfflineNavigationRouteProtoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class OfflineNavigationRouteProtoKtKt {
    /* renamed from: -initializeofflineNavigationRouteProto, reason: not valid java name */
    public static final OfflineNavigationRouteProto m27442initializeofflineNavigationRouteProto(l<? super OfflineNavigationRouteProtoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        OfflineNavigationRouteProtoKt.Dsl.Companion companion = OfflineNavigationRouteProtoKt.Dsl.Companion;
        OfflineNavigationRouteProto.Builder builderNewBuilder = OfflineNavigationRouteProto.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        OfflineNavigationRouteProtoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final OfflineNavigationRouteProto copy(OfflineNavigationRouteProto offlineNavigationRouteProto, l<? super OfflineNavigationRouteProtoKt.Dsl, ab> lVar) {
        x.f(offlineNavigationRouteProto, "<this>");
        x.f(lVar, "block");
        OfflineNavigationRouteProtoKt.Dsl.Companion companion = OfflineNavigationRouteProtoKt.Dsl.Companion;
        OfflineNavigationRouteProto.Builder builder = offlineNavigationRouteProto.toBuilder();
        x.e(builder, "toBuilder(...)");
        OfflineNavigationRouteProtoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
