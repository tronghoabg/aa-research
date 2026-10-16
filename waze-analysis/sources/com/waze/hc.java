package com.waze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class hc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f24366a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f24367b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ NativeManager f24368c;

    hc(NativeManager nativeManager, long j2, int i2) {
        this.f24366a = j2;
        this.f24367b = i2;
        Objects.requireNonNull(nativeManager);
        this.f24368c = nativeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24368c.callCallbackIntNTV(this.f24366a, this.f24367b);
    }
}
