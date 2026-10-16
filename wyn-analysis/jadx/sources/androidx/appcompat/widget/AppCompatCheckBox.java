package androidx.appcompat.widget;

import Fe.g;
import R1.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.wynauto.wyn.R;
import n1.InterfaceC3576j;
import n1.InterfaceC3577k;
import q.C3828o;
import q.C3835s;
import q.V;
import q.e1;
import q.f1;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements InterfaceC3576j, InterfaceC3577k {

    /* renamed from: a, reason: collision with root package name */
    public final C3828o f17855a;

    /* renamed from: b, reason: collision with root package name */
    public final q f17856b;

    /* renamed from: c, reason: collision with root package name */
    public final V f17857c;

    /* renamed from: d, reason: collision with root package name */
    public C3835s f17858d;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    private C3835s getEmojiTextViewHelper() {
        if (this.f17858d == null) {
            this.f17858d = new C3835s(this);
        }
        return this.f17858d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f17856b;
        if (qVar != null) {
            qVar.n();
        }
        V v2 = this.f17857c;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C3828o c3828o = this.f17855a;
        if (c3828o != null) {
            c3828o.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f17856b;
        if (qVar != null) {
            return qVar.q();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f17856b;
        if (qVar != null) {
            return qVar.r();
        }
        return null;
    }

    @Override // n1.InterfaceC3576j
    public ColorStateList getSupportButtonTintList() {
        C3828o c3828o = this.f17855a;
        if (c3828o != null) {
            return (ColorStateList) c3828o.f43844a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C3828o c3828o = this.f17855a;
        if (c3828o != null) {
            return (PorterDuff.Mode) c3828o.f43845b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17857c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17857c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f17856b;
        if (qVar != null) {
            qVar.u();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        q qVar = this.f17856b;
        if (qVar != null) {
            qVar.v(i5);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C3828o c3828o = this.f17855a;
        if (c3828o != null) {
            if (c3828o.f43848e) {
                c3828o.f43848e = false;
            } else {
                c3828o.f43848e = true;
                c3828o.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f17857c;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f17857c;
        if (v2 != null) {
            v2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f17856b;
        if (qVar != null) {
            qVar.y(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f17856b;
        if (qVar != null) {
            qVar.z(mode);
        }
    }

    @Override // n1.InterfaceC3576j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C3828o c3828o = this.f17855a;
        if (c3828o != null) {
            c3828o.f43844a = colorStateList;
            c3828o.f43846c = true;
            c3828o.a();
        }
    }

    @Override // n1.InterfaceC3576j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C3828o c3828o = this.f17855a;
        if (c3828o != null) {
            c3828o.f43845b = mode;
            c3828o.f43847d = true;
            c3828o.a();
        }
    }

    @Override // n1.InterfaceC3577k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v2 = this.f17857c;
        v2.k(colorStateList);
        v2.b();
    }

    @Override // n1.InterfaceC3577k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v2 = this.f17857c;
        v2.l(mode);
        v2.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i5) throws Resources.NotFoundException {
        super(context, attributeSet, i5);
        f1.a(context);
        e1.a(getContext(), this);
        C3828o c3828o = new C3828o(this);
        this.f17855a = c3828o;
        c3828o.c(attributeSet, i5);
        q qVar = new q(this);
        this.f17856b = qVar;
        qVar.t(attributeSet, i5);
        V v2 = new V(this);
        this.f17857c = v2;
        v2.f(attributeSet, i5);
        getEmojiTextViewHelper().b(attributeSet, i5);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i5) {
        setButtonDrawable(g.B(getContext(), i5));
    }
}
