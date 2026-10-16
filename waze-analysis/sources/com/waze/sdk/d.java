package com.waze.sdk;

import android.content.Context;
import android.content.IntentFilter;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements ai {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35365a;

    /* renamed from: b, reason: collision with root package name */
    private final bd f35366b;

    /* renamed from: c, reason: collision with root package name */
    private final c f35367c;

    /* renamed from: d, reason: collision with root package name */
    private final b f35368d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f35369e;

    public d(Context context, bd bdVar) {
        h.g.b.x.f(context, "appContext");
        h.g.b.x.f(bdVar, "audioSdkManager");
        this.f35365a = context;
        this.f35366b = bdVar;
        this.f35367c = new c(this);
        this.f35368d = new b(this);
        this.f35369e = ck.b(h.a.i.h());
        c();
    }

    static final int a(d dVar, au auVar, au auVar2) {
        h.g.b.x.f(auVar, "app1");
        h.g.b.x.f(auVar2, "app2");
        if (auVar.f() != auVar2.f()) {
            return !auVar.f() ? 1 : -1;
        }
        Context context = dVar.f35365a;
        if (auVar.g(context) != auVar2.g(context)) {
            return !auVar.g(context) ? 1 : -1;
        }
        String str = auVar.f35259b;
        h.g.b.x.e(str, "appName");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        h.g.b.x.e(lowerCase, "toLowerCase(...)");
        String str2 = auVar2.f35259b;
        h.g.b.x.e(str2, "appName");
        String lowerCase2 = str2.toLowerCase(Locale.ROOT);
        h.g.b.x.e(lowerCase2, "toLowerCase(...)");
        return lowerCase.compareTo(lowerCase2);
    }

    @Override // com.waze.sdk.ai
    public final ch b() {
        return kotlinx.coroutines.b.ai.U(this.f35369e);
    }

    public final void c() {
        List<au> partnerAudioApps = SdkConfiguration.getPartnerAudioApps(this.f35365a, true);
        h.g.b.x.e(partnerAudioApps, "getPartnerAudioApps(...)");
        List listAq = h.a.i.aq(partnerAudioApps);
        h.a.i.t(listAq, new com.waze.app_nav.hub.a.f(new h.g.a.p() { // from class: com.waze.sdk.a
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(d.a(this.f35176a, (au) obj, (au) obj2));
            }
        }, 3));
        this.f35369e.e(listAq);
    }

    @Override // com.waze.sdk.ai
    public final void d() {
        this.f35366b.u(this.f35367c);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        this.f35365a.registerReceiver(this.f35368d, intentFilter);
    }

    @Override // com.waze.sdk.ai
    public final void e() {
        this.f35366b.G(this.f35367c);
        this.f35365a.unregisterReceiver(this.f35368d);
    }
}
