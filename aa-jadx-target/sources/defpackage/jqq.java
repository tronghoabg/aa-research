package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jqq implements defpackage.seh {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.LegalStatus");
    private final defpackage.imi b;

    public jqq(defpackage.imi imiVar) {
        this.b = imiVar;
    }

    private final int e(java.lang.String str) {
        java.lang.String strY = this.b.Y(str, "");
        if (strY.isEmpty()) {
            return 0;
        }
        try {
            return java.lang.Integer.parseInt(strY);
        } catch (java.lang.NumberFormatException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(2653)).M("Unrecognized tos version: %s=%s", str, strY);
            return 0;
        }
    }

    @Override // defpackage.seh
    public final /* synthetic */ boolean a() {
        return qsp.I(this);
    }

    @Override // defpackage.seh
    public final boolean b() {
        return e("car_tos_data") > 0;
    }

    @Override // defpackage.seh
    public final boolean c() {
        return e("car_tos_safety") > 0;
    }

    @Override // defpackage.seh
    public final boolean d() {
        return e("car_tos_main") > 0;
    }
}
