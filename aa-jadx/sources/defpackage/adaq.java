package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adaq implements defpackage.adap {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.u("WirelessHttpProxy__enabled", false);
        b = rkqVar.t("WirelessHttpProxy__host_whitelist", "google.com, dl.google.com, clients2.google.com, tools.google.com");
    }

    @Override // defpackage.adap
    public final java.lang.String a() {
        return (java.lang.String) b.fF();
    }

    @Override // defpackage.adap
    public final boolean b() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }
}
