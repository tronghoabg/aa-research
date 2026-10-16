package defpackage;

/* loaded from: classes.dex */
public final class ayq extends cxt<ayt> {
    private final ayu a;
    private final boolean b = false;
    private final api c;
    private final kwp d;

    public ayq(ayu ayuVar, kwp kwpVar, api apiVar) {
        this.a = ayuVar;
        this.d = kwpVar;
        this.c = apiVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new ayt(this.a, this.d, this.c);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ayt aytVar = (ayt) cfxVar;
        aytVar.b = this.a;
        aytVar.d = this.d;
        aytVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayq)) {
            return false;
        }
        ayq ayqVar = (ayq) obj;
        if (!affa.f(this.a, ayqVar.a) || !affa.f(this.d, ayqVar.d)) {
            return false;
        }
        boolean z = ayqVar.b;
        return this.c == ayqVar.c;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + 1237) * 31) + this.c.hashCode();
    }
}
