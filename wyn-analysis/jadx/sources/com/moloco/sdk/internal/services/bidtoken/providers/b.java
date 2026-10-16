package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.n f29470a;

    /* renamed from: b, reason: collision with root package name */
    public a f29471b;

    public b(com.moloco.sdk.internal.services.n accessibilityInfoService) {
        AbstractC3340k.e(accessibilityInfoService, "accessibilityInfoService");
        this.f29470a = accessibilityInfoService;
        this.f29471b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.f29471b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        a aVarD = d();
        boolean z2 = !aVarD.equals(this.f29471b);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AcSignalProvider", "[CBT] needsRefresh: " + z2 + ", with current: " + aVarD + ", cached: " + this.f29471b, false, 4, null);
        return z2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "AcSignalProvider";
    }

    public final a d() {
        boolean zIsEnabled;
        com.moloco.sdk.internal.services.n nVar = this.f29470a;
        try {
            nVar.getClass();
            boolean z2 = false;
            try {
                Object systemService = nVar.f29713a.getSystemService("captioning");
                AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.view.accessibility.CaptioningManager");
                zIsEnabled = ((CaptioningManager) systemService).isEnabled();
            } catch (Exception unused) {
                zIsEnabled = false;
            }
            Boolean boolValueOf = Boolean.valueOf(zIsEnabled);
            Context context = nVar.f29713a;
            Object systemService2 = context.getSystemService("accessibility");
            AbstractC3340k.c(systemService2, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            Boolean boolValueOf2 = Boolean.valueOf(((AccessibilityManager) systemService2).isEnabled() && Settings.Secure.getInt(context.getContentResolver(), "accessibility_large_pointer_icon", 0) == 1);
            nVar.getClass();
            try {
                if (Settings.Secure.getInt(nVar.f29713a.getContentResolver(), "reduce_bright_colors_activated") == 1) {
                    z2 = true;
                }
            } catch (Settings.SettingNotFoundException | SecurityException unused2) {
            }
            Boolean boolValueOf3 = Boolean.valueOf(z2);
            Context context2 = nVar.f29713a;
            Object systemService3 = context2.getSystemService("accessibility");
            AbstractC3340k.c(systemService3, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            return new a(boolValueOf, boolValueOf2, boolValueOf3, Float.valueOf(((AccessibilityManager) systemService3).isEnabled() ? context2.getResources().getConfiguration().fontScale : 1.0f));
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AcSignalProvider", "[CBT] ACS Error", e7, false, 8, null);
            return new a(null, null, null, null);
        }
    }
}
