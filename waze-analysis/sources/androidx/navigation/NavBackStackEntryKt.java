package androidx.navigation;

import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.navigation.internal.NavContext;
import h.l.c;

/* loaded from: classes3.dex */
public final class NavBackStackEntryKt {
    public static final String randomUuid() {
        return NavBackStackEntryKt__NavBackStackEntry_androidKt.randomUuid();
    }

    public static final void setPlatformExtras(MutableCreationExtras mutableCreationExtras, NavContext navContext) {
        NavBackStackEntryKt__NavBackStackEntry_androidKt.setPlatformExtras(mutableCreationExtras, navContext);
    }

    public static final /* synthetic */ <T> T toRoute(NavBackStackEntry navBackStackEntry) {
        return (T) NavBackStackEntryKt__NavBackStackEntryKt.toRoute(navBackStackEntry);
    }

    public static final <T> T toRoute(NavBackStackEntry navBackStackEntry, c cVar) {
        return (T) NavBackStackEntryKt__NavBackStackEntryKt.toRoute(navBackStackEntry, cVar);
    }
}
