package com.waze.main_screen.u.b;

import com.waze.ConfigManager;
import com.waze.R;
import com.waze.alerters.a.k;
import com.waze.app_nav.ah;
import com.waze.app_nav.w;
import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final w f27692a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f27693b;

    public d(w wVar, com.waze.shared_infra.o.a aVar) {
        x.f(wVar, "flowController");
        x.f(aVar, "stringProvider");
        this.f27692a = wVar;
        this.f27693b = aVar;
    }

    @Override // com.waze.main_screen.u.b.c
    public final void a() {
        com.waze.web.d dVar = com.waze.web.d.f45485a;
        com.waze.web.c cVar = new com.waze.web.c();
        cVar.c(this.f27693b.c(R.string.DESTINATION_HELPCENTER_SUGGESTIONS_TITLE, new Object[0]));
        cVar.b(ConfigManager.getInstance().getConfigValueString(ConfigValues.CONFIG_VALUE_HELP_SUGGESTIONS_DETAILS_URL));
        k.c(this.f27692a, cVar.a(), ah.f15182a);
    }
}
