package androidx.navigation;

import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavOptionsBuilderKt {
    public static final NavOptions navOptions(l<? super NavOptionsBuilder, ab> lVar) {
        x.f(lVar, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        lVar.invoke(navOptionsBuilder);
        return navOptionsBuilder.build$navigation_common();
    }
}
