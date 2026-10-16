package com.waze.jni.protos.nav_connect;

import com.waze.jni.protos.nav_connect.NavConnectState;
import com.waze.jni.protos.nav_connect.NavConnectStateKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavConnectStateKtKt {
    /* renamed from: -initializenavConnectState, reason: not valid java name */
    public static final NavConnectState m27132initializenavConnectState(l<? super NavConnectStateKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NavConnectStateKt.Dsl.Companion companion = NavConnectStateKt.Dsl.Companion;
        NavConnectState.Builder builderNewBuilder = NavConnectState.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NavConnectStateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavConnectState.Active copy(NavConnectState.Active active, l<? super NavConnectStateKt.ActiveKt.Dsl, ab> lVar) {
        x.f(active, "<this>");
        x.f(lVar, "block");
        NavConnectStateKt.ActiveKt.Dsl.Companion companion = NavConnectStateKt.ActiveKt.Dsl.Companion;
        NavConnectState.Active.Builder builder = active.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavConnectStateKt.ActiveKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavConnectState.Active getActiveOrNull(NavConnectStateOrBuilder navConnectStateOrBuilder) {
        x.f(navConnectStateOrBuilder, "<this>");
        if (navConnectStateOrBuilder.hasActive()) {
            return navConnectStateOrBuilder.getActive();
        }
        return null;
    }

    public static /* synthetic */ void getActiveOrNull$annotations(NavConnectStateOrBuilder navConnectStateOrBuilder) {
    }

    public static final NavConnectState.Inactive getInactiveOrNull(NavConnectStateOrBuilder navConnectStateOrBuilder) {
        x.f(navConnectStateOrBuilder, "<this>");
        if (navConnectStateOrBuilder.hasInactive()) {
            return navConnectStateOrBuilder.getInactive();
        }
        return null;
    }

    public static /* synthetic */ void getInactiveOrNull$annotations(NavConnectStateOrBuilder navConnectStateOrBuilder) {
    }

    public static final NavConnectPartnerAppInfo getPartnerAppInfoOrNull(NavConnectState.ActiveOrBuilder activeOrBuilder) {
        x.f(activeOrBuilder, "<this>");
        if (activeOrBuilder.hasPartnerAppInfo()) {
            return activeOrBuilder.getPartnerAppInfo();
        }
        return null;
    }

    public static /* synthetic */ void getPartnerAppInfoOrNull$annotations(NavConnectState.ActiveOrBuilder activeOrBuilder) {
    }

    public static final NavConnectState.Paused getPausedOrNull(NavConnectStateOrBuilder navConnectStateOrBuilder) {
        x.f(navConnectStateOrBuilder, "<this>");
        if (navConnectStateOrBuilder.hasPaused()) {
            return navConnectStateOrBuilder.getPaused();
        }
        return null;
    }

    public static /* synthetic */ void getPausedOrNull$annotations(NavConnectStateOrBuilder navConnectStateOrBuilder) {
    }

    public static final NavConnectState.PendingTokenValidation getPendingTokenValidationOrNull(NavConnectStateOrBuilder navConnectStateOrBuilder) {
        x.f(navConnectStateOrBuilder, "<this>");
        if (navConnectStateOrBuilder.hasPendingTokenValidation()) {
            return navConnectStateOrBuilder.getPendingTokenValidation();
        }
        return null;
    }

    public static /* synthetic */ void getPendingTokenValidationOrNull$annotations(NavConnectStateOrBuilder navConnectStateOrBuilder) {
    }

    public static final NavConnectState.PendingUserConsent getPendingUserConsentOrNull(NavConnectStateOrBuilder navConnectStateOrBuilder) {
        x.f(navConnectStateOrBuilder, "<this>");
        if (navConnectStateOrBuilder.hasPendingUserConsent()) {
            return navConnectStateOrBuilder.getPendingUserConsent();
        }
        return null;
    }

    public static /* synthetic */ void getPendingUserConsentOrNull$annotations(NavConnectStateOrBuilder navConnectStateOrBuilder) {
    }

    public static /* synthetic */ void getPartnerAppInfoOrNull$annotations(NavConnectState.PausedOrBuilder pausedOrBuilder) {
    }

    public static /* synthetic */ void getPartnerAppInfoOrNull$annotations(NavConnectState.PendingUserConsentOrBuilder pendingUserConsentOrBuilder) {
    }

    public static final NavConnectPartnerAppInfo getPartnerAppInfoOrNull(NavConnectState.PausedOrBuilder pausedOrBuilder) {
        x.f(pausedOrBuilder, "<this>");
        if (pausedOrBuilder.hasPartnerAppInfo()) {
            return pausedOrBuilder.getPartnerAppInfo();
        }
        return null;
    }

    public static final NavConnectPartnerAppInfo getPartnerAppInfoOrNull(NavConnectState.PendingUserConsentOrBuilder pendingUserConsentOrBuilder) {
        x.f(pendingUserConsentOrBuilder, "<this>");
        if (pendingUserConsentOrBuilder.hasPartnerAppInfo()) {
            return pendingUserConsentOrBuilder.getPartnerAppInfo();
        }
        return null;
    }

    public static final NavConnectState.Inactive copy(NavConnectState.Inactive inactive, l<? super NavConnectStateKt.InactiveKt.Dsl, ab> lVar) {
        x.f(inactive, "<this>");
        x.f(lVar, "block");
        NavConnectStateKt.InactiveKt.Dsl.Companion companion = NavConnectStateKt.InactiveKt.Dsl.Companion;
        NavConnectState.Inactive.Builder builder = inactive.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavConnectStateKt.InactiveKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavConnectState.Paused copy(NavConnectState.Paused paused, l<? super NavConnectStateKt.PausedKt.Dsl, ab> lVar) {
        x.f(paused, "<this>");
        x.f(lVar, "block");
        NavConnectStateKt.PausedKt.Dsl.Companion companion = NavConnectStateKt.PausedKt.Dsl.Companion;
        NavConnectState.Paused.Builder builder = paused.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavConnectStateKt.PausedKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavConnectState.PendingTokenValidation copy(NavConnectState.PendingTokenValidation pendingTokenValidation, l<? super NavConnectStateKt.PendingTokenValidationKt.Dsl, ab> lVar) {
        x.f(pendingTokenValidation, "<this>");
        x.f(lVar, "block");
        NavConnectStateKt.PendingTokenValidationKt.Dsl.Companion companion = NavConnectStateKt.PendingTokenValidationKt.Dsl.Companion;
        NavConnectState.PendingTokenValidation.Builder builder = pendingTokenValidation.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavConnectStateKt.PendingTokenValidationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavConnectState.PendingUserConsent copy(NavConnectState.PendingUserConsent pendingUserConsent, l<? super NavConnectStateKt.PendingUserConsentKt.Dsl, ab> lVar) {
        x.f(pendingUserConsent, "<this>");
        x.f(lVar, "block");
        NavConnectStateKt.PendingUserConsentKt.Dsl.Companion companion = NavConnectStateKt.PendingUserConsentKt.Dsl.Companion;
        NavConnectState.PendingUserConsent.Builder builder = pendingUserConsent.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavConnectStateKt.PendingUserConsentKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavConnectState copy(NavConnectState navConnectState, l<? super NavConnectStateKt.Dsl, ab> lVar) {
        x.f(navConnectState, "<this>");
        x.f(lVar, "block");
        NavConnectStateKt.Dsl.Companion companion = NavConnectStateKt.Dsl.Companion;
        NavConnectState.Builder builder = navConnectState.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavConnectStateKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
