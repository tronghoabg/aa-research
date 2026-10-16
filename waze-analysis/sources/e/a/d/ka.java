package e.a.d;

import java.util.concurrent.atomic.AtomicLong;
import l.a.ahg;
import l.a.amj;
import l.a.amp;
import l.a.amq;
import l.a.ams;
import l.a.ani;
import l.a.ank;
import l.a.ans;
import l.a.apa;
import l.a.apc;
import l.a.ape;
import l.a.api;
import l.a.apm;
import l.a.apo;
import l.a.asx;
import l.a.asz;
import l.a.ata;
import l.a.atc;
import l.a.bau;
import l.a.baw;
import l.a.bbr;
import l.a.bgo;
import l.a.te;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ka {

    /* renamed from: a, reason: collision with root package name */
    private final Object f47266a;

    public ka(h.g.a.q qVar) {
        h.g.b.x.f(qVar, "block");
        this.f47266a = qVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e.a.d.jy, java.lang.Object] */
    public final kc a() {
        return new kc(this.f47266a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.q, java.lang.Object] */
    public final h.g.a.q b() {
        return this.f47266a;
    }

    final long c(long j2) {
        return ((AtomicLong) this.f47266a).addAndGet(j2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [e.a.d.ek, java.lang.Object] */
    public final void d() {
        e.a.ee eeVarG = e.a.ee.f47411k.g("Keepalive failed. The connection is likely gone");
        js jsVar = js.SUBCHANNEL_SHUTDOWN;
        this.f47266a.a(eeVarG);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [e.a.d.ek, java.lang.Object] */
    public final void e() {
        this.f47266a.r(new ej(this), com.google.d.m.a.cf.y());
    }

    public final /* synthetic */ atc g() {
        com.google.v.du duVarBuild = ((com.google.v.dm) this.f47266a).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (atc) duVarBuild;
    }

    public final void h(asx asxVar) {
        h.g.b.x.f(asxVar, "value");
        ((ata) this.f47266a).d(asxVar);
    }

    public final void i(asz aszVar) {
        h.g.b.x.f(aszVar, "value");
        ((ata) this.f47266a).e(aszVar);
    }

    public final /* synthetic */ apo j() {
        com.google.v.du duVarBuild = ((com.google.v.dm) this.f47266a).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (apo) duVarBuild;
    }

    public final void k(apa apaVar) {
        h.g.b.x.f(apaVar, "value");
        ((apm) this.f47266a).a(apaVar);
    }

    public final void l(apc apcVar) {
        h.g.b.x.f(apcVar, "value");
        ((apm) this.f47266a).b(apcVar);
    }

    public final void m(ape apeVar) {
        h.g.b.x.f(apeVar, "value");
        ((apm) this.f47266a).c(apeVar);
    }

    public final void n(api apiVar) {
        h.g.b.x.f(apiVar, "value");
        ((apm) this.f47266a).d(apiVar);
    }

    public final void o(bbr bbrVar) {
        h.g.b.x.f(bbrVar, "value");
        ((apm) this.f47266a).e(bbrVar);
    }

    public final /* synthetic */ ank p() {
        com.google.v.du duVarBuild = ((com.google.v.dm) this.f47266a).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (ank) duVarBuild;
    }

    public final void q(ahg ahgVar) {
        h.g.b.x.f(ahgVar, "value");
        ((ani) this.f47266a).a(ahgVar);
    }

    public final void r(ans ansVar) {
        h.g.b.x.f(ansVar, "value");
        ((ani) this.f47266a).c(ansVar);
    }

    public final void s(bau bauVar) {
        h.g.b.x.f(bauVar, "value");
        ((ani) this.f47266a).d(bauVar);
    }

    public final void t(baw bawVar) {
        h.g.b.x.f(bawVar, "value");
        ((ani) this.f47266a).e(bawVar);
    }

    public final void u(bgo bgoVar) {
        h.g.b.x.f(bgoVar, "value");
        ((ani) this.f47266a).f(bgoVar);
    }

    public final /* synthetic */ ams v() {
        com.google.v.du duVarBuild = ((com.google.v.dm) this.f47266a).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (ams) duVarBuild;
    }

    public final void w(te teVar) {
        h.g.b.x.f(teVar, "value");
        ((amq) this.f47266a).a(teVar);
    }

    public final void x(amj amjVar) {
        h.g.b.x.f(amjVar, "value");
        ((amq) this.f47266a).e(amjVar);
    }

    public final void y(amp ampVar) {
        h.g.b.x.f(ampVar, "value");
        ((amq) this.f47266a).f(ampVar);
    }

    public ka(Object obj) {
        this.f47266a = obj;
    }

    ka() {
        this.f47266a = new AtomicLong();
    }
}
