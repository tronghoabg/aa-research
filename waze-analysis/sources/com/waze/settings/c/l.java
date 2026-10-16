package com.waze.settings.c;

import com.waze.R;
import com.waze.network.f.ak;
import com.waze.settings.de;
import h.g.b.x;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends com.waze.settings.tree.d.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ev.n f36946a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.b.d f36947b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f36948c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.waze.ev.n nVar, com.waze.sharedui.b.d dVar, com.waze.shared_infra.o.a aVar) {
        super("ev_profile", "EV_PROFILE_SETTINGS", com.waze.ui.ad.b.c(Integer.valueOf(R.string.EV_PROFILE_SETTINGS_TITLE)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_gas_hybrid)), n.a(nVar, dVar, aVar), 16);
        x.f(nVar, "evRepository");
        x.f(dVar, "auditReporter");
        x.f(aVar, "stringProvider");
        this.f36946a = nVar;
        this.f36947b = dVar;
        this.f36948c = aVar;
    }

    @Override // com.waze.settings.tree.g
    public final void h(de deVar) {
        x.f(deVar, "page");
        super.h(deVar);
        aj.z(ak.q(deVar), null, null, new j(this, null), 3);
        com.waze.ev.n nVar = this.f36946a;
        ai.m(ai.K(nVar.g(), new k(this, null)), ak.q(deVar));
        B(n.a(nVar, this.f36947b, this.f36948c));
    }
}
