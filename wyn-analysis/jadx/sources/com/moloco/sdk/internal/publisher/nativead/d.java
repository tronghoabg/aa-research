package com.moloco.sdk.internal.publisher.nativead;

import com.moloco.sdk.internal.ortb.model.C1906u;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final C1906u f29129a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.publisher.nativead.model.h f29130b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.publisher.nativead.model.n f29131c;

    public d(C1906u bid, com.moloco.sdk.internal.publisher.nativead.model.h ortbResponse, com.moloco.sdk.internal.publisher.nativead.model.n preparedAssets) {
        AbstractC3340k.e(bid, "bid");
        AbstractC3340k.e(ortbResponse, "ortbResponse");
        AbstractC3340k.e(preparedAssets, "preparedAssets");
        this.f29129a = bid;
        this.f29130b = ortbResponse;
        this.f29131c = preparedAssets;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC3340k.a(this.f29129a, dVar.f29129a) && AbstractC3340k.a(this.f29130b, dVar.f29130b) && AbstractC3340k.a(this.f29131c, dVar.f29131c);
    }

    public final int hashCode() {
        return this.f29131c.hashCode() + ((this.f29130b.hashCode() + (this.f29129a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadedNativeAd(bid=" + this.f29129a + ", ortbResponse=" + this.f29130b + ", preparedAssets=" + this.f29131c + ')';
    }
}
