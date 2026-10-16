package androidx.activity;

import android.view.Window;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class EdgeToEdgeApi30 extends EdgeToEdgeApi29 {
    @Override // androidx.activity.EdgeToEdgeApi28, androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    public void adjustLayoutInDisplayCutoutMode(Window window) {
        x.f(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}
