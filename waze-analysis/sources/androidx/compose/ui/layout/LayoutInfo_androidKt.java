package androidx.compose.ui.layout;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutInfo_androidKt {
    public static final View getView(LayoutInfo layoutInfo) {
        x.d(layoutInfo, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutNode");
        Object owner$ui = ((LayoutNode) layoutInfo).getOwner$ui();
        if (owner$ui instanceof View) {
            return (View) owner$ui;
        }
        return null;
    }
}
