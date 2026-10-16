package com.waze.bl.b.c;

import androidx.core.app.NotificationCompat;
import com.waze.t.b.ai;
import com.waze.t.b.as;
import com.waze.t.b.bn;
import com.waze.t.b.ca;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p implements com.waze.bl.c.c.d, com.waze.t.b.g {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.waze.t.b.o f16971a;

    public p(kotlinx.coroutines.ab abVar, com.waze.shared_infra.i.e eVar, com.waze.shared_infra.i.b bVar, com.waze.t.a.b bVar2, ai aiVar, com.waze.h.a aVar, com.waze.t.b.b bVar3, com.waze.h.a.j jVar, com.waze.h.a.a aVar2, ca caVar, com.waze.t.b.c cVar, bn bnVar, as asVar, t tVar, com.waze.t.c.f fVar) {
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
        h.g.b.x.f(bnVar, "stats");
        h.g.b.x.f(asVar, "historyTrackerFactory");
        h.g.b.x.f(tVar, "feedbackPolicy");
        h.g.b.x.f(fVar, "feedbackPresenter");
        this.f16971a = new com.waze.t.b.o(abVar, eVar, bVar, bVar2, aiVar, aVar, bVar3, jVar, aVar2, caVar, cVar, bnVar, asVar, tVar, fVar);
    }

    @Override // com.waze.t.b.g
    public final as a(com.waze.shared_infra.m.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(aVar2, "onConversationClosed");
        return this.f16971a.a(aVar, aVar2);
    }
}
