package com.unity3d.services.ads;

import com.unity3d.ads.IUnityAdsInitializationListener;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IUnityAdsInitializationListener f32713b;

    public /* synthetic */ a(IUnityAdsInitializationListener iUnityAdsInitializationListener, int i5) {
        this.f32712a = i5;
        this.f32713b = iUnityAdsInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32712a) {
            case 0:
                UnityAdsImplementation.lambda$initialize$0(this.f32713b);
                break;
            default:
                this.f32713b.onInitializationComplete();
                break;
        }
    }
}
