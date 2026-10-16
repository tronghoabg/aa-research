package androidx.navigation;

import android.content.Intent;
import h.ab;
import h.g.a.l;
import h.l.c;
import h.l.s;
import java.util.Map;

/* loaded from: classes3.dex */
public final class NavControllerKt {
    public static final NavDeepLinkRequest NavDeepLinkRequest(Intent intent) {
        return NavControllerKt__NavController_androidKt.NavDeepLinkRequest(intent);
    }

    public static final NavGraph createGraph(NavController navController, int i2, int i3, l<? super NavGraphBuilder, ab> lVar) {
        return NavControllerKt__NavController_androidKt.createGraph(navController, i2, i3, lVar);
    }

    public static final NavGraph createGraph(NavController navController, Object obj, c<?> cVar, Map<s, NavType<?>> map, l<? super NavGraphBuilder, ab> lVar) {
        return NavControllerKt__NavControllerKt.createGraph(navController, obj, cVar, map, lVar);
    }

    public static final NavGraph createGraph(NavController navController, String str, String str2, l<? super NavGraphBuilder, ab> lVar) {
        return NavControllerKt__NavControllerKt.createGraph(navController, str, str2, lVar);
    }

    public static final NavGraph createGraph(NavController navController, c<?> cVar, c<?> cVar2, Map<s, NavType<?>> map, l<? super NavGraphBuilder, ab> lVar) {
        return NavControllerKt__NavControllerKt.createGraph(navController, cVar, cVar2, map, lVar);
    }
}
