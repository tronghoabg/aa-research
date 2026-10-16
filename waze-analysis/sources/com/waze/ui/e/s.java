package com.waze.ui.e;

import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f42239a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f42240b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(v vVar, h.c.e eVar) {
        super(1, eVar);
        this.f42240b = vVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(h.c.e<?> eVar) {
        return new s(this.f42240b, eVar);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((s) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [h.ab, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            if (this.f42239a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                v vVar = this.f42240b;
                if (w.a(vVar.b()) && vVar.b() == x.f42258g) {
                    return h.ab.f48028a;
                }
                vVar.l(ac.b(vVar.c()));
                CompletableDeferred completableDeferredJ = bo.j();
                vVar.i(completableDeferredJ);
                vVar.j(x.f42252a);
                this.f42239a = 1;
                if (completableDeferredJ.c(this) == aVar) {
                    return aVar;
                }
            }
            this.f42240b.i(null);
            this = h.ab.f48028a;
            return this;
        } catch (Throwable th) {
            this.f42240b.i(null);
            throw th;
        }
    }
}
