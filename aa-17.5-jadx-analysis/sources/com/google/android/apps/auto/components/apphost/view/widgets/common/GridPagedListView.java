package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.auto.sdk.ui.CarLayoutManager;
import com.google.android.projection.gearhead.R;
import defpackage.kdk;
import defpackage.kek;
import defpackage.mo;
import defpackage.owu;
import defpackage.yfl;
import defpackage.yfq;
import defpackage.yls;
import defpackage.yph;
import java.util.List;

/* loaded from: classes2.dex */
public class GridPagedListView extends kek {
    public final int a;
    public final int b;
    public boolean c;

    static {
        yph.c("CarApp.H.Tem");
    }

    public GridPagedListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = getResources().getDimensionPixelSize(R.dimen.template_padding_1);
        this.b = getResources().getDimensionPixelSize(R.dimen.template_padding_3);
    }

    @Override // defpackage.kek
    protected final yfq a() {
        int i;
        mo moVarH;
        owu owuVarI = i();
        kdk kdkVar = (kdk) owuVarI.m;
        if (kdkVar == null) {
            int i2 = yfq.d;
            return yls.a;
        }
        CarLayoutManager carLayoutManager = this.g;
        int iC = owuVarI.c(carLayoutManager.K());
        int iC2 = owuVarI.c(carLayoutManager.N());
        if (iC2 < kdkVar.a() - 1 && (moVarH = owuVarI.h((i = iC2 + 1))) != null && moVarH.f == 1 && ((GridRowContainerView) moVarH.a).a.getGlobalVisibleRect(new Rect())) {
            iC2 = i;
        }
        int i3 = yfq.d;
        yfl yflVar = new yfl(4);
        if (iC != -1 && iC2 != -1 && iC <= iC2) {
            List list = kdkVar.a;
            while (iC <= iC2) {
                yflVar.i(list.get(iC));
                iC++;
            }
        }
        return yflVar.g();
    }

    @Override // com.google.android.apps.auto.sdk.ui.PagedListView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        GridRowContainerView gridRowContainerView;
        View viewB;
        CarLayoutManager carLayoutManager = this.g;
        int iS = carLayoutManager.s();
        int iA = -1;
        if (iS >= 0) {
            View viewU = carLayoutManager.U(iS);
            if (viewU instanceof GridRowContainerView) {
                iA = ((GridRowContainerView) viewU).a();
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        if (iA >= 0 && iS < carLayoutManager.av() && (gridRowContainerView = (GridRowContainerView) carLayoutManager.U(iS)) != null && (viewB = gridRowContainerView.b(iA)) != null) {
            viewB.requestFocus();
        }
        b();
    }

    public GridPagedListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridPagedListView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public GridPagedListView(Context context) {
        this(context, null);
    }
}
