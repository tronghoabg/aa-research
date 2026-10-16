package com.waze.sound;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ej extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f39918a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ el f39919b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.a.ag f39920c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f39921d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f39922e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ej(el elVar, kotlinx.coroutines.a.ag agVar, CompletableDeferred completableDeferred, h.c.e eVar) {
        super(2, eVar);
        this.f39919b = elVar;
        this.f39920c = agVar;
        this.f39921d = completableDeferred;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ej ejVar = new ej(this.f39919b, this.f39920c, this.f39921d, eVar);
        ejVar.f39922e = obj;
        return ejVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ej) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f39918a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f39922e;
            el elVar = this.f39919b;
            elVar.f39934d.a("Recording loop started");
            this.f39918a = 1;
            if (elVar.f39937g.c().collect(new ei(elVar, this.f39920c, this.f39921d, afVar), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
