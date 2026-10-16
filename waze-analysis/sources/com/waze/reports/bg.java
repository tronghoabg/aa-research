package com.waze.reports;

import com.waze.view.text.WazeEditText;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class bg implements com.waze.sharedui.views.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f33689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33690b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f33691c;

    bg(bd bdVar, String str, int i2) {
        this.f33691c = i2;
        this.f33690b = str;
        Objects.requireNonNull(bdVar);
        this.f33689a = bdVar;
    }

    @Override // com.waze.sharedui.views.w
    public final void a(boolean z) {
        if (this.f33691c == 0) {
            GasPriceReportActivity.s((GasPriceReportActivity) this.f33689a, (WazeEditText) this.f33690b, z);
            return;
        }
        Object obj = this.f33689a;
        if (z) {
            ((bd) obj).f33683d.add(this.f33690b);
        } else {
            ((bd) obj).f33683d.remove(this.f33690b);
        }
    }

    public /* synthetic */ bg(GasPriceReportActivity gasPriceReportActivity, WazeEditText wazeEditText, int i2) {
        this.f33691c = i2;
        this.f33689a = gasPriceReportActivity;
        this.f33690b = wazeEditText;
    }
}
