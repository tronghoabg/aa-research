package androidx.navigation.fragment;

import android.support.v4.app.ab;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.NavType;
import androidx.navigation.fragment.DialogFragmentNavigator;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import h.l.s;
import java.util.Map;

/* compiled from: WazeSource */
@NavDestinationDsl
/* loaded from: classes3.dex */
public final class DialogFragmentNavigatorDestinationBuilder extends NavDestinationBuilder<DialogFragmentNavigator.Destination> {
    private c<? extends ab> fragmentClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator dialogFragmentNavigator, c<? extends Object> cVar, Map<s, NavType<?>> map, c<? extends ab> cVar2) {
        super(dialogFragmentNavigator, cVar, map);
        x.f(dialogFragmentNavigator, "navigator");
        x.f(cVar, "route");
        x.f(map, "typeMap");
        x.f(cVar2, "fragmentClass");
        this.fragmentClass = cVar2;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public DialogFragmentNavigator.Destination build() {
        DialogFragmentNavigator.Destination destination = (DialogFragmentNavigator.Destination) super.build();
        String name = o.w(this.fragmentClass).getName();
        x.e(name, "getName(...)");
        destination.setClassName(name);
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator dialogFragmentNavigator, String str, c<? extends ab> cVar) {
        super(dialogFragmentNavigator, str);
        x.f(dialogFragmentNavigator, "navigator");
        x.f(str, "route");
        x.f(cVar, "fragmentClass");
        this.fragmentClass = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator dialogFragmentNavigator, int i2, c<? extends ab> cVar) {
        super(dialogFragmentNavigator, i2);
        x.f(dialogFragmentNavigator, "navigator");
        x.f(cVar, "fragmentClass");
        this.fragmentClass = cVar;
    }
}
