package defpackage;

/* loaded from: classes.dex */
final class bpg implements akm {
    public final long a;
    private final boolean b;
    private final float c;
    private final cjy d;
    private final ckv e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    public bpg(boolean z, float f, long j, ckv ckvVar, boolean z2, boolean z3) {
        if (ckvVar == null) {
            dlj dljVar = new dlj(f);
            dljVar = Float.compare(dljVar.a, Float.NaN) == 0 ? null : dljVar;
            if (dljVar != null) {
                float f2 = dljVar.a;
                bcm bcmVar = bcr.a;
                bco bcoVar = new bco(f2);
                ckvVar = new bcm(bcoVar, bcoVar, bcoVar, bcoVar);
            } else {
                ckvVar = null;
            }
            if (ckvVar == null) {
                ckvVar = ckq.a;
            }
        }
        this.b = z;
        this.c = f;
        this.d = null;
        this.a = j;
        this.e = ckvVar;
        this.f = z2;
        this.g = z3;
        this.h = true;
        this.i = true;
    }

    @Override // defpackage.akm
    public final cwd a(ase aseVar) {
        bpf bpfVar = new bpf(this, 0);
        return new bno(aseVar, this.b, this.c, bpfVar, this.f, this.g);
    }

    @Override // defpackage.akg
    public final /* synthetic */ aku b(bux buxVar) {
        return ca.ba(buxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpg)) {
            return false;
        }
        bpg bpgVar = (bpg) obj;
        if (this.b == bpgVar.b && Float.compare(this.c, bpgVar.c) == 0) {
            cjy cjyVar = bpgVar.d;
            if (this.a != bpgVar.a || !affa.f(this.e, bpgVar.e) || this.f != bpgVar.f || this.g != bpgVar.g) {
                return false;
            }
            boolean z = bpgVar.h;
            boolean z2 = bpgVar.i;
            return true;
        }
        return false;
    }

    @Override // defpackage.akm
    public final int hashCode() {
        return (((((((((((((a.f(this.b) * 31) + Float.floatToIntBits(this.c)) * 961) + a.g(this.a)) * 31) + this.e.hashCode()) * 31) + a.f(this.f)) * 31) + a.f(this.g)) * 31) + a.f(true)) * 31) + a.f(true);
    }
}
