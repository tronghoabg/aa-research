package defpackage;

/* loaded from: classes.dex */
public final class bhh extends cxt<bhj> {
    private final afec a;
    private final afec b;
    private final afec c;
    private final vtn d;

    public bhh(vtn vtnVar, afec afecVar, afec afecVar2, afec afecVar3) {
        this.d = vtnVar;
        this.a = afecVar;
        this.b = afecVar2;
        this.c = afecVar3;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bhj(this.d, this.a, this.b, this.c);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        bhj bhjVar = (bhj) cfxVar;
        bhjVar.e.b = null;
        bhjVar.e = this.d;
        vtn vtnVar = bhjVar.e;
        vtnVar.b = bhjVar;
        vtnVar.a = true != bhjVar.A ? 2 : 3;
        bhjVar.a = this.a;
        bhjVar.b = this.b;
        bhjVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhh)) {
            return false;
        }
        bhh bhhVar = (bhh) obj;
        return this.d == bhhVar.d && this.a == bhhVar.a && this.b == bhhVar.b && this.c == bhhVar.c;
    }

    public final int hashCode() {
        return (((((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
