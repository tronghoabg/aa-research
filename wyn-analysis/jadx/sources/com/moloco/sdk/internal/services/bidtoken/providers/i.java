package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.z;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final z f29484a;

    /* renamed from: b, reason: collision with root package name */
    public h f29485b;

    public i(z batteryInfoService) {
        AbstractC3340k.e(batteryInfoService, "batteryInfoService");
        this.f29484a = batteryInfoService;
        this.f29485b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.f29485b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        boolean z2 = !AbstractC3340k.a(this.f29485b, d());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", "[CBT][BIS]: needsRefresh: " + z2, false, 4, null);
        return z2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "BInfoSignalProvider";
    }

    public final h d() {
        z zVar = this.f29484a;
        try {
            zVar.getClass();
            Intent intentRegisterReceiver = zVar.f29739a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Integer numValueOf = Integer.valueOf(intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1);
            zVar.getClass();
            Intent intentRegisterReceiver2 = zVar.f29739a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Integer numValueOf2 = Integer.valueOf(intentRegisterReceiver2 != null ? intentRegisterReceiver2.getIntExtra("status", 1) : 1);
            Object systemService = zVar.f29739a.getSystemService("power");
            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            Boolean boolValueOf = Boolean.valueOf(((PowerManager) systemService).isPowerSaveMode());
            h hVar = new h(numValueOf, numValueOf2, boolValueOf);
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", "[CBT][BIS]: blev: " + numValueOf + ", bst: " + numValueOf2 + ", psm: " + boolValueOf, false, 4, null);
            return hVar;
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", "[CBT][BIS]: Error", e7, false, 8, null);
            return new h(null, null, null);
        }
    }
}
