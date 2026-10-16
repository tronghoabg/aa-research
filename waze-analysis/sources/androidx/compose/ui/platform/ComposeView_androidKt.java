package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.viewtree.ViewTree;
import com.waze.R;
import h.g.b.x;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposeView_androidKt {
    private static boolean areWindowInsetsRulersEnabled = true;

    public static final void disableWindowInsetsRulers(ComposeView.Companion companion) {
        areWindowInsetsRulersEnabled = false;
    }

    private static final int findDepthToTag(View view, int i2) {
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!x.n(tag, obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i4;
            }
            i4++;
            Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return i3;
    }

    public static final ComposeViewContext findViewTreeComposeViewContext(View view) {
        return getComposeViewContext(findViewTreeComposeViewRoot(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findViewTreeComposeViewRoot(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(findDepthToTag(view, R.id.view_tree_lifecycle_owner), findDepthToTag(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (getComposeViewContext(view) == null) {
                i2++;
                Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
                View view4 = view2;
                view2 = view;
                view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final boolean getAreWindowInsetsRulersEnabled() {
        return areWindowInsetsRulersEnabled;
    }

    public static final ComposeViewContext getComposeViewContext(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (ComposeViewContext) weakReference.get();
        }
        return null;
    }

    public static final void setAreWindowInsetsRulersEnabled(boolean z) {
        areWindowInsetsRulersEnabled = z;
    }

    public static final void setComposeViewContext(View view, ComposeViewContext composeViewContext) {
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(composeViewContext));
    }

    public static /* synthetic */ void getComposeViewContext$annotations(View view) {
    }
}
