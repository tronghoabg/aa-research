package com.waze.main_screen.p;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aa implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f27004a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bf f27005b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f27006c;

    aa(Context context, bf bfVar, h.g.a.l lVar) {
        this.f27004a = context;
        this.f27005b = bfVar;
        this.f27006c = lVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        com.waze.main_screen.j.g gVar = (com.waze.main_screen.j.g) obj;
        if (h.g.b.x.n(gVar, com.waze.main_screen.j.f.f26482a)) {
            com.waze.google_assistant.an.a(this.f27004a, com.waze.google_assistant.al.f24100a);
        } else if (h.g.b.x.n(gVar, com.waze.main_screen.j.a.f26462a)) {
            this.f27005b.v().g();
        } else if (h.g.b.x.n(gVar, com.waze.main_screen.j.b.f26478a)) {
            this.f27006c.invoke(false);
        } else if (h.g.b.x.n(gVar, com.waze.main_screen.j.c.f26479a)) {
            bf bfVar = this.f27005b;
            bfVar.v().g();
            bfVar.A().invoke();
        } else if (h.g.b.x.n(gVar, com.waze.main_screen.j.e.f26481a)) {
            this.f27005b.v().h();
        } else if (!h.g.b.x.n(gVar, com.waze.main_screen.j.d.f26480a) && gVar != null) {
            throw new h.i();
        }
        if (gVar != null) {
            this.f27005b.g().b(gVar);
        }
        return h.ab.f48028a;
    }
}
