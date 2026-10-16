package androidx.compose.ui.graphics;

import android.os.Build;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidColor_androidKt {
    public static final long fromColorLong(Color.Companion companion, long j2) {
        long j3 = 63 & j2;
        if (j3 >= 16) {
            j2 = (j2 & (-64)) | (j3 + 1);
        }
        Color.Companion companion2 = Color.Companion;
        return j2;
    }

    /* renamed from: isColorSpaceSupported-8_81llA, reason: not valid java name */
    public static final boolean m8089isColorSpaceSupported8_81llA(long j2) {
        int i2 = (int) (j2 & 63);
        return (i2 == ColorSpaces.INSTANCE.getOklab().getId$ui_graphics() || i2 == ColorSpaces.INSTANCE.getCieXyz().getId$ui_graphics() || i2 == ColorSpaces.INSTANCE.getCieLab().getId$ui_graphics()) ? false : true;
    }

    /* renamed from: toColorLong-8_81llA, reason: not valid java name */
    public static final long m8090toColorLong8_81llA(long j2) {
        long j3 = 63 & j2;
        int i2 = (int) j3;
        return i2 <= 15 ? j2 : i2 == ColorSpaces.INSTANCE.getUnspecified$ui_graphics().getId$ui_graphics() ? ColorKt.m8282toArgb8_81llA(j2) : ((i2 == ColorSpaces.INSTANCE.getBt2020Hlg().getId$ui_graphics() || i2 == ColorSpaces.INSTANCE.getBt2020Pq().getId$ui_graphics()) && Build.VERSION.SDK_INT < 34) ? ColorKt.m8282toArgb8_81llA(j2) : (i2 != ColorSpaces.INSTANCE.getOklab().getId$ui_graphics() || Build.VERSION.SDK_INT >= 36) ? (j2 & (-64)) | (j3 - 1) : ColorKt.m8282toArgb8_81llA(j2);
    }

    /* renamed from: toSupportedColorLong-8_81llA, reason: not valid java name */
    public static final long m8091toSupportedColorLong8_81llA(long j2) {
        return m8089isColorSpaceSupported8_81llA(j2) ? m8090toColorLong8_81llA(j2) : m8090toColorLong8_81llA(Color.m8225convertvNxB06k(j2, ColorSpaces.INSTANCE.getSrgb()));
    }
}
