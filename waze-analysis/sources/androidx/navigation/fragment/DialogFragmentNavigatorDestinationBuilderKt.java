package androidx.navigation.fragment;

import android.support.v4.app.ab;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavType;
import h.a.r;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.l.s;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DialogFragmentNavigatorDestinationBuilderKt {
    public static final /* synthetic */ <F extends ab, T> void dialog(NavGraphBuilder navGraphBuilder, Map<s, NavType<?>> map, l<? super DialogFragmentNavigatorDestinationBuilder, h.ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        x.i();
        int i2 = ar.f48106a;
        m mVar = new m(Object.class);
        x.i();
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, mVar, map, new m(ab.class));
        lVar.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, Map map, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = r.j();
        }
        x.f(navGraphBuilder, "<this>");
        x.f(map, "typeMap");
        x.f(lVar, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        x.i();
        int i3 = ar.f48106a;
        m mVar = new m(Object.class);
        x.i();
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, mVar, map, new m(ab.class));
        lVar.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends ab> void dialog(NavGraphBuilder navGraphBuilder, int i2, l<? super DialogFragmentNavigatorDestinationBuilder, h.ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(lVar, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        x.i();
        int i3 = ar.f48106a;
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, i2, new m(ab.class));
        lVar.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends ab> void dialog(NavGraphBuilder navGraphBuilder, String str) {
        x.f(navGraphBuilder, "<this>");
        x.f(str, "route");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        x.i();
        int i2 = ar.f48106a;
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, str, new m(ab.class)));
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = r.j();
        }
        x.f(navGraphBuilder, "<this>");
        x.f(map, "typeMap");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        x.i();
        int i3 = ar.f48106a;
        m mVar = new m(Object.class);
        x.i();
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, mVar, map, new m(ab.class)));
    }

    public static final /* synthetic */ <F extends ab> void dialog(NavGraphBuilder navGraphBuilder, String str, l<? super DialogFragmentNavigatorDestinationBuilder, h.ab> lVar) {
        x.f(navGraphBuilder, "<this>");
        x.f(str, "route");
        x.f(lVar, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        x.i();
        int i2 = ar.f48106a;
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, str, new m(ab.class));
        lVar.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends ab, T> void dialog(NavGraphBuilder navGraphBuilder, Map<s, NavType<?>> map) {
        x.f(navGraphBuilder, "<this>");
        x.f(map, "typeMap");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        x.i();
        int i2 = ar.f48106a;
        m mVar = new m(Object.class);
        x.i();
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, mVar, map, new m(ab.class)));
    }

    public static final /* synthetic */ <F extends ab> void dialog(NavGraphBuilder navGraphBuilder, int i2) {
        x.f(navGraphBuilder, "<this>");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        x.i();
        int i3 = ar.f48106a;
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, i2, new m(ab.class)));
    }
}
