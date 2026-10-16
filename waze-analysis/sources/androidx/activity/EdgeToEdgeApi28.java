package androidx.activity;

import android.view.Window;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
class EdgeToEdgeApi28 extends EdgeToEdgeApi26 {
    @Override // androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    public void adjustLayoutInDisplayCutoutMode(Window window) {
        x.f(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}
