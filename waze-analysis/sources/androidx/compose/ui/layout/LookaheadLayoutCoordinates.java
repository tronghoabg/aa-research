package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public static final int $stable = 0;
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* renamed from: getLookaheadOffset-F1C5BW0, reason: not valid java name */
    private final long m9775getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        return Offset.m7984minusMKHz9U(mo9744localPositionOfR5De75A(rootLookaheadDelegate.getCoordinates(), Offset.Companion.m7996getZeroF1C5BW0()), getCoordinator().mo9744localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), Offset.Companion.m7996getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public int get(AlignmentLine alignmentLine) {
        return this.lookaheadDelegate.get(alignmentLine);
    }

    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return this.lookaheadDelegate.isPlacedUnderMotionFrameOfReference();
    }

    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy$ui = getCoordinator().getWrappedBy$ui();
        if (wrappedBy$ui == null || (lookaheadDelegate = wrappedBy$ui.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy$ui = getCoordinator().getLayoutNode().getOuterCoordinator$ui().getWrappedBy$ui();
        if (wrappedBy$ui == null || (lookaheadDelegate = wrappedBy$ui.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public long mo9743getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return (lookaheadDelegate.getWidth() << 32) | (lookaheadDelegate.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z) {
        return getCoordinator().localBoundingBoxOf(layoutCoordinates, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo9744localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j2) {
        return mo9745localPositionOfS_NoaFU(layoutCoordinates, j2, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public long mo9745localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j2, boolean z) {
        if (!(layoutCoordinates instanceof LookaheadLayoutCoordinates)) {
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
            long jMo9745localPositionOfS_NoaFU = mo9745localPositionOfS_NoaFU(rootLookaheadDelegate.getLookaheadLayoutCoordinates(), j2, z);
            long jMo9995getPositionnOccac = rootLookaheadDelegate.mo9995getPositionnOccac();
            int iM11296getXimpl = IntOffset.m11296getXimpl(jMo9995getPositionnOccac);
            int iM11297getYimpl = IntOffset.m11297getYimpl(jMo9995getPositionnOccac);
            long jM7984minusMKHz9U = Offset.m7984minusMKHz9U(jMo9745localPositionOfS_NoaFU, (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(iM11297getYimpl)) | (Float.floatToRawIntBits(iM11296getXimpl) << 32));
            LayoutCoordinates parentCoordinates = rootLookaheadDelegate.getCoordinator().getParentCoordinates();
            if (parentCoordinates == null) {
                parentCoordinates = rootLookaheadDelegate.getCoordinator().getCoordinates();
            }
            return Offset.m7985plusMKHz9U(jM7984minusMKHz9U, parentCoordinates.mo9745localPositionOfS_NoaFU(layoutCoordinates, Offset.Companion.m7996getZeroF1C5BW0(), z));
        }
        boolean z2 = !z;
        LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) layoutCoordinates).lookaheadDelegate;
        lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui();
        LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            long jM11299minusqkQi6aY = IntOffset.m11299minusqkQi6aY(IntOffset.m11300plusqkQi6aY(lookaheadDelegate.m10006positionIniSbpLlY$ui(lookaheadDelegate2, z2), IntOffsetKt.m11313roundk4lQ0M(j2)), this.lookaheadDelegate.m10006positionIniSbpLlY$ui(lookaheadDelegate2, z2));
            return (Float.floatToRawIntBits(IntOffset.m11297getYimpl(jM11299minusqkQi6aY)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(IntOffset.m11296getXimpl(jM11299minusqkQi6aY)) << 32);
        }
        LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
        long jM11300plusqkQi6aY = IntOffset.m11300plusqkQi6aY(IntOffset.m11300plusqkQi6aY(lookaheadDelegate.m10006positionIniSbpLlY$ui(rootLookaheadDelegate2, z2), rootLookaheadDelegate2.mo9995getPositionnOccac()), IntOffsetKt.m11313roundk4lQ0M(j2));
        LookaheadDelegate lookaheadDelegate3 = this.lookaheadDelegate;
        LookaheadDelegate rootLookaheadDelegate3 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3);
        long jM11299minusqkQi6aY2 = IntOffset.m11299minusqkQi6aY(jM11300plusqkQi6aY, IntOffset.m11300plusqkQi6aY(lookaheadDelegate3.m10006positionIniSbpLlY$ui(rootLookaheadDelegate3, z2), rootLookaheadDelegate3.mo9995getPositionnOccac()));
        long jFloatToRawIntBits = Float.floatToRawIntBits(IntOffset.m11296getXimpl(jM11299minusqkQi6aY2)) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(IntOffset.m11297getYimpl(jM11299minusqkQi6aY2)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        NodeCoordinator wrappedBy$ui = rootLookaheadDelegate3.getCoordinator().getWrappedBy$ui();
        if (wrappedBy$ui == null) {
            x.g();
        }
        NodeCoordinator wrappedBy$ui2 = rootLookaheadDelegate2.getCoordinator().getWrappedBy$ui();
        if (wrappedBy$ui2 == null) {
            x.g();
        }
        return wrappedBy$ui.mo9745localPositionOfS_NoaFU(wrappedBy$ui2, jFloatToRawIntBits2 | jFloatToRawIntBits, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo9746localToRootMKHz9U(long j2) {
        return getCoordinator().mo9746localToRootMKHz9U(Offset.m7985plusMKHz9U(j2, m9775getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo9747localToScreenMKHz9U(long j2) {
        return getCoordinator().mo9747localToScreenMKHz9U(Offset.m7985plusMKHz9U(j2, m9775getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo9748localToWindowMKHz9U(long j2) {
        return getCoordinator().mo9748localToWindowMKHz9U(Offset.m7985plusMKHz9U(j2, m9775getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo9749screenToLocalMKHz9U(long j2) {
        return Offset.m7985plusMKHz9U(getCoordinator().mo9749screenToLocalMKHz9U(j2), m9775getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo9750transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        getCoordinator().mo9750transformFromEL8BTi8(layoutCoordinates, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public void mo9751transformToScreen58bKbWc(float[] fArr) {
        getCoordinator().mo9751transformToScreen58bKbWc(fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo9752windowToLocalMKHz9U(long j2) {
        return Offset.m7985plusMKHz9U(getCoordinator().mo9752windowToLocalMKHz9U(j2), m9775getLookaheadOffsetF1C5BW0());
    }
}
