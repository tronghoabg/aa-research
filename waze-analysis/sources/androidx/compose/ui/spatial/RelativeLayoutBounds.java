package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.media3.muxer.MuxerUtil;
import h.a.ac;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RelativeLayoutBounds {
    public static final int $stable = 8;
    private final long bottomRight;
    private final DelegatableNode node;
    private final long screenOffset;
    private final long topLeft;
    private final float[] viewToWindowMatrix;
    private final long windowOffset;
    private final long windowSize;

    private RelativeLayoutBounds(long j2, long j3, long j4, long j5, long j6, float[] fArr, DelegatableNode delegatableNode) {
        this.topLeft = j2;
        this.bottomRight = j3;
        this.windowOffset = j4;
        this.screenOffset = j5;
        this.windowSize = j6;
        this.viewToWindowMatrix = fArr;
        this.node = delegatableNode;
    }

    public final List<IntRect> calculateOcclusions() {
        int i2;
        int i3;
        int i4;
        long j2;
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this.node);
        if (layoutNodeRequireLayoutNode.getRectListIndex$ui() == -4) {
            return ac.f47967a;
        }
        RectManager rectManager = DelegatableNodeKt.requireOwner(this.node).getRectManager();
        RectList rects = rectManager.getRects();
        int semanticsId = layoutNodeRequireLayoutNode.getSemanticsId();
        int semanticsId2 = layoutNodeRequireLayoutNode.getSemanticsId();
        int rectListIndex$ui = layoutNodeRequireLayoutNode.getRectListIndex$ui();
        long[] jArr = rects.items;
        int i5 = 33554431;
        if (rectListIndex$ui < 0 || rectListIndex$ui >= rects.itemsSize - 2 || (((int) jArr[rectListIndex$ui + 2]) & 33554431) != (semanticsId2 & 33554431)) {
            rectListIndex$ui = rects.indexOf(semanticsId2);
        }
        List listB = i.b();
        long[] jArr2 = rects.items;
        int i6 = rects.itemsSize;
        long j3 = jArr2[rectListIndex$ui];
        long j4 = jArr2[rectListIndex$ui + 1];
        int i7 = 0;
        while (i7 < jArr2.length - 2 && i7 < i6) {
            if (i7 == rectListIndex$ui) {
                i7 += 3;
            } else {
                long j5 = jArr2[i7];
                long j6 = jArr2[i7 + 1];
                if (((((j4 - j5) - 4294967297L) | ((j6 - j3) - 4294967297L)) & (-9223372034707292160L)) == 0) {
                    i4 = i5;
                    j2 = j3;
                    long j7 = j5 >> 32;
                    int i8 = (int) j5;
                    long j8 = j6 >> 32;
                    int i9 = (int) j6;
                    i2 = rectListIndex$ui;
                    i3 = i6;
                    if (rectManager.isTargetDrawnFirst$ui(semanticsId, ((int) jArr2[i7 + 2]) & i4)) {
                        listB.add(new IntRect((int) j7, i8, (int) j8, i9));
                    }
                } else {
                    i2 = rectListIndex$ui;
                    i3 = i6;
                    i4 = i5;
                    j2 = j3;
                }
                i7 += 3;
                i5 = i4;
                rectListIndex$ui = i2;
                j3 = j2;
                i6 = i3;
            }
        }
        return i.a(listB);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RelativeLayoutBounds relativeLayoutBounds = (RelativeLayoutBounds) obj;
            if (this.topLeft != relativeLayoutBounds.topLeft || this.bottomRight != relativeLayoutBounds.bottomRight || this.windowSize != relativeLayoutBounds.windowSize || !IntOffset.m11295equalsimpl0(this.windowOffset, relativeLayoutBounds.windowOffset) || !IntOffset.m11295equalsimpl0(this.screenOffset, relativeLayoutBounds.screenOffset)) {
                return false;
            }
            float[] fArr = this.viewToWindowMatrix;
            float[] fArr2 = relativeLayoutBounds.viewToWindowMatrix;
            if (fArr != null ? !(fArr2 == null || !Matrix.m8494equalsimpl0(fArr, fArr2)) : fArr2 == null) {
                return x.n(this.node, relativeLayoutBounds.node);
            }
        }
        return false;
    }

    public final float fractionVisibleIn(RelativeLayoutBounds relativeLayoutBounds) {
        long j2 = relativeLayoutBounds.topLeft;
        long j3 = relativeLayoutBounds.bottomRight;
        return fractionVisibleInRect((int) (j2 >> 32), (int) j2, (int) (j3 >> 32), (int) j3);
    }

    public final float fractionVisibleInRect(int i2, int i3, int i4, int i5) {
        int iMin = Math.min(Math.max((int) (this.topLeft >> 32), i2), i4);
        int iMin2 = Math.min(Math.max((int) this.topLeft, i3), i5);
        int iMax = Math.max(Math.min((int) (this.bottomRight >> 32), i4), i2);
        int i6 = (int) this.bottomRight;
        return Math.max((iMax - iMin) * (Math.max(Math.min(i6, i5), i3) - iMin2), 0) / Math.min((i4 - i2) * (i5 - i3), (r2 - r0) * (i6 - r3));
    }

    public final float fractionVisibleInWindow() {
        long j2 = this.windowSize;
        return fractionVisibleInRect(0, 0, (int) (j2 >> 32), (int) j2);
    }

    /* renamed from: fractionVisibleInWindowWithInsets-E1MhUcY, reason: not valid java name */
    public final float m10345fractionVisibleInWindowWithInsetsE1MhUcY(long j2, long j3) {
        long j4 = this.windowSize;
        long j5 = this.windowOffset;
        int iM11297getYimpl = IntOffset.m11297getYimpl(j5);
        int iM11296getXimpl = IntOffset.m11296getXimpl(j5);
        int i2 = ((int) j4) + iM11297getYimpl;
        int iM11297getYimpl2 = IntOffset.m11297getYimpl(j3);
        int i3 = ((int) (j4 >> 32)) + iM11296getXimpl;
        int iM11296getXimpl2 = IntOffset.m11296getXimpl(j3);
        return fractionVisibleInRect(iM11296getXimpl + IntOffset.m11296getXimpl(j2), iM11297getYimpl + IntOffset.m11297getYimpl(j2), i3 - iM11296getXimpl2, i2 - iM11297getYimpl2);
    }

    public final IntRect getBoundsInRoot() {
        long j2 = this.bottomRight;
        long j3 = this.topLeft;
        return new IntRect((int) (j3 >> 32), (int) j3, (int) (j2 >> 32), (int) j2);
    }

    public final IntRect getBoundsInScreen() {
        if (this.viewToWindowMatrix != null) {
            IntRect boundsInWindow = getBoundsInWindow();
            long j2 = this.windowOffset;
            return new IntRect(boundsInWindow.getLeft() + IntOffset.m11296getXimpl(j2), boundsInWindow.getTop() + IntOffset.m11297getYimpl(j2), boundsInWindow.getRight() + IntOffset.m11296getXimpl(j2), boundsInWindow.getBottom() + IntOffset.m11297getYimpl(j2));
        }
        long j3 = this.topLeft;
        long j4 = this.bottomRight;
        long j5 = this.screenOffset;
        int i2 = (int) j4;
        int i3 = (int) j3;
        int iM11297getYimpl = IntOffset.m11297getYimpl(j5);
        int iM11296getXimpl = IntOffset.m11296getXimpl(j5);
        return new IntRect(((int) (j3 >> 32)) + iM11296getXimpl, i3 + iM11297getYimpl, ((int) (j4 >> 32)) + iM11296getXimpl, i2 + iM11297getYimpl);
    }

    public final IntRect getBoundsInWindow() {
        long j2 = this.bottomRight;
        float[] fArr = this.viewToWindowMatrix;
        int i2 = (int) j2;
        int i3 = (int) (j2 >> 32);
        long j3 = this.topLeft;
        int i4 = (int) j3;
        int i5 = (int) (j3 >> 32);
        if (fArr != null) {
            return IntRectKt.roundToIntRect(Matrix.m8499mapimpl(fArr, new Rect(i5, i4, i3, i2)));
        }
        long j4 = this.screenOffset;
        long j5 = this.windowOffset;
        int iM11296getXimpl = IntOffset.m11296getXimpl(j4) - IntOffset.m11296getXimpl(j5);
        int iM11297getYimpl = IntOffset.m11297getYimpl(j4) - IntOffset.m11297getYimpl(j5);
        return new IntRect(i5 + iM11296getXimpl, i4 + iM11297getYimpl, i3 + iM11296getXimpl, i2 + iM11297getYimpl);
    }

    public final int getHeight() {
        return ((int) this.bottomRight) - ((int) this.topLeft);
    }

    /* renamed from: getPositionInRoot-nOcc-ac, reason: not valid java name */
    public final long m10346getPositionInRootnOccac() {
        return this.topLeft;
    }

    /* renamed from: getPositionInScreen-nOcc-ac, reason: not valid java name */
    public final long m10347getPositionInScreennOccac() {
        return ((((int) this.topLeft) + IntOffset.m11297getYimpl(this.screenOffset)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((((int) (r0 >> 32)) + IntOffset.m11296getXimpl(r4)) << 32);
    }

    /* renamed from: getPositionInWindow-nOcc-ac, reason: not valid java name */
    public final long m10348getPositionInWindownOccac() {
        return ((((int) this.topLeft) + (IntOffset.m11297getYimpl(this.screenOffset) - IntOffset.m11297getYimpl(this.windowOffset))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((((int) (r0 >> 32)) + (IntOffset.m11296getXimpl(r4) - IntOffset.m11296getXimpl(r6))) << 32);
    }

    public final int getWidth() {
        return ((int) (this.bottomRight >> 32)) - ((int) (this.topLeft >> 32));
    }

    public int hashCode() {
        float[] fArr = this.viewToWindowMatrix;
        return (((((((((((RelativeLayoutBounds$$ExternalSyntheticBackport0.m(this.topLeft) * 31) + RelativeLayoutBounds$$ExternalSyntheticBackport0.m(this.bottomRight)) * 31) + RelativeLayoutBounds$$ExternalSyntheticBackport0.m(this.windowSize)) * 31) + IntOffset.m11298hashCodeimpl(this.windowOffset)) * 31) + IntOffset.m11298hashCodeimpl(this.screenOffset)) * 31) + (fArr != null ? Matrix.m8496hashCodeimpl(fArr) : 0)) * 31) + this.node.hashCode();
    }

    public /* synthetic */ RelativeLayoutBounds(long j2, long j3, long j4, long j5, long j6, float[] fArr, DelegatableNode delegatableNode, o oVar) {
        this(j2, j3, j4, j5, j6, fArr, delegatableNode);
    }
}
