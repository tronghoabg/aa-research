package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.wynauto.wyn.R;
import i.AbstractC2820a;
import n1.InterfaceC3577k;
import r7.AbstractC3935e;

/* renamed from: q.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3826n extends CheckedTextView implements InterfaceC3577k {

    /* renamed from: a, reason: collision with root package name */
    public final C3828o f43835a;

    /* renamed from: b, reason: collision with root package name */
    public final R1.q f43836b;

    /* renamed from: c, reason: collision with root package name */
    public final V f43837c;

    /* renamed from: d, reason: collision with root package name */
    public C3835s f43838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3826n(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        f1.a(context);
        e1.a(getContext(), this);
        V v2 = new V(this);
        this.f43837c = v2;
        v2.f(attributeSet, R.attr.checkedTextViewStyle);
        v2.b();
        R1.q qVar = new R1.q(this);
        this.f43836b = qVar;
        qVar.t(attributeSet, R.attr.checkedTextViewStyle);
        this.f43835a = new C3828o(this);
        Context context2 = getContext();
        int[] iArr = AbstractC2820a.f36448l;
        md.J jS = md.J.s(context2, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        TypedArray typedArray = (TypedArray) jS.f40581b;
        k1.S.l(this, getContext(), iArr, attributeSet, (TypedArray) jS.f40581b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(Fe.g.B(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(Fe.g.B(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(jS.m(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC3827n0.c(typedArray.getInt(3, -1), null));
            }
            jS.v();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            jS.v();
            throw th;
        }
    }

    private C3835s getEmojiTextViewHelper() {
        if (this.f43838d == null) {
            this.f43838d = new C3835s(this);
        }
        return this.f43838d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        V v2 = this.f43837c;
        if (v2 != null) {
            v2.b();
        }
        R1.q qVar = this.f43836b;
        if (qVar != null) {
            qVar.n();
        }
        C3828o c3828o = this.f43835a;
        if (c3828o != null) {
            c3828o.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC3935e.T(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        R1.q qVar = this.f43836b;
        if (qVar != null) {
            return qVar.q();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        R1.q qVar = this.f43836b;
        if (qVar != null) {
            return qVar.r();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C3828o c3828o = this.f43835a;
        if (c3828o != null) {
            return (ColorStateList) c3828o.f43844a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C3828o c3828o = this.f43835a;
        if (c3828o != null) {
            return (PorterDuff.Mode) c3828o.f43845b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43837c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43837c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC3935e.H(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        R1.q qVar = this.f43836b;
        if (qVar != null) {
            qVar.u();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        R1.q qVar = this.f43836b;
        if (qVar != null) {
            qVar.v(i5);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C3828o c3828o = this.f43835a;
        if (c3828o != null) {
            if (c3828o.f43848e) {
                c3828o.f43848e = false;
            } else {
                c3828o.f43848e = true;
                c3828o.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f43837c;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f43837c;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3935e.U(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        R1.q qVar = this.f43836b;
        if (qVar != null) {
            qVar.y(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        R1.q qVar = this.f43836b;
        if (qVar != null) {
            qVar.z(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C3828o c3828o = this.f43835a;
        if (c3828o != null) {
            c3828o.f43844a = colorStateList;
            c3828o.f43846c = true;
            c3828o.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C3828o c3828o = this.f43835a;
        if (c3828o != null) {
            c3828o.f43845b = mode;
            c3828o.f43847d = true;
            c3828o.b();
        }
    }

    @Override // n1.InterfaceC3577k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v2 = this.f43837c;
        v2.k(colorStateList);
        v2.b();
    }

    @Override // n1.InterfaceC3577k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v2 = this.f43837c;
        v2.l(mode);
        v2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i5) throws Resources.NotFoundException {
        super.setTextAppearance(context, i5);
        V v2 = this.f43837c;
        if (v2 != null) {
            v2.g(context, i5);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i5) {
        setCheckMarkDrawable(Fe.g.B(getContext(), i5));
    }
}
