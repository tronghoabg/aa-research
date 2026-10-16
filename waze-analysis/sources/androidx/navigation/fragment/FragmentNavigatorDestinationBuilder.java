package androidx.navigation.fragment;

import android.support.v4.app.ar;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.NavType;
import androidx.navigation.fragment.FragmentNavigator;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import h.l.s;
import java.util.Map;

/* compiled from: WazeSource */
@NavDestinationDsl
/* loaded from: classes3.dex */
public final class FragmentNavigatorDestinationBuilder extends NavDestinationBuilder<FragmentNavigator.Destination> {
    private c<? extends ar> fragmentClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigatorDestinationBuilder(FragmentNavigator fragmentNavigator, c<? extends Object> cVar, Map<s, NavType<?>> map, c<? extends ar> cVar2) {
        super(fragmentNavigator, cVar, map);
        x.f(fragmentNavigator, "navigator");
        x.f(cVar, "route");
        x.f(map, "typeMap");
        x.f(cVar2, "fragmentClass");
        this.fragmentClass = cVar2;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public FragmentNavigator.Destination build() {
        FragmentNavigator.Destination destination = (FragmentNavigator.Destination) super.build();
        String name = o.w(this.fragmentClass).getName();
        x.e(name, "getName(...)");
        destination.setClassName(name);
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigatorDestinationBuilder(FragmentNavigator fragmentNavigator, String str, c<? extends ar> cVar) {
        super(fragmentNavigator, str);
        x.f(fragmentNavigator, "navigator");
        x.f(str, "route");
        x.f(cVar, "fragmentClass");
        this.fragmentClass = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigatorDestinationBuilder(FragmentNavigator fragmentNavigator, int i2, c<? extends ar> cVar) {
        super(fragmentNavigator, i2);
        x.f(fragmentNavigator, "navigator");
        x.f(cVar, "fragmentClass");
        this.fragmentClass = cVar;
    }
}
