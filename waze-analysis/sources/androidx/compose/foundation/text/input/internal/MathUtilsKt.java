package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i2, int i3, a<Integer> aVar) {
        int i4 = i2 + i3;
        return ((i2 ^ i4) & (i3 ^ i4)) < 0 ? aVar.invoke().intValue() : i4;
    }

    /* renamed from: distanceSquaredToClosestCornerFromOutside-3MmeM6k, reason: not valid java name */
    private static final float m3635distanceSquaredToClosestCornerFromOutside3MmeM6k(long j2, Rect rect) {
        if (SelectionManagerKt.m3898containsInclusiveUv8p0NA(rect, j2)) {
            return 0.0f;
        }
        float fM7979getDistanceSquaredimpl = Offset.m7979getDistanceSquaredimpl(Offset.m7984minusMKHz9U(rect.m8015getTopLeftF1C5BW0(), j2));
        if (fM7979getDistanceSquaredimpl >= Float.MAX_VALUE) {
            fM7979getDistanceSquaredimpl = Float.MAX_VALUE;
        }
        float fM7979getDistanceSquaredimpl2 = Offset.m7979getDistanceSquaredimpl(Offset.m7984minusMKHz9U(rect.m8016getTopRightF1C5BW0(), j2));
        if (fM7979getDistanceSquaredimpl2 < fM7979getDistanceSquaredimpl) {
            fM7979getDistanceSquaredimpl = fM7979getDistanceSquaredimpl2;
        }
        float fM7979getDistanceSquaredimpl3 = Offset.m7979getDistanceSquaredimpl(Offset.m7984minusMKHz9U(rect.m8008getBottomLeftF1C5BW0(), j2));
        if (fM7979getDistanceSquaredimpl3 < fM7979getDistanceSquaredimpl) {
            fM7979getDistanceSquaredimpl = fM7979getDistanceSquaredimpl3;
        }
        float fM7979getDistanceSquaredimpl4 = Offset.m7979getDistanceSquaredimpl(Offset.m7984minusMKHz9U(rect.m8009getBottomRightF1C5BW0(), j2));
        return fM7979getDistanceSquaredimpl4 < fM7979getDistanceSquaredimpl ? fM7979getDistanceSquaredimpl4 : fM7979getDistanceSquaredimpl;
    }

    /* renamed from: findClosestRect-9KIMszo, reason: not valid java name */
    public static final int m3636findClosestRect9KIMszo(long j2, Rect rect, Rect rect2) {
        float fM3635distanceSquaredToClosestCornerFromOutside3MmeM6k = m3635distanceSquaredToClosestCornerFromOutside3MmeM6k(j2, rect);
        float fM3635distanceSquaredToClosestCornerFromOutside3MmeM6k2 = m3635distanceSquaredToClosestCornerFromOutside3MmeM6k(j2, rect2);
        if (fM3635distanceSquaredToClosestCornerFromOutside3MmeM6k == fM3635distanceSquaredToClosestCornerFromOutside3MmeM6k2) {
            return 0;
        }
        return fM3635distanceSquaredToClosestCornerFromOutside3MmeM6k < fM3635distanceSquaredToClosestCornerFromOutside3MmeM6k2 ? -1 : 1;
    }

    public static final int subtractExactOrElse(int i2, int i3, a<Integer> aVar) {
        int i4 = i2 - i3;
        return ((i2 ^ i4) & (i3 ^ i2)) < 0 ? aVar.invoke().intValue() : i4;
    }
}
