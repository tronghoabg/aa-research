package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.NavigationLaneAngle;
import com.waze.jni.protos.navigate.NavigationLaneAngleKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationLaneAngleKtKt {
    /* renamed from: -initializenavigationLaneAngle, reason: not valid java name */
    public static final NavigationLaneAngle m27290initializenavigationLaneAngle(l<? super NavigationLaneAngleKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NavigationLaneAngleKt.Dsl.Companion companion = NavigationLaneAngleKt.Dsl.Companion;
        NavigationLaneAngle.Builder builderNewBuilder = NavigationLaneAngle.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NavigationLaneAngleKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationLaneAngle copy(NavigationLaneAngle navigationLaneAngle, l<? super NavigationLaneAngleKt.Dsl, ab> lVar) {
        x.f(navigationLaneAngle, "<this>");
        x.f(lVar, "block");
        NavigationLaneAngleKt.Dsl.Companion companion = NavigationLaneAngleKt.Dsl.Companion;
        NavigationLaneAngle.Builder builder = navigationLaneAngle.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationLaneAngleKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
