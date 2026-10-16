package com.waze.reports_v2.c;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f34487a;

    /* renamed from: b, reason: collision with root package name */
    int f34488b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f34489c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f34490d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(CompletableDeferred completableDeferred, h.g.a.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f34489c = completableDeferred;
        this.f34490d = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new g(this.f34489c, this.f34490d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        CompletableDeferred completableDeferred;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34488b != 0) {
            completableDeferred = (CompletableDeferred) this.f34487a;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            CompletableDeferred completableDeferred2 = this.f34489c;
            h.g.a.l lVar = this.f34490d;
            this.f34487a = completableDeferred2;
            this.f34488b = 1;
            Object objInvoke = lVar.invoke(this);
            if (objInvoke == aVar) {
                return aVar;
            }
            obj = objInvoke;
            completableDeferred = completableDeferred2;
        }
        completableDeferred.a(obj);
        return h.ab.f48028a;
    }
}
