package com.waze.bv;

import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f17526a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f17527b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f17528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f17528c = i2;
        this.f17527b = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f17528c != 0 ? new k(this.f17527b, eVar, 1, null) : new k(this.f17527b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f17528c != 0 ? ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f17528c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f17526a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                l lVar = this.f17527b;
                this.f17526a = 1;
                if (ai.B(ai.q(ai.D(lVar.f17530b.speedometerData()), g.a(), new o(null, 1, null)), new j(null)).collect(new p(lVar, 1), this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f17526a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            l lVar2 = this.f17527b;
            q qVar = lVar2.f17531c;
            bn bnVar = lVar2.f17536h;
            this.f17526a = 1;
            Object objCollect = ai.q(g.a(), bnVar, new o(null, 0)).collect(new p(qVar, 0), this);
            if (objCollect != aVar2) {
                objCollect = ab.f48028a;
            }
            if (objCollect == aVar2) {
                return aVar2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f17528c = i2;
        this.f17527b = lVar;
    }
}
