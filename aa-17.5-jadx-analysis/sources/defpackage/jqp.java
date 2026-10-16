package defpackage;

/* loaded from: classes.dex */
public final class jqp implements sdk {
    private static final yph a = yph.c("GH.LegalStatus");
    private final ima b;

    public jqp(ima imaVar) {
        this.b = imaVar;
    }

    private final int e(String str) {
        String strY = this.b.Y(str, "");
        if (strY.isEmpty()) {
            return 0;
        }
        try {
            return Integer.parseInt(strY);
        } catch (NumberFormatException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai(2651)).M("Unrecognized tos version: %s=%s", str, strY);
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
