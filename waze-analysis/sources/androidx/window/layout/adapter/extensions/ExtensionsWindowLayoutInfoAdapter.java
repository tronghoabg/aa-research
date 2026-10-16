package androidx.window.layout.adapter.extensions;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.core.Bounds;
import androidx.window.core.ExtensionsUtil;
import androidx.window.extensions.layout.DisplayFoldFeature;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.SupportedWindowFeatures;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.layout.SupportedPosture;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculatorCompat;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ExtensionsWindowLayoutInfoAdapter {
    public static final ExtensionsWindowLayoutInfoAdapter INSTANCE = new ExtensionsWindowLayoutInfoAdapter();

    private ExtensionsWindowLayoutInfoAdapter() {
    }

    private final boolean validBounds(WindowMetrics windowMetrics, Bounds bounds) {
        Rect bounds2 = windowMetrics.getBounds();
        if (bounds.isZero()) {
            return false;
        }
        if (bounds.getWidth() != bounds2.width() && bounds.getHeight() != bounds2.height()) {
            return false;
        }
        if (bounds.getWidth() >= bounds2.width() || bounds.getHeight() >= bounds2.height()) {
            return (bounds.getWidth() == bounds2.width() && bounds.getHeight() == bounds2.height()) ? false : true;
        }
        return false;
    }

    public final WindowLayoutInfo translate$window(WindowMetrics windowMetrics, androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        x.f(windowMetrics, "windowMetrics");
        x.f(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        x.e(displayFeatures, "getDisplayFeatures(...)");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            androidx.window.layout.FoldingFeature foldingFeatureTranslate$window = foldingFeature instanceof FoldingFeature ? INSTANCE.translate$window(windowMetrics, foldingFeature) : null;
            if (foldingFeatureTranslate$window != null) {
                arrayList.add(foldingFeatureTranslate$window);
            }
        }
        ArrayList arrayList2 = arrayList;
        int engagementModeFlags = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel() >= 10 ? windowLayoutInfo.getEngagementModeFlags() : 3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if ((engagementModeFlags & 1) != 0) {
            linkedHashSet.add(WindowLayoutInfo.EngagementMode.VISUALS_ON);
        }
        if ((engagementModeFlags & 2) != 0) {
            linkedHashSet.add(WindowLayoutInfo.EngagementMode.AUDIO_ON);
        }
        return new WindowLayoutInfo(arrayList2, i.au(linkedHashSet));
    }

    public final List<SupportedPosture> translate$window(SupportedWindowFeatures supportedWindowFeatures) {
        x.f(supportedWindowFeatures, "features");
        List displayFoldFeatures = supportedWindowFeatures.getDisplayFoldFeatures();
        x.e(displayFoldFeatures, "getDisplayFoldFeatures(...)");
        List list = displayFoldFeatures;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((DisplayFoldFeature) it.next()).hasProperties(new int[]{1})) {
                    return i.d(SupportedPosture.TABLETOP);
                }
            }
        }
        return i.h();
    }

    public final androidx.window.layout.FoldingFeature translate$window(WindowMetrics windowMetrics, FoldingFeature foldingFeature) {
        HardwareFoldingFeature.Type fold;
        FoldingFeature.State state;
        x.f(windowMetrics, "windowMetrics");
        x.f(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            fold = HardwareFoldingFeature.Type.Companion.getFOLD();
        } else {
            if (type != 2) {
                return null;
            }
            fold = HardwareFoldingFeature.Type.Companion.getHINGE();
        }
        int state2 = foldingFeature.getState();
        if (state2 == 1) {
            state = FoldingFeature.State.FLAT;
        } else {
            if (state2 != 2) {
                return null;
            }
            state = FoldingFeature.State.HALF_OPENED;
        }
        Rect bounds = foldingFeature.getBounds();
        x.e(bounds, "getBounds(...)");
        if (!validBounds(windowMetrics, new Bounds(bounds))) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        x.e(bounds2, "getBounds(...)");
        return new HardwareFoldingFeature(new Bounds(bounds2), fold, state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WindowLayoutInfo translate$window(Context context, androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        x.f(context, "context");
        x.f(windowLayoutInfo, "info");
        WindowMetricsCalculatorCompat windowMetricsCalculatorCompat = new WindowMetricsCalculatorCompat(null, 1, 0 == true ? 1 : 0);
        if (Build.VERSION.SDK_INT >= 30) {
            return translate$window(windowMetricsCalculatorCompat.computeCurrentWindowMetrics(context), windowLayoutInfo);
        }
        if (context instanceof Activity) {
            return translate$window(windowMetricsCalculatorCompat.computeCurrentWindowMetrics((Activity) context), windowLayoutInfo);
        }
        throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
    }
}
