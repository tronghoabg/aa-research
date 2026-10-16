package com.waze.an.c.a;

import com.waze.R;
import com.waze.an.a.v;
import com.waze.an.a.x;
import com.waze.an.c.ag;
import com.waze.an.c.ah;
import com.waze.an.c.ai;
import com.waze.an.c.aj;
import com.waze.copilot.a.w;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p implements com.waze.an.c.k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.a.p f14716a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f14717b;

    /* renamed from: c, reason: collision with root package name */
    private final af f14718c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f14719d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f14720e;

    /* renamed from: f, reason: collision with root package name */
    private ai f14721f;

    /* renamed from: g, reason: collision with root package name */
    private final ch f14722g;

    /* renamed from: h, reason: collision with root package name */
    private final v f14723h;

    /* renamed from: i, reason: collision with root package name */
    private final x f14724i;

    /* renamed from: j, reason: collision with root package name */
    private br f14725j;

    /* renamed from: k, reason: collision with root package name */
    private final w f14726k;

    public p(com.waze.an.a.p pVar, com.waze.shared_infra.o.a aVar, w wVar, boolean z) {
        h.g.b.x.f(pVar, "segmentInsightDescriptor");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(wVar, "config");
        this.f14716a = pVar;
        this.f14717b = aVar;
        this.f14726k = wVar;
        af afVarP = com.waze.ui.a.l.p(this, null);
        this.f14718c = afVarP;
        boolean z2 = false;
        bn bnVarB = ck.b(false);
        this.f14719d = bnVarB;
        if (z && pVar.e()) {
            z2 = true;
        }
        bn bnVarB2 = ck.b(Boolean.valueOf(z2));
        this.f14720e = bnVarB2;
        this.f14721f = p((com.waze.an.a.n) pVar.b().d(), null, ((Boolean) bnVarB.d()).booleanValue(), ((Boolean) bnVarB2.d()).booleanValue());
        kotlinx.coroutines.b.k kVarR = kotlinx.coroutines.b.ai.r(pVar.b(), bnVarB, bnVarB2, new o(this, null));
        int i2 = bz.f51630a;
        this.f14722g = kotlinx.coroutines.b.ai.V(kVarR, afVarP, by.b(), this.f14721f);
        this.f14723h = pVar.a();
        this.f14724i = pVar.j();
    }

    static final ab n(p pVar) {
        pVar.f14720e.e(false);
        pVar.f14716a.c();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ai p(com.waze.an.a.n nVar, ai aiVar, boolean z, boolean z2) {
        String str;
        String strC;
        ag agVar;
        ah ahVarB;
        aj ajVar = z2 ? aj.f14761a : aj.f14762b;
        com.waze.shared_infra.o.a aVar = this.f14717b;
        com.waze.an.a.p pVar = this.f14716a;
        String strC2 = aVar.c(pVar.a().b().c(), new Object[0]);
        if (nVar.c() != null) {
            str = h.o.a.n(com.waze.settings.h.c.e(nVar.c().w())) + " " + aVar.c(R.string.MIN, new Object[0]);
        } else {
            com.waze.sharedui.utils.c cVar = new com.waze.sharedui.utils.c(nVar.a(), true);
            str = cVar.a() + " " + cVar.c(aVar);
        }
        int iOrdinal = ajVar.ordinal();
        if (iOrdinal == 0) {
            strC = aVar.c(R.string.INSIGHTS_SEGMENT_TEMPLATE_AT_START_TRAFFIC_PS_PS, strC2, str);
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            strC = str;
        }
        ah ahVar = null;
        if (z) {
            String strC3 = aVar.c(R.string.INSIGHTS_SEGMENT_TEMPLATE_WITHIN_EXPANDED_TRAFFIC_PS_PS, strC2, str);
            if (aiVar == null || (ahVarB = aiVar.b()) == null) {
                long jE = this.f14726k.e();
                int i2 = h.o.e.f48279a;
                agVar = new ag(jE, h.o.e.c());
            } else {
                agVar = ahVarB.a();
            }
            ahVar = new ah(strC3, agVar, new c(this, 7, (byte[][]) null));
        }
        return new ai(pVar.a().b().b(), strC, ahVar, ajVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        br brVar = this.f14725j;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f14725j = null;
        this.f14719d.e(false);
    }

    public final v a() {
        return this.f14723h;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.f14718c, null);
    }

    @Override // com.waze.an.c.k
    public final void e() {
        this.f14716a.k();
        close();
    }

    public final ch f() {
        return this.f14722g;
    }

    @Override // com.waze.an.c.k
    public final void g() {
        boolean zBooleanValue = ((Boolean) this.f14720e.d()).booleanValue();
        if (zBooleanValue) {
            this.f14716a.d();
        }
        this.f14716a.l();
        if (zBooleanValue) {
            kotlinx.coroutines.aj.z(this.f14718c, null, null, new n(this, null, 0), 3).bY(new h.g.a.l() { // from class: com.waze.an.c.a.m
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return p.n(this.f14708a);
                }
            });
        }
    }

    @Override // com.waze.an.c.k
    public final /* synthetic */ com.waze.location.q h() {
        return this.f14723h;
    }

    public final void l() {
        br brVar = this.f14725j;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f14725j = kotlinx.coroutines.aj.z(this.f14718c, null, null, new n(this, null, 1, null), 3);
    }

    public final com.waze.an.e.h m(com.waze.an.e.a aVar) {
        h.g.b.x.f(aVar, "<this>");
        return new com.waze.an.e.h(this.f14723h, h.a.i.h());
    }

    public final String toString() {
        return "SegmentInsightStateHolderImpl(id=" + this.f14723h + ", priority=" + this.f14724i + ")";
    }
}
