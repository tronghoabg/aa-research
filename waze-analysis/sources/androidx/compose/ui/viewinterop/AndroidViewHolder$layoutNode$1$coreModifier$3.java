package androidx.compose.ui.viewinterop;

import android.view.WindowInsets;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.WindowInsetsCompat;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidViewHolder$layoutNode$1$coreModifier$3 extends y implements l<LayoutCoordinates, ab> {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidViewHolder $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$coreModifier$3(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.$this_run = androidViewHolder;
        this.$layoutNode = layoutNode;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutCoordinates layoutCoordinates) {
        WindowInsets windowInsets;
        AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, this.$layoutNode);
        AndroidViewHolder androidViewHolder = this.$this_run;
        androidViewHolder.owner.onInteropViewLayoutChange(androidViewHolder);
        int i2 = this.$this_run.position[0];
        int i3 = this.$this_run.position[1];
        AndroidViewHolder androidViewHolder2 = this.$this_run;
        androidViewHolder2.getView().getLocationOnScreen(androidViewHolder2.position);
        AndroidViewHolder androidViewHolder3 = this.$this_run;
        long j2 = androidViewHolder3.size;
        androidViewHolder3.size = layoutCoordinates.mo9743getSizeYbymL2g();
        WindowInsetsCompat windowInsetsCompat = this.$this_run.insets;
        if (windowInsetsCompat != null) {
            if ((i2 == this.$this_run.position[0] && i3 == this.$this_run.position[1] && IntSize.m11337equalsimpl0(j2, this.$this_run.size)) || (windowInsets = this.$this_run.insetToLayoutPosition(windowInsetsCompat).toWindowInsets()) == null) {
                return;
            }
            this.$this_run.getView().dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return ab.f48028a;
    }
}
