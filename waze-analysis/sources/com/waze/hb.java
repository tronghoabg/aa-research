package com.waze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class hb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f24364a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ NativeManager f24365b;

    hb(NativeManager nativeManager, long j2) {
        this.f24364a = j2;
        Objects.requireNonNull(nativeManager);
        this.f24365b = nativeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24365b.callCallbackNTV(this.f24364a);
    }
}
