package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f20735b;

    public /* synthetic */ A(a2 a2Var, int i5) {
        this.f20734a = i5;
        this.f20735b = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20734a) {
            case 0:
                this.f20735b.I();
                break;
            case 1:
                this.f20735b.H();
                break;
            case 2:
                this.f20735b.J();
                break;
            case 3:
                this.f20735b.L();
                break;
            case 4:
                this.f20735b.P();
                break;
            case 5:
                this.f20735b.N();
                break;
            default:
                this.f20735b.K();
                break;
        }
    }
}
