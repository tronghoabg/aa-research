package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ViewRootForInspector {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.ViewRootForInspector$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static AbstractComposeView $default$getSubCompositionView(ViewRootForInspector viewRootForInspector) {
            return null;
        }

        public static View $default$getViewRoot(ViewRootForInspector viewRootForInspector) {
            return null;
        }

        public static /* synthetic */ AbstractComposeView access$getSubCompositionView$jd(ViewRootForInspector viewRootForInspector) {
            return null;
        }

        public static /* synthetic */ View access$getViewRoot$jd(ViewRootForInspector viewRootForInspector) {
            return null;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static AbstractComposeView getSubCompositionView(ViewRootForInspector viewRootForInspector) {
            return null;
        }

        @Deprecated
        public static View getViewRoot(ViewRootForInspector viewRootForInspector) {
            return null;
        }
    }

    AbstractComposeView getSubCompositionView();

    View getViewRoot();
}
