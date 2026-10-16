package androidx.compose.foundation.gestures.snapping;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapPositionKt {
    public static final float calculateDistanceToDesiredSnapPosition(int i2, int i3, int i4, int i5, int i6, int i7, SnapPosition snapPosition, int i8) {
        return i6 - snapPosition.position(i2, i5, i3, i4, i7, i8);
    }
}
