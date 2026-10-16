package androidx.lifecycle;

import android.view.View;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewKt {
    public static final /* synthetic */ LifecycleOwner findViewTreeLifecycleOwner(View view) {
        x.f(view, "view");
        return ViewTreeLifecycleOwner.get(view);
    }
}
