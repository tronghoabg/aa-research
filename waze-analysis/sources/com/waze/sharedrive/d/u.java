package com.waze.sharedrive.d;

import j$.time.Instant;
import java.util.Objects;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38270a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f38271b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f38272c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f38273d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f38274e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(aq aqVar, p pVar, com.waze.sharedrive.c.a.m mVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38274e = i2;
        this.f38271b = aqVar;
        this.f38272c = pVar;
        this.f38273d = mVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.waze.sharedrive.d.r, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f38274e != 0) {
            return new u((r) this.f38273d, (aq) this.f38272c, (String) this.f38271b, eVar, 1);
        }
        Object obj2 = this.f38271b;
        return new u((aq) obj2, (p) this.f38272c, (com.waze.sharedrive.c.a.m) this.f38273d, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f38274e != 0 ? ((u) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((u) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        g gVarE;
        Object objD2;
        g gVarE2;
        if (this.f38274e == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f38270a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f38271b;
                p pVar = (p) this.f38272c;
                this.f38270a = 1;
                obj = aq.e((aq) obj2, pVar.b(), pVar.c(), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            Object obj3 = this.f38271b;
            Object obj4 = this.f38272c;
            com.waze.sharedrive.ab abVar = (com.waze.sharedrive.ab) obj;
            Object objB = abVar.b();
            if (objB != null) {
                aq aqVar = (aq) obj3;
                aq.u(aqVar, ((p) obj4).b(), (com.waze.sharedrive.c.a.m) objB);
            }
            Object obj5 = this.f38273d;
            Object objC = abVar.c();
            if (objC != null) {
                aq aqVar2 = (aq) obj3;
                aq.t(aqVar2, ((p) obj4).b(), (com.waze.sharedrive.c.a.m) obj5, (com.waze.sharedrive.q) objC);
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f38270a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            g gVar = (g) this.f38273d;
            Instant instantA = gVar.b().a();
            aq aqVar3 = (aq) this.f38272c;
            aqVar3.f38219g.a("Creating share for destination: ".concat(String.valueOf(gVar.a().c())));
            com.waze.sharedrive.c.y yVar = aqVar3.f38213a;
            com.waze.sharedrive.c.a.b bVarA = gVar.a();
            Object obj6 = this.f38271b;
            this.f38270a = 1;
            obj = yVar.e(bVarA, instantA, (String) obj6, gVar.c().a(), gVar.c().e(), gVar.c().b(), this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        Object obj7 = this.f38272c;
        com.waze.sharedrive.ab abVar2 = (com.waze.sharedrive.ab) obj;
        Object objB2 = abVar2.b();
        if (objB2 != null) {
            com.waze.sharedrive.c.a.m mVar = (com.waze.sharedrive.c.a.m) objB2;
            aq aqVar4 = (aq) obj7;
            aqVar4.f38219g.a("Share created successfully, id=".concat(String.valueOf(mVar.b())));
            bn bnVar = aqVar4.f38221i;
            do {
                objD2 = bnVar.d();
                gVarE2 = (r) objD2;
                if (gVarE2 instanceof g) {
                    gVarE2 = g.e((g) gVarE2, new e(mVar));
                } else {
                    aqVar4.Q(gVarE2, "create succeeded");
                }
            } while (!bnVar.f(objD2, gVarE2));
        }
        Object objC2 = abVar2.c();
        if (objC2 != null) {
            com.waze.sharedrive.q qVar = (com.waze.sharedrive.q) objC2;
            aq aqVar5 = (aq) obj7;
            com.waze.shared_infra.i.e eVar = aqVar5.f38219g;
            Objects.toString(qVar);
            eVar.b("Share creation failed: ".concat(qVar.toString()));
            bn bnVar2 = aqVar5.f38221i;
            do {
                objD = bnVar2.d();
                gVarE = (r) objD;
                if (gVarE instanceof g) {
                    gVarE = g.e((g) gVarE, new c(qVar));
                } else {
                    aqVar5.Q(gVarE, "create failed");
                }
            } while (!bnVar2.f(objD, gVarE));
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(r rVar, aq aqVar, String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38274e = i2;
        this.f38273d = rVar;
        this.f38272c = aqVar;
        this.f38271b = str;
    }
}
