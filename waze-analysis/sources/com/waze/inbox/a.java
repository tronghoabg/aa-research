package com.waze.inbox;

import com.waze.app_nav.ah;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a implements com.waze.shared_infra.f.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.app_nav.w f24634a;

    public a(com.waze.app_nav.w wVar) {
        h.g.b.x.f(wVar, "mainScreenFlowController");
        this.f24634a = wVar;
    }

    @Override // com.waze.shared_infra.f.b
    public final boolean a(com.waze.shared_infra.f.a aVar) {
        h.g.b.x.f(aVar, "deeplink");
        String strA = aVar.a();
        if (h.g.b.x.n(strA, "show_inbox")) {
            com.waze.app_nav.w wVar = this.f24634a;
            d dVar = d.f24639a;
            wVar.a(new com.waze.app_nav.m(new c((byte[]) null).a(), ah.f15182a));
            return true;
        }
        if (!h.g.b.x.n(strA, "open_chat")) {
            return false;
        }
        com.waze.app_nav.w wVar2 = this.f24634a;
        d dVar2 = d.f24639a;
        wVar2.a(new com.waze.app_nav.m(new c(new b(aVar.c())).a(), ah.f15182a));
        return true;
    }
}
