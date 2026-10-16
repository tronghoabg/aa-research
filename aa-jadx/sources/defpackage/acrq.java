package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class acrq implements defpackage.acrp {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.u("ExampleFeature__example_kill_switch", true);
        b = rkqVar.u("ExampleFeature__example_launch_param", false);
    }

    @Override // defpackage.acrp
    public final boolean a() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }

    @Override // defpackage.acrp
    public final boolean b() {
        return ((java.lang.Boolean) b.fF()).booleanValue();
    }
}
