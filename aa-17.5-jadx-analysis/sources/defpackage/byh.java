package defpackage;

/* loaded from: classes.dex */
public class byh<T> extends cew implements cel<T> {
    public final byi a;
    private byg b;

    public byh(Object obj, byi byiVar) {
        this.a = byiVar;
        cec cecVarB = cek.b();
        byg bygVar = new byg(cecVarB.v(), obj);
        if (!(cecVarB instanceof cdv)) {
            bygVar.h = new byg(1L, obj);
        }
        this.b = bygVar;
    }

    @Override // defpackage.bwq, defpackage.bym
    public final Object a() {
        return ((byg) cek.h(this.b, this)).a;
    }

    @Override // defpackage.bwq
    public final void b(Object obj) {
        cec cecVarB;
        byg bygVar = (byg) cek.e(this.b, this);
        if (this.a.a(bygVar.a, obj)) {
            return;
        }
        byg bygVar2 = this.b;
        synchronized (cek.b) {
            cecVarB = cek.b();
            ((byg) cek.g(bygVar2, this, cecVarB, bygVar)).a = obj;
        }
        cek.q(cecVarB, this);
    }

    @Override // defpackage.cev
    /* renamed from: c */
    public final cex getA() {
        return this.b;
    }

    @Override // defpackage.cev
    public final void d(cex cexVar) {
        cexVar.getClass();
        this.b = (byg) cexVar;
    }

    @Override // defpackage.cel
    public final byi f() {
        return this.a;
    }

    @Override // defpackage.cew, defpackage.cev
    public final cex g(cex cexVar, cex cexVar2, cex cexVar3) {
        Object obj = ((byg) cexVar2).a;
        Object obj2 = ((byg) cexVar3).a;
        byi byiVar = this.a;
        if (byiVar.a(obj, obj2)) {
            return cexVar2;
        }
        byiVar.b();
        return null;
    }

    public final String toString() {
        return "MutableState(value=" + ((byg) cek.e(this.b, this)).a + ")@" + hashCode();
    }
}
