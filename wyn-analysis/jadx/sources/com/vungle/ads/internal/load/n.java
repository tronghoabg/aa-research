package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.InvalidBidPayloadError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.p0;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.p;
import com.vungle.ads.internal.network.r;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class n extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.d sdkExecutors, com.vungle.ads.internal.omsdk.c omInjector, com.vungle.ads.internal.downloader.m downloader, PathProvider pathProvider, b adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(vungleApiClient, "vungleApiClient");
        AbstractC3340k.e(sdkExecutors, "sdkExecutors");
        AbstractC3340k.e(omInjector, "omInjector");
        AbstractC3340k.e(downloader, "downloader");
        AbstractC3340k.e(pathProvider, "pathProvider");
        AbstractC3340k.e(adRequest, "adRequest");
    }

    @Override // com.vungle.ads.internal.load.g
    public final void i() {
        com.vungle.ads.internal.model.i iVarK;
        h0 h0Var = this.f33059n;
        List list = (h0Var == null || (iVarK = h0Var.k()) == null) ? null : iVarK.f33213q;
        if (list == null || !list.isEmpty()) {
            InterfaceC2525i interfaceC2525iY = Fe.c.y(EnumC2526j.f34667a, new m(d()));
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((r) interfaceC2525iY.getValue()).a(new p((String) it.next()).b("win-notification").a(e()).a(), false);
                }
            }
        }
    }

    @Override // com.vungle.ads.internal.load.g
    public final void k() throws Throwable {
        p0 p0VarA = b().a();
        if (p0VarA == null) {
            a(new InvalidBidPayloadError().setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
            return;
        }
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.q()) {
            try {
                String strB = p0VarA.b();
                boolean z2 = u.f33874a;
                t.a("RTA_DEBUGGER", String.valueOf(strB));
                InterfaceC2525i interfaceC2525iY = Fe.c.y(EnumC2526j.f34667a, new l(d()));
                if (strB != null) {
                    new k((VungleApiClient) interfaceC2525iY.getValue()).a(strB);
                }
            } catch (Throwable unused) {
            }
        }
        h0 h0VarA = p0VarA.a();
        Integer numC = p0VarA.c();
        if (numC == null || numC.intValue() != 2 || h0VarA == null) {
            a(new AdMarkupInvalidError("The ad response did not contain valid ad markup").setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
        } else {
            a(h0VarA, new m2(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_ADM_LOAD));
        }
    }
}
