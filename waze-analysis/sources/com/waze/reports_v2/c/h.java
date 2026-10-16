package com.waze.reports_v2.c;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f34491a;

    /* renamed from: b, reason: collision with root package name */
    int f34492b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f34493c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f34494d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f34495e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f34496f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(k kVar, CompletableDeferred completableDeferred, h.g.a.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f34493c = kVar;
        this.f34494d = completableDeferred;
        this.f34495e = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        h hVar = new h(this.f34493c, this.f34494d, this.f34495e, eVar);
        hVar.f34496f = obj;
        return hVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        CompletableDeferred completableDeferred;
        h.g.a.l lVar;
        CompletableDeferred completableDeferred2;
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.f34492b;
        try {
        } catch (Throwable th) {
            e.b.c.a(th);
        }
        if (i2 == 0) {
            e.b.c.b(obj);
            k kVar = this.f34493c;
            completableDeferred = this.f34494d;
            lVar = this.f34495e;
            p pVar = kVar.f34512d;
            this.f34496f = completableDeferred;
            this.f34491a = lVar;
            this.f34492b = 1;
            if (pVar.a(this) != aVar) {
            }
            return aVar;
        }
        if (i2 != 1) {
            completableDeferred2 = (CompletableDeferred) this.f34496f;
            e.b.c.b(obj);
            completableDeferred2.a(obj);
            this.f34493c.f34515g.decrementAndGet();
            return h.ab.f48028a;
        }
        h.g.a.l lVar2 = (h.g.a.l) this.f34491a;
        CompletableDeferred completableDeferred3 = (CompletableDeferred) this.f34496f;
        e.b.c.b(obj);
        lVar = lVar2;
        completableDeferred = completableDeferred3;
        this.f34496f = completableDeferred;
        this.f34491a = null;
        this.f34492b = 2;
        obj = lVar.invoke(this);
        if (obj == aVar) {
            return aVar;
        }
        completableDeferred2 = completableDeferred;
        completableDeferred2.a(obj);
        this.f34493c.f34515g.decrementAndGet();
        return h.ab.f48028a;
    }
}
