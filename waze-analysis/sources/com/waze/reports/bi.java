package com.waze.reports;

import android.view.View;
import com.waze.R;
import com.waze.sharedui.views.AutoResizeTextView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bi implements com.waze.sharedui.views.b {

    /* renamed from: a, reason: collision with root package name */
    boolean f33692a;

    /* renamed from: b, reason: collision with root package name */
    float f33693b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ GasPriceReportActivity f33694c;

    bi(GasPriceReportActivity gasPriceReportActivity) {
        Objects.requireNonNull(gasPriceReportActivity);
        this.f33694c = gasPriceReportActivity;
        this.f33692a = false;
        this.f33693b = Float.MAX_VALUE;
    }

    @Override // com.waze.sharedui.views.b
    public final void a() {
        GasPriceReportActivity gasPriceReportActivity;
        this.f33692a = false;
        int i2 = 0;
        while (true) {
            gasPriceReportActivity = this.f33694c;
            if (i2 >= gasPriceReportActivity.m.size()) {
                break;
            }
            float textSize = ((AutoResizeTextView) ((View) gasPriceReportActivity.m.get(i2)).findViewById(R.id.gasPriceItemLabel)).getPaint().getTextSize();
            if (textSize < this.f33693b) {
                this.f33693b = textSize;
                this.f33692a = true;
            }
            i2++;
        }
        if (this.f33692a) {
            for (int i3 = 0; i3 < gasPriceReportActivity.m.size(); i3++) {
                AutoResizeTextView autoResizeTextView = (AutoResizeTextView) ((View) gasPriceReportActivity.m.get(i3)).findViewById(R.id.gasPriceItemLabel);
                autoResizeTextView.a(this.f33693b);
                autoResizeTextView.b((autoResizeTextView.getWidth() - autoResizeTextView.getPaddingLeft()) - autoResizeTextView.getPaddingRight(), (autoResizeTextView.getHeight() - autoResizeTextView.getPaddingBottom()) - autoResizeTextView.getPaddingTop());
            }
            gasPriceReportActivity.findViewById(R.id.reportGasPrices).forceLayout();
        }
    }
}
