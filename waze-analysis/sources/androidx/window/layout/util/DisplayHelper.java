package androidx.window.layout.util;

import android.graphics.Point;
import android.view.Display;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class DisplayHelper {
    public static final DisplayHelper INSTANCE = new DisplayHelper();

    private DisplayHelper() {
    }

    public final Point getRealSizeForDisplay(Display display) {
        x.f(display, "display");
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }
}
