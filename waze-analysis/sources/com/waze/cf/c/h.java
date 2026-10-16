package com.waze.cf.c;

import com.waze.ab.r;
import com.waze.jz;
import com.waze.reports.GasPriceReportActivity;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class h implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f22206a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f22207b;

    public /* synthetic */ h(Object obj, int i2) {
        this.f22207b = i2;
        this.f22206a = obj;
    }

    @Override // com.waze.ab.r
    public final void a(boolean z, boolean z2) {
        int i2 = this.f22207b;
        Object obj = this.f22206a;
        if (i2 != 0) {
            ((GasPriceReportActivity) obj).O();
        } else if (z) {
            ((jz) obj).b().a(4);
        } else {
            ((jz) obj).b().a(3);
        }
    }
}
