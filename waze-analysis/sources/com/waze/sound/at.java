package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class at implements com.waze.h.a {

    /* renamed from: a, reason: collision with root package name */
    private final ar f39463a;

    /* renamed from: b, reason: collision with root package name */
    private final fm f39464b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.h.b.r f39465c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.h.a.a f39466d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f39467e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39468f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.ab f39469g;

    public at(ar arVar, fm fmVar, com.waze.h.b.r rVar, com.waze.h.a.a aVar, com.waze.shared_infra.i.b bVar, com.waze.shared_infra.i.e eVar, kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(arVar, "audioFocusRequestor");
        h.g.b.x.f(fmVar, "soundPlayer");
        h.g.b.x.f(rVar, "singleUtteranceRecorder");
        h.g.b.x.f(aVar, "audioPlayerFactory");
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(abVar, "mainDispatcher");
        this.f39463a = arVar;
        this.f39464b = fmVar;
        this.f39465c = rVar;
        this.f39466d = aVar;
        this.f39467e = bVar;
        this.f39468f = eVar;
        this.f39469g = abVar;
    }

    @Override // com.waze.h.a
    public final ax a() {
        com.waze.h.i iVar = com.waze.h.i.f24357b;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ConversationAudioPlayer");
        h.g.b.x.e(eVarD, "create(...)");
        hl hlVarA = this.f39466d.a(iVar, eVarD);
        ar arVar = this.f39463a;
        com.waze.shared_infra.i.b bVar = this.f39467e;
        return new ax(arVar, this.f39464b, this.f39465c, hlVarA, bVar, this.f39468f, this.f39469g);
    }
}
