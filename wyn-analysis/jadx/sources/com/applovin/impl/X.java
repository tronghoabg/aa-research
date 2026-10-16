package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class X implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.sdk.k f20864b;

    public /* synthetic */ X(int i5, com.applovin.impl.sdk.k kVar) {
        this.f20863a = i5;
        this.f20864b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20863a) {
            case 0:
                k2.a(this.f20864b);
                break;
            default:
                o8.d(this.f20864b);
                break;
        }
    }
}
