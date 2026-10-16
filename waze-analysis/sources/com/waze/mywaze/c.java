package com.waze.mywaze;

import android.view.View;
import com.waze.reports.GasPriceReportActivity;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30579b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f30580c;

    public /* synthetic */ c(Object obj, int i2, int i3) {
        this.f30580c = i3;
        this.f30579b = obj;
        this.f30578a = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NumberFormatException {
        int i2 = this.f30580c;
        if (i2 == 0) {
            l.q((l) this.f30579b, this.f30578a);
            return;
        }
        int i3 = this.f30578a;
        if (i2 != 1) {
            com.waze.view.popups.d.c((com.waze.view.popups.d) this.f30579b, i3);
        } else {
            GasPriceReportActivity.E((GasPriceReportActivity) this.f30579b, i3);
        }
    }
}
