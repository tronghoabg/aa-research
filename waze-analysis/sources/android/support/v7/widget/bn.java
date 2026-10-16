package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class bn extends TextView implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView {

    /* renamed from: a, reason: collision with root package name */
    private final x f1155a;

    /* renamed from: b, reason: collision with root package name */
    private final bj f1156b;

    /* renamed from: c, reason: collision with root package name */
    private aj f1157c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1158d;

    /* renamed from: e, reason: collision with root package name */
    private bi f1159e;

    /* renamed from: f, reason: collision with root package name */
    private bk f1160f;

    public bn(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1158d = false;
        this.f1160f = null;
        fz.d(this, getContext());
        x xVar = new x(this);
        this.f1155a = xVar;
        xVar.d(attributeSet, i2);
        bj bjVar = new bj(this);
        this.f1156b = bjVar;
        bjVar.e(attributeSet, i2);
        bjVar.d();
        Preconditions.checkNotNull(this);
        a().b(attributeSet, i2);
    }

    private final aj a() {
        aj ajVar = this.f1157c;
        if (ajVar != null) {
            return ajVar;
        }
        aj ajVar2 = new aj(this);
        this.f1157c = ajVar2;
        return ajVar2;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f1155a;
        if (xVar != null) {
            xVar.c();
        }
        bj bjVar = this.f1156b;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public final int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public final int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public final int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public final int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public final int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return TextViewCompat.getFirstBaselineToTopHeight(this);
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return i().b();
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return TextViewCompat.getLastBaselineToBottomHeight(this);
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final ColorStateList getSupportBackgroundTintList() {
        x xVar = this.f1155a;
        if (xVar != null) {
            return xVar.a();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.f1155a;
        if (xVar != null) {
            return xVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1156b.a();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1156b.b();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return i().a();
    }

    final bi i() {
        bi biVar = this.f1159e;
        if (biVar != null) {
            return biVar;
        }
        bi biVar2 = new bi(this, new af(this, 2));
        this.f1159e = biVar2;
        return biVar2;
    }

    final bk n() {
        if (this.f1160f == null) {
            this.f1160f = Build.VERSION.SDK_INT >= 34 ? new bm(this) : new bl(this);
        }
        return this.f1160f;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        bj.k(this, inputConnectionOnCreateInputConnection, editorInfo);
        ed.b(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a().c(z);
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public final void setAutoSizeTextTypeWithDefaults(int i2) {
        super.setAutoSizeTextTypeWithDefaults(i2);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x xVar = this.f1155a;
        if (xVar != null) {
            xVar.i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        x xVar = this.f1155a;
        if (xVar != null) {
            xVar.e(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        bj bjVar = this.f1156b;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        bj bjVar = this.f1156b;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? android.support.a.i.d(context, i2) : null, i3 != 0 ? android.support.a.i.d(context, i3) : null, i4 != 0 ? android.support.a.i.d(context, i4) : null, i5 != 0 ? android.support.a.i.d(context, i5) : null);
        bj bjVar = this.f1156b;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? android.support.a.i.d(context, i2) : null, i3 != 0 ? android.support.a.i.d(context, i3) : null, i4 != 0 ? android.support.a.i.d(context, i4) : null, i5 != 0 ? android.support.a.i.d(context, i5) : null);
        bj bjVar = this.f1156b;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(a().f(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i2) {
        n().a(i2);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return i().d(str);
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i2) {
        n().b(i2);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i2, float f2) {
        if (Build.VERSION.SDK_INT >= 34) {
            n().c(i2, f2);
        } else {
            TextViewCompat.setLineHeight(this, i2, f2);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x xVar = this.f1155a;
        if (xVar != null) {
            xVar.g(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x xVar = this.f1155a;
        if (xVar != null) {
            xVar.h(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        bj bjVar = this.f1156b;
        bjVar.i(colorStateList);
        bjVar.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        bj bjVar = this.f1156b;
        bjVar.j(mode);
        bjVar.d();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        bj bjVar = this.f1156b;
        if (bjVar != null) {
            bjVar.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        if (this.f1158d) {
            return;
        }
        if (typeface != null && i2 > 0) {
            typeface = TypefaceCompat.create(getContext(), typeface, i2);
        }
        this.f1158d = true;
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f1158d = false;
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i2) {
        TextViewCompat.setLineHeight(this, i2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        i().c(typeface);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        bj bjVar = this.f1156b;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        bj bjVar = this.f1156b;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    public bn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public bn(Context context) {
        this(context, null);
    }
}
