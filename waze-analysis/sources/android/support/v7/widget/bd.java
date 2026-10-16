package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.core.view.TintableBackgroundView;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class bd extends Spinner implements TintableBackgroundView {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f1113c = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    int f1114a;

    /* renamed from: b, reason: collision with root package name */
    final Rect f1115b;

    /* renamed from: d, reason: collision with root package name */
    private final x f1116d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f1117e;

    /* renamed from: f, reason: collision with root package name */
    private cr f1118f;

    /* renamed from: g, reason: collision with root package name */
    private SpinnerAdapter f1119g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f1120h;

    /* renamed from: i, reason: collision with root package name */
    private bc f1121i;

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00d1: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:210), block:B:39:0x00d1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bd(android.content.Context r10, android.util.AttributeSet r11) throws java.lang.Throwable {
        /*
            r9 = this;
            r0 = 2130969933(0x7f04054d, float:1.7548562E38)
            r9.<init>(r10, r11, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.f1115b = r1
            android.content.Context r1 = r9.getContext()
            android.support.v7.widget.fz.d(r9, r1)
            int[] r1 = android.support.v7.a.a.u
            r2 = 0
            android.support.v7.widget.gc r1 = android.support.v7.widget.gc.n(r10, r11, r1, r0, r2)
            android.support.v7.widget.x r3 = new android.support.v7.widget.x
            r3.<init>(r9)
            r9.f1116d = r3
            r3 = 4
            int r3 = r1.f(r3, r2)
            if (r3 == 0) goto L31
            androidx.appcompat.view.ContextThemeWrapper r4 = new androidx.appcompat.view.ContextThemeWrapper
            r4.<init>(r10, r3)
            r9.f1117e = r4
            goto L33
        L31:
            r9.f1117e = r10
        L33:
            r3 = 1
            r4 = 0
            int[] r5 = android.support.v7.widget.bd.f1113c     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L97
            android.content.res.TypedArray r5 = r10.obtainStyledAttributes(r11, r5, r0, r2)     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L97
            boolean r6 = r5.hasValue(r2)     // Catch: java.lang.Exception -> L93 java.lang.Throwable -> Ld0
            if (r6 == 0) goto L46
            int r6 = r5.getInt(r2, r2)     // Catch: java.lang.Exception -> L93 java.lang.Throwable -> Ld0
            goto L47
        L46:
            r6 = -1
        L47:
            if (r5 == 0) goto L4c
            r5.recycle()
        L4c:
            r5 = 2
            if (r6 == 0) goto L84
            if (r6 == r3) goto L52
            goto La5
        L52:
            android.support.v7.widget.ba r6 = new android.support.v7.widget.ba
            android.content.Context r7 = r9.f1117e
            r6.<init>(r9, r7, r11)
            android.content.Context r7 = r9.f1117e
            int[] r8 = android.support.v7.a.a.u
            android.support.v7.widget.gc r2 = android.support.v7.widget.gc.n(r7, r11, r8, r0, r2)
            r7 = 3
            r8 = -2
            int r7 = r2.e(r7, r8)
            r9.f1114a = r7
            android.graphics.drawable.Drawable r7 = r2.j(r3)
            r6.f(r7)
            java.lang.String r5 = r1.p(r5)
            r6.i(r5)
            r2.q()
            r9.f1121i = r6
            android.support.v7.widget.at r2 = new android.support.v7.widget.at
            r2.<init>(r9, r9, r6)
            r9.f1118f = r2
            goto La5
        L84:
            android.support.v7.widget.av r2 = new android.support.v7.widget.av
            r2.<init>(r9)
            r9.f1121i = r2
            java.lang.String r5 = r1.p(r5)
            r2.i(r5)
            goto La5
        L93:
            r2 = move-exception
            goto L99
        L95:
            r9 = move-exception
            goto Ld2
        L97:
            r2 = move-exception
            r5 = r4
        L99:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r2)     // Catch: java.lang.Throwable -> Ld0
            if (r5 == 0) goto La5
            r5.recycle()
        La5:
            java.lang.CharSequence[] r2 = r1.w()
            if (r2 == 0) goto Lbc
            android.widget.ArrayAdapter r5 = new android.widget.ArrayAdapter
            r6 = 17367048(0x1090008, float:2.5162948E-38)
            r5.<init>(r10, r6, r2)
            r10 = 2131558749(0x7f0d015d, float:1.8742823E38)
            r5.setDropDownViewResource(r10)
            r9.setAdapter(r5)
        Lbc:
            r1.q()
            r9.f1120h = r3
            android.widget.SpinnerAdapter r10 = r9.f1119g
            if (r10 == 0) goto Lca
            r9.setAdapter(r10)
            r9.f1119g = r4
        Lca:
            android.support.v7.widget.x r9 = r9.f1116d
            r9.d(r11, r0)
            return
        Ld0:
            r9 = move-exception
            r4 = r5
        Ld2:
            if (r4 == 0) goto Ld7
            r4.recycle()
        Ld7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.bd.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        int iMax2 = Math.max(0, iMax - (15 - (iMin - iMax)));
        View view = null;
        int iMax3 = 0;
        while (iMax2 < iMin) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax2);
            int i3 = itemViewType != i2 ? itemViewType : i2;
            if (itemViewType != i2) {
                view = null;
            }
            view = spinnerAdapter.getView(iMax2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax3 = Math.max(iMax3, view.getMeasuredWidth());
            iMax2++;
            i2 = i3;
        }
        if (drawable == null) {
            return iMax3;
        }
        Rect rect = this.f1115b;
        drawable.getPadding(rect);
        return iMax3 + rect.left + rect.right;
    }

    final bc b() {
        return this.f1121i;
    }

    final void c() {
        this.f1121i.l(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f1116d;
        if (xVar != null) {
            xVar.c();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        bc bcVar = this.f1121i;
        return bcVar != null ? bcVar.bi() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        bc bcVar = this.f1121i;
        return bcVar != null ? bcVar.bj() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.f1121i != null ? this.f1114a : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        bc bcVar = this.f1121i;
        return bcVar != null ? bcVar.c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.f1117e;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        bc bcVar = this.f1121i;
        return bcVar != null ? bcVar.d() : super.getPrompt();
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final ColorStateList getSupportBackgroundTintList() {
        x xVar = this.f1116d;
        if (xVar != null) {
            return xVar.a();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.f1116d;
        if (xVar != null) {
            return xVar.b();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bc bcVar = this.f1121i;
        if (bcVar == null || !bcVar.u()) {
            return;
        }
        this.f1121i.k();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1121i == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        bb bbVar = (bb) parcelable;
        super.onRestoreInstanceState(bbVar.getSuperState());
        if (!bbVar.f1112a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new au(this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        bb bbVar = new bb(super.onSaveInstanceState());
        bc bcVar = this.f1121i;
        boolean z = false;
        if (bcVar != null && bcVar.u()) {
            z = true;
        }
        bbVar.f1112a = z;
        return bbVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cr crVar = this.f1118f;
        if (crVar == null || !crVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        bc bcVar = this.f1121i;
        if (bcVar == null) {
            return super.performClick();
        }
        if (bcVar.u()) {
            return true;
        }
        c();
        return true;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1120h) {
            this.f1119g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1121i != null) {
            Context context = this.f1117e;
            if (context == null) {
                context = getContext();
            }
            this.f1121i.e(new aw(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x xVar = this.f1116d;
        if (xVar != null) {
            xVar.i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        x xVar = this.f1116d;
        if (xVar != null) {
            xVar.e(i2);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i2) {
        bc bcVar = this.f1121i;
        if (bcVar == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            bcVar.h(i2);
            this.f1121i.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i2) {
        bc bcVar = this.f1121i;
        if (bcVar != null) {
            bcVar.j(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i2) {
        if (this.f1121i != null) {
            this.f1114a = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        bc bcVar = this.f1121i;
        if (bcVar != null) {
            bcVar.f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(android.support.a.i.d(this.f1117e, i2));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        bc bcVar = this.f1121i;
        if (bcVar != null) {
            bcVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x xVar = this.f1116d;
        if (xVar != null) {
            xVar.g(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x xVar = this.f1116d;
        if (xVar != null) {
            xVar.h(mode);
        }
    }
}
