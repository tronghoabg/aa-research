package androidx.compose.material3.internal.ripple;

import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BorderKt {
    public static final /* synthetic */ Path access$createRoundRectPath(Path path, RoundRect roundRect, float f2, float f3, boolean z) {
        createRoundRectPath(path, roundRect, f2, f3, z);
        return path;
    }

    private static final RoundRect createInsetRoundedRect(float f2, RoundRect roundRect) {
        return new RoundRect(f2, f2, roundRect.getWidth() - f2, roundRect.getHeight() - f2, m6393shrinkKibmq7A(roundRect.m8030getTopLeftCornerRadiuskKHJgLs(), f2), m6393shrinkKibmq7A(roundRect.m8031getTopRightCornerRadiuskKHJgLs(), f2), m6393shrinkKibmq7A(roundRect.m8029getBottomRightCornerRadiuskKHJgLs(), f2), m6393shrinkKibmq7A(roundRect.m8028getBottomLeftCornerRadiuskKHJgLs(), f2), null);
    }

    private static final Path createRoundRectPath(Path path, RoundRect roundRect, float f2, float f3, boolean z) {
        path.reset();
        Path.CC.addRoundRect$default(path, createInsetRoundedRect(f3, roundRect), null, 2, null);
        if (!z) {
            float f4 = f2 + f3;
            Path Path = AndroidPath_androidKt.Path();
            Path.CC.addRoundRect$default(Path, createInsetRoundedRect(f4, roundRect), null, 2, null);
            path.mo8117opN5in7k0(path, Path, PathOperation.Companion.m8564getDifferenceb3I0S0c());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m6393shrinkKibmq7A(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - f2;
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fMax = Math.max(0.0f, fIntBitsToFloat);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat(i2) - f2);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
