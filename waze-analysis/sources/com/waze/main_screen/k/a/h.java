package com.waze.main_screen.k.a;

import com.waze.an.c.af;
import h.ab;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f26524a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26525b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f26526c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f26527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(h.c.e eVar, u uVar) {
        super(3, eVar);
        this.f26526c = uVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        h hVar = new h((h.c.e) obj3, this.f26526c);
        hVar.f26527d = (kotlinx.coroutines.b.l) obj;
        hVar.f26525b = obj2;
        return hVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.b.k kVarN;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26524a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.f26527d;
            h hVar = this;
            a aVar2 = (a) this.f26525b;
            com.waze.an.c.k kVarA = aVar2.a();
            com.waze.an.c.a.p pVarC = aVar2.c();
            if (kVarA instanceof com.waze.an.c.j) {
                kVarN = this.f26526c.g((com.waze.an.c.j) kVarA);
            } else {
                if (!(kVarA instanceof com.waze.an.c.a.p) && !(kVarA instanceof af) && kVarA != null) {
                    throw new h.i();
                }
                kVarN = this.f26526c.n(kVarA instanceof af ? (af) kVarA : null, pVarC);
            }
            this.f26524a = 1;
            if (ai.g(lVar, kVarN, hVar) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
