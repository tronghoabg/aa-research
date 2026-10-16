package com.google.b.d.b;

import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f7085a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f7086b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Runnable f7087c;

    ag(aq aqVar, x xVar, Runnable runnable) {
        this.f7085a = aqVar;
        this.f7086b = xVar;
        this.f7087c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((ak) this.f7085a.f48105a) != null) {
            throw null;
        }
        x xVar = this.f7086b;
        Runnable runnable = this.f7087c;
        x xVarC = j.c(j.a(), xVar);
        try {
            runnable.run();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.f7087c + "]";
    }
}
