package com.waze.car_lib.r;

import android.net.Uri;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Object f21718a;

    public v(com.waze.shared_infra.o.a aVar, com.waze.config.d dVar, String str) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(dVar, "urlConfig");
        h.g.b.x.f(str, "clientVersion");
        Uri uriBuild = Uri.parse(dVar.b()).buildUpon().appendQueryParameter("client_version", str).build();
        h.g.b.x.e(uriBuild, "build(...)");
        this.f21718a = new com.waze.car_lib.p.bh(uriBuild, aVar.c(R.string.ABOUT_SETTING_MENU_ITEM, new Object[0]), aVar.c(R.string.AAOS_ABOUT_SETTINGS_ABOUT_QR_TEXT, new Object[0]));
    }

    public final com.waze.car_lib.p.dg a() {
        return (com.waze.car_lib.p.dg) this.f21718a;
    }

    public final com.waze.car_lib.p.bh b() {
        return (com.waze.car_lib.p.bh) this.f21718a;
    }

    public v(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        this.f21718a = new com.waze.car_lib.p.dg(aVar.c(R.string.PRIVACY_SETTINGS_ACTIVITY_RECENT_DESTINATIONS_TITLE, new Object[0]), aVar.c(R.string.AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, new Object[0]), null, false, new com.waze.car_lib.p.dc(aVar.c(R.string.CANCEL, new Object[0]), false), new com.waze.car_lib.p.dc(aVar.c(R.string.REMOVE, new Object[0]), true), 12);
    }
}
