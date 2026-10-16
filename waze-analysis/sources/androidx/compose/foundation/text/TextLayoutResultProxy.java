package androidx.compose.foundation.text;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextLayoutResultProxy {
    public static final int $stable = 8;
    private LayoutCoordinates decorationBoxCoordinates;
    private LayoutCoordinates innerTextFieldCoordinates;
    private final TextLayoutResult value;

    public /* synthetic */ TextLayoutResultProxy(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, int i2, o oVar) {
        this(textLayoutResult, (i2 & 2) != 0 ? null : layoutCoordinates, (i2 & 4) != 0 ? null : layoutCoordinates2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m3421coercedInVisibleBoundsOfInputTextMKHz9U(long r5) {
        /*
            r4 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r4.innerTextFieldCoordinates
            if (r0 == 0) goto L1e
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L16
            androidx.compose.ui.layout.LayoutCoordinates r4 = r4.decorationBoxCoordinates
            r1 = 0
            if (r4 == 0) goto L1c
            r2 = 0
            r3 = 2
            androidx.compose.ui.geometry.Rect r1 = androidx.compose.ui.layout.LayoutCoordinates.CC.localBoundingBoxOf$default(r4, r0, r2, r3, r1)
            goto L1c
        L16:
            androidx.compose.ui.geometry.Rect$Companion r4 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r1 = r4.getZero()
        L1c:
            if (r1 != 0) goto L24
        L1e:
            androidx.compose.ui.geometry.Rect$Companion r4 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r1 = r4.getZero()
        L24:
            long r4 = androidx.compose.foundation.text.TextLayoutResultProxyKt.m3427access$coerceIn3MmeM6k(r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextLayoutResultProxy.m3421coercedInVisibleBoundsOfInputTextMKHz9U(long):long");
    }

    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int getLineEnd(int i2, boolean z) {
        return this.value.getLineEnd(i2, z);
    }

    public final int getLineForVerticalPosition(float f2) {
        return this.value.getLineForVerticalPosition(Float.intBitsToFloat((int) (m3425translateDecorationToInnerCoordinatesMKHz9U$foundation(m3421coercedInVisibleBoundsOfInputTextMKHz9U((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m3423getOffsetForPosition3MmeM6k(long j2, boolean z) {
        if (z) {
            j2 = m3421coercedInVisibleBoundsOfInputTextMKHz9U(j2);
        }
        return this.value.m10516getOffsetForPositionk4lQ0M(m3425translateDecorationToInnerCoordinatesMKHz9U$foundation(j2));
    }

    public final TextLayoutResult getValue() {
        return this.value;
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m3424isPositionOnTextk4lQ0M(long j2) {
        long jM3425translateDecorationToInnerCoordinatesMKHz9U$foundation = m3425translateDecorationToInnerCoordinatesMKHz9U$foundation(m3421coercedInVisibleBoundsOfInputTextMKHz9U(j2));
        int lineForVerticalPosition = this.value.getLineForVerticalPosition(Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jM3425translateDecorationToInnerCoordinatesMKHz9U$foundation)));
        int i2 = (int) (jM3425translateDecorationToInnerCoordinatesMKHz9U$foundation >> 32);
        if (Float.intBitsToFloat(i2) >= this.value.getLineLeft(lineForVerticalPosition)) {
            return Float.intBitsToFloat(i2) <= this.value.getLineRight(lineForVerticalPosition);
        }
        return false;
    }

    public final void setDecorationBoxCoordinates(LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    public final void setInnerTextFieldCoordinates(LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }

    /* renamed from: translateDecorationToInnerCoordinates-MK-Hz9U$foundation, reason: not valid java name */
    public final long m3425translateDecorationToInnerCoordinatesMKHz9U$foundation(long j2) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 != null) {
            if (true != layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.decorationBoxCoordinates) != null) {
                LayoutCoordinates layoutCoordinates3 = true == layoutCoordinates.isAttached() ? layoutCoordinates : null;
                if (layoutCoordinates3 != null) {
                    return layoutCoordinates2.mo9744localPositionOfR5De75A(layoutCoordinates3, j2);
                }
            }
        }
        return j2;
    }

    /* renamed from: translateInnerToDecorationCoordinates-MK-Hz9U$foundation, reason: not valid java name */
    public final long m3426translateInnerToDecorationCoordinatesMKHz9U$foundation(long j2) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 != null) {
            if (true != layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.decorationBoxCoordinates) != null) {
                LayoutCoordinates layoutCoordinates3 = true == layoutCoordinates.isAttached() ? layoutCoordinates : null;
                if (layoutCoordinates3 != null) {
                    return layoutCoordinates3.mo9744localPositionOfR5De75A(layoutCoordinates2, j2);
                }
            }
        }
        return j2;
    }

    public TextLayoutResultProxy(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        this.value = textLayoutResult;
        this.innerTextFieldCoordinates = layoutCoordinates;
        this.decorationBoxCoordinates = layoutCoordinates2;
    }
}
