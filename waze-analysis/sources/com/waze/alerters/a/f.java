package com.waze.alerters.a;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f14158a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f14159b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f14160c;

    public f(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        f fVar = new f((h.c.e) obj3);
        fVar.f14160c = (kotlinx.coroutines.b.l) obj;
        fVar.f14159b = (Object[]) obj2;
        return fVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f14158a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.f14160c;
            List listR = h.a.i.r(h.a.c.X((List[]) ((Object[]) this.f14159b)));
            this.f14158a = 1;
            if (lVar.emit(listR, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
