package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bcn extends defpackage.cyc<defpackage.bcq> {
    private final boolean a;
    private final defpackage.ask b;
    private final defpackage.akr c;
    private final boolean d;
    private final defpackage.affc f;

    public bcn(boolean z, defpackage.ask askVar, defpackage.akr akrVar, boolean z2, defpackage.affc affcVar) {
        this.a = z;
        this.b = askVar;
        this.c = akrVar;
        this.d = z2;
        this.f = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.bcq(this.a, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.bcq bcqVar = (defpackage.bcq) cgeVar;
        boolean z = bcqVar.i;
        boolean z2 = this.a;
        if (z != z2) {
            bcqVar.i = z2;
            defpackage.cjv.r(bcqVar).J();
        }
        defpackage.affc affcVar = this.f;
        boolean z3 = this.d;
        defpackage.akr akrVar = this.c;
        defpackage.ask askVar = this.b;
        bcqVar.j = affcVar;
        bcqVar.w(askVar, akrVar, false, z3, null, null, bcqVar.k);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.bcn bcnVar = (defpackage.bcn) obj;
        return this.a == bcnVar.a && defpackage.afga.f(this.b, bcnVar.b) && defpackage.afga.f(this.c, bcnVar.c) && this.d == bcnVar.d && this.f == bcnVar.f;
    }

    public final int hashCode() {
        defpackage.ask askVar = this.b;
        int iHashCode = ((true != this.a ? 1237 : 1231) * 31) + (askVar != null ? askVar.hashCode() : 0);
        defpackage.akr akrVar = this.c;
        return (((((((iHashCode * 31) + (akrVar != null ? akrVar.hashCode() : 0)) * 31) + 1237) * 31) + (true != this.d ? 1237 : 1231)) * 961) + this.f.hashCode();
    }
}
