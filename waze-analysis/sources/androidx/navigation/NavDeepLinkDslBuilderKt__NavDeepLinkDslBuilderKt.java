package androidx.navigation;

import h.a.r;
import h.ab;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.l.c;
import h.l.s;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt {
    public static final <T> NavDeepLink navDeepLink(c<T> cVar, String str, Map<s, NavType> map, l<? super NavDeepLinkDslBuilder, ab> lVar) {
        x.f(cVar, "route");
        x.f(str, "basePath");
        x.f(map, "typeMap");
        x.f(lVar, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder(str, cVar, map);
        lVar.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common();
    }

    public static /* synthetic */ NavDeepLink navDeepLink$default(String str, Map map, l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            map = r.j();
        }
        if ((i2 & 4) != 0) {
            lVar = new l<NavDeepLinkDslBuilder, ab>() { // from class: androidx.navigation.NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt.navDeepLink.1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
                    invoke2(navDeepLinkDslBuilder);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
                    x.f(navDeepLinkDslBuilder, "<this>");
                }
            };
        }
        x.f(str, "basePath");
        x.f(map, "typeMap");
        x.f(lVar, "deepLinkBuilder");
        x.i();
        int i3 = ar.f48106a;
        return NavDeepLinkDslBuilderKt.navDeepLink(new m(Object.class), str, map, lVar);
    }

    public static final /* synthetic */ <T> NavDeepLink navDeepLink(String str, Map<s, NavType<?>> map, l<? super NavDeepLinkDslBuilder, ab> lVar) {
        x.f(str, "basePath");
        x.f(map, "typeMap");
        x.f(lVar, "deepLinkBuilder");
        x.i();
        int i2 = ar.f48106a;
        return NavDeepLinkDslBuilderKt.navDeepLink(new m(Object.class), str, map, lVar);
    }

    public static final NavDeepLink navDeepLink(l<? super NavDeepLinkDslBuilder, ab> lVar) {
        x.f(lVar, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        lVar.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common();
    }

    public static final <T> NavDeepLink navDeepLink(c<T> cVar, String str, l<? super NavDeepLinkDslBuilder, ab> lVar) {
        x.f(cVar, "route");
        x.f(str, "basePath");
        x.f(lVar, "deepLinkBuilder");
        return navDeepLink$default(cVar, str, null, lVar, 4, null);
    }

    public static /* synthetic */ NavDeepLink navDeepLink$default(c cVar, String str, Map map, l lVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            map = r.j();
        }
        return NavDeepLinkDslBuilderKt.navDeepLink(cVar, str, map, lVar);
    }
}
