package androidx.navigation.fragment;

import android.support.v4.app.ar;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavType;
import h.a.r;
import h.ab;
import h.g.a.l;
import h.g.b.m;
import h.g.b.x;
import h.l.s;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FragmentNavigatorDestinationBuilderKt {
    public static final /* synthetic */ <F extends ar, T> void fragment(NavGraphBuilder navGraphBuilder, Map<s, NavType<?>> map, l<? super FragmentNavigatorDestinationBuilder, ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        x.i();
        int i2 = h.g.b.ar.f48106a;
        m mVar = new m(Object.class);
        x.i();
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder(fragmentNavigator, mVar, map, new m(ar.class));
        lVar.invoke(fragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(fragmentNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void fragment$default(NavGraphBuilder navGraphBuilder, Map map, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = r.j();
        }
        x.f(navGraphBuilder, "<this>");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        x.i();
        int i3 = h.g.b.ar.f48106a;
        m mVar = new m(Object.class);
        x.i();
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder(fragmentNavigator, mVar, map, new m(ar.class));
        lVar.invoke(fragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(fragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends ar> void fragment(NavGraphBuilder navGraphBuilder, int i2, l<? super FragmentNavigatorDestinationBuilder, ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(lVar, "builder");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        x.i();
        int i3 = h.g.b.ar.f48106a;
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder(fragmentNavigator, i2, new m(ar.class));
        lVar.invoke(fragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(fragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends ar> void fragment(NavGraphBuilder navGraphBuilder, String str) {
        x.f(navGraphBuilder, "<this>");
        x.f(str, "route");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        x.i();
        int i2 = h.g.b.ar.f48106a;
        navGraphBuilder.destination(new FragmentNavigatorDestinationBuilder(fragmentNavigator, str, new m(ar.class)));
    }

    public static /* synthetic */ void fragment$default(NavGraphBuilder navGraphBuilder, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = r.j();
        }
        x.f(navGraphBuilder, "<this>");
        x.f(map, "typeMap");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        x.i();
        int i3 = h.g.b.ar.f48106a;
        m mVar = new m(Object.class);
        x.i();
        navGraphBuilder.destination(new FragmentNavigatorDestinationBuilder(fragmentNavigator, mVar, map, new m(ar.class)));
    }

    public static final /* synthetic */ <F extends ar> void fragment(NavGraphBuilder navGraphBuilder, String str, l<? super FragmentNavigatorDestinationBuilder, ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(str, "route");
        x.f(lVar, "builder");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        x.i();
        int i2 = h.g.b.ar.f48106a;
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder(fragmentNavigator, str, new m(ar.class));
        lVar.invoke(fragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(fragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends ar, T> void fragment(NavGraphBuilder navGraphBuilder, Map<s, NavType<?>> map) {
        x.f(navGraphBuilder, "<this>");
        x.f(map, "typeMap");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        x.i();
        int i2 = h.g.b.ar.f48106a;
        m mVar = new m(Object.class);
        x.i();
        navGraphBuilder.destination(new FragmentNavigatorDestinationBuilder(fragmentNavigator, mVar, map, new m(ar.class)));
    }

    public static final /* synthetic */ <F extends ar> void fragment(NavGraphBuilder navGraphBuilder, int i2) {
        x.f(navGraphBuilder, "<this>");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        x.i();
        int i3 = h.g.b.ar.f48106a;
        navGraphBuilder.destination(new FragmentNavigatorDestinationBuilder(fragmentNavigator, i2, new m(ar.class)));
    }
}
