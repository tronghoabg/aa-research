package com.waze.an.a;

import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aa extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f14539a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f14540b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f14541c;

    public aa(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        aa aaVar = new aa((h.c.e) obj3);
        aaVar.f14541c = (kotlinx.coroutines.b.l) obj;
        aaVar.f14540b = (Object[]) obj2;
        return aaVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f14539a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.f14541c;
            aa aaVar = this;
            List[] listArr = (List[]) ((Object[]) this.f14540b);
            ArrayList arrayList = new ArrayList();
            for (List list : listArr) {
                h.a.i.aD(arrayList, list);
            }
            this.f14539a = 1;
            if (lVar.emit(arrayList, aaVar) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
