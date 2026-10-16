package com.waze.main_screen.k.a;

import com.waze.R;
import com.waze.an.c.x;
import com.waze.ui.l.aa;
import com.waze.ui.l.z;
import h.ab;
import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class m extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26539a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f26540b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f26541c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.an.c.j f26542d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(u uVar, com.waze.an.c.j jVar, h.c.e eVar) {
        super(3, eVar);
        this.f26541c = uVar;
        this.f26542d = jVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        m mVar = new m(this.f26541c, this.f26542d, (h.c.e) obj3);
        mVar.f26539a = (com.waze.an.c.f) obj;
        mVar.f26540b = zBooleanValue;
        return mVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.an.c.f fVar = (com.waze.an.c.f) this.f26539a;
        final com.waze.an.c.j jVar = this.f26542d;
        final boolean z = this.f26540b;
        final x xVar = this.f26541c.f26570d;
        h.g.b.x.f(jVar, "insightFTEStateHolder");
        h.g.b.x.f(fVar, "state");
        com.waze.an.c.e eVarA = fVar.a();
        if (eVarA instanceof com.waze.an.c.b) {
            com.waze.an.c.b bVar = (com.waze.an.c.b) fVar.a();
            final aq aqVar = new aq();
            String strA = bVar.a();
            com.waze.ui.l.v vVar = new com.waze.ui.l.v(R.raw.road_insights);
            final int i2 = 1;
            h.g.a.a aVar2 = new h.g.a.a() { // from class: com.waze.an.c.t
                @Override // h.g.a.a
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            aq aqVar2 = aqVar;
                            j jVar2 = jVar;
                            return x.k(z, xVar, jVar2, aqVar2);
                        case 1:
                            aq aqVar3 = aqVar;
                            j jVar3 = jVar;
                            return x.j(z, xVar, jVar3, aqVar3);
                        case 2:
                            aq aqVar4 = aqVar;
                            j jVar4 = jVar;
                            return x.b(z, xVar, jVar4, aqVar4);
                        case 3:
                            aq aqVar5 = aqVar;
                            j jVar5 = jVar;
                            return x.c(z, xVar, jVar5, aqVar5);
                        case 4:
                            aq aqVar6 = aqVar;
                            j jVar6 = jVar;
                            return x.f(z, xVar, jVar6, aqVar6);
                        case 5:
                            aq aqVar7 = aqVar;
                            j jVar7 = jVar;
                            return x.g(z, xVar, jVar7, aqVar7);
                        case 6:
                            aq aqVar8 = aqVar;
                            j jVar8 = jVar;
                            return x.h(z, xVar, jVar8, aqVar8);
                        case 7:
                            aq aqVar9 = aqVar;
                            j jVar9 = jVar;
                            return x.i(z, xVar, jVar9, aqVar9);
                        case 8:
                            aq aqVar10 = aqVar;
                            j jVar10 = jVar;
                            return x.d(z, xVar, jVar10, aqVar10);
                        default:
                            aq aqVar11 = aqVar;
                            j jVar11 = jVar;
                            return x.e(z, xVar, jVar11, aqVar11);
                    }
                }
            };
            final int i3 = 0;
            com.waze.ui.l.ab abVar = new com.waze.ui.l.ab(strA, vVar, null, null, z, aVar2, new h.g.a.a() { // from class: com.waze.an.c.t
                @Override // h.g.a.a
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            aq aqVar2 = aqVar;
                            j jVar2 = jVar;
                            return x.k(z, xVar, jVar2, aqVar2);
                        case 1:
                            aq aqVar3 = aqVar;
                            j jVar3 = jVar;
                            return x.j(z, xVar, jVar3, aqVar3);
                        case 2:
                            aq aqVar4 = aqVar;
                            j jVar4 = jVar;
                            return x.b(z, xVar, jVar4, aqVar4);
                        case 3:
                            aq aqVar5 = aqVar;
                            j jVar5 = jVar;
                            return x.c(z, xVar, jVar5, aqVar5);
                        case 4:
                            aq aqVar6 = aqVar;
                            j jVar6 = jVar;
                            return x.f(z, xVar, jVar6, aqVar6);
                        case 5:
                            aq aqVar7 = aqVar;
                            j jVar7 = jVar;
                            return x.g(z, xVar, jVar7, aqVar7);
                        case 6:
                            aq aqVar8 = aqVar;
                            j jVar8 = jVar;
                            return x.h(z, xVar, jVar8, aqVar8);
                        case 7:
                            aq aqVar9 = aqVar;
                            j jVar9 = jVar;
                            return x.i(z, xVar, jVar9, aqVar9);
                        case 8:
                            aq aqVar10 = aqVar;
                            j jVar10 = jVar;
                            return x.d(z, xVar, jVar10, aqVar10);
                        default:
                            aq aqVar11 = aqVar;
                            j jVar11 = jVar;
                            return x.e(z, xVar, jVar11, aqVar11);
                    }
                }
            });
            aqVar.f48105a = abVar;
            return h.a.i.d(new com.waze.an.c.w(abVar, jVar));
        }
        if (eVarA instanceof com.waze.an.c.c) {
            com.waze.an.c.c cVar = (com.waze.an.c.c) fVar.a();
            final aq aqVar2 = new aq();
            String strB = cVar.b();
            com.waze.ui.l.v vVar2 = new com.waze.ui.l.v(cVar.a());
            final int i4 = 8;
            h.g.a.a aVar3 = new h.g.a.a() { // from class: com.waze.an.c.t
                @Override // h.g.a.a
                public final Object invoke() {
                    switch (i4) {
                        case 0:
                            aq aqVar22 = aqVar2;
                            j jVar2 = jVar;
                            return x.k(z, xVar, jVar2, aqVar22);
                        case 1:
                            aq aqVar3 = aqVar2;
                            j jVar3 = jVar;
                            return x.j(z, xVar, jVar3, aqVar3);
                        case 2:
                            aq aqVar4 = aqVar2;
                            j jVar4 = jVar;
                            return x.b(z, xVar, jVar4, aqVar4);
                        case 3:
                            aq aqVar5 = aqVar2;
                            j jVar5 = jVar;
                            return x.c(z, xVar, jVar5, aqVar5);
                        case 4:
                            aq aqVar6 = aqVar2;
                            j jVar6 = jVar;
                            return x.f(z, xVar, jVar6, aqVar6);
                        case 5:
                            aq aqVar7 = aqVar2;
                            j jVar7 = jVar;
                            return x.g(z, xVar, jVar7, aqVar7);
                        case 6:
                            aq aqVar8 = aqVar2;
                            j jVar8 = jVar;
                            return x.h(z, xVar, jVar8, aqVar8);
                        case 7:
                            aq aqVar9 = aqVar2;
                            j jVar9 = jVar;
                            return x.i(z, xVar, jVar9, aqVar9);
                        case 8:
                            aq aqVar10 = aqVar2;
                            j jVar10 = jVar;
                            return x.d(z, xVar, jVar10, aqVar10);
                        default:
                            aq aqVar11 = aqVar2;
                            j jVar11 = jVar;
                            return x.e(z, xVar, jVar11, aqVar11);
                    }
                }
            };
            final int i5 = 9;
            aa aaVar = new aa(strB, vVar2, null, z, aVar3, new h.g.a.a() { // from class: com.waze.an.c.t
                @Override // h.g.a.a
                public final Object invoke() {
                    switch (i5) {
                        case 0:
                            aq aqVar22 = aqVar2;
                            j jVar2 = jVar;
                            return x.k(z, xVar, jVar2, aqVar22);
                        case 1:
                            aq aqVar3 = aqVar2;
                            j jVar3 = jVar;
                            return x.j(z, xVar, jVar3, aqVar3);
                        case 2:
                            aq aqVar4 = aqVar2;
                            j jVar4 = jVar;
                            return x.b(z, xVar, jVar4, aqVar4);
                        case 3:
                            aq aqVar5 = aqVar2;
                            j jVar5 = jVar;
                            return x.c(z, xVar, jVar5, aqVar5);
                        case 4:
                            aq aqVar6 = aqVar2;
                            j jVar6 = jVar;
                            return x.f(z, xVar, jVar6, aqVar6);
                        case 5:
                            aq aqVar7 = aqVar2;
                            j jVar7 = jVar;
                            return x.g(z, xVar, jVar7, aqVar7);
                        case 6:
                            aq aqVar8 = aqVar2;
                            j jVar8 = jVar;
                            return x.h(z, xVar, jVar8, aqVar8);
                        case 7:
                            aq aqVar9 = aqVar2;
                            j jVar9 = jVar;
                            return x.i(z, xVar, jVar9, aqVar9);
                        case 8:
                            aq aqVar10 = aqVar2;
                            j jVar10 = jVar;
                            return x.d(z, xVar, jVar10, aqVar10);
                        default:
                            aq aqVar11 = aqVar2;
                            j jVar11 = jVar;
                            return x.e(z, xVar, jVar11, aqVar11);
                    }
                }
            });
            aqVar2.f48105a = aaVar;
            return h.a.i.d(new com.waze.an.c.w(aaVar, jVar));
        }
        if (!(eVarA instanceof com.waze.an.c.d)) {
            if (!(eVarA instanceof com.waze.an.c.a)) {
                throw new h.i();
            }
            com.waze.an.c.a aVar4 = (com.waze.an.c.a) fVar.a();
            final aq aqVar3 = new aq();
            String strA2 = aVar4.a();
            com.waze.ui.l.v vVar3 = new com.waze.ui.l.v(R.raw.lets_go);
            final int i6 = 2;
            h.g.a.a aVar5 = new h.g.a.a() { // from class: com.waze.an.c.t
                @Override // h.g.a.a
                public final Object invoke() {
                    switch (i6) {
                        case 0:
                            aq aqVar22 = aqVar3;
                            j jVar2 = jVar;
                            return x.k(z, xVar, jVar2, aqVar22);
                        case 1:
                            aq aqVar32 = aqVar3;
                            j jVar3 = jVar;
                            return x.j(z, xVar, jVar3, aqVar32);
                        case 2:
                            aq aqVar4 = aqVar3;
                            j jVar4 = jVar;
                            return x.b(z, xVar, jVar4, aqVar4);
                        case 3:
                            aq aqVar5 = aqVar3;
                            j jVar5 = jVar;
                            return x.c(z, xVar, jVar5, aqVar5);
                        case 4:
                            aq aqVar6 = aqVar3;
                            j jVar6 = jVar;
                            return x.f(z, xVar, jVar6, aqVar6);
                        case 5:
                            aq aqVar7 = aqVar3;
                            j jVar7 = jVar;
                            return x.g(z, xVar, jVar7, aqVar7);
                        case 6:
                            aq aqVar8 = aqVar3;
                            j jVar8 = jVar;
                            return x.h(z, xVar, jVar8, aqVar8);
                        case 7:
                            aq aqVar9 = aqVar3;
                            j jVar9 = jVar;
                            return x.i(z, xVar, jVar9, aqVar9);
                        case 8:
                            aq aqVar10 = aqVar3;
                            j jVar10 = jVar;
                            return x.d(z, xVar, jVar10, aqVar10);
                        default:
                            aq aqVar11 = aqVar3;
                            j jVar11 = jVar;
                            return x.e(z, xVar, jVar11, aqVar11);
                    }
                }
            };
            final int i7 = 3;
            z zVar = new z(strA2, vVar3, null, aVar5, new h.g.a.a() { // from class: com.waze.an.c.t
                @Override // h.g.a.a
                public final Object invoke() {
                    switch (i7) {
                        case 0:
                            aq aqVar22 = aqVar3;
                            j jVar2 = jVar;
                            return x.k(z, xVar, jVar2, aqVar22);
                        case 1:
                            aq aqVar32 = aqVar3;
                            j jVar3 = jVar;
                            return x.j(z, xVar, jVar3, aqVar32);
                        case 2:
                            aq aqVar4 = aqVar3;
                            j jVar4 = jVar;
                            return x.b(z, xVar, jVar4, aqVar4);
                        case 3:
                            aq aqVar5 = aqVar3;
                            j jVar5 = jVar;
                            return x.c(z, xVar, jVar5, aqVar5);
                        case 4:
                            aq aqVar6 = aqVar3;
                            j jVar6 = jVar;
                            return x.f(z, xVar, jVar6, aqVar6);
                        case 5:
                            aq aqVar7 = aqVar3;
                            j jVar7 = jVar;
                            return x.g(z, xVar, jVar7, aqVar7);
                        case 6:
                            aq aqVar8 = aqVar3;
                            j jVar8 = jVar;
                            return x.h(z, xVar, jVar8, aqVar8);
                        case 7:
                            aq aqVar9 = aqVar3;
                            j jVar9 = jVar;
                            return x.i(z, xVar, jVar9, aqVar9);
                        case 8:
                            aq aqVar10 = aqVar3;
                            j jVar10 = jVar;
                            return x.d(z, xVar, jVar10, aqVar10);
                        default:
                            aq aqVar11 = aqVar3;
                            j jVar11 = jVar;
                            return x.e(z, xVar, jVar11, aqVar11);
                    }
                }
            }, z, 4);
            aqVar3.f48105a = zVar;
            return h.a.i.d(new com.waze.an.c.w(zVar, jVar));
        }
        com.waze.an.c.d dVar = (com.waze.an.c.d) fVar.a();
        final aq aqVar4 = new aq();
        final aq aqVar5 = new aq();
        String strA3 = dVar.a();
        com.waze.ui.l.v vVar4 = new com.waze.ui.l.v(R.raw.bigger_picture);
        final int i8 = 4;
        h.g.a.a aVar6 = new h.g.a.a() { // from class: com.waze.an.c.t
            @Override // h.g.a.a
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        aq aqVar22 = aqVar4;
                        j jVar2 = jVar;
                        return x.k(z, xVar, jVar2, aqVar22);
                    case 1:
                        aq aqVar32 = aqVar4;
                        j jVar3 = jVar;
                        return x.j(z, xVar, jVar3, aqVar32);
                    case 2:
                        aq aqVar42 = aqVar4;
                        j jVar4 = jVar;
                        return x.b(z, xVar, jVar4, aqVar42);
                    case 3:
                        aq aqVar52 = aqVar4;
                        j jVar5 = jVar;
                        return x.c(z, xVar, jVar5, aqVar52);
                    case 4:
                        aq aqVar6 = aqVar4;
                        j jVar6 = jVar;
                        return x.f(z, xVar, jVar6, aqVar6);
                    case 5:
                        aq aqVar7 = aqVar4;
                        j jVar7 = jVar;
                        return x.g(z, xVar, jVar7, aqVar7);
                    case 6:
                        aq aqVar8 = aqVar4;
                        j jVar8 = jVar;
                        return x.h(z, xVar, jVar8, aqVar8);
                    case 7:
                        aq aqVar9 = aqVar4;
                        j jVar9 = jVar;
                        return x.i(z, xVar, jVar9, aqVar9);
                    case 8:
                        aq aqVar10 = aqVar4;
                        j jVar10 = jVar;
                        return x.d(z, xVar, jVar10, aqVar10);
                    default:
                        aq aqVar11 = aqVar4;
                        j jVar11 = jVar;
                        return x.e(z, xVar, jVar11, aqVar11);
                }
            }
        };
        final int i9 = 5;
        aa aaVar2 = new aa(strA3, vVar4, null, z, aVar6, new h.g.a.a() { // from class: com.waze.an.c.t
            @Override // h.g.a.a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        aq aqVar22 = aqVar4;
                        j jVar2 = jVar;
                        return x.k(z, xVar, jVar2, aqVar22);
                    case 1:
                        aq aqVar32 = aqVar4;
                        j jVar3 = jVar;
                        return x.j(z, xVar, jVar3, aqVar32);
                    case 2:
                        aq aqVar42 = aqVar4;
                        j jVar4 = jVar;
                        return x.b(z, xVar, jVar4, aqVar42);
                    case 3:
                        aq aqVar52 = aqVar4;
                        j jVar5 = jVar;
                        return x.c(z, xVar, jVar5, aqVar52);
                    case 4:
                        aq aqVar6 = aqVar4;
                        j jVar6 = jVar;
                        return x.f(z, xVar, jVar6, aqVar6);
                    case 5:
                        aq aqVar7 = aqVar4;
                        j jVar7 = jVar;
                        return x.g(z, xVar, jVar7, aqVar7);
                    case 6:
                        aq aqVar8 = aqVar4;
                        j jVar8 = jVar;
                        return x.h(z, xVar, jVar8, aqVar8);
                    case 7:
                        aq aqVar9 = aqVar4;
                        j jVar9 = jVar;
                        return x.i(z, xVar, jVar9, aqVar9);
                    case 8:
                        aq aqVar10 = aqVar4;
                        j jVar10 = jVar;
                        return x.d(z, xVar, jVar10, aqVar10);
                    default:
                        aq aqVar11 = aqVar4;
                        j jVar11 = jVar;
                        return x.e(z, xVar, jVar11, aqVar11);
                }
            }
        });
        com.waze.ui.l.v vVar5 = new com.waze.ui.l.v(R.raw.how_long);
        final int i10 = 6;
        h.g.a.a aVar7 = new h.g.a.a() { // from class: com.waze.an.c.t
            @Override // h.g.a.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        aq aqVar22 = aqVar5;
                        j jVar2 = jVar;
                        return x.k(z, xVar, jVar2, aqVar22);
                    case 1:
                        aq aqVar32 = aqVar5;
                        j jVar3 = jVar;
                        return x.j(z, xVar, jVar3, aqVar32);
                    case 2:
                        aq aqVar42 = aqVar5;
                        j jVar4 = jVar;
                        return x.b(z, xVar, jVar4, aqVar42);
                    case 3:
                        aq aqVar52 = aqVar5;
                        j jVar5 = jVar;
                        return x.c(z, xVar, jVar5, aqVar52);
                    case 4:
                        aq aqVar6 = aqVar5;
                        j jVar6 = jVar;
                        return x.f(z, xVar, jVar6, aqVar6);
                    case 5:
                        aq aqVar7 = aqVar5;
                        j jVar7 = jVar;
                        return x.g(z, xVar, jVar7, aqVar7);
                    case 6:
                        aq aqVar8 = aqVar5;
                        j jVar8 = jVar;
                        return x.h(z, xVar, jVar8, aqVar8);
                    case 7:
                        aq aqVar9 = aqVar5;
                        j jVar9 = jVar;
                        return x.i(z, xVar, jVar9, aqVar9);
                    case 8:
                        aq aqVar10 = aqVar5;
                        j jVar10 = jVar;
                        return x.d(z, xVar, jVar10, aqVar10);
                    default:
                        aq aqVar11 = aqVar5;
                        j jVar11 = jVar;
                        return x.e(z, xVar, jVar11, aqVar11);
                }
            }
        };
        final int i11 = 7;
        com.waze.ui.l.r rVar = new com.waze.ui.l.r(vVar5, z, null, aVar7, new h.g.a.a() { // from class: com.waze.an.c.t
            @Override // h.g.a.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        aq aqVar22 = aqVar5;
                        j jVar2 = jVar;
                        return x.k(z, xVar, jVar2, aqVar22);
                    case 1:
                        aq aqVar32 = aqVar5;
                        j jVar3 = jVar;
                        return x.j(z, xVar, jVar3, aqVar32);
                    case 2:
                        aq aqVar42 = aqVar5;
                        j jVar4 = jVar;
                        return x.b(z, xVar, jVar4, aqVar42);
                    case 3:
                        aq aqVar52 = aqVar5;
                        j jVar5 = jVar;
                        return x.c(z, xVar, jVar5, aqVar52);
                    case 4:
                        aq aqVar6 = aqVar5;
                        j jVar6 = jVar;
                        return x.f(z, xVar, jVar6, aqVar6);
                    case 5:
                        aq aqVar7 = aqVar5;
                        j jVar7 = jVar;
                        return x.g(z, xVar, jVar7, aqVar7);
                    case 6:
                        aq aqVar8 = aqVar5;
                        j jVar8 = jVar;
                        return x.h(z, xVar, jVar8, aqVar8);
                    case 7:
                        aq aqVar9 = aqVar5;
                        j jVar9 = jVar;
                        return x.i(z, xVar, jVar9, aqVar9);
                    case 8:
                        aq aqVar10 = aqVar5;
                        j jVar10 = jVar;
                        return x.d(z, xVar, jVar10, aqVar10);
                    default:
                        aq aqVar11 = aqVar5;
                        j jVar11 = jVar;
                        return x.e(z, xVar, jVar11, aqVar11);
                }
            }
        }, 4);
        aqVar4.f48105a = aaVar2;
        aqVar5.f48105a = rVar;
        com.waze.an.c.j jVar2 = jVar;
        return h.a.i.i(new com.waze.an.c.w(aaVar2, jVar2), new com.waze.an.c.w(rVar, jVar2));
    }
}
