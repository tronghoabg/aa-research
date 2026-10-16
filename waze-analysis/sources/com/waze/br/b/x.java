package com.waze.br.b;

import androidx.core.app.NotificationCompat;
import com.waze.t.b.aq;
import com.waze.t.b.as;
import com.waze.t.b.bn;
import com.waze.t.b.ca;
import kotlinx.coroutines.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f17364a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.br.a.a f17365b;

    /* renamed from: c, reason: collision with root package name */
    private final b f17366c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.h.a f17367d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.t.b.b f17368e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.h.a.j f17369f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.h.a.a f17370g;

    /* renamed from: h, reason: collision with root package name */
    private final ca f17371h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.t.b.c f17372i;

    /* renamed from: j, reason: collision with root package name */
    private final bn f17373j;

    /* renamed from: k, reason: collision with root package name */
    private final aq f17374k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.t.c.f f17375l;
    private final com.waze.shared_infra.m.a m;
    private final as n;

    public x(com.waze.shared_infra.i.b bVar, com.waze.br.a.a aVar, b bVar2, com.waze.h.a aVar2, com.waze.t.b.b bVar3, com.waze.h.a.j jVar, com.waze.h.a.a aVar3, ca caVar, com.waze.t.b.c cVar, bn bnVar, as asVar, aq aqVar, com.waze.t.c.f fVar, com.waze.shared_infra.m.a aVar4) {
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(aVar, NotificationCompat.CATEGORY_SERVICE);
        h.g.b.x.f(bVar2, "featureActionHandlerFactory");
        h.g.b.x.f(aVar2, "audioSessionFactory");
        h.g.b.x.f(bVar3, "observer");
        h.g.b.x.f(jVar, "cueFileProvider");
        h.g.b.x.f(aVar3, "secondaryAudioPlayerFactory");
        h.g.b.x.f(caVar, "ttsPlayer");
        h.g.b.x.f(cVar, "config");
        h.g.b.x.f(bnVar, "statSender");
        h.g.b.x.f(asVar, "historyTrackerFactory");
        h.g.b.x.f(aqVar, "feedbackPolicy");
        h.g.b.x.f(fVar, "feedbackPresenter");
        this.f17364a = bVar;
        this.f17365b = aVar;
        this.f17366c = bVar2;
        this.f17367d = aVar2;
        this.f17368e = bVar3;
        this.f17369f = jVar;
        this.f17370g = aVar3;
        this.f17371h = caVar;
        this.f17372i = cVar;
        this.f17373j = bnVar;
        this.n = asVar;
        this.f17374k = aqVar;
        this.f17375l = fVar;
        this.m = aVar4;
    }

    public final com.waze.shared_infra.q.j a(ab abVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(abVar, "mainDispatcher");
        h.g.b.x.f(eVar, "logger");
        b bVar = this.f17366c;
        return new com.waze.shared_infra.q.j(this.m, new com.waze.t.b.o(abVar, eVar, this.f17364a, this.f17365b, bVar, this.f17367d, this.f17368e, this.f17369f, this.f17370g, this.f17371h, this.f17372i, this.f17373j, this.n, this.f17374k, this.f17375l), eVar);
    }
}
