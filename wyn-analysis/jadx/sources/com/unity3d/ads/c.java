package com.unity3d.ads;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IUnityAdsInitializationListener f32673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f32674c;

    public /* synthetic */ c(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th, int i5) {
        this.f32672a = i5;
        this.f32673b = iUnityAdsInitializationListener;
        this.f32674c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32672a) {
            case 0:
                UnityAds.initialize$lambda$9$lambda$8$lambda$7(this.f32673b, this.f32674c);
                break;
            default:
                UnityAds.initialize$lambda$4$lambda$3$lambda$2(this.f32673b, this.f32674c);
                break;
        }
    }
}
