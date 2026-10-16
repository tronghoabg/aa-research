package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class X0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f20866b;

    public /* synthetic */ X0(w1 w1Var, int i5) {
        this.f20865a = i5;
        this.f20866b = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20865a) {
            case 0:
                this.f20866b.k();
                break;
            default:
                this.f20866b.j();
                break;
        }
    }
}
