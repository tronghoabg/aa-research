package com.waze.tide.a;

import com.waze.l.r;
import com.waze.l.t;
import com.waze.l.u;
import com.waze.l.v;
import com.waze.tide.o;
import com.waze.tide.x;
import com.waze.ui.a.l;
import h.ab;
import h.g.a.p;
import h.i;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private final o f40921a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.tide.g f40922b;

    /* renamed from: c, reason: collision with root package name */
    private final x f40923c;

    /* renamed from: d, reason: collision with root package name */
    private final af f40924d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f40925e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f40926f;

    /* renamed from: g, reason: collision with root package name */
    private final v f40927g;

    public g(o oVar, com.waze.tide.g gVar, x xVar, u uVar) {
        h.g.b.x.f(oVar, "tideController");
        h.g.b.x.f(gVar, "tideConfig");
        h.g.b.x.f(xVar, "statSender");
        h.g.b.x.f(uVar, "wazeBluetoothPermissionsStateHolderFactory");
        this.f40921a = oVar;
        this.f40922b = gVar;
        this.f40923c = xVar;
        this.f40924d = l.p(this, "TideBluetoothPermissionStateHolder");
        final int i2 = 0;
        bn bnVarB = ck.b(false);
        this.f40925e = bnVarB;
        this.f40926f = ai.U(bnVarB);
        final int i3 = 1;
        h.g.a.a aVar = new h.g.a.a(this) { // from class: com.waze.tide.a.b

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f40913a;

            {
                this.f40913a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i4 = i3;
                if (i4 == 0) {
                    return g.h(this.f40913a);
                }
                g gVar2 = this.f40913a;
                return i4 != 1 ? g.j(gVar2) : Boolean.valueOf(g.m(gVar2));
            }
        };
        com.waze.bx.a aVar2 = new com.waze.bx.a(9);
        c cVar = new c(this, i3);
        h.g.a.a aVar3 = new h.g.a.a(this) { // from class: com.waze.tide.a.b

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f40913a;

            {
                this.f40913a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i4 = i2;
                if (i4 == 0) {
                    return g.h(this.f40913a);
                }
                g gVar2 = this.f40913a;
                return i4 != 1 ? g.j(gVar2) : Boolean.valueOf(g.m(gVar2));
            }
        };
        c cVar2 = new c(this, i2);
        final int i4 = 2;
        this.f40927g = u.a(aVar, aVar2, cVar, aVar3, cVar2, new h.g.a.a(this) { // from class: com.waze.tide.a.b

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f40913a;

            {
                this.f40913a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i42 = i4;
                if (i42 == 0) {
                    return g.h(this.f40913a);
                }
                g gVar2 = this.f40913a;
                return i42 != 1 ? g.j(gVar2) : Boolean.valueOf(g.m(gVar2));
            }
        }, new p() { // from class: com.waze.tide.a.d
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                return g.k(this.f40917a, (r) obj, zBooleanValue);
            }
        });
    }

    static final ab g(g gVar, boolean z) {
        gVar.f40922b.d(z);
        return ab.f48028a;
    }

    static final ab h(g gVar) {
        gVar.f40923c.c(t.f25124b);
        return ab.f48028a;
    }

    static final ab i(g gVar, boolean z) {
        gVar.f40923c.d(z, t.f25124b);
        return ab.f48028a;
    }

    static final ab j(g gVar) {
        gVar.f40923c.b(t.f25124b);
        return ab.f48028a;
    }

    static final ab k(g gVar, r rVar, boolean z) {
        com.waze.tide.v vVar;
        h.g.b.x.f(rVar, "action");
        r rVar2 = r.f25115a;
        int iOrdinal = rVar.ordinal();
        if (iOrdinal == 0) {
            vVar = com.waze.tide.v.f40964a;
        } else if (iOrdinal == 1) {
            vVar = com.waze.tide.v.f40965b;
        } else {
            if (iOrdinal != 2) {
                throw new i();
            }
            vVar = com.waze.tide.v.f40967d;
        }
        gVar.f40923c.a(vVar, t.f25124b, z);
        return ab.f48028a;
    }

    static final boolean m(g gVar) {
        return gVar.f40922b.e();
    }

    @Override // com.waze.tide.a.a
    public final v a() {
        return this.f40927g;
    }

    @Override // com.waze.tide.a.a
    public final ch b() {
        return this.f40926f;
    }

    @Override // com.waze.tide.a.a
    public final void c() {
        this.f40925e.e(false);
        this.f40921a.b();
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f40924d, null);
    }

    @Override // com.waze.tide.a.a
    public final void d() {
        aj.z(this.f40924d, null, null, new f(this, null), 3);
    }

    @Override // com.waze.tide.a.a
    public final boolean e() {
        return this.f40921a.c();
    }
}
