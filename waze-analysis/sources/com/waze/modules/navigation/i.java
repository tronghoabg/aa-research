package com.waze.modules.navigation;

import com.waze.jni.protos.modules.navigation.AnalyticsRouting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f30438a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ i[] f30439b;

    /* renamed from: c, reason: collision with root package name */
    private final AnalyticsRouting.AnalyticsRoutingUseCase f30440c;

    static {
        i iVar = new i(AnalyticsRouting.AnalyticsRoutingUseCase.USE_CASE_TRIP_OVERVIEW);
        f30438a = iVar;
        i[] iVarArr = {iVar};
        f30439b = iVarArr;
        h.d.b.a(iVarArr);
    }

    private i(AnalyticsRouting.AnalyticsRoutingUseCase analyticsRoutingUseCase) {
        this.f30440c = analyticsRoutingUseCase;
    }

    public static i[] values() {
        return (i[]) f30439b.clone();
    }

    public final AnalyticsRouting.AnalyticsRoutingUseCase a() {
        return this.f30440c;
    }
}
