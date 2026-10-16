package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextLayoutStateKt {
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m3691coerceIn3MmeM6k(long j2, Rect rect) {
        int i2 = (int) (j2 >> 32);
        float left = Float.intBitsToFloat(i2) < rect.getLeft() ? rect.getLeft() : Float.intBitsToFloat(i2) > rect.getRight() ? rect.getRight() : Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return (Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i3) < rect.getTop() ? rect.getTop() : Float.intBitsToFloat(i3) > rect.getBottom() ? rect.getBottom() : Float.intBitsToFloat(i3)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: fromDecorationToTextLayout-Uv8p0NA, reason: not valid java name */
    public static final long m3692fromDecorationToTextLayoutUv8p0NA(TextLayoutState textLayoutState, long j2) {
        Offset offsetM7969boximpl;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
            if (decoratorNodeCoordinates != null) {
                offsetM7969boximpl = Offset.m7969boximpl((textLayoutNodeCoordinates.isAttached() && decoratorNodeCoordinates.isAttached()) ? textLayoutNodeCoordinates.mo9744localPositionOfR5De75A(decoratorNodeCoordinates, j2) : j2);
            } else {
                offsetM7969boximpl = null;
            }
            if (offsetM7969boximpl != null) {
                return offsetM7969boximpl.m7990unboximpl();
            }
        }
        return j2;
    }

    /* renamed from: fromTextLayoutToCore-Uv8p0NA, reason: not valid java name */
    public static final long m3693fromTextLayoutToCoreUv8p0NA(TextLayoutState textLayoutState, long j2) {
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            Offset offsetM7969boximpl = null;
            if (true != textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                LayoutCoordinates coreNodeCoordinates = textLayoutState.getCoreNodeCoordinates();
                if (coreNodeCoordinates != null) {
                    if (true != coreNodeCoordinates.isAttached()) {
                        coreNodeCoordinates = null;
                    }
                    if (coreNodeCoordinates != null) {
                        offsetM7969boximpl = Offset.m7969boximpl(coreNodeCoordinates.mo9744localPositionOfR5De75A(textLayoutNodeCoordinates, j2));
                    }
                }
                if (offsetM7969boximpl != null) {
                    return offsetM7969boximpl.m7990unboximpl();
                }
            }
        }
        return j2;
    }

    public static final Rect fromTextLayoutToDecoration(TextLayoutState textLayoutState, Rect rect) {
        LayoutCoordinates decoratorNodeCoordinates;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (true != textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null && (decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates()) != null) {
                LayoutCoordinates layoutCoordinates = true == decoratorNodeCoordinates.isAttached() ? decoratorNodeCoordinates : null;
                if (layoutCoordinates != null) {
                    return rect.m8017translatek4lQ0M(layoutCoordinates.localBoundingBoxOf(textLayoutNodeCoordinates, false).m8015getTopLeftF1C5BW0());
                }
            }
        }
        return rect;
    }

    /* renamed from: fromWindowToDecoration-Uv8p0NA, reason: not valid java name */
    public static final long m3694fromWindowToDecorationUv8p0NA(TextLayoutState textLayoutState, long j2) {
        LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        return (decoratorNodeCoordinates == null || !decoratorNodeCoordinates.isAttached()) ? j2 : decoratorNodeCoordinates.mo9752windowToLocalMKHz9U(j2);
    }
}
