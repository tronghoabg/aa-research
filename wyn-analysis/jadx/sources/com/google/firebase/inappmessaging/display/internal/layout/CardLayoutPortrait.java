package com.google.firebase.inappmessaging.display.internal.layout;

import A7.AbstractC0279p0;
import D9.e;
import Fe.b;
import H9.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.wynauto.wyn.R;

/* loaded from: classes4.dex */
public class CardLayoutPortrait extends a {

    /* renamed from: e, reason: collision with root package name */
    public View f27341e;

    /* renamed from: f, reason: collision with root package name */
    public View f27342f;

    /* renamed from: g, reason: collision with root package name */
    public View f27343g;

    /* renamed from: h, reason: collision with root package name */
    public View f27344h;

    public CardLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // H9.a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
        int size = getVisibleChildren().size();
        int measuredHeight = 0;
        for (int i13 = 0; i13 < size; i13++) {
            View view = getVisibleChildren().get(i13);
            int measuredHeight2 = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i14 = measuredHeight2 + measuredHeight;
            e.a("Layout child " + i13);
            e.c("\t(top, bottom)", (float) measuredHeight, (float) i14);
            e.c("\t(left, right)", (float) 0, (float) measuredWidth);
            view.layout(0, measuredHeight, measuredWidth, i14);
            e.c(AbstractC0279p0.i(i13, "Child ", " wants to be "), view.getMeasuredWidth(), view.getMeasuredHeight());
            measuredHeight += view.getMeasuredHeight();
        }
    }

    @Override // H9.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        this.f27341e = c(R.id.image_view);
        this.f27342f = c(R.id.message_title);
        this.f27343g = c(R.id.body_scroll);
        this.f27344h = c(R.id.action_bar);
        int iB = b(i5);
        int iA = a(i10);
        int iRound = Math.round(((int) (0.8d * iA)) / 4) * 4;
        e.a("Measuring image");
        b.I(this.f27341e, iB, iA, 1073741824, Integer.MIN_VALUE);
        if (a.d(this.f27341e) > iRound) {
            e.a("Image exceeded maximum height, remeasuring image");
            b.I(this.f27341e, iB, iRound, Integer.MIN_VALUE, 1073741824);
        }
        int iE = a.e(this.f27341e);
        e.a("Measuring title");
        b.I(this.f27342f, iE, iA, 1073741824, Integer.MIN_VALUE);
        e.a("Measuring action bar");
        b.I(this.f27344h, iE, iA, 1073741824, Integer.MIN_VALUE);
        e.a("Measuring scroll view");
        b.I(this.f27343g, iE, ((iA - a.d(this.f27341e)) - a.d(this.f27342f)) - a.d(this.f27344h), 1073741824, Integer.MIN_VALUE);
        int size = getVisibleChildren().size();
        int iD = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iD += a.d(getVisibleChildren().get(i11));
        }
        setMeasuredDimension(iE, iD);
    }
}
