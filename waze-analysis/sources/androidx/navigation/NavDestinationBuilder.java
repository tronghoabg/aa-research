package androidx.navigation;

import androidx.autofill.HintConstants;
import androidx.navigation.NavDestination;
import androidx.navigation.serialization.RouteSerializerKt;
import h.ab;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.l.c;
import h.l.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.b.b;
import kotlinx.b.p;

/* compiled from: WazeSource */
@NavDestinationDsl
/* loaded from: classes3.dex */
public class NavDestinationBuilder<D extends NavDestination> {
    private Map<Integer, NavAction> actions;
    private Map<String, NavArgument> arguments;
    private List<NavDeepLink> deepLinks;
    private final int id;
    private CharSequence label;
    private final Navigator<? extends D> navigator;
    private final String route;
    private Map<s, ? extends NavType<?>> typeMap;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator<? extends D> navigator, c<?> cVar, Map<s, NavType<?>> map) {
        this(navigator, cVar != null ? RouteSerializerKt.generateHashCode(p.a(cVar)) : -1, cVar != null ? RouteSerializerKt.generateRoutePattern$default(p.a(cVar), map, null, 2, null) : null);
        x.f(navigator, "navigator");
        x.f(map, "typeMap");
        if (cVar != null) {
            for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(p.a(cVar), map)) {
                this.arguments.put(namedNavArgument.getName(), namedNavArgument.getArgument());
            }
        }
        this.typeMap = map;
    }

    public final void action(int i2, l<? super NavActionBuilder, ab> lVar) {
        x.f(lVar, "actionBuilder");
        Map<Integer, NavAction> map = this.actions;
        Integer numValueOf = Integer.valueOf(i2);
        NavActionBuilder navActionBuilder = new NavActionBuilder();
        lVar.invoke(navActionBuilder);
        map.put(numValueOf, navActionBuilder.build$navigation_common());
    }

    public final void argument(String str, l<? super NavArgumentBuilder, ab> lVar) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(lVar, "argumentBuilder");
        Map<String, NavArgument> map = this.arguments;
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        lVar.invoke(navArgumentBuilder);
        map.put(str, navArgumentBuilder.build());
    }

    public D build() {
        D d2 = (D) instantiateDestination();
        d2.setLabel(this.label);
        for (Map.Entry<String, NavArgument> entry : this.arguments.entrySet()) {
            d2.addArgument(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.deepLinks.iterator();
        while (it.hasNext()) {
            d2.addDeepLink((NavDeepLink) it.next());
        }
        for (Map.Entry<Integer, NavAction> entry2 : this.actions.entrySet()) {
            d2.putAction(entry2.getKey().intValue(), entry2.getValue());
        }
        String str = this.route;
        if (str != null) {
            d2.setRoute(str);
        }
        int i2 = this.id;
        if (i2 != -1) {
            d2.setId(i2);
        }
        return d2;
    }

    public final <T> void deepLink(c<T> cVar, String str, l<? super NavDeepLinkDslBuilder, ab> lVar) {
        x.f(cVar, "route");
        x.f(str, "basePath");
        x.f(lVar, "navDeepLink");
        if (this.typeMap == null) {
            throw new IllegalStateException("Cannot add deeplink from KClass [" + cVar + "]. Use the NavDestinationBuilder constructor that takes a KClass with the same arguments.");
        }
        b bVarA = p.a(cVar);
        Map<s, ? extends NavType<?>> map = this.typeMap;
        Map<s, ? extends NavType<?>> map2 = null;
        if (map == null) {
            x.j("typeMap");
            map = null;
        }
        for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(bVarA, map)) {
            NavArgument navArgument = this.arguments.get(namedNavArgument.getName());
            if (navArgument == null || !x.n(navArgument.getType(), namedNavArgument.getArgument().getType())) {
                throw new IllegalArgumentException("Cannot add deeplink from KClass [" + cVar + "]. DeepLink contains unknown argument [" + namedNavArgument.getName() + "]. Ensure deeplink arguments matches the destination's route from KClass");
            }
        }
        Map<s, ? extends NavType<?>> map3 = this.typeMap;
        if (map3 == null) {
            x.j("typeMap");
        } else {
            map2 = map3;
        }
        deepLink(NavDeepLinkDslBuilderKt.navDeepLink(cVar, str, map2, lVar));
    }

    public final /* synthetic */ <T> void deepLinkSafeArgs(String str) {
        x.f(str, "basePath");
        x.i();
        int i2 = ar.f48106a;
        deepLink(new m(Object.class), str, new l<NavDeepLinkDslBuilder, ab>() { // from class: androidx.navigation.NavDestinationBuilder.deepLink.1
            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ ab invoke(NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
                invoke2(navDeepLinkDslBuilder);
                return ab.f48028a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
                x.f(navDeepLinkDslBuilder, "$this$deepLink");
            }
        });
    }

    public final int getId() {
        return this.id;
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    protected final Navigator<? extends D> getNavigator() {
        return this.navigator;
    }

    public final String getRoute() {
        return this.route;
    }

    protected D instantiateDestination() {
        return (D) this.navigator.createDestination();
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void argument(String str, NavArgument navArgument) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(navArgument, "argument");
        this.arguments.put(str, navArgument);
    }

    public NavDestinationBuilder(Navigator<? extends D> navigator, int i2, String str) {
        x.f(navigator, "navigator");
        this.navigator = navigator;
        this.id = i2;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator<? extends D> navigator, String str) {
        this(navigator, -1, str);
        x.f(navigator, "navigator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator<? extends D> navigator, int i2) {
        this(navigator, i2, (String) null);
        x.f(navigator, "navigator");
    }

    public final void deepLink(String str) {
        x.f(str, "uriPattern");
        this.deepLinks.add(new NavDeepLink(str));
    }

    public final /* synthetic */ <T> void deepLink(String str, l<? super NavDeepLinkDslBuilder, ab> lVar) {
        x.f(str, "basePath");
        x.f(lVar, "navDeepLink");
        x.i();
        int i2 = ar.f48106a;
        deepLink(new m(Object.class), str, lVar);
    }

    public final void deepLink(l<? super NavDeepLinkDslBuilder, ab> lVar) {
        x.f(lVar, "navDeepLink");
        List<NavDeepLink> list = this.deepLinks;
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        lVar.invoke(navDeepLinkDslBuilder);
        list.add(navDeepLinkDslBuilder.build$navigation_common());
    }

    public final void deepLink(NavDeepLink navDeepLink) {
        x.f(navDeepLink, "navDeepLink");
        this.deepLinks.add(navDeepLink);
    }
}
