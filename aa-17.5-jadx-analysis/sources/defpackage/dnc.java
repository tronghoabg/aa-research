package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

/* loaded from: classes2.dex */
final class dnc {
    public static final dnc a = new dnc();

    public final int a(Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return i - (rect.top + (rect.bottom > i2 ? rect.bottom - i2 : 0));
    }
}
