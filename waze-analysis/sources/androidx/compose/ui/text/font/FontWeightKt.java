package androidx.compose.ui.text.font;

import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FontWeightKt {
    public static final FontWeight lerp(FontWeight fontWeight, FontWeight fontWeight2, float f2) {
        int iLerp = MathHelpersKt.lerp(fontWeight.getWeight(), fontWeight2.getWeight(), f2);
        if (iLerp <= 0) {
            iLerp = 1;
        } else if (iLerp > 1000) {
            iLerp = 1000;
        }
        return new FontWeight(iLerp);
    }
}
