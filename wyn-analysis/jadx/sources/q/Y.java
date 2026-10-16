package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import b1.AbstractC1497f;
import j1.AbstractC3076d;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import m1.AbstractC3476a;
import m1.AbstractC3478c;
import n1.InterfaceC3577k;
import r7.AbstractC3935e;

/* loaded from: classes.dex */
public class Y extends TextView implements InterfaceC3577k {

    /* renamed from: a, reason: collision with root package name */
    public final R1.q f43720a;

    /* renamed from: b, reason: collision with root package name */
    public final V f43721b;

    /* renamed from: c, reason: collision with root package name */
    public final C3845x f43722c;

    /* renamed from: d, reason: collision with root package name */
    public C3835s f43723d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f43724e;

    /* renamed from: f, reason: collision with root package name */
    public a2.v f43725f;

    /* renamed from: g, reason: collision with root package name */
    public Future f43726g;

    public Y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C3835s getEmojiTextViewHelper() {
        if (this.f43723d == null) {
            this.f43723d = new C3835s(this);
        }
        return this.f43723d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        R1.q qVar = this.f43720a;
        if (qVar != null) {
            qVar.n();
        }
        V v2 = this.f43721b;
        if (v2 != null) {
            v2.b();
        }
    }

    public final void f() {
        Future future = this.f43726g;
        if (future == null) {
            return;
        }
        try {
            this.f43726g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC3935e.A(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (v1.f43928b) {
            return super.getAutoSizeMaxTextSize();
        }
        V v2 = this.f43721b;
        if (v2 != null) {
            return Math.round(v2.f43715i.f43775e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (v1.f43928b) {
            return super.getAutoSizeMinTextSize();
        }
        V v2 = this.f43721b;
        if (v2 != null) {
            return Math.round(v2.f43715i.f43774d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (v1.f43928b) {
            return super.getAutoSizeStepGranularity();
        }
        V v2 = this.f43721b;
        if (v2 != null) {
            return Math.round(v2.f43715i.f43773c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (v1.f43928b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        V v2 = this.f43721b;
        return v2 != null ? v2.f43715i.f43776f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (v1.f43928b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        V v2 = this.f43721b;
        if (v2 != null) {
            return v2.f43715i.f43771a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC3935e.T(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public W getSuperCaller() {
        if (this.f43725f == null) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 28) {
                this.f43725f = new X(this);
            } else if (i5 >= 26) {
                this.f43725f = new a2.v(this, 21);
            }
        }
        return this.f43725f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        R1.q qVar = this.f43720a;
        if (qVar != null) {
            return qVar.q();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        R1.q qVar = this.f43720a;
        if (qVar != null) {
            return qVar.r();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43721b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43721b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        f();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C3845x c3845x;
        if (Build.VERSION.SDK_INT >= 28 || (c3845x = this.f43722c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c3845x.f43941c;
        return textClassifier == null ? N.a((TextView) c3845x.f43940b) : textClassifier;
    }

    public i1.c getTextMetricsParamsCompat() {
        return AbstractC3935e.A(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i5;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f43721b.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnectionOnCreateInputConnection != null) {
            CharSequence text = getText();
            if (i10 >= 30) {
                AbstractC3476a.a(editorInfo, text);
            } else {
                text.getClass();
                if (i10 >= 30) {
                    AbstractC3476a.a(editorInfo, text);
                } else {
                    int i11 = editorInfo.initialSelStart;
                    int i12 = editorInfo.initialSelEnd;
                    int i13 = i11 > i12 ? i12 : i11;
                    if (i11 <= i12) {
                        i11 = i12;
                    }
                    int length = text.length();
                    if (i13 < 0 || i11 > length || (i5 = editorInfo.inputType & 4095) == 129 || i5 == 225 || i5 == 18) {
                        AbstractC3478c.b(editorInfo, null, 0, 0);
                    } else if (length <= 2048) {
                        AbstractC3478c.b(editorInfo, text, i13, i11);
                    } else {
                        int i14 = i11 - i13;
                        int i15 = i14 > 1024 ? 0 : i14;
                        int i16 = 2048 - i15;
                        int iMin = Math.min(text.length() - i11, i16 - Math.min(i13, (int) (i16 * 0.8d)));
                        int iMin2 = Math.min(i13, i16 - iMin);
                        int i17 = i13 - iMin2;
                        if (Character.isLowSurrogate(text.charAt(i17))) {
                            i17++;
                            iMin2--;
                        }
                        if (Character.isHighSurrogate(text.charAt((i11 + iMin) - 1))) {
                            iMin--;
                        }
                        int i18 = iMin2 + i15;
                        AbstractC3478c.b(editorInfo, i15 != i14 ? TextUtils.concat(text.subSequence(i17, i17 + iMin2), text.subSequence(i11, iMin + i11)) : text.subSequence(i17, i18 + iMin + i17), iMin2, i18);
                    }
                }
            }
        }
        AbstractC3935e.H(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
        V v2 = this.f43721b;
        if (v2 == null || v1.f43928b) {
            return;
        }
        v2.f43715i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i5, int i10) {
        f();
        super.onMeasure(i5, i10);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
        super.onTextChanged(charSequence, i5, i10, i11);
        V v2 = this.f43721b;
        if (v2 == null || v1.f43928b) {
            return;
        }
        C3811f0 c3811f0 = v2.f43715i;
        if (c3811f0.f()) {
            c3811f0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i5, int i10, int i11, int i12) {
        if (v1.f43928b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i5, i10, i11, i12);
            return;
        }
        V v2 = this.f43721b;
        if (v2 != null) {
            v2.h(i5, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i5) {
        if (v1.f43928b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i5);
            return;
        }
        V v2 = this.f43721b;
        if (v2 != null) {
            v2.i(iArr, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i5) {
        if (v1.f43928b) {
            super.setAutoSizeTextTypeWithDefaults(i5);
            return;
        }
        V v2 = this.f43721b;
        if (v2 != null) {
            v2.j(i5);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        R1.q qVar = this.f43720a;
        if (qVar != null) {
            qVar.u();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        R1.q qVar = this.f43720a;
        if (qVar != null) {
            qVar.v(i5);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f43721b;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f43721b;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f43721b;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f43721b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i5);
        } else {
            AbstractC3935e.L(this, i5);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i5);
        } else {
            AbstractC3935e.M(this, i5);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i5) {
        AbstractC3076d.c(i5);
        if (i5 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i5 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(i1.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC3935e.A(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        R1.q qVar = this.f43720a;
        if (qVar != null) {
            qVar.y(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        R1.q qVar = this.f43720a;
        if (qVar != null) {
            qVar.z(mode);
        }
    }

    @Override // n1.InterfaceC3577k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v2 = this.f43721b;
        v2.k(colorStateList);
        v2.b();
    }

    @Override // n1.InterfaceC3577k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v2 = this.f43721b;
        v2.l(mode);
        v2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        V v2 = this.f43721b;
        if (v2 != null) {
            v2.g(context, i5);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C3845x c3845x;
        if (Build.VERSION.SDK_INT >= 28 || (c3845x = this.f43722c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c3845x.f43941c = textClassifier;
        }
    }

    public void setTextFuture(Future<i1.d> future) {
        this.f43726g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(i1.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f36712b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i5 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i5 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i5 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i5 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i5 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i5 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i5 = 7;
            }
        }
        setTextDirection(i5);
        getPaint().set(cVar.f36711a);
        setBreakStrategy(cVar.f36713c);
        setHyphenationFrequency(cVar.f36714d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i5, float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2 = v1.f43928b;
        if (z2) {
            super.setTextSize(i5, f10);
            return;
        }
        V v2 = this.f43721b;
        if (v2 == null || z2) {
            return;
        }
        C3811f0 c3811f0 = v2.f43715i;
        if (c3811f0.f()) {
            return;
        }
        c3811f0.g(f10, i5);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i5) {
        Typeface typefaceCreate;
        if (this.f43724e) {
            return;
        }
        if (typeface == null || i5 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC3935e abstractC3935e = AbstractC1497f.f19128a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i5);
        }
        this.f43724e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i5);
        } finally {
            this.f43724e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Context context, AttributeSet attributeSet, int i5) throws Resources.NotFoundException {
        super(context, attributeSet, i5);
        f1.a(context);
        this.f43724e = false;
        this.f43725f = null;
        e1.a(getContext(), this);
        R1.q qVar = new R1.q(this);
        this.f43720a = qVar;
        qVar.t(attributeSet, i5);
        V v2 = new V(this);
        this.f43721b = v2;
        v2.f(attributeSet, i5);
        v2.b();
        C3845x c3845x = new C3845x();
        c3845x.f43940b = this;
        this.f43722c = c3845x;
        getEmojiTextViewHelper().b(attributeSet, i5);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i5, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i5 != 0 ? Fe.g.B(context, i5) : null, i10 != 0 ? Fe.g.B(context, i10) : null, i11 != 0 ? Fe.g.B(context, i11) : null, i12 != 0 ? Fe.g.B(context, i12) : null);
        V v2 = this.f43721b;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i5, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i5 != 0 ? Fe.g.B(context, i5) : null, i10 != 0 ? Fe.g.B(context, i10) : null, i11 != 0 ? Fe.g.B(context, i11) : null, i12 != 0 ? Fe.g.B(context, i12) : null);
        V v2 = this.f43721b;
        if (v2 != null) {
            v2.b();
        }
    }
}
