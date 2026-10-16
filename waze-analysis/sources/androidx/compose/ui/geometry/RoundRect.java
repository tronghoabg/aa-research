package androidx.compose.ui.geometry;

import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RoundRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final RoundRect Zero = RoundRectKt.m8034RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m7952getZerokKHJgLs());
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    public /* synthetic */ RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5, int i2, o oVar) {
        this(f2, f3, f4, f5, (i2 & 16) != 0 ? CornerRadius.Companion.m7952getZerokKHJgLs() : j2, (i2 & 32) != 0 ? CornerRadius.Companion.m7952getZerokKHJgLs() : j3, (i2 & 64) != 0 ? CornerRadius.Companion.m7952getZerokKHJgLs() : j4, (i2 & 128) != 0 ? CornerRadius.Companion.m7952getZerokKHJgLs() : j5, null);
    }

    /* renamed from: copy-MDFrsts$default, reason: not valid java name */
    public static /* synthetic */ RoundRect m8021copyMDFrsts$default(RoundRect roundRect, float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = roundRect.left;
        }
        if ((i2 & 2) != 0) {
            f3 = roundRect.top;
        }
        if ((i2 & 4) != 0) {
            f4 = roundRect.right;
        }
        if ((i2 & 8) != 0) {
            f5 = roundRect.bottom;
        }
        if ((i2 & 16) != 0) {
            j2 = roundRect.topLeftCornerRadius;
        }
        if ((i2 & 32) != 0) {
            j3 = roundRect.topRightCornerRadius;
        }
        if ((i2 & 64) != 0) {
            j4 = roundRect.bottomRightCornerRadius;
        }
        if ((i2 & 128) != 0) {
            j5 = roundRect.bottomLeftCornerRadius;
        }
        long j6 = j5;
        long j7 = j4;
        long j8 = j3;
        long j9 = j2;
        return roundRect.m8027copyMDFrsts(f2, f3, f4, f5, j9, j8, j7, j6);
    }

    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    private final float minRadius(float f2, float f3, float f4, float f5) {
        float f6 = f3 + f4;
        return (f6 <= f5 || f6 == 0.0f) ? f2 : Math.min(f2, f5 / f6);
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float fMinRadius = minRadius(minRadius(minRadius(minRadius(1.0f, Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (this.topLeftCornerRadius & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), getHeight()), Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)), Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)), getWidth()), Float.intBitsToFloat((int) (this.topRightCornerRadius & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (this.bottomRightCornerRadius & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), getHeight()), Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)), Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32)), getWidth());
        float f2 = this.left * fMinRadius;
        float f3 = this.top * fMinRadius;
        float f4 = this.right * fMinRadius;
        float f5 = this.bottom * fMinRadius;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)) * fMinRadius;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.topLeftCornerRadius & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * fMinRadius;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)) * fMinRadius;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.topRightCornerRadius & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * fMinRadius;
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat3);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(fIntBitsToFloat4);
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)) * fMinRadius;
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (this.bottomRightCornerRadius & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * fMinRadius;
        long jFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat5);
        long jFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat6);
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32));
        long j2 = jFloatToRawIntBits6 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long j3 = jFloatToRawIntBits5 << 32;
        long j4 = jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        float f6 = fIntBitsToFloat7 * fMinRadius;
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * fMinRadius;
        RoundRect roundRect2 = new RoundRect(f2, f3, f4, f5, (jFloatToRawIntBits << 32) | j4, (jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits3 << 32), j3 | j2, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat8) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs, reason: not valid java name */
    public final long m8022component5kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs, reason: not valid java name */
    public final long m8023component6kKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs, reason: not valid java name */
    public final long m8024component7kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs, reason: not valid java name */
    public final long m8025component8kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0140  */
    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m8026containsk4lQ0M(long r12) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.geometry.RoundRect.m8026containsk4lQ0M(long):boolean");
    }

    /* renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m8027copyMDFrsts(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5) {
        return new RoundRect(f2, f3, f4, f5, j2, j3, j4, j5, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m7939equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m7939equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m7939equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m7939equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m8028getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m8029getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m8030getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m8031getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        int iFloatToIntBits = (((((Float.floatToIntBits(this.left) * 31) + Float.floatToIntBits(this.top)) * 31) + Float.floatToIntBits(this.right)) * 31) + Float.floatToIntBits(this.bottom);
        long j2 = this.bottomLeftCornerRadius;
        long j3 = this.bottomRightCornerRadius;
        return (((((((iFloatToIntBits * 31) + CornerRadius.m7942hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m7942hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m7942hashCodeimpl(j3)) * 31) + CornerRadius.m7942hashCodeimpl(j2);
    }

    public String toString() {
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        long j2 = this.topLeftCornerRadius;
        long j3 = this.topRightCornerRadius;
        boolean zM7939equalsimpl0 = CornerRadius.m7939equalsimpl0(j2, j3);
        long j4 = this.bottomRightCornerRadius;
        long j5 = this.bottomLeftCornerRadius;
        if (!zM7939equalsimpl0 || !CornerRadius.m7939equalsimpl0(j3, j4) || !CornerRadius.m7939equalsimpl0(j4, j5)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m7948toStringimpl(j2)) + ", topRight=" + ((Object) CornerRadius.m7948toStringimpl(j3)) + ", bottomRight=" + ((Object) CornerRadius.m7948toStringimpl(j4)) + ", bottomLeft=" + ((Object) CornerRadius.m7948toStringimpl(j5)) + ')';
        }
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i3 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i3) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i3), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i3), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i2), 1) + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getZero$annotations() {
        }
    }

    public /* synthetic */ RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5, o oVar) {
        this(f2, f3, f4, f5, j2, j3, j4, j5);
    }

    private RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
        this.topLeftCornerRadius = j2;
        this.topRightCornerRadius = j3;
        this.bottomRightCornerRadius = j4;
        this.bottomLeftCornerRadius = j5;
    }
}
