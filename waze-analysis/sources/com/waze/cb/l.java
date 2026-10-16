package com.waze.cb;

import android.content.Context;
import android.content.Intent;
import com.waze.R;
import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22098a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.app_nav.hub.c.e f22099b;

    public l(Context context, com.waze.app_nav.hub.c.e eVar) {
        x.f(context, "appContext");
        x.f(eVar, "presenterProvider");
        this.f22098a = context;
        this.f22099b = eVar;
    }

    public static final /* synthetic */ void c(l lVar) {
        com.waze.uid.d.s sVar = com.waze.uid.d.q.f44463a.a().f44466d;
        com.waze.uid.d.r rVar = new com.waze.uid.d.r(com.waze.shared_infra.o.b.a().c(R.string.AADC_REQUEST_AGE_SCREEN_LINK_TEXT, new Object[0]), true);
        String strB = ConfigValues.CONFIG_VALUE_U16_LEARN_MORE_URL.b();
        x.e(strB, "getValue(...)");
        Context context = lVar.f22098a;
        Intent intentA = sVar.a(context, rVar, strB);
        intentA.setFlags(268435456);
        context.startActivity(intentA);
    }

    private final com.waze.app_nav.hub.c.b d(boolean z, com.waze.uid.stats.b bVar, com.waze.shared_infra.q.i iVar, h.g.a.a aVar, h.g.a.a aVar2) {
        if (z) {
            com.waze.uid.d.q.f44463a.a().c().E(iVar != null ? Long.valueOf(iVar.b()) : null);
        } else {
            com.waze.uid.d.q.f44463a.a().c().A(bVar);
        }
        com.waze.app_nav.hub.c.b bVarA = this.f22099b.a(new com.waze.app_nav.hub.service.a("U16 Block Screen", "U16 Block Screen", new k(aVar2, iVar, aVar, this, bVar, z), a.class));
        bVarA.c();
        return bVarA;
    }

    @Override // com.waze.cb.j
    public final com.waze.app_nav.hub.c.b a(com.waze.uid.stats.b bVar, com.waze.shared_infra.q.i iVar, h.g.a.a aVar, h.g.a.a aVar2) {
        x.f(bVar, "screenContext");
        x.f(iVar, "birthdate");
        x.f(aVar, "onEditClick");
        x.f(aVar2, "onConfirmClick");
        return d(true, bVar, iVar, aVar, aVar2);
    }

    @Override // com.waze.cb.j
    public final com.waze.app_nav.hub.c.b b(com.waze.uid.stats.b bVar) {
        x.f(bVar, "screenContext");
        return d(false, bVar, null, new com.waze.bx.a(16), new com.waze.bx.a(17));
    }
}
