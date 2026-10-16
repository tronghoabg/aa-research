package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundButton;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class z extends CheckBox implements TintableCompoundButton, TintableBackgroundView, TintableCompoundDrawablesView {

    /* renamed from: a, reason: collision with root package name */
    private final ac f1636a;

    /* renamed from: b, reason: collision with root package name */
    private final x f1637b;

    /* renamed from: c, reason: collision with root package name */
    private final bj f1638c;

    /* renamed from: d, reason: collision with root package name */
    private aj f1639d;

    public z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        fz.d(this, getContext());
        ac acVar = new ac(this);
        this.f1636a = acVar;
        acVar.d(attributeSet, R.attr.checkboxStyle);
        x xVar = new x(this);
        this.f1637b = xVar;
        xVar.d(attributeSet, R.attr.checkboxStyle);
        bj bjVar = new bj(this);
        this.f1638c = bjVar;
        bjVar.e(attributeSet, R.attr.checkboxStyle);
        a().b(attributeSet, R.attr.checkboxStyle);
    }

    private final aj a() {
        aj ajVar = this.f1639d;
        if (ajVar != null) {
            return ajVar;
        }
        aj ajVar2 = new aj(this);
        this.f1639d = ajVar2;
        return ajVar2;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f1637b;
        if (xVar != null) {
            xVar.c();
        }
        bj bjVar = this.f1638c;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final ColorStateList getSupportBackgroundTintList() {
        x xVar = this.f1637b;
        if (xVar != null) {
            return xVar.a();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.f1637b;
        if (xVar != null) {
            return xVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundButton
    public final ColorStateList getSupportButtonTintList() {
        ac acVar = this.f1636a;
        if (acVar != null) {
            return acVar.a();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundButton
    public final PorterDuff.Mode getSupportButtonTintMode() {
        ac acVar = this.f1636a;
        if (acVar != null) {
            return acVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1638c.a();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1638c.b();
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a().c(z);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x xVar = this.f1637b;
        if (xVar != null) {
            xVar.i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        x xVar = this.f1637b;
        if (xVar != null) {
            xVar.e(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(android.support.a.i.d(getContext(), i2));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        bj bjVar = this.f1638c;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        bj bjVar = this.f1638c;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(a().f(inputFilterArr));
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x xVar = this.f1637b;
        if (xVar != null) {
            xVar.g(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x xVar = this.f1637b;
        if (xVar != null) {
            xVar.h(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    public final void setSupportButtonTintList(ColorStateList colorStateList) {
        ac acVar = this.f1636a;
        if (acVar != null) {
            acVar.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    public final void setSupportButtonTintMode(PorterDuff.Mode mode) {
        ac acVar = this.f1636a;
        if (acVar != null) {
            acVar.g(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        bj bjVar = this.f1638c;
        bjVar.i(colorStateList);
        bjVar.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        bj bjVar = this.f1638c;
        bjVar.j(mode);
        bjVar.d();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        ac acVar = this.f1636a;
        if (acVar != null) {
            acVar.e();
        }
    }
}
