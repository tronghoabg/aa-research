package androidx.navigation;

import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class NavHostKt__NavHost_androidKt {
    public static final NavGraph createGraph(NavHost navHost, int i2, int i3, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navHost, "<this>");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i2, i3);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, int i2, int i3, l lVar, int i4, Object obj) {
        x.f(navHost, "<this>");
        x.f(lVar, "builder");
        NavigatorProvider navigatorProvider = navHost.getNavController().getNavigatorProvider();
        if (1 == (i4 & 1)) {
            i2 = 0;
        }
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i2, i3);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
