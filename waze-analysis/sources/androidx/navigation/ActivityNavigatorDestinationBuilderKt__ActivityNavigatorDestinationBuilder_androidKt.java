package androidx.navigation;

import h.a.r;
import h.ab;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.l.s;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt {
    public static final /* synthetic */ <T> void activity(NavGraphBuilder navGraphBuilder, Map<s, NavType<?>> map, l<? super ActivityNavigatorDestinationBuilder, ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        ActivityNavigator activityNavigator = (ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class);
        x.i();
        int i2 = ar.f48106a;
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder(activityNavigator, new m(Object.class), map);
        lVar.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void activity$default(NavGraphBuilder navGraphBuilder, Map map, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = r.j();
        }
        x.f(navGraphBuilder, "<this>");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        ActivityNavigator activityNavigator = (ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class);
        x.i();
        int i3 = ar.f48106a;
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder(activityNavigator, new m(Object.class), map);
        lVar.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static final void activity(NavGraphBuilder navGraphBuilder, String str, l<? super ActivityNavigatorDestinationBuilder, ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(str, "route");
        x.f(lVar, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), str);
        lVar.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static final void activity(NavGraphBuilder navGraphBuilder, int i2, l<? super ActivityNavigatorDestinationBuilder, ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(lVar, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), i2);
        lVar.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }
}
