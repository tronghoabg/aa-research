package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import Ef.H0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* loaded from: classes4.dex */
public final /* synthetic */ class H implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30355b;

    public /* synthetic */ H(Object obj, int i5) {
        this.f30354a = i5;
        this.f30355b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int height;
        int height2;
        switch (this.f30354a) {
            case 0:
                K3.r rVar = (K3.r) this.f30355b;
                H0 h02 = (H0) rVar.f6513c;
                if (h02 != null) {
                    h02.cancel(null);
                }
                rVar.f6513c = Ef.H.D((Kd.a) rVar.f6512b, null, new J(rVar, i5, i10, i11, i12, null), 3);
                break;
            case 1:
                s6.t tVar = (s6.t) this.f30355b;
                tVar.getClass();
                int i17 = i12 - i10;
                int i18 = i16 - i14;
                if (i11 - i5 != i15 - i13 || i17 != i18) {
                    PopupWindow popupWindow = tVar.k;
                    if (popupWindow.isShowing()) {
                        tVar.p();
                        int width = tVar.getWidth() - popupWindow.getWidth();
                        int i19 = tVar.f45247l;
                        popupWindow.update(view, width - i19, (-popupWindow.getHeight()) - i19, -1, -1);
                        break;
                    }
                }
                break;
            default:
                s6.y yVar = (s6.y) this.f30355b;
                s6.t tVar2 = yVar.f45285a;
                int width2 = (tVar2.getWidth() - tVar2.getPaddingLeft()) - tVar2.getPaddingRight();
                int height3 = (tVar2.getHeight() - tVar2.getPaddingBottom()) - tVar2.getPaddingTop();
                ViewGroup viewGroup = yVar.f45287c;
                int iC = s6.y.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iC, s6.y.c(yVar.k) + s6.y.c(yVar.f45293i));
                ViewGroup viewGroup2 = yVar.f45288d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z2 = width2 <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (yVar.f45282A != z2) {
                    yVar.f45282A = z2;
                    view.post(new s6.u(yVar, 1));
                }
                boolean z10 = i11 - i5 != i15 - i13;
                if (!yVar.f45282A && z10) {
                    view.post(new s6.u(yVar, 2));
                    break;
                }
                break;
        }
    }
}
