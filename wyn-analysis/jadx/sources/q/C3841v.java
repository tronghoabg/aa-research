package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import n1.InterfaceC3577k;
import r7.AbstractC3935e;

/* renamed from: q.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3841v extends MultiAutoCompleteTextView implements InterfaceC3577k {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f43921d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final R1.q f43922a;

    /* renamed from: b, reason: collision with root package name */
    public final V f43923b;

    /* renamed from: c, reason: collision with root package name */
    public final C3845x f43924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3841v(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, com.wynauto.wyn.R.attr.autoCompleteTextViewStyle);
        f1.a(context);
        e1.a(getContext(), this);
        md.J jS = md.J.s(getContext(), attributeSet, f43921d, com.wynauto.wyn.R.attr.autoCompleteTextViewStyle, 0);
        if (((TypedArray) jS.f40581b).hasValue(0)) {
            setDropDownBackgroundDrawable(jS.n(0));
        }
        jS.v();
        R1.q qVar = new R1.q(this);
        this.f43922a = qVar;
        qVar.t(attributeSet, com.wynauto.wyn.R.attr.autoCompleteTextViewStyle);
        V v2 = new V(this);
        this.f43923b = v2;
        v2.f(attributeSet, com.wynauto.wyn.R.attr.autoCompleteTextViewStyle);
        v2.b();
        C3845x c3845x = new C3845x(this);
        this.f43924c = c3845x;
        c3845x.b(attributeSet, com.wynauto.wyn.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerA = c3845x.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        R1.q qVar = this.f43922a;
        if (qVar != null) {
            qVar.n();
        }
        V v2 = this.f43923b;
        if (v2 != null) {
            v2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        R1.q qVar = this.f43922a;
        if (qVar != null) {
            return qVar.q();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        R1.q qVar = this.f43922a;
        if (qVar != null) {
            return qVar.r();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43923b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43923b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC3935e.H(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f43924c.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        R1.q qVar = this.f43922a;
        if (qVar != null) {
            qVar.u();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        R1.q qVar = this.f43922a;
        if (qVar != null) {
            qVar.v(i5);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f43923b;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f43923b;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i5) {
        setDropDownBackgroundDrawable(Fe.g.B(getContext(), i5));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f43924c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f43924c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        R1.q qVar = this.f43922a;
        if (qVar != null) {
            qVar.y(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        R1.q qVar = this.f43922a;
        if (qVar != null) {
            qVar.z(mode);
        }
    }

    @Override // n1.InterfaceC3577k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v2 = this.f43923b;
        v2.k(colorStateList);
        v2.b();
    }

    @Override // n1.InterfaceC3577k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v2 = this.f43923b;
        v2.l(mode);
        v2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i5) throws Resources.NotFoundException {
        super.setTextAppearance(context, i5);
        V v2 = this.f43923b;
        if (v2 != null) {
            v2.g(context, i5);
        }
    }
}
