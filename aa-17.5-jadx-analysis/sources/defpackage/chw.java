package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class chw {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = new int[2];
    private static final Rect c = new Rect();

    public static final chr a(int i) {
        if (i == 1) {
            return new chr(2);
        }
        if (i == 2) {
            return new chr(1);
        }
        if (i == 17) {
            return new chr(3);
        }
        if (i == 33) {
            return new chr(5);
        }
        if (i == 66) {
            return new chr(4);
        }
        if (i != 130) {
            return null;
        }
        return new chr(6);
    }

    public static final cjb b(View view, View view2) {
        int[] iArr = b;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        Rect rect = c;
        view.getFocusedRect(rect);
        float f = i4;
        float f2 = i3;
        return new cjb(f2 + rect.left, f + rect.top, rect.left + f2 + rect.width(), rect.top + f + rect.height());
    }

    public static final dlr c(int i) {
        if (i == 0) {
            return dlr.a;
        }
        if (i != 1) {
            return null;
        }
        return dlr.b;
    }

    public static final Integer d(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i != 2 ? null : 1;
    }

    public static final boolean e(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof czq) {
            return ((czq) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }
}
