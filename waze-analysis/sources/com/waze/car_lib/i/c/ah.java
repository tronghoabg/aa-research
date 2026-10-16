package com.waze.car_lib.i.c;

import com.waze.navigate.an;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ah extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20077a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f20078b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f20079c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f20080d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f20081e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(t tVar, kotlinx.coroutines.b.k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20081e = i2;
        this.f20079c = tVar;
        this.f20078b = kVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f20081e == 0) {
            ah ahVar = new ah(this.f20078b, (ai) this.f20079c, eVar, 0);
            ahVar.f20080d = obj;
            return ahVar;
        }
        ah ahVar2 = new ah((t) this.f20079c, this.f20078b, eVar, 1);
        ahVar2.f20080d = obj;
        return ahVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f20081e != 0 ? ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f20081e == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f20077a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f20080d;
                bn bnVarB = ck.b(new u(null, null));
                Object obj2 = this.f20079c;
                ai aiVar = (ai) obj2;
                aj.z(afVar, null, null, new af(aiVar, bnVarB, null, 1, null), 3);
                aj.z(afVar, null, null, new af(aiVar, bnVarB, null, 0), 3);
                this.f20077a = 1;
                if (kotlinx.coroutines.b.ai.q(bnVarB, this.f20078b, new ag(null, 0)).collect(new v(obj2, 2), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f20077a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar2 = (kotlinx.coroutines.af) this.f20080d;
            Object obj3 = this.f20079c;
            t tVar = (t) obj3;
            tVar.f20134f.f(afVar2);
            ch chVarJ = tVar.f20130b.J();
            kotlinx.coroutines.b.k kVarA = tVar.f20131c.a(this.f20078b);
            kotlinx.coroutines.b.k kVarQ = kotlinx.coroutines.b.ai.q(tVar.f20134f.e(), tVar.f20132d.al(), new ag(null, 1, null));
            ch chVar = chVarJ;
            ch<com.waze.map.z> routeColorsFlow = tVar.f20129a.getRouteColorsFlow();
            ch chVarI = tVar.n.f() ? tVar.f20133e.I() : kotlinx.coroutines.b.ai.G(an.f30997a);
            this.f20077a = 1;
            if (new s(new s(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.t(chVar, routeColorsFlow, kVarA, kVarQ, chVarI, new n(obj3)), new o(tVar, null)), tVar, 1), tVar, 0).collect(new v(obj3, 1), this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(kotlinx.coroutines.b.k kVar, ai aiVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20081e = i2;
        this.f20078b = kVar;
        this.f20079c = aiVar;
    }
}
