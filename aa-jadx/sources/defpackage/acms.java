package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class acms implements defpackage.acmr {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.u("AdasRouteInfoFeature__adas_route_info_enabled", false);
        b = rkqVar.u("AdasRouteInfoFeature__car_intent_enabled", false);
    }

    @Override // defpackage.acmr
    public final boolean a() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }

    @Override // defpackage.acmr
    public final boolean b() {
        return ((java.lang.Boolean) b.fF()).booleanValue();
    }
}
