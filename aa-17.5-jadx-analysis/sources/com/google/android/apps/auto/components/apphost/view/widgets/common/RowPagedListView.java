package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.auto.sdk.ui.CarLayoutManager;
import defpackage.hif;
import defpackage.kdw;
import defpackage.kdx;
import defpackage.kek;
import defpackage.mo;
import defpackage.owu;
import defpackage.yfl;
import defpackage.yfq;
import defpackage.yls;
import defpackage.yph;

/* loaded from: classes2.dex */
public class RowPagedListView extends kek {
    static {
        yph.c("CarApp.H.Tem");
    }

    public RowPagedListView(Context context) {
        super(context);
    }

    private static kdx f(RecyclerView recyclerView, int i) {
        mo moVarH = recyclerView.h(i);
        if (moVarH == null) {
            return null;
        }
        int i2 = moVarH.f;
        int i3 = kdw.g;
        if (i2 == 1 || i2 == 2) {
            return (kdx) moVarH.a;
        }
        return null;
    }

    @Override // defpackage.kek
    protected final yfq a() {
        hif hifVarA;
        int i;
        kdx kdxVarF;
        owu owuVarI = i();
        if (((kdw) owuVarI.m) == null) {
            int i2 = yfq.d;
            return yls.a;
        }
        CarLayoutManager carLayoutManager = this.g;
        int iC = owuVarI.c(carLayoutManager.K());
        int iC2 = owuVarI.c(carLayoutManager.N());
        if (iC2 < r1.a() - 1 && (kdxVarF = f(owuVarI, (i = iC2 + 1))) != null && kdxVarF.f()) {
            iC2 = i;
        }
        int i3 = yfq.d;
        yfl yflVar = new yfl(4);
        if (iC != -1 && iC2 != -1 && iC <= iC2) {
            while (iC <= iC2) {
                kdx kdxVarF2 = f(owuVarI, iC);
                if (kdxVarF2 != null && (hifVarA = kdxVarF2.a()) != null) {
                    yflVar.i(hifVarA.a);
                }
                iC++;
            }
        }
        return yflVar.g();
    }

    @Override // com.google.android.apps.auto.sdk.ui.PagedListView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View viewU;
        CarLayoutManager carLayoutManager = this.g;
        int iS = carLayoutManager.s();
        super.onLayout(z, i, i2, i3, i4);
        if (iS >= 0 && iS < carLayoutManager.av() && (viewU = carLayoutManager.U(iS)) != null) {
            viewU.requestFocus();
        }
        b();
    }

    public RowPagedListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RowPagedListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RowPagedListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
