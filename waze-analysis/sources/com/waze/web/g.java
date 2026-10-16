package com.waze.web;

import android.view.ViewTreeObserver;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f45490a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f45491b;

    g(SimpleWebActivity simpleWebActivity, int i2) {
        this.f45491b = i2;
        Objects.requireNonNull(simpleWebActivity);
        this.f45490a = simpleWebActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i2 = this.f45491b;
        Object obj = this.f45490a;
        if (i2 == 0) {
            i iVar = (i) obj;
            int measuredWidth = iVar.f45494a.getMeasuredWidth();
            int measuredHeight = iVar.f45494a.getMeasuredHeight();
            if (measuredWidth <= 0 || measuredHeight <= 0) {
                return;
            }
            iVar.f45494a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            return;
        }
        SimpleWebActivity simpleWebActivity = (SimpleWebActivity) obj;
        int measuredWidth2 = simpleWebActivity.f45476h.getMeasuredWidth();
        int measuredHeight2 = simpleWebActivity.f45476h.getMeasuredHeight();
        if (measuredWidth2 <= 0 || measuredHeight2 <= 0) {
            return;
        }
        simpleWebActivity.f45476h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        simpleWebActivity.n();
    }

    g(i iVar, int i2) {
        this.f45491b = i2;
        Objects.requireNonNull(iVar);
        this.f45490a = iVar;
    }
}
