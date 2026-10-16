package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bls implements defpackage.bkb {
    final /* synthetic */ defpackage.blw a;
    private boolean b = true;
    private defpackage.dgc c;

    public bls(defpackage.blw blwVar) {
        this.a = blwVar;
    }

    @Override // defpackage.bkb
    public final void a() {
        if (this.b) {
            this.a.m(this.c);
        }
    }

    @Override // defpackage.bkb
    public final boolean b(long j, defpackage.bks bksVar) {
        defpackage.beg begVar;
        defpackage.blw blwVar = this.a;
        if (!blwVar.v() || blwVar.f().a().length() == 0 || (begVar = blwVar.d) == null || begVar.e() == null) {
            return false;
        }
        f(blwVar.f(), j, false, bksVar);
        return true;
    }

    @Override // defpackage.bkb
    public final boolean c(long j) {
        defpackage.blw blwVar = this.a;
        defpackage.beg begVar = blwVar.d;
        if (begVar == null || begVar.e() == null || !blwVar.v()) {
            return false;
        }
        blwVar.B = -1;
        defpackage.cit citVar = blwVar.h;
        if (citVar != null) {
            citVar.a(7);
        }
        f(blwVar.f(), j, false, defpackage.bkr.a);
        return true;
    }

    @Override // defpackage.bkb
    public final boolean d(long j) {
        defpackage.beg begVar;
        defpackage.blw blwVar = this.a;
        if (!blwVar.v() || blwVar.f().a().length() == 0 || (begVar = blwVar.d) == null || begVar.e() == null) {
            return false;
        }
        f(blwVar.f(), j, false, defpackage.bkr.a);
        return true;
    }

    @Override // defpackage.bkb
    public final boolean e(long j, defpackage.bks bksVar, int i) {
        defpackage.beg begVar;
        defpackage.blw blwVar = this.a;
        if (!blwVar.v() || blwVar.f().a().length() == 0 || (begVar = blwVar.d) == null || begVar.e() == null) {
            return false;
        }
        defpackage.cit citVar = blwVar.h;
        if (citVar != null) {
            citVar.a(7);
        }
        blwVar.k = j;
        blwVar.B = -1;
        blwVar.j(true);
        long jF = f(blwVar.f(), blwVar.k, true, bksVar);
        if (i >= 2) {
            this.b = true;
            this.c = new defpackage.dgc(jF);
        }
        return true;
    }

    public final long f(defpackage.dkd dkdVar, long j, boolean z, defpackage.bks bksVar) {
        defpackage.blw blwVar = this.a;
        long jB = blwVar.b(dkdVar, j, z, false, bksVar, false, null);
        if (!defpackage.dgc.h(jB, this.c)) {
            this.b = false;
        }
        blwVar.q(defpackage.dgc.i(jB) ? defpackage.bdz.c : defpackage.bdz.b);
        return jB;
    }
}
