package defpackage;

/* loaded from: classes.dex */
public final class ali extends cxt<alj> {
    private final aqf a;
    private final api b;
    private final boolean c;
    private final aom d;
    private final asf f;
    private final amy g;
    private final boolean h;
    private final aiu i;

    public ali(aqf aqfVar, api apiVar, boolean z, aom aomVar, asf asfVar, amy amyVar, boolean z2, aiu aiuVar) {
        this.a = aqfVar;
        this.b = apiVar;
        this.c = z;
        this.d = aomVar;
        this.f = asfVar;
        this.g = amyVar;
        this.h = z2;
        this.i = aiuVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new alj(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((alj) cfxVar).f(this.a, this.b, this.h, this.i, this.c, this.d, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ali aliVar = (ali) obj;
        return affa.f(this.a, aliVar.a) && this.b == aliVar.b && this.c == aliVar.c && affa.f(this.d, aliVar.d) && affa.f(this.f, aliVar.f) && affa.f(this.g, aliVar.g) && this.h == aliVar.h && affa.f(this.i, aliVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        aom aomVar = this.d;
        int iHashCode2 = ((((((iHashCode * 31) + (true != this.c ? 1237 : 1231)) * 31) + 1237) * 31) + (aomVar != null ? aomVar.hashCode() : 0)) * 31;
        asf asfVar = this.f;
        int iHashCode3 = (iHashCode2 + (asfVar != null ? asfVar.hashCode() : 0)) * 31;
        amy amyVar = this.g;
        int iHashCode4 = (((iHashCode3 + (amyVar != null ? amyVar.hashCode() : 0)) * 31) + (true != this.h ? 1237 : 1231)) * 31;
        aiu aiuVar = this.i;
        return iHashCode4 + (aiuVar != null ? aiuVar.hashCode() : 0);
    }
}
