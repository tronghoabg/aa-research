package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCheckedTextView;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class aa extends CheckedTextView implements TintableCheckedTextView, TintableBackgroundView, TintableCompoundDrawablesView {

    /* renamed from: a, reason: collision with root package name */
    private final ab f1026a;

    /* renamed from: b, reason: collision with root package name */
    private final x f1027b;

    /* renamed from: c, reason: collision with root package name */
    private final bj f1028c;

    /* renamed from: d, reason: collision with root package name */
    private aj f1029d;

    public aa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        fz.d(this, getContext());
        bj bjVar = new bj(this);
        this.f1028c = bjVar;
        bjVar.e(attributeSet, R.attr.checkedTextViewStyle);
        bjVar.d();
        x xVar = new x(this);
        this.f1027b = xVar;
        xVar.d(attributeSet, R.attr.checkedTextViewStyle);
        ab abVar = new ab(this);
        this.f1026a = abVar;
        abVar.g(attributeSet);
        a().b(attributeSet, R.attr.checkedTextViewStyle);
    }

    private final aj a() {
        aj ajVar = this.f1029d;
        if (ajVar != null) {
            return ajVar;
        }
        aj ajVar2 = new aj(this);
        this.f1029d = ajVar2;
        return ajVar2;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        bj bjVar = this.f1028c;
        if (bjVar != null) {
            bjVar.d();
        }
        x xVar = this.f1027b;
        if (xVar != null) {
            xVar.c();
        }
        ab abVar = this.f1026a;
        if (abVar != null) {
            abVar.c();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final ColorStateList getSupportBackgroundTintList() {
        x xVar = this.f1027b;
        if (xVar != null) {
            return xVar.a();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.f1027b;
        if (xVar != null) {
            return xVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    public final ColorStateList getSupportCheckMarkTintList() {
        ab abVar = this.f1026a;
        if (abVar != null) {
            return abVar.a();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    public final PorterDuff.Mode getSupportCheckMarkTintMode() {
        ab abVar = this.f1026a;
        if (abVar != null) {
            return abVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1028c.a();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1028c.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ed.b(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a().c(z);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x xVar = this.f1027b;
        if (xVar != null) {
            xVar.i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        x xVar = this.f1027b;
        if (xVar != null) {
            xVar.e(i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(android.support.a.i.d(getContext(), i2));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        bj bjVar = this.f1028c;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        bj bjVar = this.f1028c;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x xVar = this.f1027b;
        if (xVar != null) {
            xVar.g(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x xVar = this.f1027b;
        if (xVar != null) {
            xVar.h(mode);
        }
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    public final void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        ab abVar = this.f1026a;
        if (abVar != null) {
            abVar.e(colorStateList);
        }
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    public final void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        ab abVar = this.f1026a;
        if (abVar != null) {
            abVar.f(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        bj bjVar = this.f1028c;
        bjVar.i(colorStateList);
        bjVar.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        bj bjVar = this.f1028c;
        bjVar.j(mode);
        bjVar.d();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        bj bjVar = this.f1028c;
        if (bjVar != null) {
            bjVar.g(context, i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        ab abVar = this.f1026a;
        if (abVar != null) {
            abVar.d();
        }
    }
}
