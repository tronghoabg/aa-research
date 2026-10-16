package com.waze.view.button;

import com.waze.reports.ee;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ReportMenuButton f45021a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ee f45022b;

    b(ReportMenuButton reportMenuButton, ee eeVar) {
        this.f45022b = eeVar;
        Objects.requireNonNull(reportMenuButton);
        this.f45021a = reportMenuButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReportMenuButton reportMenuButton = this.f45021a;
        reportMenuButton.setVisibility(0);
        reportMenuButton.f45016f.f();
        reportMenuButton.postDelayed(new a(this, this.f45022b, 0), 600L);
    }
}
