package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class EdgeToEdgeApi23 extends EdgeToEdgeBase {
    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, Window window, View view, boolean z, boolean z2) {
        x.f(systemBarStyle, "statusBarStyle");
        x.f(systemBarStyle2, "navigationBarStyle");
        x.f(window, "window");
        x.f(view, "view");
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(systemBarStyle.getScrim$activity(z));
        window.setNavigationBarColor(systemBarStyle2.getDarkScrim$activity());
        new WindowInsetsControllerCompat(window, view).setAppearanceLightStatusBars(!z);
    }
}
