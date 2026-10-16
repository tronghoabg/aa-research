package com.waze.reports;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends di {
    private int x;

    public k(Context context, dr drVar) {
        super(context, drVar, R.string.CLOSURE);
        this.x = -1;
        this.o = 3;
        this.f33847g = -1;
        this.f33851k = false;
        this.f33852l = true;
        this.n = false;
        this.m = true;
        super.G();
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.reportGenericExtArea);
        this.f33846f.inflate(R.layout.report_closure_content, viewGroup);
        findViewById(R.id.reportGenericSelectorArea).setVisibility(0);
        findViewById(R.id.reportGenericDetailsArea).setVisibility(0);
        viewGroup.setVisibility(8);
    }

    @Override // com.waze.reports.di
    protected final int a() {
        return 12;
    }

    @Override // com.waze.reports.di
    protected final com.waze.reports_v2.b.ad b() {
        return com.waze.reports_v2.b.ad.f34020d;
    }

    @Override // com.waze.reports.di
    public final com.waze.reports_v2.b.ae c() {
        int i2 = this.x;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? com.waze.reports_v2.b.ae.f34026b : com.waze.reports_v2.b.ae.f34029e : com.waze.reports_v2.b.ae.f34028d : com.waze.reports_v2.b.ae.f34027c;
    }

    @Override // com.waze.reports.di
    protected final int[] e() {
        return new int[]{R.drawable.icon_report_hazard_on_road, R.drawable.icon_report_hazard_construction, R.drawable.icon_report_closure_event};
    }

    @Override // com.waze.reports.di
    protected final int[] f() {
        return new int[]{R.string.HAZARD, R.string.CONSTRUCTION, R.string.EVENT};
    }

    @Override // com.waze.reports.di
    protected final int[] g() {
        return null;
    }

    @Override // com.waze.reports.di
    protected final int h() {
        return this.x;
    }

    @Override // com.waze.reports.di
    protected final void i(int i2) {
        String strC;
        L();
        if (i2 == 0) {
            this.x = 0;
            strC = this.f33841a.c(R.string.HAZARD, new Object[0]);
        } else if (i2 != 1) {
            this.x = 2;
            strC = this.f33841a.c(R.string.EVENT, new Object[0]);
        } else {
            this.x = 1;
            strC = this.f33841a.c(R.string.CONSTRUCTION, new Object[0]);
        }
        ((TextView) findViewById(R.id.reportTitle)).setText(strC);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // com.waze.reports.di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(com.waze.reports_v2.b.ae r3) {
        /*
            r2 = this;
            int r3 = r3.ordinal()
            r0 = 2
            if (r3 == r0) goto L13
            r1 = 3
            if (r3 == r1) goto L11
            r1 = 4
            if (r3 == r1) goto L14
            r0 = -1
            r2.x = r0
            goto L16
        L11:
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            r2.x = r0
        L16:
            if (r0 < 0) goto L1f
            android.view.View[] r2 = r2.r
            r2 = r2[r0]
            r2.performClick()
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports.k.j(com.waze.reports_v2.b.ae):void");
    }

    @Override // com.waze.reports.di
    protected final void k() {
        L();
        ((TextView) findViewById(R.id.reportTitle)).setText(this.f33841a.c(this.p, new Object[0]));
    }
}
