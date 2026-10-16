package com.waze.reports_v2.c;

import androidx.core.app.NotificationCompat;
import com.waze.config.ConfigValues;
import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class an implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.d.j f34191a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.q.r f34192b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f34193c;

    /* renamed from: d, reason: collision with root package name */
    private final ag f34194d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34195e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.af f34196f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f34197g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f34198h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f34199i;

    public an(com.waze.navigate.eo eoVar, com.waze.reports_v2.d.j jVar, com.waze.shared_infra.q.r rVar, com.waze.shared_infra.q.e eVar, ag agVar) {
        h.g.b.x.f(eoVar, "navigationState");
        h.g.b.x.f(jVar, "statsSender");
        h.g.b.x.f(rVar, "timeUtil");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(agVar, "config");
        this.f34191a = jVar;
        this.f34192b = rVar;
        this.f34193c = eVar;
        this.f34194d = agVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ConversationalReportingActivationStateHolder");
        h.g.b.x.e(eVarD, "create(...)");
        this.f34195e = eVarD;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, null);
        this.f34196f = afVarP;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(ai.f34185a);
        this.f34197g = bnVarB;
        this.f34198h = kotlinx.coroutines.b.ai.U(bnVarB);
        this.f34199i = agVar.d();
        kotlinx.coroutines.aj.z(afVarP, null, null, new am(this, (h.c.e) null, 0), 3);
    }

    public static final /* synthetic */ boolean e(an anVar) {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        if (boolB.booleanValue()) {
            ag agVar = anVar.f34194d;
            if (agVar.c() && !agVar.a()) {
                com.waze.shared_infra.q.r rVar = anVar.f34192b;
                Long lB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_LAST_ACTIVATION_DIALOG_SHOWN_EPOCH_SECONDS.b();
                h.g.b.x.e(lB, "getValue(...)");
                Instant instantOfEpochSecond = Instant.ofEpochSecond(lB.longValue());
                h.g.b.x.e(instantOfEpochSecond, "ofEpochSecond(...)");
                int iA = rVar.a(instantOfEpochSecond.getEpochSecond(), com.waze.settings.h.c.f(anVar.f34193c.a())).a();
                anVar.f34195e.a("daysSinceLastShown returns: " + iA);
                long j2 = (long) iA;
                h.o.c cVar = h.o.a.f48264a;
                Long lB2 = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_PERIOD_BACKOFF_DAYS.b();
                h.g.b.x.e(lB2, "getValue(...)");
                if (j2 > h.o.a.k(h.o.c.j(lB2.longValue(), h.o.d.f48276g))) {
                    ag.g(0);
                }
                int iF = ag.f();
                int iE = ag.e();
                if (iF < ((int) ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_MAX_APPEARANCES.b().longValue()) && iE < ((int) ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_PERIOD_LIMIT.b().longValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void h() {
        this.f34195e.a("feature turned on by user");
        this.f34197g.e(ai.f34185a);
        this.f34194d.i();
        ag.j(false);
    }

    public final kotlinx.coroutines.b.ch c() {
        return this.f34198h;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.f34196f, null);
    }

    public final void d() {
        this.f34195e.a("Not showing conversational reporting activation dialog, controlPanel is not minimized");
    }

    public final boolean f() {
        return this.f34199i;
    }

    public final void g(com.waze.ui.g.w wVar) {
        h.g.b.x.f(wVar, NotificationCompat.CATEGORY_EVENT);
        if (wVar instanceof com.waze.ui.w.b.ah) {
            if (h.g.b.x.n(this.f34198h.d(), ak.f34187a)) {
                boolean zJ = ((com.waze.ui.w.b.ah) wVar).j();
                com.waze.reports_v2.d.j jVar = this.f34191a;
                if (zJ) {
                    jVar.n();
                    h();
                    return;
                } else {
                    jVar.m();
                    this.f34197g.e(ai.f34185a);
                    return;
                }
            }
            return;
        }
        if (wVar instanceof com.waze.ui.w.b.af) {
            this.f34191a.s();
            ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_SHOWN_COUNTER_IN_TOTAL.d(Long.valueOf(ag.f() + 1));
            ag.g(ag.e() + 1);
            Instant instantB = this.f34193c.b();
            h.g.b.x.f(instantB, "timestamp");
            ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_LAST_ACTIVATION_DIALOG_SHOWN_EPOCH_SECONDS.d(Long.valueOf(instantB.getEpochSecond()));
            return;
        }
        if (wVar instanceof com.waze.ui.w.b.ad) {
            this.f34191a.p();
            this.f34197g.e(ai.f34185a);
            return;
        }
        if (wVar instanceof com.waze.ui.w.b.ae) {
            this.f34191a.q();
            this.f34197g.e(ai.f34185a);
            return;
        }
        if (wVar instanceof com.waze.ui.w.b.ag) {
            com.waze.reports_v2.d.j jVar2 = this.f34191a;
            jVar2.r();
            jVar2.o();
            this.f34197g.e(ak.f34187a);
            return;
        }
        if (wVar instanceof com.waze.ui.w.b.al) {
            com.waze.reports_v2.d.j jVar3 = this.f34191a;
            jVar3.r();
            if (((com.waze.ui.w.b.al) wVar).j()) {
                h();
                return;
            } else {
                jVar3.o();
                this.f34197g.e(aj.f34186a);
                return;
            }
        }
        if (wVar instanceof com.waze.ui.w.b.ak) {
            this.f34197g.e(ak.f34187a);
            return;
        }
        if (wVar instanceof com.waze.ui.w.b.aj) {
            this.f34191a.n();
            h();
        } else {
            if (!(wVar instanceof com.waze.ui.w.b.ai)) {
                throw new h.i();
            }
            this.f34191a.m();
            ag.j(true);
            this.f34197g.e(ai.f34185a);
        }
    }
}
