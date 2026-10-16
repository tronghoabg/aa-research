package defpackage;

/* loaded from: classes3.dex */
public final class aclq implements aclp {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.u("AdasRouteInfoFeature__adas_route_info_enabled", false);
        b = rjuVar.u("AdasRouteInfoFeature__car_intent_enabled", false);
    }

    @Override // defpackage.aclp
    public final boolean a() {
        return ((Boolean) a.gu()).booleanValue();
    }

    @Override // defpackage.aclp
    public final boolean b() {
        return ((Boolean) b.gu()).booleanValue();
    }
}
