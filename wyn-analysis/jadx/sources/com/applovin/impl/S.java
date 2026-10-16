package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class S implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1640h0 f20838b;

    public /* synthetic */ S(C1640h0 c1640h0, int i5) {
        this.f20837a = i5;
        this.f20838b = c1640h0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20837a) {
            case 0:
                this.f20838b.e();
                break;
            case 1:
                this.f20838b.f();
                break;
            case 2:
                this.f20838b.a();
                break;
            default:
                this.f20838b.d();
                break;
        }
    }
}
