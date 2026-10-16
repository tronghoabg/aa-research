package com.waze.planned_drive.histogram;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.waze.beacons.p;
import com.waze.sharedui.views.ad;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f33331a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33332b;

    public /* synthetic */ c(ViewGroup viewGroup, int i2) {
        this.f33332b = i2;
        this.f33331a = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i2 = this.f33332b;
        ViewGroup viewGroup = this.f33331a;
        if (i2 != 0) {
            ((ad) viewGroup).getHandler().post(new p(viewGroup, 14));
        } else {
            HistogramRecyclerView.a((HistogramRecyclerView) viewGroup);
        }
    }
}
