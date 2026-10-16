package com.waze.reports;

import android.content.Context;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends di {
    public g(Context context, dr drVar) {
        super(context, drVar, R.string.MAP_CHAT_REPORT_TITLE);
        this.o = 0;
        this.f33847g = R.layout.report_map_note_content;
        super.G();
        findViewById(R.id.reportSend).setEnabled(false);
        findViewById(R.id.reportSend).setAlpha(0.5f);
    }

    @Override // com.waze.reports.di
    protected final int a() {
        return 0;
    }

    @Override // com.waze.reports.di
    protected final com.waze.reports_v2.b.ad b() {
        return com.waze.reports_v2.b.ad.f34021e;
    }

    @Override // com.waze.reports.di
    public final com.waze.reports_v2.b.ae c() {
        return com.waze.reports_v2.b.ae.f34025a;
    }

    @Override // com.waze.reports.di
    protected final void d() {
        super.d();
        if (this.s.getText() == null || this.s.getText().toString().isEmpty()) {
            return;
        }
        findViewById(R.id.reportSend).setEnabled(true);
        findViewById(R.id.reportSend).setAlpha(1.0f);
    }

    @Override // com.waze.reports.di
    protected final int[] e() {
        return null;
    }

    @Override // com.waze.reports.di
    protected final int[] f() {
        return null;
    }

    @Override // com.waze.reports.di
    protected final int[] g() {
        return null;
    }
}
