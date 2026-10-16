package com.waze.o.b.b;

import androidx.core.app.NotificationCompat;
import com.waze.t.b.aq;
import com.waze.t.b.as;
import com.waze.t.b.bn;
import com.waze.t.b.ca;
import h.g.b.x;
import kotlinx.coroutines.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l implements com.waze.o.c.c.d, com.waze.t.b.g {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.waze.t.b.o f32760a;

    public l(ab abVar, com.waze.shared_infra.i.e eVar, com.waze.shared_infra.i.b bVar, com.waze.o.c.a.a aVar, com.waze.o.c.c.a aVar2, com.waze.h.a aVar3, com.waze.t.b.b bVar2, com.waze.h.a.j jVar, com.waze.h.a.a aVar4, ca caVar, com.waze.o.c.c.b bVar3, bn bnVar, as asVar, aq aqVar, com.waze.t.c.f fVar) {
        x.f(abVar, "mainDispatcher");
        x.f(eVar, "logger");
        x.f(bVar, "exceptionReporter");
        x.f(aVar, NotificationCompat.CATEGORY_SERVICE);
        x.f(aVar2, "featureActionHandlerFactory");
        x.f(aVar3, "audioSessionFactory");
        x.f(bVar2, "observer");
        x.f(jVar, "cueFileProvider");
        x.f(aVar4, "secondaryAudioPlayerFactory");
        x.f(caVar, "ttsPlayer");
        x.f(bVar3, "config");
        x.f(bnVar, "statSender");
        x.f(asVar, "historyTrackerFactory");
        x.f(aqVar, "feedbackPolicy");
        x.f(fVar, "feedbackPresenter");
        this.f32760a = new com.waze.t.b.o(abVar, eVar, bVar, aVar, aVar2, aVar3, bVar2, jVar, aVar4, caVar, bVar3, bnVar, asVar, aqVar, fVar);
    }

    @Override // com.waze.t.b.g
    public final as a(com.waze.shared_infra.m.a aVar, h.g.a.a aVar2) {
        x.f(aVar2, "onConversationClosed");
        return this.f32760a.a(aVar, aVar2);
    }
}
