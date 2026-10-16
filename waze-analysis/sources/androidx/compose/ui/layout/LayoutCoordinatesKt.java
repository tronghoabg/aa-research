package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect rectLocalBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rectLocalBoundingBoxOf$default = LayoutCoordinates.CC.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, (int) (layoutCoordinates.mo9743getSizeYbymL2g() >> 32), (int) (layoutCoordinates.mo9743getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) : rectLocalBoundingBoxOf$default;
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.CC.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates, boolean z) {
        float left;
        float top;
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = findRootCoordinates(layoutCoordinates);
        long jMo9743getSizeYbymL2g = layoutCoordinatesFindRootCoordinates.mo9743getSizeYbymL2g() >> 32;
        long jMo9743getSizeYbymL2g2 = layoutCoordinatesFindRootCoordinates.mo9743getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        Rect rectLocalBoundingBoxOf = layoutCoordinatesFindRootCoordinates.localBoundingBoxOf(layoutCoordinates, z);
        float right = (int) jMo9743getSizeYbymL2g;
        if (z) {
            left = rectLocalBoundingBoxOf.getLeft();
            if (left < 0.0f) {
                left = 0.0f;
            }
            if (left > right) {
                left = right;
            }
        } else {
            left = rectLocalBoundingBoxOf.getLeft();
        }
        float bottom = (int) jMo9743getSizeYbymL2g2;
        if (z) {
            top = rectLocalBoundingBoxOf.getTop();
            if (top < 0.0f) {
                top = 0.0f;
            }
            if (top > bottom) {
                top = bottom;
            }
        } else {
            top = rectLocalBoundingBoxOf.getTop();
        }
        if (z) {
            float right2 = rectLocalBoundingBoxOf.getRight();
            if (right2 < 0.0f) {
                right2 = 0.0f;
            }
            if (right2 <= right) {
                right = right2;
            }
        } else {
            right = rectLocalBoundingBoxOf.getRight();
        }
        if (z) {
            float bottom2 = rectLocalBoundingBoxOf.getBottom();
            float f2 = bottom2 >= 0.0f ? bottom2 : 0.0f;
            if (f2 <= bottom) {
                bottom = f2;
            }
        } else {
            bottom = rectLocalBoundingBoxOf.getBottom();
        }
        if (left == right || top == bottom) {
            return Rect.Companion.getZero();
        }
        long jMo9748localToWindowMKHz9U = layoutCoordinatesFindRootCoordinates.mo9748localToWindowMKHz9U((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        float f3 = bottom;
        long jMo9748localToWindowMKHz9U2 = layoutCoordinatesFindRootCoordinates.mo9748localToWindowMKHz9U((Float.floatToRawIntBits(top) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(right) << 32));
        long jMo9748localToWindowMKHz9U3 = layoutCoordinatesFindRootCoordinates.mo9748localToWindowMKHz9U((Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(right) << 32));
        long jMo9748localToWindowMKHz9U4 = layoutCoordinatesFindRootCoordinates.mo9748localToWindowMKHz9U((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        int i2 = (int) (jMo9748localToWindowMKHz9U2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo9748localToWindowMKHz9U >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo9748localToWindowMKHz9U4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo9748localToWindowMKHz9U3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        long j2 = jMo9748localToWindowMKHz9U & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long j3 = jMo9748localToWindowMKHz9U2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long j4 = jMo9748localToWindowMKHz9U4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        int i3 = (int) (jMo9748localToWindowMKHz9U3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) j2);
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) j3);
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) j4);
        float fIntBitsToFloat8 = Float.intBitsToFloat(i3);
        return new Rect(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        NodeCoordinator nodeCoordinator;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator wrappedBy$ui = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (wrappedBy$ui == null) {
            return layoutCoordinates2;
        }
        do {
            nodeCoordinator = wrappedBy$ui;
            wrappedBy$ui = wrappedBy$ui.getWrappedBy$ui();
        } while (wrappedBy$ui != null);
        return nodeCoordinator;
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo9744localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m7996getZeroF1C5BW0()) : Offset.Companion.m7996getZeroF1C5BW0();
    }

    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo9746localToRootMKHz9U(Offset.Companion.m7996getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo9748localToWindowMKHz9U(Offset.Companion.m7996getZeroF1C5BW0());
    }

    public static final long positionOnScreen(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo9747localToScreenMKHz9U(Offset.Companion.m7996getZeroF1C5BW0());
    }
}
