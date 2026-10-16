package com.waze.main_screen.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ae implements ad {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.i f27780a;

    public ae(com.waze.main_screen.i iVar) {
        h.g.b.x.f(iVar, "mainMenuStatsSender");
        this.f27780a = iVar;
    }

    @Override // com.waze.main_screen.v.ad
    public final void a(a aVar, String str, String str2, String str3, String str4) {
        com.waze.main_screen.g gVar;
        h.g.b.x.f(aVar, "action");
        a aVar2 = a.f27771a;
        af afVar = af.f27781a;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            gVar = com.waze.main_screen.g.f26339a;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            gVar = com.waze.main_screen.g.f26340b;
        }
        this.f27780a.h(gVar, str, str2, str3, str4);
    }

    @Override // com.waze.main_screen.v.ad
    public final void b(String str, String str2, String str3) {
        this.f27780a.i(str, str2, str3);
    }

    @Override // com.waze.main_screen.v.ad
    public final void c(af afVar, String str, String str2, String str3) {
        com.waze.main_screen.h hVar;
        h.g.b.x.f(afVar, "skipReason");
        a aVar = a.f27771a;
        af afVar2 = af.f27781a;
        int iOrdinal = afVar.ordinal();
        if (iOrdinal == 0) {
            hVar = com.waze.main_screen.h.f26437a;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            hVar = com.waze.main_screen.h.f26438b;
        }
        this.f27780a.k(hVar, str, str2, str3);
    }
}
