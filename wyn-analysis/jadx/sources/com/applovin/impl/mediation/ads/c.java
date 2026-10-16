package com.applovin.impl.mediation.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewImpl f22080b;

    public /* synthetic */ c(MaxAdViewImpl maxAdViewImpl, int i5) {
        this.f22079a = i5;
        this.f22080b = maxAdViewImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22079a) {
            case 0:
                this.f22080b.g();
                break;
            default:
                this.f22080b.c();
                break;
        }
    }
}
