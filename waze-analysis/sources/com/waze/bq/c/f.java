package com.waze.bq.c;

import androidx.core.app.NotificationCompat;
import com.waze.h.a.j;
import com.waze.t.b.aq;
import com.waze.t.b.as;
import com.waze.t.b.bn;
import com.waze.t.b.ca;
import com.waze.t.b.g;
import com.waze.t.b.o;
import h.g.b.x;
import kotlinx.coroutines.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ o f17244a;

    public f(ab abVar, com.waze.shared_infra.i.e eVar, com.waze.shared_infra.i.b bVar, com.waze.bq.a.a aVar, a aVar2, com.waze.h.a aVar3, com.waze.t.b.b bVar2, j jVar, com.waze.h.a.a aVar4, ca caVar, com.waze.t.b.c cVar, bn bnVar, as asVar, aq aqVar, com.waze.t.c.f fVar) {
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
        x.f(cVar, "config");
        x.f(bnVar, "statSender");
        x.f(asVar, "historyTrackerFactory");
        x.f(aqVar, "feedbackPolicy");
        x.f(fVar, "feedbackPresenter");
        this.f17244a = new o(abVar, eVar, bVar, aVar, aVar2, aVar3, bVar2, jVar, aVar4, caVar, cVar, bnVar, asVar, aqVar, fVar);
    }

    @Override // com.waze.t.b.g
    public final as a(com.waze.shared_infra.m.a aVar, h.g.a.a aVar2) {
        x.f(aVar2, "onConversationClosed");
        return this.f17244a.a(aVar, aVar2);
    }
}
