package com.waze.main_screen.t;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class s implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f27623a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f27624b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27625c;

    s(Context context, am amVar, int i2) {
        this.f27625c = i2;
        this.f27623a = context;
        this.f27624b = amVar;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.waze.br.c.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [h.g.a.l, java.lang.Object] */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        int i2 = this.f27625c;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlinx.coroutines.aj.z(this.f27624b, null, null, new q((am) this.f27623a, (h.c.e) null, 1, (byte[]) null), 3);
                return h.ab.f48028a;
            }
            com.waze.br.c.n nVar = (com.waze.br.c.n) obj;
            if (nVar instanceof com.waze.br.c.f) {
                this.f27624b.invoke(((com.waze.br.c.f) nVar).a());
                this.f27623a.g();
            }
            return h.ab.f48028a;
        }
        com.waze.main_screen.j.g gVar = (com.waze.main_screen.j.g) obj;
        if (h.g.b.x.n(gVar, com.waze.main_screen.j.f.f26482a)) {
            com.waze.google_assistant.an.a((Context) this.f27623a, com.waze.google_assistant.al.f24100a);
        } else if (h.g.b.x.n(gVar, com.waze.main_screen.j.a.f26462a)) {
            ((am) this.f27624b).s().g();
        } else if (!h.g.b.x.n(gVar, com.waze.main_screen.j.b.f26478a) && !h.g.b.x.n(gVar, com.waze.main_screen.j.c.f26479a) && !h.g.b.x.n(gVar, com.waze.main_screen.j.e.f26481a) && !h.g.b.x.n(gVar, com.waze.main_screen.j.d.f26480a) && gVar != null) {
            throw new h.i();
        }
        if (gVar != null) {
            ((am) this.f27624b).d().b(gVar);
        }
        return h.ab.f48028a;
    }

    s(Object obj, Object obj2, int i2) {
        this.f27625c = i2;
        this.f27624b = obj;
        this.f27623a = obj2;
    }
}
