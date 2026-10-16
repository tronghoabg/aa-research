package com.waze.ads.b;

import android.net.Uri;
import com.waze.nightmode.j;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final j f13942a;

    public a(j jVar) {
        x.f(jVar, "nightModeManager");
        this.f13942a = jVar;
    }

    public final String a(String str) {
        x.f(str, "url");
        if (!((Boolean) this.f13942a.a().d()).booleanValue()) {
            return str;
        }
        Uri uri = Uri.parse(str);
        x.e(uri, "parse(...)");
        String string = uri.buildUpon().appendQueryParameter("ata_theme", "dark").build().toString();
        x.e(string, "toString(...)");
        return string;
    }
}
