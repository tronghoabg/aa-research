package defpackage;

/* loaded from: classes2.dex */
public final class shm implements sdk {
    private static final ypf a = ols.R("CAR.SETUP.legal");
    private final qst b;

    public shm(qst qstVar) {
        this.b = qstVar;
    }

    private final int e(String str) {
        String strB = this.b.b(str, null);
        if (strB == null) {
            return 0;
        }
        try {
            return Integer.parseInt(strB);
        } catch (NumberFormatException e) {
            a.g().p(e).ai(8979).M("Unrecognized tos version: %s=%s", str, strB);
            return 0;
        }
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
}
