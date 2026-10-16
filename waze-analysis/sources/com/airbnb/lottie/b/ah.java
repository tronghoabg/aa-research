package com.airbnb.lottie.b;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ah implements com.airbnb.lottie.u {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.k f1969a;

    ah(kotlinx.coroutines.k kVar) {
        this.f1969a = kVar;
    }

    @Override // com.airbnb.lottie.u
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        kotlinx.coroutines.k kVar = this.f1969a;
        Throwable th = (Throwable) obj;
        if (kVar.h()) {
            return;
        }
        h.g.b.x.c(th);
        kVar.resumeWith(e.b.c.a(th));
    }
}
