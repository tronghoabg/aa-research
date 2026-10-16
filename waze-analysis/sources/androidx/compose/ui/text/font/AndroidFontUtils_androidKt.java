package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontWeight;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidFontUtils_androidKt {
    public static final FontWeight getAndroidBold(FontWeight.Companion companion) {
        return companion.getW600();
    }

    public static final int getAndroidTypefaceStyle(boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return 3;
            }
        } else if (z) {
            return 1;
        }
        return !z2 ? 0 : 2;
    }

    /* renamed from: getAndroidTypefaceStyle-FO1MlWM, reason: not valid java name */
    public static final int m10612getAndroidTypefaceStyleFO1MlWM(FontWeight fontWeight, int i2) {
        int iCompareTo = fontWeight.compareTo(getAndroidBold(FontWeight.Companion));
        return getAndroidTypefaceStyle(iCompareTo >= 0, FontStyle.m10661equalsimpl0(i2, FontStyle.Companion.m10667getItalic_LCdwA()));
    }
}
