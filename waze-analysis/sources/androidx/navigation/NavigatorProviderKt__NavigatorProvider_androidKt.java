package androidx.navigation;

import h.g.b.o;
import h.g.b.x;
import h.l.c;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class NavigatorProviderKt__NavigatorProvider_androidKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, c<T> cVar) {
        x.f(navigatorProvider, "<this>");
        x.f(cVar, "clazz");
        return (T) navigatorProvider.getNavigator(o.w(cVar));
    }
}
