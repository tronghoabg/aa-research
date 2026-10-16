package com.moloco.sdk.internal.services.bidtoken.providers;

import android.net.ConnectivityManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.C1940c;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class t implements j {

    /* renamed from: a, reason: collision with root package name */
    public final C1940c f29523a;

    /* renamed from: b, reason: collision with root package name */
    public s f29524b;

    public t(C1940c networkInfoService) {
        AbstractC3340k.e(networkInfoService, "networkInfoService");
        this.f29523a = networkInfoService;
        this.f29524b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.f29524b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        s sVarD = d();
        boolean z2 = !sVarD.equals(this.f29524b);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS needsRefresh: " + z2 + ", with nis: " + sVarD + ", cached: " + this.f29524b, false, 4, null);
        return z2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "NISignalProvider";
    }

    public final s d() {
        Integer numValueOf;
        Integer numValueOf2;
        C1940c c1940c = this.f29523a;
        try {
            Object systemService = c1940c.f29575a.getSystemService("phone");
            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
            boolean z2 = false;
            if (networkOperator == null || networkOperator.length() == 0) {
                numValueOf = null;
            } else {
                String strSubstring = networkOperator.substring(0, 3);
                AbstractC3340k.d(strSubstring, "substring(...)");
                numValueOf = Integer.valueOf(Integer.parseInt(strSubstring));
            }
            Object systemService2 = c1940c.f29575a.getSystemService("phone");
            AbstractC3340k.c(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String networkOperator2 = ((TelephonyManager) systemService2).getNetworkOperator();
            if (networkOperator2 == null || networkOperator2.length() == 0) {
                numValueOf2 = null;
            } else {
                String strSubstring2 = networkOperator2.substring(3);
                AbstractC3340k.d(strSubstring2, "substring(...)");
                numValueOf2 = Integer.valueOf(Integer.parseInt(strSubstring2));
            }
            Object systemService3 = c1940c.f29575a.getSystemService("connectivity");
            AbstractC3340k.c(systemService3, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService3;
            if (Build.VERSION.SDK_INT >= 24 && connectivityManager.getRestrictBackgroundStatus() == 3) {
                z2 = true;
            }
            s sVar = new s(numValueOf, numValueOf2, Boolean.valueOf(z2), c1940c.a());
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS providing " + sVar, false, 4, null);
            return sVar;
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS Error", e7, false, 8, null);
            return new s(null, null, null, null);
        }
    }
}
