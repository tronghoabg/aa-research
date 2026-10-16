package androidx.biometric.internal.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FingerprintDialogActivityKt {
    public static final /* synthetic */ int access$getDismissDialogDelay(Context context) {
        return 2000;
    }

    private static final int getDismissDialogDelay(Context context) {
        return 2000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getThemedColorFor(Context context, int i2) throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{i2});
        x.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }
}
