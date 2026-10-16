package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RoundRectKt {
    public static final RoundRect RoundRect(float f2, float f3, float f4, float f5, float f6, float f7) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return new RoundRect(f2, f3, f4, f5, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, null);
    }

    /* renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m8032RoundRectZAM2FJo(Rect rect, long j2, long j3, long j4, long j5) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j2, j3, j4, j5, null);
    }

    /* renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m8034RoundRectgG7oq9Y(float f2, float f3, float f4, float f5, long j2) {
        return RoundRect(f2, f3, f4, f5, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)));
    }

    /* renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m8035RoundRectsniSvfs(Rect rect, long j2) {
        return RoundRect(rect, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)));
    }

    public static final Rect getBoundingRect(RoundRect roundRect) {
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(RoundRect roundRect) {
        float left = roundRect.getLeft() + (roundRect.getWidth() / 2.0f);
        float top = roundRect.getTop() + (roundRect.getHeight() / 2.0f);
        return (Float.floatToRawIntBits(top) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(left) << 32);
    }

    public static final float getMaxDimension(RoundRect roundRect) {
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(RoundRect roundRect) {
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final Rect getSafeInnerRect(RoundRect roundRect) {
        float fMax = Math.max(Float.intBitsToFloat((int) (roundRect.m8028getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() >> 32)));
        float fMax2 = Math.max(Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        float fMax3 = Math.max(Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() >> 32)));
        float fMax4 = Math.max(Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & roundRect.m8028getBottomLeftCornerRadiuskKHJgLs())));
        return new Rect(roundRect.getLeft() + (fMax * 0.29289323f), roundRect.getTop() + (fMax2 * 0.29289323f), roundRect.getRight() - (fMax3 * 0.29289323f), roundRect.getBottom() - (fMax4 * 0.29289323f));
    }

    public static final boolean isCircle(RoundRect roundRect) {
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final boolean isEllipse(RoundRect roundRect) {
        if (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() != roundRect.m8031getTopRightCornerRadiuskKHJgLs() || roundRect.m8031getTopRightCornerRadiuskKHJgLs() != roundRect.m8029getBottomRightCornerRadiuskKHJgLs() || roundRect.m8029getBottomRightCornerRadiuskKHJgLs() != roundRect.m8028getBottomLeftCornerRadiuskKHJgLs()) {
            return false;
        }
        double width = roundRect.getWidth();
        double dIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() >> 32));
        if (width > dIntBitsToFloat + dIntBitsToFloat) {
            return false;
        }
        double height = roundRect.getHeight();
        double dIntBitsToFloat2 = Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return height <= dIntBitsToFloat2 + dIntBitsToFloat2;
    }

    public static final boolean isEmpty(RoundRect roundRect) {
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(RoundRect roundRect) {
        return (Float.floatToRawIntBits(roundRect.getLeft()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getTop()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getRight()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getBottom()) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final boolean isRect(RoundRect roundRect) {
        long jM8030getTopLeftCornerRadiuskKHJgLs = roundRect.m8030getTopLeftCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~jM8030getTopLeftCornerRadiuskKHJgLs) & (jM8030getTopLeftCornerRadiuskKHJgLs - 4294967297L) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM8031getTopRightCornerRadiuskKHJgLs = roundRect.m8031getTopRightCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~jM8031getTopRightCornerRadiuskKHJgLs) & (jM8031getTopRightCornerRadiuskKHJgLs - 4294967297L) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM8028getBottomLeftCornerRadiuskKHJgLs = roundRect.m8028getBottomLeftCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~jM8028getBottomLeftCornerRadiuskKHJgLs) & (jM8028getBottomLeftCornerRadiuskKHJgLs - 4294967297L) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM8029getBottomRightCornerRadiuskKHJgLs = roundRect.m8029getBottomRightCornerRadiuskKHJgLs() & 9223372034707292159L;
        return (((~jM8029getBottomRightCornerRadiuskKHJgLs) & ((-4294967297L) + jM8029getBottomRightCornerRadiuskKHJgLs)) & (-9223372034707292160L)) != 0;
    }

    public static final boolean isSimple(RoundRect roundRect) {
        long jM8030getTopLeftCornerRadiuskKHJgLs = roundRect.m8030getTopLeftCornerRadiuskKHJgLs();
        return (jM8030getTopLeftCornerRadiuskKHJgLs >>> 32) == (jM8030getTopLeftCornerRadiuskKHJgLs & MuxerUtil.UNSIGNED_INT_MAX_VALUE) && roundRect.m8030getTopLeftCornerRadiuskKHJgLs() == roundRect.m8031getTopRightCornerRadiuskKHJgLs() && roundRect.m8030getTopLeftCornerRadiuskKHJgLs() == roundRect.m8029getBottomRightCornerRadiuskKHJgLs() && roundRect.m8030getTopLeftCornerRadiuskKHJgLs() == roundRect.m8028getBottomLeftCornerRadiuskKHJgLs();
    }

    public static final RoundRect lerp(RoundRect roundRect, RoundRect roundRect2, float f2) {
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f2), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f2), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f2), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f2), CornerRadiusKt.m7953lerp3Ry4LBc(roundRect.m8030getTopLeftCornerRadiuskKHJgLs(), roundRect2.m8030getTopLeftCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m7953lerp3Ry4LBc(roundRect.m8031getTopRightCornerRadiuskKHJgLs(), roundRect2.m8031getTopRightCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m7953lerp3Ry4LBc(roundRect.m8029getBottomRightCornerRadiuskKHJgLs(), roundRect2.m8029getBottomRightCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m7953lerp3Ry4LBc(roundRect.m8028getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m8028getBottomLeftCornerRadiuskKHJgLs(), f2), null);
    }

    /* renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m8036translateUv8p0NA(RoundRect roundRect, long j2) {
        int i2 = (int) (j2 >> 32);
        float left = roundRect.getLeft() + Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return new RoundRect(left, roundRect.getTop() + Float.intBitsToFloat(i3), roundRect.getRight() + Float.intBitsToFloat(i2), roundRect.getBottom() + Float.intBitsToFloat(i3), roundRect.m8030getTopLeftCornerRadiuskKHJgLs(), roundRect.m8031getTopRightCornerRadiuskKHJgLs(), roundRect.m8029getBottomRightCornerRadiuskKHJgLs(), roundRect.m8028getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    public static final RoundRect RoundRect(Rect rect, float f2, float f3) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f2, f3);
    }
}
