package androidx.savedstate;

import android.view.View;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ViewKt {
    public static final /* synthetic */ SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(View view) {
        x.f(view, "view");
        return ViewTreeSavedStateRegistryOwner.get(view);
    }
}
