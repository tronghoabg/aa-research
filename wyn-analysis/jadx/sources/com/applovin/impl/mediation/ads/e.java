package com.applovin.impl.mediation.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxFullscreenAdImpl f22085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22086c;

    public /* synthetic */ e(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, int i5) {
        this.f22084a = i5;
        this.f22085b = maxFullscreenAdImpl;
        this.f22086c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22084a) {
            case 0:
                this.f22085b.c(this.f22086c);
                break;
            case 1:
                this.f22085b.a(this.f22086c);
                break;
            default:
                this.f22085b.b(this.f22086c);
                break;
        }
    }
}
