package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* loaded from: classes.dex */
public final class M extends Spinner {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f43672i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final R1.q f43673a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f43674b;

    /* renamed from: c, reason: collision with root package name */
    public final C3797C f43675c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f43676d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f43677e;

    /* renamed from: f, reason: collision with root package name */
    public final L f43678f;

    /* renamed from: g, reason: collision with root package name */
    public int f43679g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f43680h;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public M(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130969689(0x7f040459, float:1.7548067E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f43680h = r1
            android.content.Context r1 = r12.getContext()
            q.e1.a(r1, r12)
            int[] r1 = i.AbstractC2820a.f36458v
            r2 = 0
            md.J r3 = md.J.s(r13, r14, r1, r0, r2)
            R1.q r4 = new R1.q
            r4.<init>(r12)
            r12.f43673a = r4
            java.lang.Object r4 = r3.f40581b
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r5 = 4
            int r5 = r4.getResourceId(r5, r2)
            if (r5 == 0) goto L35
            o.d r6 = new o.d
            r6.<init>(r13, r5)
            r12.f43674b = r6
            goto L37
        L35:
            r12.f43674b = r13
        L37:
            r5 = -1
            r6 = 0
            int[] r7 = q.M.f43672i     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r2)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r2)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r5 = r7.getInt(r2, r2)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r13 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r13 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L9d
            if (r5 == r8) goto L6a
            goto Laa
        L6a:
            q.J r5 = new q.J
            android.content.Context r9 = r12.f43674b
            r5.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f43674b
            md.J r1 = md.J.s(r9, r14, r1, r0, r2)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f40581b
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f43679g = r9
            android.graphics.drawable.Drawable r9 = r1.n(r8)
            r5.l(r9)
            java.lang.String r7 = r4.getString(r7)
            r5.f43660D = r7
            r1.v()
            r12.f43678f = r5
            q.C r1 = new q.C
            r1.<init>(r12, r12, r5)
            r12.f43675c = r1
            goto Laa
        L9d:
            q.G r1 = new q.G
            r1.<init>(r12)
            r12.f43678f = r1
            java.lang.String r5 = r4.getString(r7)
            r1.f43654c = r5
        Laa:
            java.lang.CharSequence[] r1 = r4.getTextArray(r2)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r13, r4, r1)
            r13 = 2131558611(0x7f0d00d3, float:1.8742543E38)
            r2.setDropDownViewResource(r13)
            r12.setAdapter(r2)
        Lc1:
            r3.v()
            r12.f43677e = r8
            android.widget.SpinnerAdapter r13 = r12.f43676d
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.f43676d = r6
        Lcf:
            R1.q r13 = r12.f43673a
            r13.t(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q.M.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i5 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f43680h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        R1.q qVar = this.f43673a;
        if (qVar != null) {
            qVar.n();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        L l10 = this.f43678f;
        return l10 != null ? l10.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        L l10 = this.f43678f;
        return l10 != null ? l10.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f43678f != null ? this.f43679g : super.getDropDownWidth();
    }

    public final L getInternalPopup() {
        return this.f43678f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        L l10 = this.f43678f;
        return l10 != null ? l10.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f43674b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        L l10 = this.f43678f;
        return l10 != null ? l10.d() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        R1.q qVar = this.f43673a;
        if (qVar != null) {
            return qVar.q();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        R1.q qVar = this.f43673a;
        if (qVar != null) {
            return qVar.r();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        L l10 = this.f43678f;
        if (l10 == null || !l10.a()) {
            return;
        }
        l10.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        if (this.f43678f == null || View.MeasureSpec.getMode(i5) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i5)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        K k = (K) parcelable;
        super.onRestoreInstanceState(k.getSuperState());
        if (!k.f43665a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new E9.d(this, 5));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        K k = new K(super.onSaveInstanceState());
        L l10 = this.f43678f;
        k.f43665a = l10 != null && l10.a();
        return k;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3797C c3797c = this.f43675c;
        if (c3797c == null || !c3797c.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        L l10 = this.f43678f;
        if (l10 == null) {
            return super.performClick();
        }
        if (l10.a()) {
            return true;
        }
        this.f43678f.i(AbstractC3799E.b(this), AbstractC3799E.a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        R1.q qVar = this.f43673a;
        if (qVar != null) {
            qVar.u();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        R1.q qVar = this.f43673a;
        if (qVar != null) {
            qVar.v(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i5) {
        L l10 = this.f43678f;
        if (l10 == null) {
            super.setDropDownHorizontalOffset(i5);
        } else {
            l10.h(i5);
            l10.c(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i5) {
        L l10 = this.f43678f;
        if (l10 != null) {
            l10.g(i5);
        } else {
            super.setDropDownVerticalOffset(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i5) {
        if (this.f43678f != null) {
            this.f43679g = i5;
        } else {
            super.setDropDownWidth(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        L l10 = this.f43678f;
        if (l10 != null) {
            l10.l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i5) {
        setPopupBackgroundDrawable(Fe.g.B(getPopupContext(), i5));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        L l10 = this.f43678f;
        if (l10 != null) {
            l10.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        R1.q qVar = this.f43673a;
        if (qVar != null) {
            qVar.y(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        R1.q qVar = this.f43673a;
        if (qVar != null) {
            qVar.z(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f43677e) {
            this.f43676d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        L l10 = this.f43678f;
        if (l10 != null) {
            Context context = this.f43674b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            H h10 = new H();
            h10.f43656a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                h10.f43657b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                F.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            l10.k(h10);
        }
    }
}
