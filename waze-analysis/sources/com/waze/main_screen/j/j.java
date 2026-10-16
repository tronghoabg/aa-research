package com.waze.main_screen.j;

import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class j implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f26485a;

    j(m mVar) {
        this.f26485a = mVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        g gVar = (g) obj;
        if (x.n(gVar, a.f26462a)) {
            m mVar = this.f26485a;
            mVar.f26491c.d();
            mVar.f26493e.e(gVar);
        } else {
            b bVar = b.f26478a;
            if (x.n(gVar, bVar)) {
                m mVar2 = this.f26485a;
                mVar2.f26491c.d();
                mVar2.f26493e.e(gVar);
            } else if (x.n(gVar, c.f26479a)) {
                m mVar3 = this.f26485a;
                mVar3.f26491c.d();
                mVar3.f26493e.e(gVar);
            } else if (x.n(gVar, d.f26480a)) {
                m mVar4 = this.f26485a;
                mVar4.f26491c.d();
                mVar4.f26493e.e(gVar);
            } else if (x.n(gVar, e.f26481a)) {
                m mVar5 = this.f26485a;
                mVar5.f26491c.d();
                mVar5.f26493e.e(bVar);
            } else {
                if (!x.n(gVar, f.f26482a)) {
                    throw new h.i();
                }
                m mVar6 = this.f26485a;
                mVar6.f26491c.d();
                mVar6.f26493e.e(gVar);
            }
        }
        return ab.f48028a;
    }
}
