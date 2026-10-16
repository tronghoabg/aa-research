package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class F0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3 f20774b;

    public /* synthetic */ F0(p3 p3Var, int i5) {
        this.f20773a = i5;
        this.f20774b = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20773a) {
            case 0:
                this.f20774b.h();
                break;
            default:
                this.f20774b.d();
                break;
        }
    }
}
