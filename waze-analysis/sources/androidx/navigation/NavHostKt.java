package androidx.navigation;

import h.ab;
import h.g.a.l;
import h.l.c;
import h.l.s;
import java.util.Map;

/* loaded from: classes3.dex */
public final class NavHostKt {
    public static final NavGraph createGraph(NavHost navHost, int i2, int i3, l<? super NavGraphBuilder, ab> lVar) {
        return NavHostKt__NavHost_androidKt.createGraph(navHost, i2, i3, lVar);
    }

    public static final NavGraph createGraph(NavHost navHost, Object obj, c<?> cVar, Map<s, NavType<?>> map, l<? super NavGraphBuilder, ab> lVar) {
        return NavHostKt__NavHostKt.createGraph(navHost, obj, cVar, map, lVar);
    }

    public static final NavGraph createGraph(NavHost navHost, String str, String str2, l<? super NavGraphBuilder, ab> lVar) {
        return NavHostKt__NavHostKt.createGraph(navHost, str, str2, lVar);
    }

    public static final NavGraph createGraph(NavHost navHost, c<?> cVar, c<?> cVar2, Map<s, NavType<?>> map, l<? super NavGraphBuilder, ab> lVar) {
        return NavHostKt__NavHostKt.createGraph(navHost, cVar, cVar2, map, lVar);
    }
}
