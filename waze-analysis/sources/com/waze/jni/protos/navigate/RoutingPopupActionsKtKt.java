package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.RoutingPopupActions;
import com.waze.jni.protos.navigate.RoutingPopupActionsKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RoutingPopupActionsKtKt {
    /* renamed from: -initializeroutingPopupActions, reason: not valid java name */
    public static final RoutingPopupActions m27637initializeroutingPopupActions(l<? super RoutingPopupActionsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoutingPopupActionsKt.Dsl.Companion companion = RoutingPopupActionsKt.Dsl.Companion;
        RoutingPopupActions.Builder builderNewBuilder = RoutingPopupActions.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoutingPopupActionsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RoutingPopupActions copy(RoutingPopupActions routingPopupActions, l<? super RoutingPopupActionsKt.Dsl, ab> lVar) {
        x.f(routingPopupActions, "<this>");
        x.f(lVar, "block");
        RoutingPopupActionsKt.Dsl.Companion companion = RoutingPopupActionsKt.Dsl.Companion;
        RoutingPopupActions.Builder builder = routingPopupActions.toBuilder();
        x.e(builder, "toBuilder(...)");
        RoutingPopupActionsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
