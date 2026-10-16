package defpackage;

/* loaded from: classes3.dex */
public final class acpk implements acpj {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.u("Crash__broadcast_enabled", false);
        b = rjuVar.t("Crash__process", "projection");
    }

    @Override // defpackage.acpj
    public final String a() {
        return (String) b.gu();
    }

    @Override // defpackage.acpj
    public final boolean b() {
        return ((Boolean) a.gu()).booleanValue();
    }
}
