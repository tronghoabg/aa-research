package com.waze.ui.e;

import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f42243a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f42244b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f42245c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(v vVar, int i2, h.c.e eVar) {
        super(1, eVar);
        this.f42244b = vVar;
        this.f42245c = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(h.c.e<?> eVar) {
        return new u(this.f42244b, this.f42245c, eVar);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((u) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            if (this.f42243a == 0) {
                e.b.c.b(obj);
                v vVar = this.f42244b;
                if (w.a(vVar.b())) {
                    int iA = vVar.a();
                    vVar.l(new ac(new Integer(this.f42245c)));
                    if (iA == 1) {
                        vVar.j(x.f42255d);
                        CompletableDeferred completableDeferredJ = bo.j();
                        vVar.i(completableDeferredJ);
                        this.f42243a = 1;
                        if (completableDeferredJ.c(this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return h.ab.f48028a;
            }
            e.b.c.b(obj);
            v vVar2 = this.f42244b;
            vVar2.l(ac.b(vVar2.c()));
            this.f42244b.i(null);
            return h.ab.f48028a;
        } catch (Throwable th) {
            this.f42244b.i(null);
            throw th;
        }
    }
}
