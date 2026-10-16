package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.RoutingPopup;
import com.waze.jni.protos.navigate.RoutingPopupKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RoutingPopupKtKt {
    /* renamed from: -initializeroutingPopup, reason: not valid java name */
    public static final RoutingPopup m27638initializeroutingPopup(l<? super RoutingPopupKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoutingPopupKt.Dsl.Companion companion = RoutingPopupKt.Dsl.Companion;
        RoutingPopup.Builder builderNewBuilder = RoutingPopup.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoutingPopupKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RoutingPopup copy(RoutingPopup routingPopup, l<? super RoutingPopupKt.Dsl, ab> lVar) {
        x.f(routingPopup, "<this>");
        x.f(lVar, "block");
        RoutingPopupKt.Dsl.Companion companion = RoutingPopupKt.Dsl.Companion;
        RoutingPopup.Builder builder = routingPopup.toBuilder();
        x.e(builder, "toBuilder(...)");
        RoutingPopupKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RoutingPopupActions getActionsOrNull(RoutingPopupOrBuilder routingPopupOrBuilder) {
        x.f(routingPopupOrBuilder, "<this>");
        if (routingPopupOrBuilder.hasActions()) {
            return routingPopupOrBuilder.getActions();
        }
        return null;
    }

    public static /* synthetic */ void getActionsOrNull$annotations(RoutingPopupOrBuilder routingPopupOrBuilder) {
    }

    public static final RoutingPopupActions getInCarActionsOrNull(RoutingPopupOrBuilder routingPopupOrBuilder) {
        x.f(routingPopupOrBuilder, "<this>");
        if (routingPopupOrBuilder.hasInCarActions()) {
            return routingPopupOrBuilder.getInCarActions();
        }
        return null;
    }

    public static /* synthetic */ void getInCarActionsOrNull$annotations(RoutingPopupOrBuilder routingPopupOrBuilder) {
    }
}
