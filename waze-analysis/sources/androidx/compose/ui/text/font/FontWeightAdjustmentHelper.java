package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FontWeightAdjustmentHelper {
    public static final int $stable = 0;
    public static final FontWeightAdjustmentHelper INSTANCE = new FontWeightAdjustmentHelper();

    private FontWeightAdjustmentHelper() {
    }

    public final int getFontWeightAdjustment(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return FontWeightAdjustmentHelperApi31.INSTANCE.fontWeightAdjustment(context);
        }
        return 0;
    }
}
