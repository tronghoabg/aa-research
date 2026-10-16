package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PointerEventKt {
    public static final boolean anyChangeConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final boolean changedToDown(PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    public static final void consumeAllChanges(PointerInputChange pointerInputChange) {
        pointerInputChange.consume();
    }

    public static final void consumeDownChange(PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    public static final void consumePositionChange(PointerInputChange pointerInputChange) {
        if (Offset.m7977equalsimpl0(positionChange(pointerInputChange), Offset.Companion.m7996getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.consume();
    }

    /* renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m9543isOutOfBoundsO0kMr_c(PointerInputChange pointerInputChange, long j2) {
        long jM9608getPositionF1C5BW0 = pointerInputChange.m9608getPositionF1C5BW0();
        long j3 = jM9608getPositionF1C5BW0 >> 32;
        long j4 = jM9608getPositionF1C5BW0 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        float fIntBitsToFloat = Float.intBitsToFloat((int) j3);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j4);
        return (fIntBitsToFloat > ((float) ((int) (j2 >> 32)))) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) ((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))));
    }

    /* renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m9544isOutOfBoundsjwHxaWs(PointerInputChange pointerInputChange, long j2, long j3) {
        boolean zM9682equalsimpl0 = PointerType.m9682equalsimpl0(pointerInputChange.m9611getTypeT8wyACA(), PointerType.Companion.m9689getTouchT8wyACA());
        long jM9608getPositionF1C5BW0 = pointerInputChange.m9608getPositionF1C5BW0();
        long j4 = jM9608getPositionF1C5BW0 >> 32;
        int i2 = (int) (jM9608getPositionF1C5BW0 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) j4);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
        float f2 = zM9682equalsimpl0 ? 1.0f : 0.0f;
        float f3 = fIntBitsToFloat3 * f2;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * f2;
        return (fIntBitsToFloat > ((float) ((int) (j2 >> 32))) + f3) | (fIntBitsToFloat < (-f3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((float) ((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) + fIntBitsToFloat4);
    }

    public static final long positionChange(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, false);
    }

    public static final boolean positionChangeConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z) {
        return (z || !pointerInputChange.isConsumed()) ? Offset.m7984minusMKHz9U(pointerInputChange.m9608getPositionF1C5BW0(), pointerInputChange.m9609getPreviousPositionF1C5BW0()) : Offset.Companion.m7996getZeroF1C5BW0();
    }

    public static final boolean positionChanged(PointerInputChange pointerInputChange) {
        return !Offset.m7977equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.Companion.m7996getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !Offset.m7977equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.Companion.m7996getZeroF1C5BW0());
    }

    private static final int toInt(boolean z) {
        return z ? 1 : 0;
    }
}
