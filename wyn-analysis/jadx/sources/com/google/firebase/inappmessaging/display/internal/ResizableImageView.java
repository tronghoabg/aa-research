package com.google.firebase.inappmessaging.display.internal;

import D9.e;
import D9.n;
import R8.v;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import q.C3839u;

/* loaded from: classes4.dex */
public class ResizableImageView extends C3839u {

    /* renamed from: d, reason: collision with root package name */
    public final int f27336d;

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f27336d = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    public final n c(int i5, int i10) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (i5 > maxWidth) {
            e.b("Image: capping width", maxWidth);
            i10 = (i10 * maxWidth) / i5;
            i5 = maxWidth;
        }
        if (i10 > maxHeight) {
            e.b("Image: capping height", maxHeight);
            i5 = (i5 * maxHeight) / i10;
        } else {
            maxHeight = i10;
        }
        return new n(i5, maxHeight, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        Drawable drawable = getDrawable();
        boolean adjustViewBounds = getAdjustViewBounds();
        if (drawable == null || !adjustViewBounds) {
            return;
        }
        e.c("Image: intrinsic width, height", drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        n nVarC = c((int) Math.ceil((r10 * this.f27336d) / 160), (int) Math.ceil((r9 * this.f27336d) / 160));
        int i11 = nVarC.f2592b;
        int i12 = nVarC.f2593c;
        e.c("Image: new target dimensions", i11, i12);
        setMeasuredDimension(i11, i12);
        int iMax = Math.max(getMinimumWidth(), getSuggestedMinimumWidth());
        int iMax2 = Math.max(getMinimumHeight(), getSuggestedMinimumHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = iMax;
        float f11 = iMax2;
        e.c("Image: min width, height", f10, f11);
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        e.c("Image: actual width, height", f12, f13);
        float f14 = measuredWidth < iMax ? f10 / f12 : 1.0f;
        float f15 = measuredHeight < iMax2 ? f11 / f13 : 1.0f;
        if (f14 <= f15) {
            f14 = f15;
        }
        if (f14 > 1.0d) {
            int iCeil = (int) Math.ceil(f12 * f14);
            int iCeil2 = (int) Math.ceil(f13 * f14);
            StringBuilder sbH = v.h("Measured dimension (", measuredWidth, "x", measuredHeight, ") too small.  Resizing to ");
            sbH.append(iCeil);
            sbH.append("x");
            sbH.append(iCeil2);
            e.a(sbH.toString());
            n nVarC2 = c(iCeil, iCeil2);
            setMeasuredDimension(nVarC2.f2592b, nVarC2.f2593c);
        }
    }
}
