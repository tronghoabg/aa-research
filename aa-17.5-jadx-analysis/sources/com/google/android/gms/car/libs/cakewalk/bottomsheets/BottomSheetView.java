package com.google.android.gms.car.libs.cakewalk.bottomsheets;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.projection.gearhead.R;
import defpackage.onh;
import defpackage.rnq;
import defpackage.rpc;
import defpackage.rpd;
import defpackage.sss;
import defpackage.woy;

/* loaded from: classes2.dex */
public class BottomSheetView extends FrameLayout {
    public BottomSheetBehavior a;

    public BottomSheetView(Context context) {
        super(context);
    }

    public final void a(boolean z) {
        woy.aa(this.a != null, "BottomSheetView::initializeBottomSheet must be called first");
        if (z) {
            new sss().postDelayed(new rnq(this, 5), 40L);
        } else {
            this.a.U(4);
        }
    }

    public final void b(Display display, rpd rpdVar, View view) {
        if (this.a == null) {
            this.a = BottomSheetBehavior.M(this);
        }
        Context context = getContext();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        this.a.ac(displayMetrics.heightPixels - context.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_peek_height_buffer));
        this.a.T(true);
        BottomSheetBehavior bottomSheetBehavior = this.a;
        bottomSheetBehavior.w = true;
        bottomSheetBehavior.U(5);
        int identifier = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom() + (identifier > 0 ? getResources().getDimensionPixelSize(identifier) : 0));
        this.a.N(new rpc(rpdVar));
        view.setOnClickListener(new onh(this, 13));
    }

    public BottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomSheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
