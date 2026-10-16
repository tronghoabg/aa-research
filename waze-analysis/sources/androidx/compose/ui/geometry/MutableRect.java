package androidx.compose.ui.geometry;

import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableRect {
    public static final int $stable = 8;
    private float bottom;
    private float left;
    private float right;
    private float top;

    public MutableRect(float f2, float f3, float f4, float f5) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m7954containsk4lQ0M(long j2) {
        int i2 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float f2 = this.left;
        float f3 = this.right;
        float f4 = this.top;
        float f5 = this.bottom;
        return (fIntBitsToFloat < f3) & (fIntBitsToFloat >= f2) & (fIntBitsToFloat2 >= f4) & (fIntBitsToFloat2 < f5);
    }

    public final void deflate(float f2) {
        inflate(-f2);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m7955getBottomCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float f2 = this.bottom;
        return (Float.floatToRawIntBits(right) << 32) | (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m7956getBottomLeftF1C5BW0() {
        float f2 = this.left;
        float f3 = this.bottom;
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m7957getBottomRightF1C5BW0() {
        float f2 = this.right;
        float f3 = this.bottom;
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m7958getCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float bottom = this.top + ((getBottom() - getTop()) / 2.0f);
        return (Float.floatToRawIntBits(bottom) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(right) << 32);
    }

    /* renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m7959getCenterLeftF1C5BW0() {
        float f2 = this.left;
        float bottom = this.top + ((getBottom() - getTop()) / 2.0f);
        return (Float.floatToRawIntBits(bottom) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m7960getCenterRightF1C5BW0() {
        float f2 = this.right;
        float bottom = this.top + ((getBottom() - getTop()) / 2.0f);
        return (Float.floatToRawIntBits(bottom) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32);
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    public final float getRight() {
        return this.right;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m7961getSizeNHjbRc() {
        float right = getRight() - getLeft();
        float bottom = getBottom() - getTop();
        return (Float.floatToRawIntBits(bottom) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(right) << 32);
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m7962getTopCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float f2 = this.top;
        return (Float.floatToRawIntBits(right) << 32) | (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m7963getTopLeftF1C5BW0() {
        float f2 = this.left;
        float f3 = this.top;
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m7964getTopRightF1C5BW0() {
        float f2 = this.right;
        float f3 = this.top;
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    public final void inflate(float f2) {
        this.left -= f2;
        this.top -= f2;
        this.right += f2;
        this.bottom += f2;
    }

    public final void intersect(float f2, float f3, float f4, float f5) {
        this.left = Math.max(f2, this.left);
        this.top = Math.max(f3, this.top);
        this.right = Math.min(f4, this.right);
        this.bottom = Math.min(f5, this.bottom);
    }

    public final boolean isEmpty() {
        return (this.left >= this.right) | (this.top >= this.bottom);
    }

    public final boolean isFinite() {
        return ((Float.floatToRawIntBits(this.left) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.top) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.right) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.bottom) & Integer.MAX_VALUE) < 2139095040);
    }

    public final boolean isInfinite() {
        return (this.left == Float.POSITIVE_INFINITY) | (this.top == Float.POSITIVE_INFINITY) | (this.right == Float.POSITIVE_INFINITY) | (this.bottom == Float.POSITIVE_INFINITY);
    }

    public final boolean overlaps(Rect rect) {
        return (this.left < rect.getRight()) & (rect.getLeft() < this.right) & (this.top < rect.getBottom()) & (rect.getTop() < this.bottom);
    }

    public final void set(float f2, float f3, float f4, float f5) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
    }

    public final void setBottom(float f2) {
        this.bottom = f2;
    }

    public final void setLeft(float f2) {
        this.left = f2;
    }

    public final void setRight(float f2) {
        this.right = f2;
    }

    public final void setTop(float f2) {
        this.top = f2;
    }

    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    public final void translate(float f2, float f3) {
        this.left += f2;
        this.top += f3;
        this.right += f2;
        this.bottom += f3;
    }

    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final void m7965translatek4lQ0M(long j2) {
        translate(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)));
    }

    public final boolean overlaps(MutableRect mutableRect) {
        return this.right > mutableRect.left && mutableRect.right > this.left && this.bottom > mutableRect.top && mutableRect.bottom > this.top;
    }
}
