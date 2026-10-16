package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ColorSpaceVerificationHelperV36 {
    public static final ColorSpaceVerificationHelperV36 INSTANCE = new ColorSpaceVerificationHelperV36();

    private ColorSpaceVerificationHelperV36() {
    }

    public static final ColorSpace obtainAndroidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getOklab())) {
            return ColorSpace.get(ColorSpace.Named.OK_LAB);
        }
        return null;
    }

    public static final androidx.compose.ui.graphics.colorspace.ColorSpace obtainComposeColorSpaceFromId(int i2) {
        return i2 == ColorSpace.Named.OK_LAB.ordinal() ? ColorSpaces.INSTANCE.getOklab() : ColorSpaces.INSTANCE.getUnspecified$ui_graphics();
    }
}
