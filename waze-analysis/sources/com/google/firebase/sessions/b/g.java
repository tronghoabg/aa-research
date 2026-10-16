package com.google.firebase.sessions.b;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import h.ab;
import h.g.b.x;
import java.net.URL;
import java.util.Map;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.sessions.b f10885a;

    /* renamed from: b, reason: collision with root package name */
    private final h.c.j f10886b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10887c;

    public g(com.google.firebase.sessions.b bVar, h.c.j jVar) {
        x.f(bVar, "appInfo");
        x.f(jVar, "blockingDispatcher");
        x.f("firebase-settings.crashlytics.com", "baseUrl");
        this.f10885a = bVar;
        this.f10886b = jVar;
        this.f10887c = "firebase-settings.crashlytics.com";
    }

    public static final /* synthetic */ URL b(g gVar) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).authority(gVar.f10887c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        com.google.firebase.sessions.b bVar = gVar.f10885a;
        return new URL(builderAppendPath.appendPath(bVar.c()).appendPath("settings").appendQueryParameter("build_version", bVar.a().b()).appendQueryParameter("display_version", bVar.a().e()).build().toString());
    }

    public final Object a(Map map, h.g.a.p pVar, h.g.a.p pVar2, h.c.e eVar) {
        Object objV = aj.v(this.f10886b, new f(this, map, pVar, pVar2, null), eVar);
        return objV == h.c.a.a.f48038a ? objV : ab.f48028a;
    }
}
