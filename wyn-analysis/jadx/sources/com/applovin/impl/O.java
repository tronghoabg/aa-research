package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class O implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f4 f20819b;

    public /* synthetic */ O(f4 f4Var, int i5) {
        this.f20818a = i5;
        this.f20819b = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20818a) {
            case 0:
                this.f20819b.d();
                break;
            case 1:
                this.f20819b.c();
                break;
            default:
                this.f20819b.b();
                break;
        }
    }
}
