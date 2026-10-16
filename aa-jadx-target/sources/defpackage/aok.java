package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aok extends defpackage.cyc<defpackage.aoq> {
    private static final defpackage.affc a = new defpackage.ajg(14);
    private final defpackage.apn b;
    private final boolean c;
    private final defpackage.ask d;
    private final boolean f;
    private final defpackage.affh g;
    private final defpackage.affh h;
    private final boolean i;
    private final bqp j;

    public aok(bqp bqpVar, defpackage.apn apnVar, boolean z, defpackage.ask askVar, boolean z2, defpackage.affh affhVar, defpackage.affh affhVar2, boolean z3) {
        this.j = bqpVar;
        this.b = apnVar;
        this.c = z;
        this.d = askVar;
        this.f = z2;
        this.g = affhVar;
        this.h = affhVar2;
        this.i = z3;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.aoq(this.j, a, this.b, this.c, this.d, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        boolean z;
        boolean z2;
        defpackage.aoq aoqVar = (defpackage.aoq) cgeVar;
        defpackage.affc affcVar = a;
        bqp bqpVar = aoqVar.j;
        bqp bqpVar2 = this.j;
        if (defpackage.afga.f(bqpVar, bqpVar2)) {
            z = false;
        } else {
            aoqVar.j = bqpVar2;
            z = true;
        }
        boolean z3 = this.i;
        if (aoqVar.i != z3) {
            aoqVar.i = z3;
            z2 = true;
        } else {
            z2 = z;
        }
        defpackage.affh affhVar = this.h;
        defpackage.affh affhVar2 = this.g;
        boolean z4 = this.f;
        defpackage.ask askVar = this.d;
        boolean z5 = this.c;
        defpackage.apn apnVar = this.b;
        aoqVar.b = affhVar2;
        aoqVar.c = affhVar;
        aoqVar.a = z4;
        aoqVar.G(affcVar, z5, askVar, apnVar, z2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.aok aokVar = (defpackage.aok) obj;
        return defpackage.afga.f(this.j, aokVar.j) && this.b == aokVar.b && this.c == aokVar.c && defpackage.afga.f(this.d, aokVar.d) && this.f == aokVar.f && defpackage.afga.f(this.g, aokVar.g) && defpackage.afga.f(this.h, aokVar.h) && this.i == aokVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.j.hashCode() * 31) + this.b.hashCode();
        defpackage.ask askVar = this.d;
        return (((((((((((iHashCode * 31) + (true != this.c ? 1237 : 1231)) * 31) + (askVar != null ? askVar.hashCode() : 0)) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + (true == this.i ? 1231 : 1237);
    }
}
