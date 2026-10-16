package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f23270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinSdk.SdkInitializationListener f23271c;

    public /* synthetic */ w(k kVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener, int i5) {
        this.f23269a = i5;
        this.f23270b = kVar;
        this.f23271c = sdkInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23269a) {
            case 0:
                this.f23270b.a(this.f23271c);
                break;
            default:
                this.f23270b.b(this.f23271c);
                break;
        }
    }
}
