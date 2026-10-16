package com.applovin.impl.sdk;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f22838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.sdk.ad.b f22839c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f22840d;

    public /* synthetic */ B(m mVar, com.applovin.impl.sdk.ad.b bVar, Context context, int i5) {
        this.f22837a = i5;
        this.f22838b = mVar;
        this.f22839c = bVar;
        this.f22840d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22837a) {
            case 0:
                this.f22838b.a(this.f22839c, this.f22840d);
                break;
            default:
                this.f22838b.b(this.f22839c, this.f22840d);
                break;
        }
    }
}
