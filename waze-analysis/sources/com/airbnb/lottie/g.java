package com.airbnb.lottie;

import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g implements u {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f2390a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f2391b;

    public g(LottieAnimationView lottieAnimationView, int i2, byte[] bArr) {
        this.f2391b = i2;
        this.f2390a = new WeakReference(lottieAnimationView);
    }

    @Override // com.airbnb.lottie.u
    public final /* synthetic */ void a(Object obj) {
        if (this.f2391b == 0) {
            h hVar = (h) obj;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f2390a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.m(hVar);
            return;
        }
        Throwable th = (Throwable) obj;
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f2390a.get();
        if (lottieAnimationView2 == null) {
            return;
        }
        if (lottieAnimationView2.f1733e != 0) {
            lottieAnimationView2.setImageResource(lottieAnimationView2.f1733e);
        }
        LottieAnimationView.f1730b.a(th);
    }

    public g(LottieAnimationView lottieAnimationView, int i2) {
        this.f2391b = i2;
        this.f2390a = new WeakReference(lottieAnimationView);
    }
}
