package defpackage;

/* loaded from: classes.dex */
final class bdv extends cxt<bdw> {
    private final dfw a;
    private final int b;
    private final int c;

    public bdv(dfw dfwVar, int i, int i2) {
        this.a = dfwVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bdw(this.a, this.b, this.c);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        bdw bdwVar = (bdw) cfxVar;
        dfw dfwVar = bdwVar.a;
        dfw dfwVar2 = this.a;
        boolean zF = affa.f(dfwVar, dfwVar2);
        int i = this.c;
        int i2 = this.b;
        if (zF && bdwVar.b == i2 && bdwVar.c == i) {
            return;
        }
        bdwVar.a = dfwVar2;
        bdwVar.b = i2;
        bdwVar.c = i;
        bdwVar.e = dao.g(dfwVar2, bzi.q(bdwVar).s);
        bdwVar.d = true;
        bzi.q(bdwVar).I();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdv)) {
            return false;
        }
        bdv bdvVar = (bdv) obj;
        return affa.f(this.a, bdvVar.a) && this.b == bdvVar.b && this.c == bdvVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }
}
