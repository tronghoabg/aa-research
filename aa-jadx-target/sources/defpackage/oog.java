package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oog implements defpackage.seh {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.LegalHelper");
    private final defpackage.qsh b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oog(defpackage.qsh qshVar) {
        this(qshVar, null);
        defpackage.mkp.a.g();
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

    public final int e(java.lang.String str) {
        java.lang.NumberFormatException e;
        java.lang.String strD;
        try {
            try {
                strD = this.b.a().D(str, "");
                try {
                    if (strD.isEmpty()) {
                        return 0;
                    }
                    return java.lang.Integer.parseInt(strD);
                } catch (java.lang.NumberFormatException e2) {
                    e = e2;
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(6079)).M("Unrecognized tos version: %s=%s", str, strD);
                    return 0;
                }
            } catch (java.lang.NumberFormatException e3) {
                e = e3;
                strD = null;
            }
        } catch (java.lang.IllegalStateException e4) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e4)).ai((char) 6080)).y("Client is not connected while reading %s", str);
            return 0;
        } catch (defpackage.qst e5) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e5)).ai((char) 6078)).y("getBooleanCarServiceSetting %s failed", str);
            return 0;
        }
    }

    public final void f(java.lang.String str) {
        try {
            defpackage.oml.D(this.b, str, "0");
        } catch (java.lang.IllegalStateException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 6082)).y("Client is not connected while writing %s", str);
        } catch (defpackage.qst e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e2)).ai((char) 6081)).u("Failed to clear data TOS");
        }
    }

    public final void g(java.lang.String str, int i) {
        if (i <= e(str)) {
            return;
        }
        try {
            defpackage.oml.D(this.b, str, java.lang.Integer.toString(i));
        } catch (java.lang.IllegalStateException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 6084)).y("Client is not connected while writing %s", str);
        } catch (defpackage.qst e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e2)).ai((char) 6083)).u("Failed to set data TOS acceptance");
        }
    }

    public oog(defpackage.qsh qshVar, byte[] bArr) {
        this.b = qshVar;
    }
}
