package com.waze.sdk.b;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c implements com.b.a.a.a.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f35274a;

    c(m mVar) {
        Objects.requireNonNull(mVar);
        this.f35274a = mVar;
    }

    @Override // com.b.a.a.a.c
    public final void a(com.b.a.a.a.k kVar) {
        m mVar = this.f35274a;
        mVar.f35298d = kVar;
        mVar.X();
        mVar.o = false;
    }

    @Override // com.b.a.a.a.c
    public final void b(Throwable th) {
        m mVar = this.f35274a;
        if (mVar.o) {
            mVar.o = false;
            if (!(th instanceof com.b.a.a.a.a.j)) {
                m.ak("Connection failed: ".concat(String.valueOf(String.valueOf(th))));
                mVar.al();
                return;
            }
            m.ak("Connection failed: ".concat(String.valueOf(String.valueOf(th))));
            if (mVar.f35301g) {
                mVar.W(th.getMessage());
            } else {
                mVar.f35301g = true;
                mVar.S();
            }
        }
    }
}
