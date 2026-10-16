package com.waze.reports_v2.c;

import androidx.core.app.NotificationCompat;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    private final ae f34242a;

    /* renamed from: b, reason: collision with root package name */
    private final ao f34243b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.d.j f34244c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34245d;

    /* renamed from: e, reason: collision with root package name */
    private final bs f34246e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f34247f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f34248g;

    /* renamed from: h, reason: collision with root package name */
    private ad f34249h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.af f34250i;

    /* renamed from: j, reason: collision with root package name */
    private kotlinx.coroutines.br f34251j;

    /* renamed from: k, reason: collision with root package name */
    private kotlinx.coroutines.br f34252k;

    /* renamed from: l, reason: collision with root package name */
    private kotlinx.coroutines.br f34253l;
    private final com.waze.sound.ax m;

    public /* synthetic */ bj(ae aeVar, ao aoVar, com.waze.reports_v2.d.j jVar, com.waze.shared_infra.i.e eVar, bs bsVar, com.waze.sound.ax axVar, int i2) {
        if ((i2 & 8) != 0) {
            eVar = com.waze.shared_infra.i.a.d("ConversationalReportingController");
            h.g.b.x.e(eVar, "create(...)");
        }
        int i3 = kotlinx.coroutines.av.f51370a;
        kotlinx.coroutines.cj cjVar = kotlinx.coroutines.e.ac.f51860a;
        h.g.b.x.f(aeVar, "conversationControllerFactory");
        h.g.b.x.f(aoVar, "config");
        h.g.b.x.f(jVar, "reportingStatsSender");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(cjVar, "coroutineContext");
        h.g.b.x.f(bsVar, "conversationalReportingSupportedLocaleState");
        h.g.b.x.f(axVar, "audioSession");
        this.f34242a = aeVar;
        this.f34243b = aoVar;
        this.f34244c = jVar;
        this.f34245d = eVar;
        this.f34246e = bsVar;
        this.m = axVar;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(bc.f34232a);
        this.f34247f = bnVarB;
        this.f34248g = kotlinx.coroutines.b.ai.U(bnVarB);
        this.f34250i = kotlinx.coroutines.aj.e(cjVar.plus(h.g.b.o.i()));
    }

    public static final /* synthetic */ void f(bj bjVar, t tVar) {
        com.waze.reports_v2.b.at atVarB = tVar.b();
        Objects.toString(atVarB);
        bjVar.f34245d.a("alert reported: ".concat(String.valueOf(atVarB)));
        bjVar.f34249h = null;
        ao aoVar = bjVar.f34243b;
        aoVar.g(aoVar.b() + 1);
        bjVar.s(new be(tVar.b(), tVar.a()));
    }

    public static final /* synthetic */ void g(bj bjVar, u uVar) {
        aq aqVar;
        h.g.b.x.f(uVar, "<this>");
        u uVar2 = u.f34538a;
        int iOrdinal = uVar.ordinal();
        if (iOrdinal == 0) {
            aqVar = aq.f34202a;
        } else if (iOrdinal == 1) {
            aqVar = aq.f34203b;
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            aqVar = aq.f34204c;
        }
        bjVar.q(aqVar);
    }

    public static final /* synthetic */ void h(bj bjVar, ar arVar, String str) {
        bjVar.f34245d.b("Conversational controller returned an error response: ".concat(str));
        bjVar.r(arVar);
    }

    public static final /* synthetic */ void i(bj bjVar, String str) {
        bjVar.f34245d.a("Followup message: ".concat(String.valueOf(str)));
        bjVar.s(new ba(str));
    }

    static final h.ab n(bj bjVar) {
        bjVar.f34252k = null;
        return h.ab.f48028a;
    }

    static final h.ab o(bj bjVar) {
        bjVar.f34245d.a("active job complete, setting to null");
        bjVar.f34251j = null;
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        this.f34245d.g("audio session ended");
        this.m.close();
        kotlinx.coroutines.br brVar = this.f34252k;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f34252k = null;
        kotlinx.coroutines.br brVar2 = this.f34253l;
        if (brVar2 != null) {
            brVar2.s(null);
        }
        this.f34253l = null;
        this.f34249h = null;
    }

    private final void q(aq aqVar) {
        String string;
        Objects.toString(aqVar);
        this.f34245d.a("Conversation canceled. reason: ".concat(String.valueOf(aqVar)));
        if (((bf) this.f34248g.d()).c()) {
            ad adVar = this.f34249h;
            if (adVar == null || (string = adVar.d()) == null) {
                string = UUID.randomUUID().toString();
                h.g.b.x.e(string, "toString(...)");
            }
            this.f34244c.k(string, string, aqVar);
            p();
            s(new ay(aqVar));
        }
    }

    private final void r(ar arVar) {
        String string;
        ad adVar = this.f34249h;
        if (adVar == null || (string = adVar.d()) == null) {
            string = UUID.randomUUID().toString();
            h.g.b.x.e(string, "toString(...)");
        }
        com.waze.shared_infra.i.e eVar = this.f34245d;
        Objects.toString(arVar);
        eVar.b("Conversation error. errorType: ".concat(String.valueOf(arVar)));
        this.f34244c.l(string, string, arVar);
        p();
        s(new az(arVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(bf bfVar) {
        this.f34247f.e(bfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t() {
        com.waze.shared_infra.i.e eVar = this.f34245d;
        eVar.a("tryRecoverAudioSession: Attempting to recover...");
        boolean zI = this.m.i();
        if (zI) {
            eVar.a("tryRecoverAudioSession: Audio session recovered.");
            return zI;
        }
        eVar.b("tryRecoverAudioSession: Failed to reopen audio session.");
        return zI;
    }

    public final kotlinx.coroutines.b.ch d() {
        return this.f34248g;
    }

    public final void k(ax axVar) {
        h.g.b.x.f(axVar, NotificationCompat.CATEGORY_EVENT);
        final int i2 = 1;
        if (axVar instanceof av) {
            com.waze.shared_infra.i.e eVar = this.f34245d;
            eVar.a("Conversation and audio session started");
            if (!this.m.i()) {
                eVar.g("could not open audio session");
                if (!t()) {
                    s(new az(ar.f34221l));
                    p();
                    return;
                }
            }
            kotlinx.coroutines.br brVar = this.f34252k;
            if (brVar != null) {
                brVar.s(null);
            }
            kotlinx.coroutines.af afVar = this.f34250i;
            kotlinx.coroutines.br brVarZ = kotlinx.coroutines.aj.z(afVar, null, null, new am(this, (h.c.e) null, 2), 3);
            this.f34252k = brVarZ;
            if (brVarZ != null) {
                final int i3 = 0;
                brVarZ.bY(new h.g.a.l(this) { // from class: com.waze.reports_v2.c.ap

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ bj f34200a;

                    {
                        this.f34200a = this;
                    }

                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        if (i3 != 0) {
                            return bj.o(this.f34200a);
                        }
                        return bj.n(this.f34200a);
                    }
                });
            }
            kotlinx.coroutines.br brVar2 = this.f34253l;
            if (brVar2 != null) {
                brVar2.s(null);
            }
            this.f34253l = kotlinx.coroutines.aj.z(afVar, new bi(CoroutineExceptionHandler.f51269c, this), null, new cx(this, (h.c.e) null, 1), 2);
            if (((bf) this.f34248g.d()).c()) {
                return;
            }
            s(bb.f34231a);
            return;
        }
        if (axVar instanceof as) {
            q(((as) axVar).a());
            return;
        }
        if (!(axVar instanceof aw)) {
            if (axVar instanceof au) {
                r(((au) axVar).a());
                return;
            } else {
                if (!(axVar instanceof at)) {
                    throw new h.i();
                }
                this.f34245d.a("Conversation ended");
                p();
                s(bc.f34232a);
                return;
            }
        }
        String strA = ((aw) axVar).a();
        if (this.f34248g.d() instanceof bb) {
            ae aeVar = this.f34242a;
            com.waze.reports_v2.d.j jVar = this.f34244c;
            ad adVarA = aeVar.a();
            jVar.t(adVarA.e(), adVarA.d());
            this.f34249h = adVarA;
        }
        s(bd.f34233a);
        com.waze.shared_infra.i.e eVar2 = this.f34245d;
        eVar2.a("Request to send prompt: ".concat(strA));
        if (this.f34251j != null) {
            eVar2.g("sendPrompts called while mid-process of previous prompts handling - returning");
            return;
        }
        ad adVar = this.f34249h;
        if (adVar == null) {
            s(bc.f34232a);
            this.f34245d.b("conversationController wasn't initialized- returning to idle");
            return;
        }
        kotlinx.coroutines.br brVarZ2 = kotlinx.coroutines.aj.z(this.f34250i, null, null, new bh(adVar, strA, this, null), 3);
        this.f34251j = brVarZ2;
        if (brVarZ2 != null) {
            brVarZ2.bY(new h.g.a.l(this) { // from class: com.waze.reports_v2.c.ap

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ bj f34200a;

                {
                    this.f34200a = this;
                }

                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    if (i2 != 0) {
                        return bj.o(this.f34200a);
                    }
                    return bj.n(this.f34200a);
                }
            });
        }
    }
}
