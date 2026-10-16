package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class H implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f20780b;

    public /* synthetic */ H(e1 e1Var, int i5) {
        this.f20779a = i5;
        this.f20780b = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20779a) {
            case 0:
                this.f20780b.j();
                break;
            case 1:
                this.f20780b.e();
                break;
            default:
                this.f20780b.i();
                break;
        }
    }
}
