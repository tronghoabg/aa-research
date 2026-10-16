package defpackage;

/* loaded from: classes.dex */
public final class bln implements bjx {
    final /* synthetic */ blr a;
    private boolean b = true;
    private dfv c;

    public bln(blr blrVar) {
        this.a = blrVar;
    }

    @Override // defpackage.bjx
    public final void a() {
        if (this.b) {
            this.a.m(this.c);
        }
    }

    @Override // defpackage.bjx
    public final boolean b(long j, bko bkoVar) {
        bed bedVar;
        blr blrVar = this.a;
        if (!blrVar.v() || blrVar.f().a().length() == 0 || (bedVar = blrVar.d) == null || bedVar.d() == null) {
            return false;
        }
        f(blrVar.f(), j, false, bkoVar);
        return true;
    }

    @Override // defpackage.bjx
    public final boolean c(long j) {
        blr blrVar = this.a;
        bed bedVar = blrVar.d;
        if (bedVar == null || bedVar.d() == null || !blrVar.v()) {
            return false;
        }
        blrVar.B = -1;
        cil cilVar = blrVar.h;
        if (cilVar != null) {
            cilVar.a(7);
        }
        f(blrVar.f(), j, false, bkn.a);
        return true;
    }

    @Override // defpackage.bjx
    public final boolean d(long j) {
        bed bedVar;
        blr blrVar = this.a;
        if (!blrVar.v() || blrVar.f().a().length() == 0 || (bedVar = blrVar.d) == null || bedVar.d() == null) {
            return false;
        }
        f(blrVar.f(), j, false, bkn.a);
        return true;
    }

    @Override // defpackage.bjx
    public final boolean e(long j, bko bkoVar, int i) {
        bed bedVar;
        blr blrVar = this.a;
        if (!blrVar.v() || blrVar.f().a().length() == 0 || (bedVar = blrVar.d) == null || bedVar.d() == null) {
            return false;
        }
        cil cilVar = blrVar.h;
        if (cilVar != null) {
            cilVar.a(7);
        }
        blrVar.k = j;
        blrVar.B = -1;
        blrVar.j(true);
        long jF = f(blrVar.f(), blrVar.k, true, bkoVar);
        if (i >= 2) {
            this.b = true;
            this.c = new dfv(jF);
        }
        return true;
    }

    public final long f(djv djvVar, long j, boolean z, bko bkoVar) {
        blr blrVar = this.a;
        long jB = blrVar.b(djvVar, j, z, false, bkoVar, false, null);
        if (!dfv.h(jB, this.c)) {
            this.b = false;
        }
        blrVar.q(dfv.i(jB) ? bdu.c : bdu.b);
        return jB;
    }
}
