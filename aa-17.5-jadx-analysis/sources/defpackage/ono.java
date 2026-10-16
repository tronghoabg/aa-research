package defpackage;

/* loaded from: classes.dex */
public final class ono implements sdk {
    private static final yph a = yph.c("GH.LegalHelper");
    private final qrn b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ono(qrn qrnVar) {
        this(qrnVar, null);
        mki.a.g();
    }

    @Override // defpackage.sdk
    public final /* synthetic */ boolean a() {
        return qrv.t(this);
    }

    @Override // defpackage.sdk
    public final boolean b() {
        return e("car_tos_data") > 0;
    }

    @Override // defpackage.sdk
    public final boolean c() {
        return e("car_tos_safety") > 0;
    }

    @Override // defpackage.sdk
    public final boolean d() {
        return e("car_tos_main") > 0;
    }

    public final int e(String str) {
        NumberFormatException e;
        String strD;
        try {
            try {
                strD = this.b.a().D(str, "");
                try {
                    if (strD.isEmpty()) {
                        return 0;
                    }
                    return Integer.parseInt(strD);
                } catch (NumberFormatException e2) {
                    e = e2;
                    ((ype) ((ype) ((ype) a.g()).p(e)).ai(6053)).M("Unrecognized tos version: %s=%s", str, strD);
                    return 0;
                }
            } catch (NumberFormatException e3) {
                e = e3;
                strD = null;
            }
        } catch (IllegalStateException e4) {
            ((ype) ((ype) ((ype) a.g()).p(e4)).ai((char) 6054)).y("Client is not connected while reading %s", str);
            return 0;
        } catch (qrz e5) {
            ((ype) ((ype) ((ype) a.g()).p(e5)).ai((char) 6052)).y("getBooleanCarServiceSetting %s failed", str);
            return 0;
        }
    }

    public final void f(String str) {
        try {
            ols.D(this.b, str, Integer.toString(0));
        } catch (IllegalStateException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 6056)).y("Client is not connected while writing %s", str);
        } catch (qrz e2) {
            ((ype) ((ype) ((ype) a.g()).p(e2)).ai((char) 6055)).u("Failed to clear data TOS");
        }
    }

    public final void g(String str, int i) {
        if (i <= e(str)) {
            return;
        }
        try {
            qrn qrnVar = this.b;
            qrnVar.a().o(str, Integer.toString(i));
        } catch (IllegalStateException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 6058)).y("Client is not connected while writing %s", str);
        } catch (qrz e2) {
            ((ype) ((ype) ((ype) a.g()).p(e2)).ai((char) 6057)).u("Failed to set data TOS acceptance");
        }
    }

    public ono(qrn qrnVar, byte[] bArr) {
        this.b = qrnVar;
    }
}
