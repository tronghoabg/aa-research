package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdRetryActiveError;
import com.vungle.ads.NetworkTimeoutError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.util.PathProvider;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public class j extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.d sdkExecutors, com.vungle.ads.internal.omsdk.c omInjector, com.vungle.ads.internal.downloader.m downloader, PathProvider pathProvider, b adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(vungleApiClient, "vungleApiClient");
        AbstractC3340k.e(sdkExecutors, "sdkExecutors");
        AbstractC3340k.e(omInjector, "omInjector");
        AbstractC3340k.e(downloader, "downloader");
        AbstractC3340k.e(pathProvider, "pathProvider");
        AbstractC3340k.e(adRequest, "adRequest");
    }

    public static final VungleError a(j jVar, Throwable th) {
        jVar.getClass();
        if (th instanceof SocketTimeoutException) {
            return new NetworkTimeoutError();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar.l());
        sb2.append(" request fail: ");
        sb2.append(th != null ? th.getMessage() : null);
        return new NetworkUnreachable(sb2.toString());
    }

    @Override // com.vungle.ads.internal.load.g
    public final void i() {
    }

    @Override // com.vungle.ads.internal.load.g
    public final void k() {
        b bVar = this.f33053g;
        VungleAdSize vungleAdSize = bVar.f33039c;
        i3 placement = bVar.f33037a;
        AbstractC3340k.e(placement, "placement");
        if (h().a(placement.b())) {
            a(new AdRetryActiveError().setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.network.m mVarA = a(placement.b(), vungleAdSize);
        if (mVarA != null) {
            mVarA.a(new i(this, placement));
            return;
        }
        a(new NetworkUnreachable(l() + " is null").setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
    }

    public String l() {
        return "ads";
    }

    public com.vungle.ads.internal.network.m a(String placement, VungleAdSize vungleAdSize) {
        AbstractC3340k.e(placement, "placement");
        return h().a(placement, vungleAdSize);
    }
}
