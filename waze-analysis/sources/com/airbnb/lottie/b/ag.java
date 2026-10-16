package com.airbnb.lottie.b;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ag implements com.airbnb.lottie.u {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.k f1968a;

    ag(kotlinx.coroutines.k kVar) {
        this.f1968a = kVar;
    }

    @Override // com.airbnb.lottie.u
    public final void a(Object obj) {
        kotlinx.coroutines.k kVar = this.f1968a;
        if (kVar.h()) {
            return;
        }
        kVar.resumeWith(obj);
    }
}
