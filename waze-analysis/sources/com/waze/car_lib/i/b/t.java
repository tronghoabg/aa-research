package com.waze.car_lib.i.b;

import com.waze.an.a.a.bd;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class t extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20027a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f20028b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f20029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(h.c.e eVar, int i2) {
        super(3, eVar);
        this.f20029c = i2;
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f20029c != 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            t tVar = new t((h.c.e) obj3, 1, null);
            tVar.f20028b = zBooleanValue;
            tVar.f20027a = (bd) obj2;
            return tVar.invokeSuspend(h.ab.f48028a);
        }
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        t tVar2 = new t((h.c.e) obj3, 0);
        tVar2.f20027a = (com.waze.bv.h) obj;
        tVar2.f20028b = zBooleanValue2;
        return tVar2.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f20029c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return new s((com.waze.bv.h) this.f20027a, this.f20028b);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f20028b;
        return new h.k(Boolean.valueOf(z), (bd) this.f20027a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(h.c.e eVar, int i2, byte[] bArr) {
        super(3, eVar);
        this.f20029c = i2;
    }
}
