package androidx.compose.ui.focus;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusInteropUtils_androidKt {
    private static final int[] tempCoordinates = new int[2];
    private static final Rect tempRect = new Rect();

    public static final androidx.compose.ui.geometry.Rect calculateFocusRectRelativeTo(View view, View view2) {
        int[] iArr = tempCoordinates;
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i4 = i2 - iArr[0];
        int i5 = i3 - iArr[1];
        Rect rect = tempRect;
        view.getFocusedRect(rect);
        float f2 = i5;
        float f3 = i4;
        return new androidx.compose.ui.geometry.Rect(f3 + rect.left, f2 + rect.top, rect.left + f3 + rect.width(), rect.top + f2 + rect.height());
    }

    public static final boolean requestInteropFocus(View view, Integer num, Rect rect) {
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
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* renamed from: toAndroidFocusDirection-3ESFkO8, reason: not valid java name */
    public static final Integer m7867toAndroidFocusDirection3ESFkO8(int i2) {
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7866getUpdhqQ8s())) {
            return 33;
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7859getDowndhqQ8s())) {
            return 130;
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7862getLeftdhqQ8s())) {
            return 17;
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7865getRightdhqQ8s())) {
            return 66;
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7863getNextdhqQ8s())) {
            return 2;
        }
        return !FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7864getPreviousdhqQ8s()) ? null : 1;
    }

    public static final FocusDirection toFocusDirection(int i2) {
        if (i2 == 1) {
            return FocusDirection.m7852boximpl(FocusDirection.Companion.m7864getPreviousdhqQ8s());
        }
        if (i2 == 2) {
            return FocusDirection.m7852boximpl(FocusDirection.Companion.m7863getNextdhqQ8s());
        }
        if (i2 == 17) {
            return FocusDirection.m7852boximpl(FocusDirection.Companion.m7862getLeftdhqQ8s());
        }
        if (i2 == 33) {
            return FocusDirection.m7852boximpl(FocusDirection.Companion.m7866getUpdhqQ8s());
        }
        if (i2 == 66) {
            return FocusDirection.m7852boximpl(FocusDirection.Companion.m7865getRightdhqQ8s());
        }
        if (i2 != 130) {
            return null;
        }
        return FocusDirection.m7852boximpl(FocusDirection.Companion.m7859getDowndhqQ8s());
    }

    /* renamed from: toFocusDirection-ZmokQxo, reason: not valid java name */
    public static final FocusDirection m7868toFocusDirectionZmokQxo(KeyEvent keyEvent) {
        long jM9435getKeyZmokQxo = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9276getNavigatePreviousEK5gGoQ())) {
            return FocusDirection.m7852boximpl(FocusDirection.Companion.m7864getPreviousdhqQ8s());
        }
        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9274getNavigateNextEK5gGoQ())) {
            return FocusDirection.m7852boximpl(FocusDirection.Companion.m7863getNextdhqQ8s());
        }
        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9363getTabEK5gGoQ())) {
            return FocusDirection.m7852boximpl(KeyEvent_androidKt.m9441isShiftPressedZmokQxo(keyEvent) ? FocusDirection.Companion.m7864getPreviousdhqQ8s() : FocusDirection.Companion.m7863getNextdhqQ8s());
        }
        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9193getDirectionRightEK5gGoQ())) {
            return FocusDirection.m7852boximpl(FocusDirection.Companion.m7865getRightdhqQ8s());
        }
        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9192getDirectionLeftEK5gGoQ())) {
            return FocusDirection.m7852boximpl(FocusDirection.Companion.m7862getLeftdhqQ8s());
        }
        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9194getDirectionUpEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9315getPageUpEK5gGoQ())) {
            return FocusDirection.m7852boximpl(FocusDirection.Companion.m7866getUpdhqQ8s());
        }
        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9189getDirectionDownEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9314getPageDownEK5gGoQ())) {
            return FocusDirection.m7852boximpl(FocusDirection.Companion.m7859getDowndhqQ8s());
        }
        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9188getDirectionCenterEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9202getEnterEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9299getNumPadEnterEK5gGoQ())) {
            return FocusDirection.m7852boximpl(FocusDirection.Companion.m7860getEnterdhqQ8s());
        }
        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9131getBackEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9205getEscapeEK5gGoQ())) {
            return FocusDirection.m7852boximpl(FocusDirection.Companion.m7861getExitdhqQ8s());
        }
        return null;
    }

    public static final LayoutDirection toLayoutDirection(int i2) {
        if (i2 == 0) {
            return LayoutDirection.Ltr;
        }
        if (i2 != 1) {
            return null;
        }
        return LayoutDirection.Rtl;
    }
}
