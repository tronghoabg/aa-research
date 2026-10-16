package androidx.lifecycle;

import android.view.View;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewTreeViewModelKt {
    public static final /* synthetic */ ViewModelStoreOwner findViewTreeViewModelStoreOwner(View view) {
        x.f(view, "view");
        return ViewTreeViewModelStoreOwner.get(view);
    }
}
