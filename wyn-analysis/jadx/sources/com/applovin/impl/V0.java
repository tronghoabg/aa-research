package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.adview.g f20854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f20855c;

    public /* synthetic */ V0(com.applovin.impl.adview.g gVar, Runnable runnable, int i5) {
        this.f20853a = i5;
        this.f20854b = gVar;
        this.f20855c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20853a) {
            case 0:
                w1.b(this.f20854b, this.f20855c);
                break;
            case 1:
                w1.a(this.f20854b, this.f20855c);
                break;
            default:
                w1.c(this.f20854b, this.f20855c);
                break;
        }
    }
}
