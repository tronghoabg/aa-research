package androidx.compose.ui.spatial;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ThrottledCallbacksKt {
    /* renamed from: rectInfoFor-Dg36KO4, reason: not valid java name */
    public static final RelativeLayoutBounds m10359rectInfoForDg36KO4(DelegatableNode delegatableNode, long j2, long j3, long j4, long j5, long j6, float[] fArr) {
        NodeCoordinator nodeCoordinatorM9921requireCoordinator64DMado = DelegatableNodeKt.m9921requireCoordinator64DMado(delegatableNode, 2);
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        if (!layoutNodeRequireLayoutNode.isPlaced()) {
            return null;
        }
        if (layoutNodeRequireLayoutNode.getOuterCoordinator$ui() == nodeCoordinatorM9921requireCoordinator64DMado) {
            return new RelativeLayoutBounds(j2, j3, j4, j5, j6, fArr, delegatableNode, null);
        }
        int iM11296getXimpl = IntOffset.m11296getXimpl(j2);
        int iM11297getYimpl = IntOffset.m11297getYimpl(j2);
        long jFloatToRawIntBits = Float.floatToRawIntBits(iM11296getXimpl);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(iM11297getYimpl);
        long jMo9743getSizeYbymL2g = nodeCoordinatorM9921requireCoordinator64DMado.getCoordinates().mo9743getSizeYbymL2g();
        long jM11313roundk4lQ0M = IntOffsetKt.m11313roundk4lQ0M(layoutNodeRequireLayoutNode.getOuterCoordinator$ui().getCoordinates().mo9744localPositionOfR5De75A(nodeCoordinatorM9921requireCoordinator64DMado, (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32)));
        int iM11296getXimpl2 = IntOffset.m11296getXimpl(jM11313roundk4lQ0M);
        long j7 = jMo9743getSizeYbymL2g >> 32;
        return new RelativeLayoutBounds(jM11313roundk4lQ0M, ((IntOffset.m11297getYimpl(jM11313roundk4lQ0M) + ((int) (jMo9743getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((iM11296getXimpl2 + ((int) j7)) << 32), j4, j5, j6, fArr, delegatableNode, null);
    }
}
