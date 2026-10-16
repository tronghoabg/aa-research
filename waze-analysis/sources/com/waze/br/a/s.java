package com.waze.br.a;

import e.a.cm;
import e.a.cq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s implements b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bs.b f17308a;

    public s(com.waze.bs.b bVar) {
        h.g.b.x.f(bVar, "stub");
        this.f17308a = bVar;
    }

    @Override // com.waze.br.a.b
    public final kotlinx.coroutines.b.k a(com.waze.bs.m mVar) {
        h.g.b.x.f(mVar, "request");
        cm cmVar = new cm();
        h.g.b.x.f(mVar, "request");
        h.g.b.x.f(cmVar, "headers");
        com.waze.bs.b bVar = this.f17308a;
        e.a.i channel = bVar.getChannel();
        h.g.b.x.e(channel, "getChannel(...)");
        cq cqVarA = com.waze.bs.a.a();
        h.g.b.x.e(cqVarA, "getChatMethod(...)");
        e.a.h callOptions = bVar.getCallOptions();
        h.g.b.x.e(callOptions, "getCallOptions(...)");
        return e.a.e.f.a(channel, cqVarA, mVar, callOptions, cmVar);
    }

    @Override // com.waze.br.a.b
    public final kotlinx.coroutines.b.k b(com.waze.bs.ad adVar) {
        h.g.b.x.f(adVar, "request");
        cm cmVar = new cm();
        h.g.b.x.f(adVar, "request");
        h.g.b.x.f(cmVar, "headers");
        com.waze.bs.b bVar = this.f17308a;
        e.a.i channel = bVar.getChannel();
        h.g.b.x.e(channel, "getChannel(...)");
        cq cqVarB = com.waze.bs.a.b();
        h.g.b.x.e(cqVarB, "getStartChatMethod(...)");
        e.a.h callOptions = bVar.getCallOptions();
        h.g.b.x.e(callOptions, "getCallOptions(...)");
        return e.a.e.f.a(channel, cqVarB, adVar, callOptions, cmVar);
    }
}
