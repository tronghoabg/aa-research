package com.waze.view.button;

import com.waze.reports.ee;
import com.waze.reports_v2.d.j;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f45019a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f45020b;

    a(ReportMenuButton reportMenuButton, int i2) {
        this.f45020b = i2;
        Objects.requireNonNull(reportMenuButton);
        this.f45019a = reportMenuButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f45020b;
        Object obj = this.f45019a;
        if (i2 != 0) {
            ReportMenuButton reportMenuButton = (ReportMenuButton) obj;
            reportMenuButton.f45016f.setLevel(10000);
            reportMenuButton.invalidate();
        } else if (obj != null) {
            j.f34595a.a().z();
        }
    }

    a(b bVar, ee eeVar, int i2) {
        this.f45020b = i2;
        this.f45019a = eeVar;
        Objects.requireNonNull(bVar);
    }
}
