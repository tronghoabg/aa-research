package defpackage;

/* loaded from: classes2.dex */
public final class gtn implements gmw {
    public final gtq a;
    public final gth b;
    public final gor c;
    private final got d;

    public gtn() {
        this(null, null, new gor(null), new got(null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtn)) {
            return false;
        }
        gtn gtnVar = (gtn) obj;
        return affa.f(this.a, gtnVar.a) && affa.f(this.b, gtnVar.b) && affa.f(this.c, gtnVar.c) && affa.f(this.d, gtnVar.d);
    }

    public final int hashCode() {
        gtq gtqVar = this.a;
        int iHashCode = gtqVar == null ? 0 : gtqVar.hashCode();
        gth gthVar = this.b;
        return (((((iHashCode * 31) + (gthVar != null ? gthVar.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "NavigationTemplateInternal(navigationInfo=" + this.a + ", travelEstimate=" + this.b + ", mapActions=" + this.c + ", panModeDelegate=" + this.d + ")";
    }

    public gtn(gtq gtqVar, gth gthVar, gor gorVar, got gotVar) {
        this.a = gtqVar;
        this.b = gthVar;
        this.c = gorVar;
        this.d = gotVar;
    }
}
