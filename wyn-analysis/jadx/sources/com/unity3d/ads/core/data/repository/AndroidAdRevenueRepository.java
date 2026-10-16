package com.unity3d.ads.core.data.repository;

import Gf.a;
import Hf.InterfaceC0590b0;
import Hf.k0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidAdRevenueRepository;", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "<init>", "()V", "LHf/b0;", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "adRevenueEvents", "LHf/b0;", "getAdRevenueEvents", "()LHf/b0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidAdRevenueRepository implements AdRevenueRepository {

    @NotNull
    private final InterfaceC0590b0 adRevenueEvents = k0.a(0, 64, a.f4781b);

    @Override // com.unity3d.ads.core.data.repository.AdRevenueRepository
    @NotNull
    public InterfaceC0590b0 getAdRevenueEvents() {
        return this.adRevenueEvents;
    }
}
