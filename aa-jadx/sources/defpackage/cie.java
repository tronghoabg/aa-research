package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cie {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = new int[2];
    private static final android.graphics.Rect c = new android.graphics.Rect();

    public static final defpackage.chz a(int i) {
        if (i == 1) {
            return new defpackage.chz(2);
        }
        if (i == 2) {
            return new defpackage.chz(1);
        }
        if (i == 17) {
            return new defpackage.chz(3);
        }
        if (i == 33) {
            return new defpackage.chz(5);
        }
        if (i == 66) {
            return new defpackage.chz(4);
        }
        if (i != 130) {
            return null;
        }
        return new defpackage.chz(6);
    }

    public static final defpackage.cjj b(android.view.View view, android.view.View view2) {
        int[] iArr = b;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        android.graphics.Rect rect = c;
        view.getFocusedRect(rect);
        float f = i4;
        float f2 = i3;
        return new defpackage.cjj(f2 + rect.left, f + rect.top, rect.left + f2 + rect.width(), rect.top + f + rect.height());
    }

    public static final defpackage.dlz c(int i) {
        if (i == 0) {
            return defpackage.dlz.a;
        }
        if (i != 1) {
            return null;
        }
        return defpackage.dlz.b;
    }

    public static final java.lang.Integer d(int i) {
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

    public static final boolean e(android.view.View view, java.lang.Integer num, android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof defpackage.czz) {
            return ((defpackage.czz) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            android.view.View viewFindNextFocusFromRect = android.view.FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        android.view.View viewFindNextFocus = android.view.FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }
}
