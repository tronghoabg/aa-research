package defpackage;

/* loaded from: classes.dex */
public class byb extends cew implements cel, bwq, bym {
    private bya a;

    public byb(float f) {
        cec cecVarB = cek.b();
        bya byaVar = new bya(cecVarB.v(), f);
        if (!(cecVarB instanceof cdv)) {
            byaVar.h = new bya(1L, f);
        }
        this.a = byaVar;
    }

    @Override // defpackage.bwq, defpackage.bym
    public final /* synthetic */ Object a() {
        return Float.valueOf(e());
    }

    @Override // defpackage.bwq
    public final /* synthetic */ void b(Object obj) {
        h(((Number) obj).floatValue());
    }

    @Override // defpackage.cev
    /* renamed from: c */
    public final cex getA() {
        return this.a;
    }

    @Override // defpackage.cev
    public final void d(cex cexVar) {
        cexVar.getClass();
        this.a = (bya) cexVar;
    }

    public final float e() {
        return ((bya) cek.h(this.a, this)).a;
    }

    @Override // defpackage.cel
    public final byi f() {
        return bxp.c;
    }

    @Override // defpackage.cew, defpackage.cev
    public final cex g(cex cexVar, cex cexVar2, cex cexVar3) {
        if (((bya) cexVar2).a == ((bya) cexVar3).a) {
            return cexVar2;
        }
        return null;
    }

    public final void h(float f) {
        cec cecVarB;
        bya byaVar = (bya) cek.e(this.a, this);
        if (byaVar.a == f) {
            return;
        }
        bya byaVar2 = this.a;
        synchronized (cek.b) {
            cecVarB = cek.b();
            ((bya) cek.g(byaVar2, this, cecVarB, byaVar)).a = f;
        }
        cek.q(cecVarB, this);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((bya) cek.e(this.a, this)).a + ")@" + hashCode();
    }
}
