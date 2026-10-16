package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class VNode {
    public static final int $stable = 8;
    private l<? super VNode, ab> invalidateListener;

    private VNode() {
    }

    public abstract void draw(DrawScope drawScope);

    public l<VNode, ab> getInvalidateListener$ui() {
        return this.invalidateListener;
    }

    public final void invalidate() {
        l<VNode, ab> invalidateListener$ui = getInvalidateListener$ui();
        if (invalidateListener$ui != null) {
            invalidateListener$ui.invoke(this);
        }
    }

    public void setInvalidateListener$ui(l<? super VNode, ab> lVar) {
        this.invalidateListener = lVar;
    }

    public /* synthetic */ VNode(o oVar) {
        this();
    }
}
