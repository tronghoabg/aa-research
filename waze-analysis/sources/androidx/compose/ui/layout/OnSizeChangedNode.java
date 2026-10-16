package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.MeasuredSizeAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OnSizeChangedNode extends Modifier.Node implements MeasuredSizeAwareModifierNode {
    public static final int $stable = 8;
    private l<? super IntSize, ab> onSizeChanged;
    private final boolean shouldAutoInvalidate = true;
    private long previousSize = -9223372034707292160L;

    public OnSizeChangedNode(l<? super IntSize, ab> lVar) {
        this.onSizeChanged = lVar;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo2116onRemeasuredozmzZPI(long j2) {
        if (IntSize.m11337equalsimpl0(this.previousSize, j2)) {
            return;
        }
        this.onSizeChanged.invoke(IntSize.m11331boximpl(j2));
        this.previousSize = j2;
    }

    public final void update(l<? super IntSize, ab> lVar) {
        this.onSizeChanged = lVar;
        this.previousSize = -9223372034707292160L;
    }
}
