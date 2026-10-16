package androidx.navigation;

import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class NavGraphBuilderKt__NavGraphBuilder_androidKt {
    public static final void navigation(NavGraphBuilder navGraphBuilder, int i2, int i3, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), i2, i3);
        lVar.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, int i2, int i3, l lVar, int i4, Object obj) {
        x.f(navigatorProvider, "<this>");
        x.f(lVar, "builder");
        if (1 == (i4 & 1)) {
            i2 = 0;
        }
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i2, i3);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, int i2, int i3, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navigatorProvider, "<this>");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i2, i3);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
