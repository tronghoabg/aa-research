package o9;

import com.applovin.impl.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m9.O;
import p7.AbstractC3772b;
import p9.u;
import r9.C3955l;
import r9.S;
import s9.k;
import s9.m;
import s9.o;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3658a f41432a;

    /* renamed from: b, reason: collision with root package name */
    public final e f41433b;

    /* renamed from: f, reason: collision with root package name */
    public long f41437f;

    /* renamed from: g, reason: collision with root package name */
    public h f41438g;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f41434c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public c9.c f41436e = s9.g.f45372a;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f41435d = new HashMap();

    public d(InterfaceC3658a interfaceC3658a, e eVar) {
        this.f41432a = interfaceC3658a;
        this.f41433b = eVar;
    }

    public final O a(c cVar, long j8) {
        Fe.c.k(!(cVar instanceof e), "Unexpected bundle metadata element.", new Object[0]);
        int size = this.f41436e.size();
        if (cVar instanceof j) {
            this.f41434c.add((j) cVar);
        } else if (cVar instanceof h) {
            h hVar = (h) cVar;
            HashMap map = this.f41435d;
            s9.h hVar2 = hVar.f41452a;
            map.put(hVar2, hVar);
            this.f41438g = hVar;
            if (!hVar.f41454c) {
                c9.c cVar2 = this.f41436e;
                o oVar = hVar.f41453b;
                k kVarH = k.h(hVar2, oVar);
                kVarH.f45383d = oVar;
                this.f41436e = cVar2.g(hVar2, kVarH);
                this.f41438g = null;
            }
        } else if (cVar instanceof C3659b) {
            C3659b c3659b = (C3659b) cVar;
            h hVar3 = this.f41438g;
            if (hVar3 != null) {
                if (c3659b.f41431a.f45380a.equals(hVar3.f41452a)) {
                    c9.c cVar3 = this.f41436e;
                    k kVar = c3659b.f41431a;
                    kVar.f45383d = this.f41438g.f41453b;
                    this.f41436e = cVar3.g(kVar.f45380a, kVar);
                    this.f41438g = null;
                }
            }
            throw new IllegalArgumentException("The document being added does not match the stored metadata.");
        }
        this.f41437f += j8;
        if (size == this.f41436e.size()) {
            return null;
        }
        int size2 = this.f41436e.size();
        e eVar = this.f41433b;
        return new O(size2, eVar.f41442d, this.f41437f, eVar.f41443e, null, 2);
    }

    public final c9.c b() {
        Fe.c.k(this.f41438g == null, "Bundled documents end with a document metadata element instead of a document.", new Object[0]);
        e eVar = this.f41433b;
        String str = eVar.f41439a;
        Fe.c.k(str != null, "Bundle ID must be set", new Object[0]);
        int size = this.f41436e.size();
        int i5 = eVar.f41442d;
        Fe.c.k(size == i5, "Expected %s documents, but loaded %s.", Integer.valueOf(i5), Integer.valueOf(this.f41436e.size()));
        c9.c cVar = this.f41436e;
        C3955l c3955l = (C3955l) this.f41432a;
        A5.g gVar = new A5.g(c3955l, cVar, c3955l.a(new u(m.l("__bundle__/docs/" + str), null).i()), 19);
        AbstractC3772b abstractC3772b = c3955l.f44631a;
        c9.c cVar2 = (c9.c) abstractC3772b.O("Apply bundle documents", gVar);
        HashMap map = new HashMap();
        ArrayList arrayList = this.f41434c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.put(((j) it.next()).f41458a, s9.h.f45374c);
        }
        for (h hVar : this.f41435d.values()) {
            Iterator it2 = hVar.f41455d.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                map.put(str2, ((c9.d) map.get(str2)).a(hVar.f41452a));
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            j jVar = (j) it3.next();
            c9.d dVar = (c9.d) map.get(jVar.f41458a);
            S sA = c3955l.a(jVar.f41459b.f41456a);
            abstractC3772b.P("Saved named query", new N(c3955l, jVar, sA, sA.f44597b, dVar, 3));
        }
        abstractC3772b.P("Save bundle", new ng.a(11, c3955l, eVar));
        return cVar2;
    }
}
