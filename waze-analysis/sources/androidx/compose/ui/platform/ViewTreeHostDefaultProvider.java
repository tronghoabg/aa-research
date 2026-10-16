package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.HostDefaultKey;
import androidx.compose.runtime.HostDefaultProvider;
import androidx.compose.runtime.ViewTreeHostDefaultKey;
import androidx.core.viewtree.ViewTree;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewTreeHostDefaultProvider implements HostDefaultProvider {
    public static final int $stable = 8;
    private final View view;

    public ViewTreeHostDefaultProvider(View view) {
        this.view = view;
    }

    @Override // androidx.compose.runtime.HostDefaultProvider
    public <T> T getHostDefault(HostDefaultKey<T> hostDefaultKey) {
        if (hostDefaultKey instanceof ViewTreeHostDefaultKey) {
            View view = this.view;
            while (view != null) {
                T t = (T) view.getTag(((ViewTreeHostDefaultKey) hostDefaultKey).getTagKey());
                if (t != null) {
                    return t;
                }
                Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
                view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
            }
        }
        return null;
    }
}
