package com.waze.trip_overview.c.a;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f41268a;

    x(ab abVar) {
        this.f41268a = abVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        int iIntValue = ((Number) obj).intValue();
        ComposeView composeViewD = this.f41268a.D();
        ViewGroup.LayoutParams layoutParams = composeViewD.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = iIntValue;
        composeViewD.setLayoutParams(layoutParams2);
        return h.ab.f48028a;
    }
}
