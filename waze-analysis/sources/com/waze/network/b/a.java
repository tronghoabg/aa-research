package com.waze.network.b;

import java.util.concurrent.ThreadFactory;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f31916a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.f31916a != 0) {
            int i2 = com.google.android.libraries.phenotype.client.h.f6000a;
            return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
        int i3 = f.f32053a;
        return new Thread(null, runnable, "DnsResolverCallback");
    }
}
