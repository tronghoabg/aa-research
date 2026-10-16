package com.waze.x;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Uri.Builder f45543a;

    private h(Uri.Builder builder) {
        this.f45543a = builder.scheme("waze").authority("").path("");
    }

    public static h b() {
        return new h(new Uri.Builder());
    }

    public static h c(String str) {
        if (str.startsWith("?")) {
            Iterator it = d.f45535a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = String.format("?%s=", ((c) it.next()).a());
                if (str.startsWith(str2)) {
                    str = String.valueOf(str2).concat(String.valueOf(Uri.encode(str.substring(str2.length()))));
                    break;
                }
            }
        }
        return new h(Uri.parse(str).buildUpon());
    }

    public static boolean d(String str) {
        if (str == null) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (uri.isHierarchical()) {
            return "waze".equals(uri.getScheme());
        }
        return false;
    }

    public static boolean e(String str) {
        String path;
        if (str == null) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (uri.isHierarchical()) {
            return (ProxyConfig.MATCH_HTTP.equals(uri.getScheme()) || ProxyConfig.MATCH_HTTPS.equals(uri.getScheme())) && ("waze.com".equals(uri.getHost()) || "www.waze.com".equals(uri.getHost())) && (path = uri.getPath()) != null && path.startsWith("/ul");
        }
        return false;
    }

    public final Uri a() {
        return this.f45543a.build();
    }

    public final void f(c cVar, String str) {
        this.f45543a.appendQueryParameter(cVar.a(), str);
    }

    public final String toString() {
        return this.f45543a.build().toString();
    }
}
