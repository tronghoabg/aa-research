package com.waze.sound;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cs implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ct f39713a;

    cs(ct ctVar) {
        Objects.requireNonNull(ctVar);
        this.f39713a = ctVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39713a.f39714a.post(new cr(this));
    }
}
