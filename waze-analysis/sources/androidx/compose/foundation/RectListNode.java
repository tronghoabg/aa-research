package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.media3.muxer.MuxerUtil;
import h.b.a;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    public static final int $stable = 8;
    private Rect androidRect;
    private l<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect;

    public RectListNode(l<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> lVar) {
        this.rect = lVar;
    }

    private final Rect calcBounds(LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Rect rect) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        long jMo9744localPositionOfR5De75A = layoutCoordinatesFindRootCoordinates.mo9744localPositionOfR5De75A(layoutCoordinates, rect.m8015getTopLeftF1C5BW0());
        long jMo9744localPositionOfR5De75A2 = layoutCoordinatesFindRootCoordinates.mo9744localPositionOfR5De75A(layoutCoordinates, rect.m8016getTopRightF1C5BW0());
        long jMo9744localPositionOfR5De75A3 = layoutCoordinatesFindRootCoordinates.mo9744localPositionOfR5De75A(layoutCoordinates, rect.m8008getBottomLeftF1C5BW0());
        long jMo9744localPositionOfR5De75A4 = layoutCoordinatesFindRootCoordinates.mo9744localPositionOfR5De75A(layoutCoordinates, rect.m8009getBottomRightF1C5BW0());
        int i2 = (int) (jMo9744localPositionOfR5De75A >> 32);
        int i3 = (int) (jMo9744localPositionOfR5De75A2 >> 32);
        int i4 = (int) (jMo9744localPositionOfR5De75A3 >> 32);
        int i5 = (int) (jMo9744localPositionOfR5De75A4 >> 32);
        float f2 = a.f(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4), Float.intBitsToFloat(i5));
        long j2 = jMo9744localPositionOfR5De75A & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        int i6 = (int) (jMo9744localPositionOfR5De75A2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i7 = (int) j2;
        float fIntBitsToFloat = Float.intBitsToFloat(i7);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i6);
        int i8 = (int) (jMo9744localPositionOfR5De75A3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i8);
        int i9 = (int) (jMo9744localPositionOfR5De75A4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return new Rect(h.h.a.b(f2), h.h.a.b(a.f(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, Float.intBitsToFloat(i9))), h.h.a.b(a.e(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4), Float.intBitsToFloat(i5))), h.h.a.b(a.e(Float.intBitsToFloat(i7), Float.intBitsToFloat(i6), Float.intBitsToFloat(i8), Float.intBitsToFloat(i9))));
    }

    private final void replaceRect(Rect rect) {
        MutableVector<Rect> mutableVectorCurrentRects = currentRects();
        Rect rect2 = this.androidRect;
        if (rect2 != null) {
            mutableVectorCurrentRects.remove(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            mutableVectorCurrentRects.add(rect);
        }
        updateRects(mutableVectorCurrentRects);
        this.androidRect = rect;
    }

    public abstract MutableVector<Rect> currentRects();

    public l<LayoutCoordinates, androidx.compose.ui.geometry.Rect> getRect() {
        return this.rect;
    }

    protected final View getView() {
        return DelegatableNode_androidKt.requireView(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        replaceRect(null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        Rect rectCalcBounds;
        if (getRect() == null) {
            androidx.compose.ui.geometry.Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates);
            rectCalcBounds = new Rect(h.h.a.b(rectBoundsInRoot.getLeft()), h.h.a.b(rectBoundsInRoot.getTop()), h.h.a.b(rectBoundsInRoot.getRight()), h.h.a.b(rectBoundsInRoot.getBottom()));
        } else {
            l<LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect = getRect();
            if (rect == null) {
                x.g();
            }
            rectCalcBounds = calcBounds(layoutCoordinates, rect.invoke(layoutCoordinates));
        }
        replaceRect(rectCalcBounds);
    }

    public void setRect(l<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> lVar) {
        this.rect = lVar;
    }

    public abstract void updateRects(MutableVector<Rect> mutableVector);
}
