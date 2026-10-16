package defpackage;

/* loaded from: classes.dex */
final class bhe implements bho {
    final /* synthetic */ bhg a;
    private final long b;

    public bhe(bhg bhgVar, long j) {
        this.a = bhgVar;
        this.b = j;
    }

    @Override // defpackage.bho
    public final long a(cst cstVar) {
        cst cstVar2 = (cst) this.a.b.a();
        if (cstVar2 == null) {
            asl.b("Tried to open context menu before the anchor was placed.");
            throw new aezp();
        }
        if (cstVar2.t()) {
            return cstVar.m(cstVar2.k(this.b));
        }
        return 0L;
    }

    @Override // defpackage.bho
    public final bfu b() {
        return awx.Z(this.a);
    }

    @Override // defpackage.bho
    public final cjb c(cst cstVar) {
        return byx.E(a(cstVar), 0L);
    }
}
