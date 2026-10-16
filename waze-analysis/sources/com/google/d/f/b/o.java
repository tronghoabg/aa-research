package com.google.d.f.b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o extends r {

    /* renamed from: a, reason: collision with root package name */
    private final Map f7778a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f7779b;

    /* renamed from: c, reason: collision with root package name */
    private final q f7780c;

    /* renamed from: d, reason: collision with root package name */
    private final p f7781d;

    /* synthetic */ o(n nVar) {
        HashMap map = new HashMap();
        this.f7778a = map;
        HashMap map2 = new HashMap();
        this.f7779b = map2;
        map.putAll(nVar.f7774c);
        map2.putAll(nVar.f7775d);
        this.f7780c = nVar.f7776e;
        this.f7781d = nVar.f7777f;
    }

    @Override // com.google.d.f.b.r
    protected final void a(com.google.d.f.aa aaVar, Object obj, Object obj2) {
        q qVar = (q) this.f7778a.get(aaVar);
        if (qVar != null) {
            qVar.a(aaVar, obj, obj2);
        } else {
            this.f7780c.a(aaVar, obj, obj2);
        }
    }

    @Override // com.google.d.f.b.r
    protected final void b(com.google.d.f.aa aaVar, Iterator it, Object obj) {
        p pVar = (p) this.f7779b.get(aaVar);
        if (pVar != null) {
            pVar.a(aaVar, it, obj);
            return;
        }
        p pVar2 = this.f7781d;
        if (pVar2 != null && !this.f7778a.containsKey(aaVar)) {
            pVar2.a(aaVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(aaVar, it.next(), obj);
            }
        }
    }
}
