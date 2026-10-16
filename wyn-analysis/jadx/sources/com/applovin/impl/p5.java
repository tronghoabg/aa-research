package com.applovin.impl;

import com.applovin.impl.AbstractC1668v;

/* loaded from: classes.dex */
public class p5 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final a f22498g;

    public interface a {
        void a(AbstractC1668v.a aVar);
    }

    public p5(com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskCollectAdvertisingId", kVar, true);
        this.f22498g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f22498g.a(this.f21766a.A().f());
    }
}
