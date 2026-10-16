package com.google.firebase.inappmessaging.display.internal.layout;

import D9.e;
import Fe.b;
import H9.a;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.wynauto.wyn.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class ModalLayoutLandscape extends a {

    /* renamed from: e, reason: collision with root package name */
    public View f27348e;

    /* renamed from: f, reason: collision with root package name */
    public View f27349f;

    /* renamed from: g, reason: collision with root package name */
    public View f27350g;

    /* renamed from: h, reason: collision with root package name */
    public View f27351h;

    /* renamed from: i, reason: collision with root package name */
    public int f27352i;

    /* renamed from: j, reason: collision with root package name */
    public int f27353j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f27354l;

    public ModalLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // H9.a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        int i13;
        int i14;
        super.onLayout(z2, i5, i10, i11, i12);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i15 = this.k;
        int i16 = this.f27354l;
        if (i15 < i16) {
            i14 = (i16 - i15) / 2;
            i13 = 0;
        } else {
            i13 = (i15 - i16) / 2;
            i14 = 0;
        }
        e.a("Layout image");
        int i17 = i14 + paddingTop;
        int iE = a.e(this.f27348e) + paddingLeft;
        a.f(this.f27348e, paddingLeft, i17, iE, a.d(this.f27348e) + i17);
        int i18 = iE + this.f27352i;
        e.a("Layout getTitle");
        int i19 = paddingTop + i13;
        int iD = a.d(this.f27349f) + i19;
        a.f(this.f27349f, i18, i19, measuredWidth, iD);
        e.a("Layout getBody");
        int i20 = iD + (this.f27349f.getVisibility() == 8 ? 0 : this.f27353j);
        int iD2 = a.d(this.f27350g) + i20;
        a.f(this.f27350g, i18, i20, measuredWidth, iD2);
        e.a("Layout button");
        int i21 = iD2 + (this.f27350g.getVisibility() != 8 ? this.f27353j : 0);
        View view = this.f27351h;
        a.f(view, i18, i21, a.e(view) + i18, a.d(view) + i21);
    }

    @Override // H9.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        DisplayMetrics displayMetrics = this.f4986c;
        super.onMeasure(i5, i10);
        this.f27348e = c(R.id.image_view);
        this.f27349f = c(R.id.message_title);
        this.f27350g = c(R.id.body_scroll);
        this.f27351h = c(R.id.button);
        int iMax = 0;
        this.f27352i = this.f27348e.getVisibility() == 8 ? 0 : (int) Math.floor(TypedValue.applyDimension(1, 24, displayMetrics));
        this.f27353j = (int) Math.floor(TypedValue.applyDimension(1, 24, displayMetrics));
        List listAsList = Arrays.asList(this.f27349f, this.f27350g, this.f27351h);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iB = b(i5);
        int iA = a(i10) - paddingTop;
        int i11 = iB - paddingRight;
        e.a("Measuring image");
        b.J(this.f27348e, (int) (i11 * 0.4f), iA);
        int iE = a.e(this.f27348e);
        int i12 = i11 - (this.f27352i + iE);
        float f10 = iE;
        e.c("Max col widths (l, r)", f10, i12);
        Iterator it = listAsList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (((View) it.next()).getVisibility() != 8) {
                i13++;
            }
        }
        int iMax2 = Math.max(0, (i13 - 1) * this.f27353j);
        int i14 = iA - iMax2;
        e.a("Measuring getTitle");
        b.J(this.f27349f, i12, i14);
        e.a("Measuring button");
        b.J(this.f27351h, i12, i14);
        e.a("Measuring scroll view");
        b.J(this.f27350g, i12, (i14 - a.d(this.f27349f)) - a.d(this.f27351h));
        this.k = a.d(this.f27348e);
        this.f27354l = iMax2;
        Iterator it2 = listAsList.iterator();
        while (it2.hasNext()) {
            this.f27354l = a.d((View) it2.next()) + this.f27354l;
        }
        int iMax3 = Math.max(this.k + paddingTop, this.f27354l + paddingTop);
        Iterator it3 = listAsList.iterator();
        while (it3.hasNext()) {
            iMax = Math.max(a.e((View) it3.next()), iMax);
        }
        e.c("Measured columns (l, r)", f10, iMax);
        int i15 = iE + iMax + this.f27352i + paddingRight;
        e.c("Measured dims", i15, iMax3);
        setMeasuredDimension(i15, iMax3);
    }
}
