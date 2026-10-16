package androidx.compose.ui.node;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LookaheadAlignmentLines extends AlignmentLines {
    public static final int $stable = 8;

    public LookaheadAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    /* renamed from: calculatePositionInParent-R5De75A */
    protected long mo9903calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j2) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        if (lookaheadDelegate == null) {
            x.g();
        }
        long jMo9995getPositionnOccac = lookaheadDelegate.mo9995getPositionnOccac();
        int iM11296getXimpl = IntOffset.m11296getXimpl(jMo9995getPositionnOccac);
        int iM11297getYimpl = IntOffset.m11297getYimpl(jMo9995getPositionnOccac);
        return Offset.m7985plusMKHz9U((Float.floatToRawIntBits(iM11297getYimpl) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(iM11296getXimpl) << 32), j2);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        if (lookaheadDelegate == null) {
            x.g();
        }
        return lookaheadDelegate.getMeasureResult$ui().getAlignmentLines();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        if (lookaheadDelegate == null) {
            x.g();
        }
        return lookaheadDelegate.get(alignmentLine);
    }
}
