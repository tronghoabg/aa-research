package com.waze.google_assistant;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f24243a;

    v(w wVar) {
        this.f24243a = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w wVar = this.f24243a;
        w.d(wVar);
        wVar.f24245b.postDelayed(this, wVar.f24249f);
    }
}
