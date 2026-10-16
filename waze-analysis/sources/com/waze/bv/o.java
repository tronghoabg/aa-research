package com.waze.bv;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17543a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17544b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f17545c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(h.c.e eVar, int i2) {
        super(3, eVar);
        this.f17545c = i2;
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f17545c != 0) {
            o oVar = new o((h.c.e) obj3, 1, null);
            oVar.f17543a = (n) obj;
            oVar.f17544b = (d) obj2;
            return oVar.invokeSuspend(ab.f48028a);
        }
        o oVar2 = new o((h.c.e) obj3, 0);
        oVar2.f17543a = (d) obj;
        oVar2.f17544b = (h) obj2;
        return oVar2.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f17545c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return new h.k((n) this.f17543a, (d) this.f17544b);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new h.k((d) this.f17543a, (h) this.f17544b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(h.c.e eVar, int i2, byte[] bArr) {
        super(3, eVar);
        this.f17545c = i2;
    }
}
