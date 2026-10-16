package defpackage;

/* loaded from: classes.dex */
public class byd extends cew implements cel, bwq, bym {
    private byc a;

    public byd(int i) {
        cec cecVarB = cek.b();
        byc bycVar = new byc(cecVarB.v(), i);
        if (!(cecVarB instanceof cdv)) {
            bycVar.h = new byc(1L, i);
        }
        this.a = bycVar;
    }

    @Override // defpackage.bwq, defpackage.bym
    public final /* synthetic */ Object a() {
        return Integer.valueOf(e());
    }

    @Override // defpackage.bwq
    public final /* synthetic */ void b(Object obj) {
        h(((Number) obj).intValue());
    }

    @Override // defpackage.cev
    /* renamed from: c */
    public final cex getA() {
        return this.a;
    }

    @Override // defpackage.cev
    public final void d(cex cexVar) {
        cexVar.getClass();
        this.a = (byc) cexVar;
    }

    public final int e() {
        return ((byc) cek.h(this.a, this)).a;
    }

    @Override // defpackage.cel
    public final byi f() {
        return bxp.c;
    }

    @Override // defpackage.cew, defpackage.cev
    public final cex g(cex cexVar, cex cexVar2, cex cexVar3) {
        if (((byc) cexVar2).a == ((byc) cexVar3).a) {
            return cexVar2;
        }
        return null;
    }

    public final void h(int i) {
        cec cecVarB;
        byc bycVar = (byc) cek.e(this.a, this);
        if (bycVar.a != i) {
            byc bycVar2 = this.a;
            synchronized (cek.b) {
                cecVarB = cek.b();
                ((byc) cek.g(bycVar2, this, cecVarB, bycVar)).a = i;
            }
            cek.q(cecVarB, this);
        }
    }

    public final String toString() {
        return "MutableIntState(value=" + ((byc) cek.e(this.a, this)).a + ")@" + hashCode();
    }
}
