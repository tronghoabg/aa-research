package androidx.navigation;

import androidx.autofill.HintConstants;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class NavigatorProviderKt__NavigatorProviderKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, String str) {
        x.f(navigatorProvider, "<this>");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return (T) navigatorProvider.getNavigator(str);
    }

    public static final void plusAssign(NavigatorProvider navigatorProvider, Navigator<? extends NavDestination> navigator) {
        x.f(navigatorProvider, "<this>");
        x.f(navigator, "navigator");
        navigatorProvider.addNavigator(navigator);
    }

    public static final Navigator<? extends NavDestination> set(NavigatorProvider navigatorProvider, String str, Navigator<? extends NavDestination> navigator) {
        x.f(navigatorProvider, "<this>");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(navigator, "navigator");
        return navigatorProvider.addNavigator(str, navigator);
    }
}
