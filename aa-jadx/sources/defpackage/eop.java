package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eop extends defpackage.eor {
    @Override // defpackage.eor
    public final int a(android.view.View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        int baseline = view.getBaseline();
        if (baseline == -1) {
            return Integer.MIN_VALUE;
        }
        return baseline;
    }

    @Override // defpackage.eor
    public final int b(android.view.View view, int i) {
        return 0;
    }

    @Override // defpackage.eor
    public final java.lang.String c() {
        return "BASELINE";
    }

    @Override // defpackage.eor
    public final defpackage.eow d() {
        return new defpackage.eoo();
    }
}
