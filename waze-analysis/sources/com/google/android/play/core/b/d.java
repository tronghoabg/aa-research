package com.google.android.play.core.b;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d extends a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f6969a;

    d(i iVar) {
        Objects.requireNonNull(iVar);
        this.f6969a = iVar;
    }

    @Override // com.google.android.play.core.b.a
    public final void b() {
        i iVar = this.f6969a;
        synchronized (iVar.f6979f) {
            if (iVar.f6984k.get() > 0 && iVar.f6984k.decrementAndGet() > 0) {
                iVar.n.h("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            if (iVar.m != null) {
                iVar.n.h("Unbind from service.", new Object[0]);
                iVar.f6975b.unbindService(iVar.f6985l);
                iVar.f6980g = false;
                iVar.m = null;
                iVar.f6985l = null;
            }
            iVar.w();
        }
    }
}
