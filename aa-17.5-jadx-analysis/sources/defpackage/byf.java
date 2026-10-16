package defpackage;

/* loaded from: classes.dex */
public class byf extends cew implements cel, bwq, bym {
    private bye a;

    public byf(long j) {
        cec cecVarB = cek.b();
        bye byeVar = new bye(cecVarB.v(), j);
        if (!(cecVarB instanceof cdv)) {
            byeVar.h = new bye(1L, j);
        }
        this.a = byeVar;
    }

    @Override // defpackage.bwq, defpackage.bym
    public final /* synthetic */ Object a() {
        return Long.valueOf(e());
    }

    @Override // defpackage.bwq
    public final /* synthetic */ void b(Object obj) {
        h(((Number) obj).longValue());
    }

    @Override // defpackage.cev
    /* renamed from: c */
    public final cex getA() {
        return this.a;
    }

    @Override // defpackage.cev
    public final void d(cex cexVar) {
        cexVar.getClass();
        this.a = (bye) cexVar;
    }

    public final long e() {
        return ((bye) cek.h(this.a, this)).a;
    }

    @Override // defpackage.cel
    public final byi f() {
        return bxp.c;
    }

    @Override // defpackage.cew, defpackage.cev
    public final cex g(cex cexVar, cex cexVar2, cex cexVar3) {
        if (((bye) cexVar2).a == ((bye) cexVar3).a) {
            return cexVar2;
        }
        return null;
    }

    public final void h(long j) {
        cec cecVarB;
        bye byeVar = (bye) cek.e(this.a, this);
        if (byeVar.a != j) {
            bye byeVar2 = this.a;
            synchronized (cek.b) {
                cecVarB = cek.b();
                ((bye) cek.g(byeVar2, this, cecVarB, byeVar)).a = j;
            }
            cek.q(cecVarB, this);
        }
    }

    public final String toString() {
        return "MutableLongState(value=" + ((bye) cek.e(this.a, this)).a + ")@" + hashCode();
    }
}
