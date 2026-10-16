package com.waze.reports;

import android.view.ViewTreeObserver;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bj implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ GasPriceReportActivity f33695a;

    /* renamed from: b, reason: collision with root package name */
    private int f33696b;

    bj(GasPriceReportActivity gasPriceReportActivity) {
        Objects.requireNonNull(gasPriceReportActivity);
        this.f33695a = gasPriceReportActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        GasPriceReportActivity gasPriceReportActivity = this.f33695a;
        int height = gasPriceReportActivity.q.getHeight();
        int i2 = this.f33696b;
        if (i2 != 0) {
            if (i2 > height) {
                gasPriceReportActivity.findViewById(R.id.reportGasFullscreenFooter).setVisibility(8);
                gasPriceReportActivity.findViewById(R.id.reportGasPriceButtonsArea).setVisibility(8);
                gasPriceReportActivity.findViewById(R.id.reportGasKeyboardIndicator).setVisibility(0);
                gasPriceReportActivity.findViewById(R.id.reportGasKeyboardFooter).setVisibility(0);
                gasPriceReportActivity.findViewById(R.id.reportLogoFramesLayout).setVisibility(8);
            } else if (i2 < height) {
                gasPriceReportActivity.findViewById(R.id.reportGasFullscreenFooter).setVisibility(0);
                gasPriceReportActivity.findViewById(R.id.reportGasPriceButtonsArea).setVisibility(0);
                gasPriceReportActivity.findViewById(R.id.reportGasKeyboardIndicator).setVisibility(8);
                gasPriceReportActivity.findViewById(R.id.reportGasKeyboardFooter).setVisibility(8);
                gasPriceReportActivity.findViewById(R.id.reportLogoFramesLayout).setVisibility(0);
                if (gasPriceReportActivity.p != -1) {
                    gasPriceReportActivity.N();
                }
                if (gasPriceReportActivity.r != null) {
                    gasPriceReportActivity.r.c();
                    gasPriceReportActivity.r.b();
                }
            }
        }
        this.f33696b = height;
    }
}
