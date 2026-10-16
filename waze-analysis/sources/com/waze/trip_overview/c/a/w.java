package com.waze.trip_overview.c.a;

import com.waze.map.b.dz;
import com.waze.trip_overview.bs;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class w extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f41265a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f41266b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f41267c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(h.c.e eVar, int i2) {
        super(3, eVar);
        this.f41267c = i2;
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f41267c != 0) {
            w wVar = new w((h.c.e) obj3, 1, null);
            wVar.f41265a = (ad) obj;
            wVar.f41266b = (dz) obj2;
            return wVar.invokeSuspend(h.ab.f48028a);
        }
        w wVar2 = new w((h.c.e) obj3, 0);
        wVar2.f41265a = (ae) obj;
        wVar2.f41266b = (bs) obj2;
        return wVar2.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f41267c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return new h.k((ad) this.f41265a, (dz) this.f41266b);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new h.k((ae) this.f41265a, (bs) this.f41266b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(h.c.e eVar, int i2, byte[] bArr) {
        super(3, eVar);
        this.f41267c = i2;
    }
}
