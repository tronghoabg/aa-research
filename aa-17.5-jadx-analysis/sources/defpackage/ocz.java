package defpackage;

/* loaded from: classes.dex */
public final class ocz extends cxt<odc> {
    private final asf a;
    private final nok b;

    public ocz(nok nokVar, asf asfVar) {
        this.b = nokVar;
        this.a = asfVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new odc(this.b, this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        odc odcVar = (odc) cfxVar;
        ((byw) odcVar.f.a).m(odcVar);
        odcVar.f = this.b;
        ((byw) odcVar.f.a).n(odcVar);
        odcVar.b = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocz)) {
            return false;
        }
        ocz oczVar = (ocz) obj;
        return affa.f(this.b, oczVar.b) && affa.f(this.a, oczVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "TooltipAnchorElement(tooltipRequester=" + this.b + ", interactionSource=" + this.a + ")";
    }
}
