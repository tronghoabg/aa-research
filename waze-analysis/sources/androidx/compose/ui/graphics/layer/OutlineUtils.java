package androidx.compose.ui.graphics.layer;

import android.view.View;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class OutlineUtils {
    public static final OutlineUtils INSTANCE = new OutlineUtils();
    private static boolean hasRetrievedMethod;
    private static Method rebuildOutlineMethod;

    private OutlineUtils() {
    }

    public final boolean rebuildOutline(View view) {
        view.invalidateOutline();
        return true;
    }
}
