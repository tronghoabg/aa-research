package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class acxs implements defpackage.acxr {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.u("StratoFeature__enabled", false);
        b = rkqVar.u("StratoFeature__window_animation_enabled", false);
    }

    @Override // defpackage.acxr
    public final boolean a() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }

    @Override // defpackage.acxr
    public final boolean b() {
        return ((java.lang.Boolean) b.fF()).booleanValue();
    }
}
