package com.unity3d.ads;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IUnityAdsTokenListener f32671b;

    public /* synthetic */ b(IUnityAdsTokenListener iUnityAdsTokenListener, int i5) {
        this.f32670a = i5;
        this.f32671b = iUnityAdsTokenListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32670a) {
            case 0:
                UnityAds.getToken$lambda$26$lambda$25$lambda$24(this.f32671b);
                break;
            case 1:
                UnityAds.getToken$lambda$29$lambda$28(this.f32671b);
                break;
            default:
                this.f32671b.onUnityAdsTokenReady(null);
                break;
        }
    }
}
