package com.waze.network.b;

import com.waze.gk;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class an extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f31945a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f31946b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f31947c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(gk gkVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31947c = i2;
        this.f31946b = gkVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.gk, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f31947c;
        if (i2 == 0) {
            return new an((gk) this.f31946b, eVar, 0);
        }
        Object obj2 = this.f31946b;
        return i2 != 1 ? new an((bc) obj2, eVar, 2) : new an((ag) obj2, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f31947c;
        return i2 != 0 ? i2 != 1 ? ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((an) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.waze.gk, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f31947c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f31945a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f31945a = 1;
                if (this.f31946b.waitForOnline(this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f31945a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f31945a = 1;
                if (((bc) this.f31946b).f32004h.b(this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f31945a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj2 = this.f31946b;
            this.f31945a = 1;
            if (ag.f((ag) obj2, this) == aVar3) {
                return aVar3;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(ag agVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31947c = i2;
        this.f31946b = agVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(bc bcVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31947c = i2;
        this.f31946b = bcVar;
    }
}
