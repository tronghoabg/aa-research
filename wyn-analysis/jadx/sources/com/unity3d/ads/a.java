package com.unity3d.ads;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoadListener f32668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f32669c;

    public /* synthetic */ a(LoadListener loadListener, Throwable th, int i5) {
        this.f32667a = i5;
        this.f32668b = loadListener;
        this.f32669c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32667a) {
            case 0:
                InterstitialAd$Companion$load$1.invokeSuspend$lambda$3$lambda$2(this.f32668b, this.f32669c);
                break;
            default:
                RewardedAd$Companion$load$1.invokeSuspend$lambda$3$lambda$2(this.f32668b, this.f32669c);
                break;
        }
    }
}
