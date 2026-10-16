package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class TextInputEditText extends android.support.v7.widget.ah {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f6794a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6795b;

    public TextInputEditText(Context context, AttributeSet attributeSet, int i2) {
        super(com.google.android.material.theme.a.a.a(context, attributeSet, i2, 0), attributeSet, i2);
        this.f6794a = new Rect();
        TypedArray typedArrayA = com.google.android.material.internal.n.a(context, attributeSet, al.f6864b, i2, R.style.Widget_Design_TextInputEditText, new int[0]);
        this.f6795b = typedArrayA.getBoolean(0, false);
        typedArrayA.recycle();
    }

    private final TextInputLayout c() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean d(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f6795b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayoutC = c();
        if (!d(textInputLayoutC) || rect == null) {
            return;
        }
        Rect rect2 = this.f6794a;
        textInputLayoutC.getFocusedRect(rect2);
        rect.bottom = rect2.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayoutC = c();
        if (!d(textInputLayoutC)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayoutC.getGlobalVisibleRect(rect, point);
        if (!globalVisibleRect || point == null) {
            return globalVisibleRect;
        }
        point.offset(-getScrollX(), -getScrollY());
        return true;
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout textInputLayoutC = c();
        return (textInputLayoutC == null || !textInputLayoutC.S()) ? super.getHint() : textInputLayoutC.n();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutC = c();
        if (textInputLayoutC != null && textInputLayoutC.S() && super.getHint() == null && com.google.android.material.d.c.e()) {
            setHint("");
        }
    }

    @Override // android.support.v7.widget.ah, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout textInputLayoutC = c();
            editorInfo.hintText = textInputLayoutC != null ? textInputLayoutC.n() : null;
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayoutC = c();
        if (!d(textInputLayoutC) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int height = textInputLayoutC.getHeight() - getHeight();
        Rect rect2 = this.f6794a;
        rect2.set(rect.left, rect.top, rect.right, rect.bottom + height);
        return super.requestRectangleOnScreen(rect2);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context) {
        this(context, null);
    }
}
