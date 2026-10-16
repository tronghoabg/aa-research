package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DrawResult {
    public static final int $stable = 8;
    private l<? super ContentDrawScope, ab> block;

    public DrawResult(l<? super ContentDrawScope, ab> lVar) {
        this.block = lVar;
    }

    public final l<ContentDrawScope, ab> getBlock$ui() {
        return this.block;
    }

    public final void setBlock$ui(l<? super ContentDrawScope, ab> lVar) {
        this.block = lVar;
    }
}
