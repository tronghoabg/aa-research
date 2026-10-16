package com.google.firebase.inappmessaging.display.internal.layout;

import A7.R0;
import D9.e;
import H9.a;
import I9.b;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class ModalLayoutPortrait extends a {

    /* renamed from: e, reason: collision with root package name */
    public final I9.a f27355e;

    /* renamed from: f, reason: collision with root package name */
    public int f27356f;

    public ModalLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        I9.a aVar = new I9.a();
        aVar.f5432a = new ArrayList();
        aVar.f5433b = 0;
        this.f27355e = aVar;
    }

    @Override // H9.a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        int i13;
        int i14;
        super.onLayout(z2, i5, i10, i11, i12);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int size = getVisibleChildren().size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = getVisibleChildren().get(i15);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i16 = measuredHeight + paddingTop;
            if ((layoutParams.gravity & 1) == 1) {
                int i17 = (i11 - i5) / 2;
                int i18 = measuredWidth / 2;
                i14 = i17 - i18;
                i13 = i17 + i18;
            } else {
                i13 = paddingLeft + measuredWidth;
                i14 = paddingLeft;
            }
            e.a("Layout child " + i15);
            e.c("\t(top, bottom)", (float) paddingTop, (float) i16);
            e.c("\t(left, right)", (float) i14, (float) i13);
            view.layout(i14, paddingTop, i13, i16);
            int measuredHeight2 = view.getMeasuredHeight() + paddingTop;
            if (i15 < size - 1) {
                measuredHeight2 += this.f27356f;
            }
            paddingTop = measuredHeight2;
        }
    }

    @Override // H9.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        float f10;
        super.onMeasure(i5, i10);
        this.f27356f = (int) Math.floor(TypedValue.applyDimension(1, 24, this.f4986c));
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iB = b(i5);
        int iA = a(i10);
        int size = ((getVisibleChildren().size() - 1) * this.f27356f) + paddingTop;
        I9.a aVar = this.f27355e;
        aVar.getClass();
        aVar.f5433b = iA;
        aVar.f5432a = new ArrayList();
        int iA2 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            boolean z2 = childAt.getId() == R.id.body_scroll || childAt.getId() == R.id.image_view;
            b bVar = new b();
            bVar.f5434a = childAt;
            bVar.f5435b = z2;
            bVar.f5436c = aVar.f5433b;
            aVar.f5432a.add(bVar);
        }
        e.a("Screen dimens: " + getDisplayMetrics());
        e.c("Max pct", getMaxWidthPct(), getMaxHeightPct());
        float f11 = (float) iB;
        e.c("Base dimens", f11, iA);
        Iterator it = aVar.f5432a.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            e.a("Pre-measure child");
            Fe.b.I(bVar2.f5434a, iB, iA, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        Iterator it2 = aVar.f5432a.iterator();
        int iA3 = 0;
        while (it2.hasNext()) {
            iA3 += ((b) it2.next()).a();
        }
        int i12 = iA3 + size;
        e.b("Total reserved height", size);
        e.b("Total desired height", i12);
        boolean z10 = i12 > iA;
        e.a("Total height constrained: " + z10);
        if (z10) {
            int i13 = iA - size;
            Iterator it3 = aVar.f5432a.iterator();
            int iA4 = 0;
            while (it3.hasNext()) {
                b bVar3 = (b) it3.next();
                if (!bVar3.f5435b) {
                    iA4 += bVar3.a();
                }
            }
            int i14 = i13 - iA4;
            ArrayList arrayList = new ArrayList();
            Iterator it4 = aVar.f5432a.iterator();
            while (it4.hasNext()) {
                b bVar4 = (b) it4.next();
                if (bVar4.f5435b) {
                    arrayList.add(bVar4);
                }
            }
            Collections.sort(arrayList, new R0(3));
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                iA2 += ((b) it5.next()).a();
            }
            int size2 = arrayList.size();
            if (size2 >= 6) {
                throw new IllegalStateException("VerticalViewGroupMeasure only supports up to 5 children");
            }
            float f12 = size2 - 1;
            float f13 = 0.2f;
            float f14 = 1.0f - (f12 * 0.2f);
            e.c("VVGM (minFrac, maxFrac)", 0.2f, f14);
            Iterator it6 = arrayList.iterator();
            float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            while (it6.hasNext()) {
                b bVar5 = (b) it6.next();
                float fA = bVar5.a() / iA2;
                if (fA > f14) {
                    f15 += fA - f14;
                    f10 = f14;
                } else {
                    f10 = fA;
                }
                if (fA < f13) {
                    float fMin = Math.min(f13 - fA, f15);
                    f15 -= fMin;
                    f10 = fA + fMin;
                }
                e.c("\t(desired, granted)", fA, f10);
                bVar5.f5436c = (int) (f10 * i14);
                f13 = 0.2f;
            }
        }
        int i15 = iB - paddingLeft;
        Iterator it7 = aVar.f5432a.iterator();
        while (it7.hasNext()) {
            b bVar6 = (b) it7.next();
            e.a("Measuring child");
            Fe.b.I(bVar6.f5434a, i15, bVar6.f5436c, Integer.MIN_VALUE, Integer.MIN_VALUE);
            size += a.d(bVar6.f5434a);
        }
        e.c("Measured dims", f11, size);
        setMeasuredDimension(iB, size);
    }
}
