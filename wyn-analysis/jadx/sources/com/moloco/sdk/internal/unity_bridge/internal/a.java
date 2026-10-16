package com.moloco.sdk.internal.unity_bridge.internal;

import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MolocoUnityLoadCallback f29757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29758c;

    public /* synthetic */ a(MolocoUnityLoadCallback molocoUnityLoadCallback, String str, int i5) {
        this.f29756a = i5;
        this.f29757b = molocoUnityLoadCallback;
        this.f29758c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29756a) {
            case 0:
                this.f29757b.onAdLoadSuccess(this.f29758c);
                break;
            default:
                this.f29757b.onAdLoadSuccess(this.f29758c);
                break;
        }
    }
}
