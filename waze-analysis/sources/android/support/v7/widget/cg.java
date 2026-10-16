package android.support.v7.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class cg {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f1232b = {R.attr.state_checked};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f1233c = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public static final Rect f1231a = new Rect();

    public static Rect a(Drawable drawable) {
        Insets opticalInsets = drawable.getOpticalInsets();
        return new Rect(opticalInsets.left, opticalInsets.top, opticalInsets.right, opticalInsets.bottom);
    }

    static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        if (Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1232b);
        } else {
            drawable.setState(f1233c);
        }
        drawable.setState(state);
    }
}
