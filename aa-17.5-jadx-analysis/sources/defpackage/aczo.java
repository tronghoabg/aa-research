package defpackage;

/* loaded from: classes3.dex */
public final class aczo implements aczn {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.u("WirelessHttpProxy__enabled", false);
        b = rjuVar.t("WirelessHttpProxy__host_whitelist", "google.com, dl.google.com, clients2.google.com, tools.google.com");
    }

    @Override // defpackage.aczn
    public final String a() {
        return (String) b.gu();
    }

    @Override // defpackage.aczn
    public final boolean b() {
        return ((Boolean) a.gu()).booleanValue();
    }
}
