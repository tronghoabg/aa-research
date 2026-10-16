package defpackage;

/* loaded from: classes.dex */
public final class azz extends cxt<baa> {
    private final afdr a;
    private final azy b;
    private final api c;
    private final boolean d;
    private final boolean f = false;

    public azz(afdr afdrVar, azy azyVar, api apiVar, boolean z) {
        this.a = afdrVar;
        this.b = azyVar;
        this.c = apiVar;
        this.d = z;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new baa(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        baa baaVar = (baa) cfxVar;
        baaVar.a = this.a;
        baaVar.b = this.b;
        api apiVar = baaVar.c;
        api apiVar2 = this.c;
        if (apiVar != apiVar2) {
            baaVar.c = apiVar2;
            bzi.q(baaVar).J();
        }
        boolean z = this.d;
        if (baaVar.d == z) {
            return;
        }
        baaVar.d = z;
        baaVar.b();
        bzi.q(baaVar).J();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azz)) {
            return false;
        }
        azz azzVar = (azz) obj;
        if (this.a != azzVar.a || !affa.f(this.b, azzVar.b) || this.c != azzVar.c || this.d != azzVar.d) {
            return false;
        }
        boolean z = azzVar.f;
        return true;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.d ? 1237 : 1231)) * 31) + 1237;
    }
}
