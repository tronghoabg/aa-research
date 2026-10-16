package androidx.navigation;

import androidx.navigation.NavDeepLink;
import androidx.navigation.serialization.RouteSerializerKt;
import h.a.r;
import h.g.b.x;
import h.l.c;
import h.l.s;
import java.util.Map;
import kotlinx.b.p;

/* compiled from: WazeSource */
@NavDeepLinkDsl
/* loaded from: classes3.dex */
public final class NavDeepLinkDslBuilder {
    private String action;
    private final NavDeepLink.Builder builder;
    private String mimeType;
    private c<?> route;
    private Map<s, ? extends NavType<?>> typeMap;
    private String uriPattern;

    public NavDeepLinkDslBuilder(String str, c<?> cVar, Map<s, NavType<?>> map) {
        x.f(str, "basePath");
        x.f(cVar, "route");
        x.f(map, "typeMap");
        this.builder = new NavDeepLink.Builder();
        this.typeMap = r.j();
        if (str.length() <= 0) {
            throw new IllegalArgumentException("The basePath for NavDeepLink from KClass cannot be empty");
        }
        this.uriPattern = RouteSerializerKt.generateRoutePattern(p.a(cVar), map, str);
        this.route = cVar;
        this.typeMap = map;
    }

    public final NavDeepLink build$navigation_common() {
        String str = this.uriPattern;
        if (str == null && this.action == null && this.mimeType == null) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.");
        }
        NavDeepLink.Builder builder = this.builder;
        if (str != null) {
            builder.setUriPattern(str);
        }
        String str2 = this.action;
        if (str2 != null) {
            builder.setAction(str2);
        }
        String str3 = this.mimeType;
        if (str3 != null) {
            builder.setMimeType(str3);
        }
        return builder.build();
    }

    public final String getAction() {
        return this.action;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getUriPattern() {
        return this.uriPattern;
    }

    public final void setAction(String str) {
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        this.action = str;
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public final void setUriPattern(String str) {
        this.uriPattern = str;
    }

    public NavDeepLinkDslBuilder() {
        this.builder = new NavDeepLink.Builder();
        this.typeMap = r.j();
    }
}
