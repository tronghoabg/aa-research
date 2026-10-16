package com.waze.car_lib.a;

import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ac extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18812a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f18813b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f18814c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f18815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ae aeVar, com.waze.ads.a.f fVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18815d = i2;
        this.f18813b = aeVar;
        this.f18814c = fVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f18815d;
        if (i2 == 0) {
            return new ac((ae) this.f18813b, (com.waze.ads.a.f) this.f18814c, eVar, 0);
        }
        if (i2 == 1) {
            return new ac((ae) this.f18814c, (String) this.f18813b, eVar, 1);
        }
        if (i2 != 2) {
            return new ac((ae) this.f18814c, (String) this.f18813b, eVar, 3, (byte[]) null);
        }
        return new ac((ae) this.f18813b, (com.waze.ads.a.f) this.f18814c, eVar, 2, (byte[]) null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f18815d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((ac) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ac) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ac) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ac) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Object objD2;
        Object objD3;
        Object objD4;
        Object objD5;
        int i2 = this.f18815d;
        e eVar = null;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f18812a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f18813b;
                Object obj3 = this.f18814c;
                this.f18812a = 1;
                obj = ((ae) obj2).f18821b.b((com.waze.ads.a.f) obj3, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            h.o.a aVar2 = (h.o.a) obj;
            if (aVar2 != null) {
                Object obj4 = this.f18813b;
                Object obj5 = this.f18814c;
                ((ae) obj4).f18822c.b((com.waze.ads.a.f) obj5, aVar2.w());
            }
            bn bnVar = ((ae) this.f18813b).f18826g;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, ab.e((ab) objD, false, aVar2, null, 11)));
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f18812a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj6 = this.f18814c;
                Object obj7 = this.f18813b;
                this.f18812a = 1;
                if (((ae) obj6).f18823d.a((String) obj7, this) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f18812a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj8 = this.f18813b;
                Object obj9 = this.f18814c;
                this.f18812a = 1;
                obj = ((ae) obj8).f18821b.c((com.waze.ads.a.f) obj9, this);
                if (obj == aVar4) {
                    return aVar4;
                }
            }
            com.waze.av.d.k kVar = (com.waze.av.d.k) obj;
            bn bnVar2 = ((ae) this.f18813b).f18826g;
            do {
                objD2 = bnVar2.d();
            } while (!bnVar2.f(objD2, ab.e((ab) objD2, false, null, kVar, 7)));
            return h.ab.f48028a;
        }
        h.c.a.a aVar5 = h.c.a.a.f48038a;
        if (this.f18812a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ae aeVar = (ae) this.f18814c;
            bn bnVar3 = aeVar.f18826g;
            do {
                objD3 = bnVar3.d();
            } while (!bnVar3.f(objD3, ab.e((ab) objD3, true, null, null, 13)));
            com.waze.ads.a.a aVar6 = aeVar.f18821b;
            Object obj10 = this.f18813b;
            this.f18812a = 1;
            obj = aVar6.a((String) obj10, this);
            if (obj == aVar5) {
                return aVar5;
            }
        }
        com.waze.ads.a.f fVar = (com.waze.ads.a.f) obj;
        Object obj11 = this.f18814c;
        if (fVar != null) {
            ae aeVar2 = (ae) obj11;
            bn bnVar4 = aeVar2.f18826g;
            do {
                objD4 = bnVar4.d();
            } while (!bnVar4.f(objD4, new ab(fVar)));
            aeVar2.f18822c.d(fVar, false);
            aj.z(aeVar2.f18824e, null, null, new ac(aeVar2, fVar, (h.c.e) null, 0), 3);
            aj.z(aeVar2.f18824e, null, null, new ac(aeVar2, fVar, (h.c.e) null, 2, (byte[]) null), 3);
            return h.ab.f48028a;
        }
        ae aeVar3 = (ae) obj11;
        bn bnVar5 = aeVar3.f18826g;
        do {
            objD5 = bnVar5.d();
        } while (!bnVar5.f(objD5, ab.e((ab) objD5, false, null, null, 12)));
        e eVar2 = aeVar3.f18825f;
        if (eVar2 == null) {
            h.g.b.x.j("controller");
        } else {
            eVar = eVar2;
        }
        eVar.a();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ae aeVar, com.waze.ads.a.f fVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f18815d = i2;
        this.f18813b = aeVar;
        this.f18814c = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ae aeVar, String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18815d = i2;
        this.f18814c = aeVar;
        this.f18813b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ae aeVar, String str, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f18815d = i2;
        this.f18814c = aeVar;
        this.f18813b = str;
    }
}
