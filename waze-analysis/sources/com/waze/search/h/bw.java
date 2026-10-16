package com.waze.search.h;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bw extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bx f35859a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f35860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bw(bx bxVar, String str, h.c.e eVar) {
        super(2, eVar);
        this.f35859a = bxVar;
        this.f35860b = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bw(this.f35859a, this.f35860b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bw) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        ce ceVar;
        String str;
        com.waze.settings.v aeVar;
        bw bwVar = this;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        bx bxVar = bwVar.f35859a;
        kotlinx.coroutines.b.bn bnVar = bxVar.s;
        while (true) {
            String str2 = bwVar.f35860b;
            Object objD = bnVar.d();
            ceVar = (ce) objD;
            str = str2;
            if (h.n.o.G(str)) {
                aeVar = new com.waze.search.e.ae((List) bxVar.w.d());
            } else {
                by.a().a("Moving to Autocomplete");
                aeVar = new com.waze.search.e.ac(null, h.a.i.h());
            }
            com.waze.z.a.d.an anVarA = ceVar.a();
            com.waze.z.a.d.ak akVar = anVarA instanceof com.waze.z.a.d.ak ? (com.waze.z.a.d.ak) anVarA : null;
            if (akVar == null) {
                akVar = new com.waze.z.a.d.ak(null, 7);
            }
            if (bnVar.f(objD, ce.l(ceVar, com.waze.z.a.d.ak.d(akVar, str2, null, 6), aeVar, null, null, false, false, false, null, null, false, 4092))) {
                break;
            }
            bwVar = this;
        }
        com.waze.z.a.d.an anVarA2 = ((ce) bxVar.s.d()).a();
        if (((ce) bxVar.s.d()).k() instanceof com.waze.search.e.ac) {
            bxVar.q.m(anVarA2);
        } else if (anVarA2 instanceof com.waze.z.a.d.ak) {
            bxVar.q.m(com.waze.z.a.d.ak.d((com.waze.z.a.d.ak) anVarA2, "", null, 6));
        }
        com.waze.z.a.d.an anVarA3 = ceVar.a();
        com.waze.z.a.d.ak akVar2 = anVarA3 instanceof com.waze.z.a.d.ak ? (com.waze.z.a.d.ak) anVarA3 : null;
        if (akVar2 != null && akVar2.b().length() > 0 && str.length() == 0) {
            bxVar.f35869i.f();
        }
        return h.ab.f48028a;
    }
}
