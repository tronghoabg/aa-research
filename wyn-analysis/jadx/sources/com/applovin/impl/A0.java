package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class A0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l4 f20737b;

    public /* synthetic */ A0(l4 l4Var, int i5) {
        this.f20736a = i5;
        this.f20737b = l4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20736a) {
            case 0:
                this.f20737b.k();
                break;
            case 1:
                this.f20737b.n();
                break;
            case 2:
                this.f20737b.u();
                break;
            case 3:
                this.f20737b.o();
                break;
            case 4:
                this.f20737b.s();
                break;
            case 5:
                this.f20737b.p();
                break;
            case 6:
                this.f20737b.r();
                break;
            case 7:
                this.f20737b.l();
                break;
            case 8:
                this.f20737b.t();
                break;
            case 9:
                this.f20737b.q();
                break;
            default:
                this.f20737b.m();
                break;
        }
    }
}
