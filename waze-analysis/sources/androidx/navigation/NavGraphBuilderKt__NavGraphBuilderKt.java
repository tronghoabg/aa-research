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
final /* synthetic */ class NavGraphBuilderKt__NavGraphBuilderKt {
    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, c<T> cVar, Object obj, Map<s, NavType> map, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(cVar, "route");
        x.f(obj, "startDestination");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), obj, (c<?>) cVar, (Map<s, NavType<?>>) map);
        lVar.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, Object obj, c cVar, Map map, l lVar, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            map = r.j();
        }
        if ((i2 & 2) != 0) {
            cVar = null;
        }
        x.f(navigatorProvider, "<this>");
        x.f(obj, "startDestination");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, obj, (c<?>) cVar, (Map<s, NavType<?>>) map);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder, String str, String str2, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(str, "startDestination");
        x.f(str2, "route");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), str, str2);
        lVar.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder navGraphBuilder, Object obj, Map<s, NavType<?>> map, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(obj, "startDestination");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        x.i();
        int i2 = ar.f48106a;
        NavGraphBuilderKt.navigation(navGraphBuilder, new m(Object.class), obj, map, lVar);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, c cVar, Object obj, Map map, l lVar, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            map = r.j();
        }
        NavGraphBuilderKt.navigation(navGraphBuilder, cVar, obj, (Map<s, NavType>) map, (l<? super NavGraphBuilder, ab>) lVar);
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder navGraphBuilder, c<?> cVar, Map<s, NavType<?>> map, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(cVar, "startDestination");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        x.i();
        int i2 = ar.f48106a;
        NavGraphBuilderKt.navigation(navGraphBuilder, (c) new m(Object.class), (c) cVar, (Map<s, NavType>) map, lVar);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, c cVar, Map map, l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            map = r.j();
        }
        x.f(navGraphBuilder, "<this>");
        x.f(cVar, "startDestination");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        x.i();
        int i3 = ar.f48106a;
        NavGraphBuilderKt.navigation(navGraphBuilder, (c) new m(Object.class), cVar, (Map<s, NavType>) map, (l<? super NavGraphBuilder, ab>) lVar);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, c<T> cVar, c cVar2, Map<s, NavType> map, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(cVar, "route");
        x.f(cVar2, "startDestination");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), (c<?>) cVar2, (c<?>) cVar, (Map<s, NavType<?>>) map);
        lVar.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, Object obj, c<?> cVar, Map<s, NavType<?>> map, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navigatorProvider, "<this>");
        x.f(obj, "startDestination");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, obj, cVar, map);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, String str, String str2, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navigatorProvider, "<this>");
        x.f(str, "startDestination");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, str, str2);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, c cVar, c cVar2, Map map, l lVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            map = r.j();
        }
        NavGraphBuilderKt.navigation(navGraphBuilder, cVar, cVar2, (Map<s, NavType>) map, (l<? super NavGraphBuilder, ab>) lVar);
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, c<?> cVar, c<?> cVar2, Map<s, NavType<?>> map, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navigatorProvider, "<this>");
        x.f(cVar, "startDestination");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, cVar, cVar2, map);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, Object obj, Map map, l lVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            map = r.j();
        }
        x.f(navGraphBuilder, "<this>");
        x.f(obj, "startDestination");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        x.i();
        int i3 = ar.f48106a;
        NavGraphBuilderKt.navigation(navGraphBuilder, new m(Object.class), obj, (Map<s, NavType>) map, (l<? super NavGraphBuilder, ab>) lVar);
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, String str, String str2, l lVar, int i2, Object obj) {
        x.f(navigatorProvider, "<this>");
        x.f(str, "startDestination");
        x.f(lVar, "builder");
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, str, str2);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, c cVar, c cVar2, Map map, l lVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            map = r.j();
        }
        if ((i2 & 2) != 0) {
            cVar2 = null;
        }
        x.f(navigatorProvider, "<this>");
        x.f(cVar, "startDestination");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, (c<?>) cVar, (c<?>) cVar2, (Map<s, NavType<?>>) map);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
