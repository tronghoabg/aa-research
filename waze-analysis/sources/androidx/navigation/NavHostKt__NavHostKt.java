package androidx.navigation;

import h.a.r;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import h.l.c;
import h.l.s;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class NavHostKt__NavHostKt {
    public static final NavGraph createGraph(NavHost navHost, Object obj, c<?> cVar, Map<s, NavType<?>> map, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navHost, "<this>");
        x.f(obj, "startDestination");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), obj, cVar, map);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, Object obj, c cVar, Map map, l lVar, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            map = r.j();
        }
        if ((i2 & 2) != 0) {
            cVar = null;
        }
        x.f(navHost, "<this>");
        x.f(obj, "startDestination");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), obj, (c<?>) cVar, (Map<s, NavType<?>>) map);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph createGraph(NavHost navHost, String str, String str2, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navHost, "<this>");
        x.f(str, "startDestination");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), str, str2);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph createGraph(NavHost navHost, c<?> cVar, c<?> cVar2, Map<s, NavType<?>> map, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navHost, "<this>");
        x.f(cVar, "startDestination");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), cVar, cVar2, map);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, String str, String str2, l lVar, int i2, Object obj) {
        x.f(navHost, "<this>");
        x.f(str, "startDestination");
        x.f(lVar, "builder");
        NavigatorProvider navigatorProvider = navHost.getNavController().getNavigatorProvider();
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, str, str2);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, c cVar, c cVar2, Map map, l lVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            map = r.j();
        }
        if ((i2 & 2) != 0) {
            cVar2 = null;
        }
        x.f(navHost, "<this>");
        x.f(cVar, "startDestination");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), (c<?>) cVar, (c<?>) cVar2, (Map<s, NavType<?>>) map);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
