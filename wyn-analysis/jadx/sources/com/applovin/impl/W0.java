package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f20861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20862c;

    public /* synthetic */ W0(w1 w1Var, String str, int i5) {
        this.f20860a = i5;
        this.f20861b = w1Var;
        this.f20862c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20860a) {
            case 0:
                this.f20861b.c(this.f20862c);
                break;
            default:
                this.f20861b.b(this.f20862c);
                break;
        }
    }
}
