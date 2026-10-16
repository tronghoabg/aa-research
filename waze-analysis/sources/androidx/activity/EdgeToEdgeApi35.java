package androidx.activity;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.insets.ColorProtection;
import androidx.core.view.insets.Protection;
import androidx.core.view.insets.ProtectionLayout;
import h.a.i;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class EdgeToEdgeApi35 extends EdgeToEdgeApi30 {
    @Override // androidx.activity.EdgeToEdgeApi29, androidx.activity.EdgeToEdgeApi26, androidx.activity.EdgeToEdgeImpl
    public void setUp(SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, Window window, View view, boolean z, boolean z2) {
        x.f(systemBarStyle, "statusBarStyle");
        x.f(systemBarStyle2, "navigationBarStyle");
        x.f(window, "window");
        x.f(view, "view");
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int scrimWithEnforcedContrast$activity = systemBarStyle.getScrimWithEnforcedContrast$activity(z);
        int scrimWithEnforcedContrast$activity2 = systemBarStyle2.getScrimWithEnforcedContrast$activity(z2);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            Iterator<View> it = ViewGroupKt.getChildren(viewGroup).iterator();
            while (true) {
                if (it.hasNext()) {
                    Object tag = it.next().getTag();
                    if (tag instanceof List) {
                        List list = (List) tag;
                        if (list.size() == 4 && (list.get(0) instanceof ColorProtection)) {
                            for (Object obj : (Iterable) tag) {
                                if ((obj instanceof ColorProtection ? (ColorProtection) obj : null) != null) {
                                    ColorProtection colorProtection = (ColorProtection) obj;
                                    int side = colorProtection.getSide();
                                    if (side == 1) {
                                        colorProtection.setColor(scrimWithEnforcedContrast$activity2);
                                    } else if (side == 2) {
                                        colorProtection.setColor(scrimWithEnforcedContrast$activity);
                                    } else if (side == 4) {
                                        colorProtection.setColor(scrimWithEnforcedContrast$activity2);
                                    } else if (side == 8) {
                                        colorProtection.setColor(scrimWithEnforcedContrast$activity2);
                                    }
                                }
                            }
                        }
                    }
                } else if (scrimWithEnforcedContrast$activity != 0) {
                    List listI = i.i(new ColorProtection(2, scrimWithEnforcedContrast$activity), new ColorProtection(1, scrimWithEnforcedContrast$activity2), new ColorProtection(4, scrimWithEnforcedContrast$activity2), new ColorProtection(8, scrimWithEnforcedContrast$activity2));
                    ProtectionLayout protectionLayout = new ProtectionLayout(((ViewGroup) view).getContext(), (List<Protection>) listI);
                    protectionLayout.setTag(listI);
                    viewGroup.addView(protectionLayout);
                } else if (scrimWithEnforcedContrast$activity2 != 0) {
                    scrimWithEnforcedContrast$activity = 0;
                    List listI2 = i.i(new ColorProtection(2, scrimWithEnforcedContrast$activity), new ColorProtection(1, scrimWithEnforcedContrast$activity2), new ColorProtection(4, scrimWithEnforcedContrast$activity2), new ColorProtection(8, scrimWithEnforcedContrast$activity2));
                    ProtectionLayout protectionLayout2 = new ProtectionLayout(((ViewGroup) view).getContext(), (List<Protection>) listI2);
                    protectionLayout2.setTag(listI2);
                    viewGroup.addView(protectionLayout2);
                }
            }
        }
        window.setNavigationBarContrastEnforced(systemBarStyle2.getNightMode$activity() == 0);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
        windowInsetsControllerCompat.setAppearanceLightStatusBars(!z);
        windowInsetsControllerCompat.setAppearanceLightNavigationBars(!z2);
    }
}
