package defpackage;

/* loaded from: classes.dex */
public final class apu extends cxt<aqe> {
    private final aqf a;
    private final api b;
    private final boolean c;
    private final boolean d;
    private final aom f;
    private final aiu i = null;
    private final asf g = null;
    private final amy h = null;

    public apu(aqf aqfVar, api apiVar, boolean z, boolean z2, aom aomVar) {
        this.a = aqfVar;
        this.b = apiVar;
        this.c = z;
        this.d = z2;
        this.f = aomVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new aqe(this.a, null, this.f, this.b, this.c, this.d, null, null);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((aqe) cfxVar).L(this.a, this.b, null, this.c, this.d, this.f, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apu)) {
            return false;
        }
        apu apuVar = (apu) obj;
        if (!affa.f(this.a, apuVar.a) || this.b != apuVar.b) {
            return false;
        }
        aiu aiuVar = apuVar.i;
        if (this.c != apuVar.c || this.d != apuVar.d || !affa.f(this.f, apuVar.f)) {
            return false;
        }
        asf asfVar = apuVar.g;
        amy amyVar = apuVar.h;
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        aom aomVar = this.f;
        return ((((((iHashCode * 961) + (true != this.c ? 1237 : 1231)) * 31) + (true == this.d ? 1231 : 1237)) * 31) + (aomVar != null ? aomVar.hashCode() : 0)) * 961;
    }
}
