package com.waze.view.popups.a;

import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class m extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f45213a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f45214b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(aa aaVar, h.c.e eVar) {
        super(2, eVar);
        this.f45214b = aaVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new m(this.f45214b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((m) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f45213a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            aa aaVar = this.f45214b;
            this.f45213a = 1;
            if (ai.y(new l(aaVar.f45150k)).collect(new i(aaVar), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
