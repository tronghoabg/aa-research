package com.applovin.impl;

import com.applovin.sdk.AppLovinBidTokenCollectionListener;

/* loaded from: classes.dex */
public final /* synthetic */ class N0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinBidTokenCollectionListener f20816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20817c;

    public /* synthetic */ N0(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str, int i5) {
        this.f20815a = i5;
        this.f20816b = appLovinBidTokenCollectionListener;
        this.f20817c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20815a) {
            case 0:
                t2.c(this.f20816b, this.f20817c);
                break;
            default:
                t2.d(this.f20816b, this.f20817c);
                break;
        }
    }
}
