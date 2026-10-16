package com.waze.t.b;

import androidx.core.app.NotificationCompat;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.ab f40787a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40788b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f40789c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.t.a.b f40790d;

    /* renamed from: e, reason: collision with root package name */
    private final ai f40791e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.h.a f40792f;

    /* renamed from: g, reason: collision with root package name */
    private final b f40793g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.h.a.j f40794h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.h.a.a f40795i;

    /* renamed from: j, reason: collision with root package name */
    private final ca f40796j;

    /* renamed from: k, reason: collision with root package name */
    private final c f40797k;

    /* renamed from: l, reason: collision with root package name */
    private final bn f40798l;
    private final aq m;
    private final com.waze.t.c.f n;
    private h o;

    public o(kotlinx.coroutines.ab abVar, com.waze.shared_infra.i.e eVar, com.waze.shared_infra.i.b bVar, com.waze.t.a.b bVar2, ai aiVar, com.waze.h.a aVar, b bVar3, com.waze.h.a.j jVar, com.waze.h.a.a aVar2, ca caVar, c cVar, bn bnVar, as asVar, aq aqVar, com.waze.t.c.f fVar) {
        h.g.b.x.f(abVar, "mainDispatcher");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(bVar2, NotificationCompat.CATEGORY_SERVICE);
        h.g.b.x.f(aiVar, "featureActionHandlerFactory");
        h.g.b.x.f(aVar, "audioSessionFactory");
        h.g.b.x.f(bVar3, "observer");
        h.g.b.x.f(jVar, "cueFileProvider");
        h.g.b.x.f(aVar2, "secondaryAudioPlayerFactory");
        h.g.b.x.f(caVar, "ttsPlayer");
        h.g.b.x.f(cVar, "config");
        h.g.b.x.f(bnVar, "statSender");
        h.g.b.x.f(asVar, "historyTrackerFactory");
        h.g.b.x.f(aqVar, "feedbackPolicy");
        h.g.b.x.f(fVar, "feedbackPresenter");
        this.f40787a = abVar;
        this.f40788b = eVar;
        this.f40789c = bVar;
        this.f40790d = bVar2;
        this.f40791e = aiVar;
        this.f40792f = aVar;
        this.f40793g = bVar3;
        this.f40794h = jVar;
        this.f40795i = aVar2;
        this.f40796j = caVar;
        this.f40797k = cVar;
        this.f40798l = bnVar;
        this.m = aqVar;
        this.n = fVar;
    }

    static final h.ab b(o oVar, h.g.a.a aVar) {
        h hVar = oVar.o;
        if (hVar != null) {
            oVar.o = null;
            com.waze.shared_infra.i.e eVar = oVar.f40788b;
            Objects.toString(hVar);
            eVar.a("activeController was closed and cleaned up : ".concat(hVar.toString()));
        }
        aVar.invoke();
        return h.ab.f48028a;
    }

    @Override // com.waze.t.b.g
    public final as a(com.waze.shared_infra.m.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(aVar2, "onConversationClosed");
        h hVar = this.o;
        if (hVar != null) {
            this.f40788b.g("Starting a new controller while another one is already active, closing it. (activeController=" + hVar + ")");
            hVar.close();
            this.o = null;
        }
        c cVar = this.f40797k;
        bm bmVar = cVar.q() ? bm.f40747b : bm.f40746a;
        bn bnVar = this.f40798l;
        bnVar.k(bmVar);
        com.waze.shared_infra.i.e eVar = this.f40788b;
        kotlinx.coroutines.ab abVar = this.f40787a;
        com.waze.shared_infra.i.b bVar = this.f40789c;
        com.waze.t.a.b bVar2 = this.f40790d;
        ai aiVar = this.f40791e;
        com.waze.h.a aVar3 = this.f40792f;
        b bVar3 = this.f40793g;
        com.waze.h.a.j jVar = this.f40794h;
        com.waze.h.a.a aVar4 = this.f40795i;
        aj ajVarA = aiVar.a();
        com.waze.sound.ax axVarA = aVar3.a();
        com.waze.h.i iVar = com.waze.h.i.f24357b;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ConversationSecondaryAudioPlayer");
        h.g.b.x.e(eVarD, "create(...)");
        ag agVar = new ag(abVar, eVar, bVar, bVar2, ajVarA, axVarA, bVar3, jVar, aVar4.a(iVar, eVarD), this.f40796j, cVar, bnVar, new az(null), this.m, this.n, new j(this, aVar2, 3));
        as asVarG = ag.G(agVar, aVar);
        if (!(asVarG instanceof d)) {
            if (!(asVarG instanceof f)) {
                throw new h.i();
            }
            agVar.Q();
            this.o = agVar;
            return asVarG;
        }
        e eVarA = ((d) asVarG).a();
        e eVar2 = e.f40769a;
        ah ahVar = ah.f40680a;
        if (eVarA.ordinal() != 0) {
            throw new h.i();
        }
        bnVar.f(bc.f40729e, null);
        agVar.close();
        return asVarG;
    }
}
