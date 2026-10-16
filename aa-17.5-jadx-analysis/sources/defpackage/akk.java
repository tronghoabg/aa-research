package defpackage;

/* loaded from: classes.dex */
final class akk extends cxt<akl> {
    private final ase a;
    private final akm b;

    public akk(ase aseVar, akm akmVar) {
        this.a = aseVar;
        this.b = akmVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new akl(this.b.a(this.a));
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        akl aklVar = (akl) cfxVar;
        cwd cwdVarA = this.b.a(this.a);
        aklVar.V(aklVar.a);
        aklVar.a = cwdVarA;
        aklVar.W(cwdVarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akk)) {
            return false;
        }
        akk akkVar = (akk) obj;
        return affa.f(this.a, akkVar.a) && affa.f(this.b, akkVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
