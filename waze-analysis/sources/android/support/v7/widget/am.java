package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundDrawablesView;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class am extends MultiAutoCompleteTextView implements TintableBackgroundView, TintableCompoundDrawablesView {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1067a = {R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    private final x f1068b;

    /* renamed from: c, reason: collision with root package name */
    private final bj f1069c;

    /* renamed from: d, reason: collision with root package name */
    private final ai f1070d;

    public am(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.waze.R.attr.autoCompleteTextViewStyle);
        fz.d(this, getContext());
        gc gcVarN = gc.n(getContext(), attributeSet, f1067a, com.waze.R.attr.autoCompleteTextViewStyle, 0);
        if (gcVarN.s(0)) {
            setDropDownBackgroundDrawable(gcVarN.j(0));
        }
        gcVarN.q();
        x xVar = new x(this);
        this.f1068b = xVar;
        xVar.d(attributeSet, com.waze.R.attr.autoCompleteTextViewStyle);
        bj bjVar = new bj(this);
        this.f1069c = bjVar;
        bjVar.e(attributeSet, com.waze.R.attr.autoCompleteTextViewStyle);
        bjVar.d();
        ai aiVar = new ai(this);
        this.f1070d = aiVar;
        aiVar.c(attributeSet, com.waze.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (ai.d(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = aiVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f1068b;
        if (xVar != null) {
            xVar.c();
        }
        bj bjVar = this.f1069c;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final ColorStateList getSupportBackgroundTintList() {
        x xVar = this.f1068b;
        if (xVar != null) {
            return xVar.a();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.f1068b;
        if (xVar != null) {
            return xVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1069c.a();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1069c.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ed.b(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f1070d.b(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x xVar = this.f1068b;
        if (xVar != null) {
            xVar.i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        x xVar = this.f1068b;
        if (xVar != null) {
            xVar.e(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        bj bjVar = this.f1069c;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        bj bjVar = this.f1069c;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(android.support.a.i.d(getContext(), i2));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1070d.a(keyListener));
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x xVar = this.f1068b;
        if (xVar != null) {
            xVar.g(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x xVar = this.f1068b;
        if (xVar != null) {
            xVar.h(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        bj bjVar = this.f1069c;
        bjVar.i(colorStateList);
        bjVar.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        bj bjVar = this.f1069c;
        bjVar.j(mode);
        bjVar.d();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        bj bjVar = this.f1069c;
        if (bjVar != null) {
            bjVar.g(context, i2);
        }
    }
}
