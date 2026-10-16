package com.google.d.m.a;

import java.util.concurrent.ExecutionException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class az implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final bm f8014a;

    /* renamed from: b, reason: collision with root package name */
    final ay f8015b;

    az(bm bmVar, ay ayVar) {
        this.f8014a = bmVar;
        this.f8015b = ayVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thA;
        bm bmVar = this.f8014a;
        if ((bmVar instanceof com.google.d.m.a.a.a) && (thA = com.google.d.m.a.a.b.a((com.google.d.m.a.a.a) bmVar)) != null) {
            this.f8015b.onFailure(thA);
            return;
        }
        try {
            this.f8015b.onSuccess(bd.o(bmVar));
        } catch (ExecutionException e2) {
            this.f8015b.onFailure(e2.getCause());
        } catch (Throwable th) {
            this.f8015b.onFailure(th);
        }
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.g(this.f8015b);
        return zVarH.toString();
    }
}
