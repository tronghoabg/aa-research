package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ho implements hn {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sound.f.f f40167a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.google_assistant.aa f40168b;

    public ho(ih ihVar, com.waze.sound.f.f fVar, com.waze.google_assistant.aa aaVar) {
        h.g.b.x.f(ihVar, "voiceAssistantManager");
        h.g.b.x.f(fVar, "voiceSearchStats");
        h.g.b.x.f(aaVar, "googleAssistantManager");
        this.f40167a = fVar;
        this.f40168b = aaVar;
    }

    @Override // com.waze.sound.hn
    public final hm a(com.waze.z.a.d.ap apVar) {
        h.g.b.x.f(apVar, "voiceSearchType");
        com.waze.z.a.d.ap apVar2 = com.waze.z.a.d.ap.f45939a;
        int iOrdinal = apVar.ordinal();
        if (iOrdinal == 0) {
            this.f40168b.p();
            return hm.f40163a;
        }
        if (iOrdinal != 1) {
            throw new h.i();
        }
        if (this.f40168b.B()) {
            return hm.f40164b;
        }
        this.f40167a.a();
        return hm.f40165c;
    }
}
