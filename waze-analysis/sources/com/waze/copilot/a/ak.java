package com.waze.copilot.a;

import android.net.Uri;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private final al f22687a;

    /* renamed from: b, reason: collision with root package name */
    private final am f22688b;

    /* renamed from: c, reason: collision with root package name */
    private final ah f22689c;

    /* renamed from: d, reason: collision with root package name */
    private final ag f22690d;

    public ak(al alVar, am amVar, ah ahVar, ag agVar) {
        h.g.b.x.f(alVar, "getCopilotUserSelectionsUseCase");
        h.g.b.x.f(amVar, "getMarketplaceUrlUseCase");
        h.g.b.x.f(ahVar, "getCarCampaignUrlUseCase");
        h.g.b.x.f(agVar, "getCampaignUrlUseCase");
        this.f22687a = alVar;
        this.f22688b = amVar;
        this.f22689c = ahVar;
        this.f22690d = agVar;
    }

    public final Object a(k kVar) {
        boolean z = kVar instanceof i;
        com.waze.copilot.data.b.q qVarA = this.f22687a.a(true);
        Uri uriA = z ? this.f22689c.a(((i) kVar).a()) : kVar instanceof h ? this.f22690d.a(((h) kVar).a()) : this.f22688b.a();
        if (h.g.b.x.n(uriA, Uri.EMPTY)) {
            return "";
        }
        String string = uriA.buildUpon().appendQueryParameter("car_id", qVarA.d()).appendQueryParameter("mood_id", qVarA.e()).appendQueryParameter("voice_id", qVarA.f()).build().toString();
        h.g.b.x.e(string, "toString(...)");
        return string;
    }
}
