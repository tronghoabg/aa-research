package q;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import c1.InterfaceC1545a;
import java.lang.reflect.InvocationTargetException;

/* renamed from: q.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3827n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f43839a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f43840b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f43841c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 29 || i5 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f43839a);
        } else {
            drawable.setState(f43840b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            Insets insetsA = AbstractC3825m0.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        boolean z2 = drawable instanceof InterfaceC1545a;
        Object obj = drawable;
        if (z2) {
            ((c1.b) ((InterfaceC1545a) drawable)).getClass();
            obj = null;
        }
        if (i5 >= 29) {
            boolean z10 = AbstractC3823l0.f43823a;
        } else if (AbstractC3823l0.f43823a) {
            try {
                Object objInvoke = AbstractC3823l0.f43824b.invoke(obj, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(AbstractC3823l0.f43825c.getInt(objInvoke), AbstractC3823l0.f43826d.getInt(objInvoke), AbstractC3823l0.f43827e.getInt(objInvoke), AbstractC3823l0.f43828f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f43841c;
    }

    public static PorterDuff.Mode c(int i5, PorterDuff.Mode mode) {
        if (i5 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i5 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i5 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i5) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
