package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class acqm implements defpackage.acql {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.u("Crash__broadcast_enabled", false);
        b = rkqVar.t("Crash__process", "projection");
    }

    @Override // defpackage.acql
    public final java.lang.String a() {
        return (java.lang.String) b.fF();
    }

    @Override // defpackage.acql
    public final boolean b() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }
}
