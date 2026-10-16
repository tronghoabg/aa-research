package com.waze.sound;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cq f39710a;

    cp(cq cqVar) {
        Objects.requireNonNull(cqVar);
        this.f39710a = cqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw cwVar = this.f39710a.f39711a;
        cwVar.p();
        cwVar.f39727j.setVisibility(8);
        cwVar.q();
    }
}
