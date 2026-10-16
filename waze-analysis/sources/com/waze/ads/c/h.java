package com.waze.ads.c;

import com.waze.search.v2.gb;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f13964a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f13965b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f13966c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f13967d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(m mVar, com.waze.ads.a.f fVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f13967d = i2;
        this.f13965b = mVar;
        this.f13966c = fVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f13967d;
        if (i2 == 0) {
            return new h((m) this.f13965b, (com.waze.ads.a.f) this.f13966c, eVar, 0);
        }
        if (i2 != 1) {
            return new h((m) this.f13965b, (com.waze.ads.a.f) this.f13966c, eVar, 2, null);
        }
        return new h((m) this.f13966c, (String) this.f13965b, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f13967d;
        return i2 != 0 ? i2 != 1 ? ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Object objD2;
        f fVar;
        int i2 = this.f13967d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f13964a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f13965b;
                Object obj3 = this.f13966c;
                this.f13964a = 1;
                obj = ((m) obj2).f13985f.b((com.waze.ads.a.f) obj3, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            h.o.a aVar2 = (h.o.a) obj;
            if (aVar2 != null) {
                ((m) this.f13965b).f13980a.b((com.waze.ads.a.f) this.f13966c, aVar2.w());
            }
            bn bnVar = ((m) this.f13965b).f13989j;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, f.g((f) objD, false, aVar2, null, null, 27)));
            return ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f13964a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj4 = this.f13966c;
                Object obj5 = this.f13965b;
                this.f13964a = 1;
                if (((m) obj4).f13982c.a((String) obj5, this) == aVar3) {
                    return aVar3;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        if (this.f13964a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj6 = this.f13965b;
            Object obj7 = this.f13966c;
            this.f13964a = 1;
            obj = ((m) obj6).f13985f.c((com.waze.ads.a.f) obj7, this);
            if (obj == aVar4) {
                return aVar4;
            }
        }
        com.waze.av.d.k kVar = (com.waze.av.d.k) obj;
        bn bnVar2 = ((m) this.f13965b).f13989j;
        do {
            objD2 = bnVar2.d();
            fVar = (f) objD2;
        } while (!bnVar2.f(objD2, f.g(fVar, false, null, kVar, kVar != null ? gb.j(kVar, 0, null, false, 15) : fVar.c(), 7)));
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(m mVar, com.waze.ads.a.f fVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f13967d = i2;
        this.f13965b = mVar;
        this.f13966c = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(m mVar, String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f13967d = i2;
        this.f13966c = mVar;
        this.f13965b = str;
    }
}
