package com.vungle.ads.internal.load;

import com.vungle.ads.internal.network.VungleApiClient;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final VungleApiClient f33073a;

    public k(VungleApiClient apiClient) {
        AbstractC3340k.e(apiClient, "apiClient");
        this.f33073a = apiClient;
    }

    public final void a(String adm) {
        AbstractC3340k.e(adm, "adm");
        this.f33073a.d(adm);
    }
}
