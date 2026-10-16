package com.waze.br.c;

import androidx.compose.runtime.MutableFloatState;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f17389a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f17390b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MutableFloatState f17391c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f17392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(w wVar, MutableFloatState mutableFloatState, h.c.e eVar) {
        super(2, eVar);
        this.f17390b = wVar;
        this.f17391c = mutableFloatState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        c cVar = new c(this.f17390b, this.f17391c, eVar);
        cVar.f17392d = obj;
        return cVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        af afVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f17389a != 0) {
            afVar = (af) this.f17392d;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            afVar = (af) this.f17392d;
        }
        while (aj.j(afVar)) {
            MutableFloatState mutableFloatState = this.f17391c;
            h.j.e eVar = h.j.f.f48136a;
            float fA = eVar.a();
            mutableFloatState.setFloatValue((fA * 0.39000002f) + 0.01f);
            h.o.c cVar = h.o.a.f48264a;
            this.f17392d = afVar;
            this.f17389a = 1;
            if (aj.r(h.o.c.j(eVar.g(), h.o.d.f48272c), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
