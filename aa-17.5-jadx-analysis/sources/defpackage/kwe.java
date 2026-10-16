package defpackage;

/* loaded from: classes2.dex */
public enum kwe implements nma {
    DASHBOARD_UNAVAILABLE_TOOLTIP(new joa(4), acpc.t(), acai.H, yzz.USER_EDUCATION_COOLWALK_DASHBOARD_UNAVAILABLE),
    RAIL_WIDGET_TOOLTIP(new joa(5), acpc.A(), acai.I, yzz.USER_EDUCATION_COOLWALK_RAIL_WIDGET);

    private final odd d;

    kwe(xyc xycVar, boolean z, acai acaiVar, yzz yzzVar) {
        this.d = new odd(xycVar, 0, z, acaiVar, yzzVar);
    }

    @Override // defpackage.nma
    public final nlz a() {
        return this == RAIL_WIDGET_TOOLTIP ? nlz.e : nlz.a;
    }

    @Override // defpackage.nge
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return this.d.a((oco) obj, this);
    }

    @Override // defpackage.nge
    public final String c() {
        return "CoolwalkSystemUi";
    }

    @Override // defpackage.nge
    public final String d() {
        return name();
    }
}
