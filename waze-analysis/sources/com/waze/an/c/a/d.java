package com.waze.an.c.a;

import com.waze.AlerterController$Alerter$Type;
import com.waze.an.c.ac;
import com.waze.an.c.ad;
import com.waze.an.c.ae;
import com.waze.an.c.af;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements af {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.a.b f14668a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f14669b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14670c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.af f14671d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f14672e;

    /* renamed from: f, reason: collision with root package name */
    private ac f14673f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f14674g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f14675h;

    /* renamed from: i, reason: collision with root package name */
    private final ch f14676i;

    public d(com.waze.an.a.b bVar, com.waze.shared_infra.o.a aVar, com.waze.shared_infra.i.e eVar, boolean z, boolean z2) {
        x.f(bVar, "alertDescriptor");
        x.f(aVar, "stringProvider");
        x.f(eVar, "logger");
        this.f14668a = bVar;
        this.f14669b = aVar;
        this.f14670c = eVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, null);
        this.f14671d = afVarP;
        bn bnVarB = ck.b(Boolean.valueOf(z));
        this.f14672e = bnVarB;
        this.f14673f = v((com.waze.j) bVar.b().d(), null, ((Boolean) bnVarB.d()).booleanValue());
        this.f14674g = z2 && ((com.waze.j) bVar.b().d()).c() == com.waze.g.f23985b;
        this.f14675h = ((com.waze.j) bVar.b().d()).c() != null;
        kotlinx.coroutines.b.k kVarF = ai.F(ai.K(bVar.b(), new h(this, (h.c.e) null, 1)), bnVarB, new b(this, null));
        int i2 = bz.f51630a;
        this.f14676i = ai.V(kVarF, afVarP, by.c(), this.f14673f);
    }

    public static /* synthetic */ ab i(d dVar) {
        dVar.w(com.waze.alerters.a.a.f14135d);
        return ab.f48028a;
    }

    public static /* synthetic */ ab j(d dVar) {
        dVar.w(com.waze.alerters.a.a.f14132a);
        return ab.f48028a;
    }

    public static /* synthetic */ ab k(d dVar) {
        dVar.w(com.waze.alerters.a.a.f14132a);
        return ab.f48028a;
    }

    public static /* synthetic */ ab l(d dVar) {
        dVar.w(com.waze.alerters.a.a.f14134c);
        return ab.f48028a;
    }

    public static /* synthetic */ ab m(d dVar, com.waze.j jVar) {
        dVar.w(jVar.e() == AlerterController$Alerter$Type.DANGER_ZONE ? com.waze.alerters.a.a.f14135d : com.waze.alerters.a.a.f14133b);
        return ab.f48028a;
    }

    static final ab n(d dVar) {
        dVar.w(com.waze.alerters.a.a.f14132a);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d3 A[PHI: r3
  0x01d3: PHI (r3v22 java.lang.String) = (r3v18 java.lang.String), (r3v39 java.lang.String) binds: [B:111:0x01d0, B:100:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.waze.an.c.ac v(com.waze.j r18, com.waze.an.c.ac r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.an.c.a.d.v(com.waze.j, com.waze.an.c.ac, boolean):com.waze.an.c.ac");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(com.waze.alerters.a.a aVar) {
        String str = "onUserAction " + aVar + " for " + h();
        com.waze.shared_infra.i.e eVar = this.f14670c;
        eVar.a(str);
        if (aVar == com.waze.alerters.a.a.f14136e) {
            AlerterController$Alerter$Type alerterController$Alerter$TypeE = ((com.waze.j) this.f14668a.b().d()).e();
            AlerterController$Alerter$Type alerterController$Alerter$Type = AlerterController$Alerter$Type.UNSPECIFIED;
            int iOrdinal = alerterController$Alerter$TypeE.ordinal();
            if (iOrdinal == 15) {
                eVar.a("Ignoring map touch for reroute alert.");
                return;
            } else if (iOrdinal == 24) {
                eVar.a("Ignoring map touch for danger zone.");
                return;
            }
        }
        this.f14668a.c(aVar);
    }

    private static final ad x(com.waze.i iVar, com.waze.h hVar, h.g.a.a aVar) {
        if (iVar.b() != hVar) {
            return null;
        }
        long jA = iVar.a();
        int i2 = h.o.e.f48279a;
        return new ad(h.o.e.c(), jA, aVar);
    }

    @Override // com.waze.an.c.af
    public final ae a() {
        return ((com.waze.j) this.f14668a.b().d()).e() == AlerterController$Alerter$Type.REROUTE ? ae.f14749a : ae.f14750b;
    }

    @Override // com.waze.an.c.af
    public final ch b() {
        return this.f14676i;
    }

    @Override // com.waze.an.c.af
    public final com.waze.an.e.g c(com.waze.an.e.a aVar) {
        x.f(aVar, "<this>");
        return new com.waze.an.e.c((com.waze.j) this.f14668a.b().d());
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f14671d, null);
    }

    @Override // com.waze.an.c.k
    public final void e() {
        this.f14668a.k();
    }

    @Override // com.waze.an.c.k
    public final void g() {
        this.f14668a.l();
    }

    @Override // com.waze.an.c.k
    public final com.waze.location.q h() {
        return this.f14668a.m();
    }

    public final void s(boolean z) {
        this.f14672e.e(Boolean.valueOf(z));
    }

    public final boolean u() {
        return this.f14675h;
    }
}
