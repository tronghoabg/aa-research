package androidx.compose.ui.geometry;

import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Rect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Rect Zero = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public Rect(float f2, float f3, float f4, float f5) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
    }

    public static /* synthetic */ Rect copy$default(Rect rect, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = rect.left;
        }
        if ((i2 & 2) != 0) {
            f3 = rect.top;
        }
        if ((i2 & 4) != 0) {
            f4 = rect.right;
        }
        if ((i2 & 8) != 0) {
            f5 = rect.bottom;
        }
        return rect.copy(f2, f3, f4, f5);
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

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m8006containsk4lQ0M(long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float f2 = this.left;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return (fIntBitsToFloat < this.right) & (fIntBitsToFloat >= f2) & (fIntBitsToFloat2 >= this.top) & (fIntBitsToFloat2 < this.bottom);
    }

    public final Rect copy(float f2, float f3, float f4, float f5) {
        return new Rect(f2, f3, f4, f5);
    }

    public final Rect deflate(float f2) {
        return inflate(-f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return Float.compare(this.left, rect.left) == 0 && Float.compare(this.top, rect.top) == 0 && Float.compare(this.right, rect.right) == 0 && Float.compare(this.bottom, rect.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m8007getBottomCenterF1C5BW0() {
        return (Float.floatToRawIntBits(this.left + ((getRight() - getLeft()) / 2.0f)) << 32) | (Float.floatToRawIntBits(this.bottom) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m8008getBottomLeftF1C5BW0() {
        return (Float.floatToRawIntBits(this.left) << 32) | (Float.floatToRawIntBits(this.bottom) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m8009getBottomRightF1C5BW0() {
        return (Float.floatToRawIntBits(this.right) << 32) | (Float.floatToRawIntBits(this.bottom) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m8010getCenterF1C5BW0() {
        float right = getRight() - getLeft();
        float bottom = getBottom() - getTop();
        return (Float.floatToRawIntBits(this.top + (bottom / 2.0f)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(this.left + (right / 2.0f)) << 32);
    }

    /* renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m8011getCenterLeftF1C5BW0() {
        float bottom = getBottom() - getTop();
        return (Float.floatToRawIntBits(this.left) << 32) | (Float.floatToRawIntBits(this.top + (bottom / 2.0f)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m8012getCenterRightF1C5BW0() {
        float bottom = getBottom() - getTop();
        return (Float.floatToRawIntBits(this.right) << 32) | (Float.floatToRawIntBits(this.top + (bottom / 2.0f)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
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
    public final long m8013getSizeNHjbRc() {
        float right = getRight() - getLeft();
        float bottom = getBottom() - getTop();
        return (Float.floatToRawIntBits(bottom) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(right) << 32);
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m8014getTopCenterF1C5BW0() {
        return (Float.floatToRawIntBits(this.left + ((getRight() - getLeft()) / 2.0f)) << 32) | (Float.floatToRawIntBits(this.top) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m8015getTopLeftF1C5BW0() {
        return (Float.floatToRawIntBits(this.left) << 32) | (Float.floatToRawIntBits(this.top) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m8016getTopRightF1C5BW0() {
        return (Float.floatToRawIntBits(this.right) << 32) | (Float.floatToRawIntBits(this.top) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.left) * 31) + Float.floatToIntBits(this.top)) * 31) + Float.floatToIntBits(this.right)) * 31) + Float.floatToIntBits(this.bottom);
    }

    public final Rect inflate(float f2) {
        float f3 = this.bottom;
        float f4 = this.right;
        return new Rect(this.left - f2, this.top - f2, f4 + f2, f3 + f2);
    }

    public final Rect intersect(Rect rect) {
        return new Rect(Math.max(this.left, rect.left), Math.max(this.top, rect.top), Math.min(this.right, rect.right), Math.min(this.bottom, rect.bottom));
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
        return (this.left < rect.right) & (rect.left < this.right) & (this.top < rect.bottom) & (rect.top < this.bottom);
    }

    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    public final Rect translate(float f2, float f3) {
        float f4 = this.bottom;
        float f5 = this.right;
        return new Rect(this.left + f2, this.top + f3, f5 + f2, f4 + f3);
    }

    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final Rect m8017translatek4lQ0M(long j2) {
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = this.left + Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return new Rect(fIntBitsToFloat, this.top + Float.intBitsToFloat(i3), this.right + Float.intBitsToFloat(i2), this.bottom + Float.intBitsToFloat(i3));
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Rect getZero() {
            return Rect.Zero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getZero$annotations() {
        }
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    /* renamed from: getSize-NH-jbRc$annotations, reason: not valid java name */
    public static /* synthetic */ void m8005getSizeNHjbRc$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    public static /* synthetic */ void isFinite$annotations() {
    }

    public static /* synthetic */ void isInfinite$annotations() {
    }

    public final Rect intersect(float f2, float f3, float f4, float f5) {
        float f6 = this.bottom;
        float f7 = this.right;
        return new Rect(Math.max(this.left, f2), Math.max(this.top, f3), Math.min(f7, f4), Math.min(f6, f5));
    }
}
