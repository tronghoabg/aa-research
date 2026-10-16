package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class alm extends defpackage.cyc<defpackage.alo> {
    private final defpackage.aqk a;
    private final defpackage.apn b;
    private final boolean c;
    private final defpackage.aor d;
    private final defpackage.ask f;
    private final defpackage.and g;
    private final boolean h;
    private final defpackage.aiz i;

    public alm(defpackage.aqk aqkVar, defpackage.apn apnVar, boolean z, defpackage.aor aorVar, defpackage.ask askVar, defpackage.and andVar, boolean z2, defpackage.aiz aizVar) {
        this.a = aqkVar;
        this.b = apnVar;
        this.c = z;
        this.d = aorVar;
        this.f = askVar;
        this.g = andVar;
        this.h = z2;
        this.i = aizVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.alo(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.alo) cgeVar).f(this.a, this.b, this.h, this.i, this.c, this.d, this.f, this.g);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.alm almVar = (defpackage.alm) obj;
        return defpackage.afga.f(this.a, almVar.a) && this.b == almVar.b && this.c == almVar.c && defpackage.afga.f(this.d, almVar.d) && defpackage.afga.f(this.f, almVar.f) && defpackage.afga.f(this.g, almVar.g) && this.h == almVar.h && defpackage.afga.f(this.i, almVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        defpackage.aor aorVar = this.d;
        int iHashCode2 = ((((((iHashCode * 31) + (true != this.c ? 1237 : 1231)) * 31) + 1237) * 31) + (aorVar != null ? aorVar.hashCode() : 0)) * 31;
        defpackage.ask askVar = this.f;
        int iHashCode3 = (iHashCode2 + (askVar != null ? askVar.hashCode() : 0)) * 31;
        defpackage.and andVar = this.g;
        int iHashCode4 = (((iHashCode3 + (andVar != null ? andVar.hashCode() : 0)) * 31) + (true != this.h ? 1237 : 1231)) * 31;
        defpackage.aiz aizVar = this.i;
        return iHashCode4 + (aizVar != null ? aizVar.hashCode() : 0);
    }
}
