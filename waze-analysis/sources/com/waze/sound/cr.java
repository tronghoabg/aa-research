package com.waze.sound;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cs f39712a;

    cr(cs csVar) {
        Objects.requireNonNull(csVar);
        this.f39712a = csVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw cwVar = this.f39712a.f39713a.f39714a;
        cwVar.f39721d.d(true);
        cwVar.f39720c.d(true);
        cwVar.m.cancel();
        cwVar.f39724g.setProgress(cwVar.n);
    }
}
