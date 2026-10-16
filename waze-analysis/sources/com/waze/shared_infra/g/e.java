package com.waze.shared_infra.g;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {
    static final WindowInsetsCompat a(d dVar, ViewGroup viewGroup, View view, d dVar2, d dVar3, View view2, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(DisplayStrings.DS_CLOSE);
        Context context = view2.getContext();
        x.c(context);
        x.f(context, "<this>");
        if (context.getResources().getConfiguration().orientation == 1) {
            ViewGroup viewGroup2 = viewGroup;
            viewGroup2.setPadding(dVar.b() + insets.left, dVar.d() + insets.top, dVar.c() + insets.right, viewGroup2.getPaddingBottom());
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), dVar2.a() + insets.bottom);
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            marginLayoutParams2.leftMargin = dVar3.b();
            marginLayoutParams2.rightMargin = dVar3.c();
            viewGroup2.setLayoutParams(marginLayoutParams);
        } else {
            Insets insets2 = windowInsetsCompat.getInsets(DisplayStrings.DS_CATEGORIES);
            Insets insets3 = windowInsetsCompat.getInsets(2);
            ViewGroup viewGroup3 = viewGroup;
            viewGroup3.setPadding(dVar.b() + insets2.left, dVar.d() + insets2.top + insets3.top, dVar.c() + insets2.right, viewGroup3.getPaddingBottom());
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), dVar2.a() + insets2.bottom + insets3.bottom);
            int iB = h.h.a.b(context.getResources().getDisplayMetrics().density * 16.0f);
            ViewGroup.LayoutParams layoutParams2 = viewGroup3.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2;
            ViewGroup.MarginLayoutParams marginLayoutParams4 = marginLayoutParams3;
            x.f(context, "<this>");
            Object systemService = context.getSystemService("display");
            x.d(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
            int rotation = ((DisplayManager) systemService).getDisplay(0).getRotation();
            com.waze.ad.a.a aVar = rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? null : com.waze.ad.a.a.f13881d : com.waze.ad.a.a.f13879b : com.waze.ad.a.a.f13880c : com.waze.ad.a.a.f13878a;
            if (insets3.left > 0 || aVar == com.waze.ad.a.a.f13881d) {
                marginLayoutParams4.leftMargin = dVar3.b() + insets3.left + iB;
            }
            if (insets3.right > 0 || aVar == com.waze.ad.a.a.f13880c) {
                marginLayoutParams4.rightMargin = dVar3.c() + insets3.right + iB;
            }
            viewGroup3.setLayoutParams(marginLayoutParams3);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    public static final void b(final ViewGroup viewGroup, final View view) {
        x.f(viewGroup, "root");
        x.f(view, "content");
        ViewGroup viewGroup2 = viewGroup;
        final d dVarI = i(viewGroup2);
        x.f(viewGroup2, "view");
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i3 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = viewGroup2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i4 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = viewGroup2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        final d dVar = new d(i2, i3, i4, marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
        final d dVarI2 = i(view);
        ViewCompat.setOnApplyWindowInsetsListener(viewGroup2, new OnApplyWindowInsetsListener() { // from class: com.waze.shared_infra.g.b
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return e.a(dVarI, viewGroup, view, dVarI2, dVar, view2, windowInsetsCompat);
            }
        });
    }

    public static final void c(View view) {
        x.f(view, "view");
        e(view, true, true, true, true);
    }

    public static final void d(View view, final View view2) {
        x.f(view, "contentView");
        x.f(view2, "bottomInsetTarget");
        final d dVarI = i(view);
        final d dVarI2 = i(view2);
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: com.waze.shared_infra.g.c
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view3, WindowInsetsCompat windowInsetsCompat) {
                d dVar = dVarI;
                Insets insets = windowInsetsCompat.getInsets(DisplayStrings.DS_CLOSE);
                view3.setPadding(dVar.b() + insets.left, dVar.d() + insets.top, dVar.c() + insets.right, dVar.a());
                d dVar2 = dVarI2;
                view2.setPadding(dVar2.b(), dVar2.d(), dVar2.c(), dVar2.a() + insets.bottom);
                return WindowInsetsCompat.CONSUMED;
            }
        });
    }

    public static final void e(View view, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        x.f(view, "view");
        final d dVarI = i(view);
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: com.waze.shared_infra.g.a
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                d dVar = dVarI;
                Insets insets = windowInsetsCompat.getInsets(DisplayStrings.DS_CLOSE);
                int iB = dVar.b();
                Integer numValueOf = Integer.valueOf(insets.left);
                numValueOf.intValue();
                if (true != z) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                boolean z5 = z2;
                int i2 = iB + iIntValue;
                int iD = dVar.d();
                Integer numValueOf2 = Integer.valueOf(insets.top);
                numValueOf2.intValue();
                if (true != z5) {
                    numValueOf2 = null;
                }
                int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                boolean z6 = z3;
                int i3 = iD + iIntValue2;
                int iC = dVar.c();
                Integer numValueOf3 = Integer.valueOf(insets.right);
                numValueOf3.intValue();
                if (true != z6) {
                    numValueOf3 = null;
                }
                int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                boolean z7 = z4;
                int i4 = iC + iIntValue3;
                int iA = dVar.a();
                Integer numValueOf4 = Integer.valueOf(insets.bottom);
                numValueOf4.intValue();
                Integer num = true == z7 ? numValueOf4 : null;
                view2.setPadding(i2, i3, i4, iA + (num != null ? num.intValue() : 0));
                return WindowInsetsCompat.CONSUMED;
            }
        });
    }

    public static final void f(Window window) {
        x.f(window, "window");
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.addFlags(Integer.MIN_VALUE);
    }

    public static final com.waze.shared_infra.h.a h(List list) {
        x.f(list, "<this>");
        if (list.isEmpty()) {
            return com.waze.shared_infra.h.a.f37868a;
        }
        int iC = ((com.waze.shared_infra.h.c) i.P(list)).c();
        int iD = ((com.waze.shared_infra.h.c) i.P(list)).d();
        int size = list.size();
        int iMin = iD;
        int iMin2 = iC;
        int iMax = iMin;
        for (int i2 = 1; i2 < size; i2++) {
            com.waze.shared_infra.h.c cVar = (com.waze.shared_infra.h.c) list.get(i2);
            iMin2 = Math.min(iMin2, cVar.c());
            iC = Math.max(iC, cVar.c());
            iMin = Math.min(iMin, cVar.d());
            iMax = Math.max(iMax, cVar.d());
        }
        return new com.waze.shared_infra.h.a(iC, iMin2, iMax, iMin);
    }

    public static final d i(View view) {
        x.f(view, "view");
        return new d(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final com.waze.shared_infra.e.a j(byte[] bArr) {
        x.f(bArr, "<this>");
        return new com.waze.shared_infra.e.a(bArr);
    }
}
