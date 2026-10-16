package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes4.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f27117a;

    public b(ClockFaceView clockFaceView) {
        this.f27117a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f27117a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f27097v.f27105d) - clockFaceView.f27090D;
        if (height != clockFaceView.f27120t) {
            clockFaceView.f27120t = height;
            clockFaceView.m();
            int i5 = clockFaceView.f27120t;
            ClockHandView clockHandView = clockFaceView.f27097v;
            clockHandView.f27112l = i5;
            clockHandView.invalidate();
        }
        return true;
    }
}
