package com.moloco.sdk.internal.unity_bridge.internal;

import com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback;
import com.moloco.sdk.publisher.MolocoAd;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MolocoUnityShowCallback f29765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MolocoAd f29766c;

    public /* synthetic */ c(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAd molocoAd, int i5) {
        this.f29764a = i5;
        this.f29765b = molocoUnityShowCallback;
        this.f29766c = molocoAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29764a) {
            case 0:
                this.f29765b.onAdHidden(this.f29766c.getAdUnitId());
                break;
            case 1:
                this.f29765b.onAdClicked(this.f29766c.getAdUnitId());
                break;
            default:
                this.f29765b.onAdShowSuccess(this.f29766c.getAdUnitId());
                break;
        }
    }
}
