package androidx.navigation;

import android.content.Intent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class NavControllerKt__NavController_androidKt {
    public static final NavDeepLinkRequest NavDeepLinkRequest(Intent intent) {
        x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        return new NavDeepLinkRequest(intent.getData(), intent.getAction(), intent.getType());
    }

    public static final NavGraph createGraph(NavController navController, int i2, int i3, l<? super NavGraphBuilder, ab> lVar) {
        x.f(navController, "<this>");
        x.f(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), i2, i3);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavController navController, int i2, int i3, l lVar, int i4, Object obj) {
        x.f(navController, "<this>");
        x.f(lVar, "builder");
        if (1 == (i4 & 1)) {
            i2 = 0;
        }
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), i2, i3);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
