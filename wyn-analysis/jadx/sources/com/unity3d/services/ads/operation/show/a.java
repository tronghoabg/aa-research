package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShowOperationState f32719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UnityAds.UnityAdsShowError f32720c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f32721d;

    public /* synthetic */ a(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str, int i5) {
        this.f32718a = i5;
        this.f32719b = showOperationState;
        this.f32720c = unityAdsShowError;
        this.f32721d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32718a) {
            case 0:
                this.f32719b.onUnityAdsShowFailure(this.f32720c, this.f32721d);
                break;
            default:
                this.f32719b.lambda$onUnityAdsShowFailure$0(this.f32720c, this.f32721d);
                break;
        }
    }
}
