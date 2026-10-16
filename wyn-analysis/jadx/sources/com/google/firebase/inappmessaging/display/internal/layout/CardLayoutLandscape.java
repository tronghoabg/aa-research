package com.google.firebase.inappmessaging.display.internal.layout;

import D9.e;
import Fe.b;
import H9.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.wynauto.wyn.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class CardLayoutLandscape extends a {

    /* renamed from: e, reason: collision with root package name */
    public View f27337e;

    /* renamed from: f, reason: collision with root package name */
    public View f27338f;

    /* renamed from: g, reason: collision with root package name */
    public View f27339g;

    /* renamed from: h, reason: collision with root package name */
    public View f27340h;

    public CardLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // H9.a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        e.a("Layout image");
        int iE = a.e(this.f27337e);
        a.f(this.f27337e, 0, 0, iE, a.d(this.f27337e));
        e.a("Layout title");
        int iD = a.d(this.f27338f);
        a.f(this.f27338f, iE, 0, measuredWidth, iD);
        e.a("Layout scroll");
        a.f(this.f27339g, iE, iD, measuredWidth, a.d(this.f27339g) + iD);
        e.a("Layout action bar");
        a.f(this.f27340h, iE, measuredHeight - a.d(this.f27340h), measuredWidth, measuredHeight);
    }

    @Override // H9.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        this.f27337e = c(R.id.image_view);
        this.f27338f = c(R.id.message_title);
        this.f27339g = c(R.id.body_scroll);
        View viewC = c(R.id.action_bar);
        this.f27340h = viewC;
        int iMax = 0;
        List listAsList = Arrays.asList(this.f27338f, this.f27339g, viewC);
        int iB = b(i5);
        int iA = a(i10);
        int iRound = Math.round(((int) (0.6d * iB)) / 4) * 4;
        e.a("Measuring image");
        b.I(this.f27337e, iB, iA, Integer.MIN_VALUE, 1073741824);
        if (a.e(this.f27337e) > iRound) {
            e.a("Image exceeded maximum width, remeasuring image");
            b.I(this.f27337e, iRound, iA, 1073741824, Integer.MIN_VALUE);
        }
        int iD = a.d(this.f27337e);
        int iE = a.e(this.f27337e);
        int i11 = iB - iE;
        float f10 = iE;
        e.c("Max col widths (l, r)", f10, i11);
        e.a("Measuring title");
        b.J(this.f27338f, i11, iD);
        e.a("Measuring action bar");
        b.J(this.f27340h, i11, iD);
        e.a("Measuring scroll view");
        b.I(this.f27339g, i11, (iD - a.d(this.f27338f)) - a.d(this.f27340h), Integer.MIN_VALUE, 1073741824);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            iMax = Math.max(a.e((View) it.next()), iMax);
        }
        e.c("Measured columns (l, r)", f10, iMax);
        int i12 = iE + iMax;
        e.c("Measured dims", i12, iD);
        setMeasuredDimension(i12, iD);
    }
}
