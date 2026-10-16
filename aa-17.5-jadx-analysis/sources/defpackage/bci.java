package defpackage;

/* loaded from: classes.dex */
public final class bci extends cxt<bcl> {
    private final boolean a;
    private final asf b;
    private final akm c;
    private final boolean d;
    private final afec f;

    public bci(boolean z, asf asfVar, akm akmVar, boolean z2, afec afecVar) {
        this.a = z;
        this.b = asfVar;
        this.c = akmVar;
        this.d = z2;
        this.f = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bcl(this.a, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        bcl bclVar = (bcl) cfxVar;
        boolean z = bclVar.i;
        boolean z2 = this.a;
        if (z != z2) {
            bclVar.i = z2;
            bzi.q(bclVar).J();
        }
        afec afecVar = this.f;
        boolean z3 = this.d;
        akm akmVar = this.c;
        asf asfVar = this.b;
        bclVar.j = afecVar;
        bclVar.w(asfVar, akmVar, false, z3, null, null, bclVar.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bci bciVar = (bci) obj;
        return this.a == bciVar.a && affa.f(this.b, bciVar.b) && affa.f(this.c, bciVar.c) && this.d == bciVar.d && this.f == bciVar.f;
    }

    public final int hashCode() {
        asf asfVar = this.b;
        int iHashCode = ((true != this.a ? 1237 : 1231) * 31) + (asfVar != null ? asfVar.hashCode() : 0);
        akm akmVar = this.c;
        return (((((((iHashCode * 31) + (akmVar != null ? akmVar.hashCode() : 0)) * 31) + 1237) * 31) + (true != this.d ? 1237 : 1231)) * 961) + this.f.hashCode();
    }
}
