package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class eoj extends eol {
    @Override // defpackage.eol
    public final int a(View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        int baseline = view.getBaseline();
        if (baseline == -1) {
            return Integer.MIN_VALUE;
        }
        return baseline;
    }

    @Override // defpackage.eol
    public final int b(View view, int i) {
        return 0;
    }

    @Override // defpackage.eol
    public final String c() {
        return "BASELINE";
    }

    @Override // defpackage.eol
    public final eoq d() {
        return new eoi();
    }
}
