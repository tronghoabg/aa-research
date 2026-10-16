package com.waze.av.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aw extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15899a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ be f15900b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.av.a.p f15901c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f15902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(be beVar, com.waze.av.a.p pVar, h.g.a.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f15900b = beVar;
        this.f15901c = pVar;
        this.f15902d = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        aw awVar = new aw(this.f15900b, this.f15901c, this.f15902d, eVar);
        awVar.f15899a = obj;
        return awVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aw) create((List) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list = (List) this.f15899a;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.waze.av.a.p pVar = this.f15901c;
                aa aaVar = (aa) it.next();
                if (be.p(pVar, aaVar.a()) && ((Boolean) this.f15902d.invoke(aaVar)).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
