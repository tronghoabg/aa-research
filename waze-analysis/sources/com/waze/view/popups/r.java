package com.waze.view.popups;

import android.app.Activity;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f45343a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f45344b;

    /* renamed from: c, reason: collision with root package name */
    private final View f45345c;

    public r(t tVar, Activity activity, View view) {
        Objects.requireNonNull(tVar);
        this.f45343a = tVar;
        this.f45344b = activity;
        this.f45345c = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        t tVar = this.f45343a;
        if (tVar.g()) {
            tVar.d();
            return;
        }
        Activity activity = this.f45344b;
        View view2 = this.f45345c;
        Rect rect = new Rect();
        if (view2.getGlobalVisibleRect(rect, null)) {
            DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            int i2 = rect2.top;
            int iCenterX = rect.centerX();
            int iCenterY = rect.centerY() - i2;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
            View view3 = tVar.f45348a;
            view3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            tVar.c(iCenterX, iCenterY, displayMetrics.heightPixels, view3.getMeasuredHeight(), view3.getMeasuredWidth(), displayMetrics);
        } else {
            com.waze.shared_infra.i.h.d("UserTooltipView", "Button was not visible!");
        }
        tVar.f();
    }
}
