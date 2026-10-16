package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class byj extends defpackage.cfd implements defpackage.ces, defpackage.bwx, defpackage.bys {
    private defpackage.byi a;

    public byj(int i) {
        defpackage.cej cejVarB = defpackage.cer.b();
        defpackage.byi byiVar = new defpackage.byi(cejVarB.v(), i);
        if (!(cejVarB instanceof defpackage.cec)) {
            byiVar.h = new defpackage.byi(1L, i);
        }
        this.a = byiVar;
    }

    @Override // defpackage.bwx, defpackage.bys
    public final /* synthetic */ java.lang.Object a() {
        return java.lang.Integer.valueOf(e());
    }

    @Override // defpackage.bwx
    public final /* synthetic */ void b(java.lang.Object obj) {
        h(((java.lang.Number) obj).intValue());
    }

    @Override // defpackage.cfc
    /* JADX INFO: renamed from: c */
    public final defpackage.cfe getA() {
        return this.a;
    }

    @Override // defpackage.cfc
    public final void d(defpackage.cfe cfeVar) {
        cfeVar.getClass();
        this.a = (defpackage.byi) cfeVar;
    }

    public final int e() {
        return ((defpackage.byi) defpackage.cer.h(this.a, this)).a;
    }

    @Override // defpackage.ces
    public final defpackage.byo f() {
        return defpackage.bxv.c;
    }

    @Override // defpackage.cfd, defpackage.cfc
    public final defpackage.cfe g(defpackage.cfe cfeVar, defpackage.cfe cfeVar2, defpackage.cfe cfeVar3) {
        if (((defpackage.byi) cfeVar2).a == ((defpackage.byi) cfeVar3).a) {
            return cfeVar2;
        }
        return null;
    }

    public final void h(int i) {
        defpackage.cej cejVarB;
        defpackage.byi byiVar = (defpackage.byi) defpackage.cer.e(this.a, this);
        if (byiVar.a != i) {
            defpackage.byi byiVar2 = this.a;
            synchronized (defpackage.cer.b) {
                cejVarB = defpackage.cer.b();
                ((defpackage.byi) defpackage.cer.g(byiVar2, this, cejVarB, byiVar)).a = i;
            }
            defpackage.cer.q(cejVarB, this);
        }
    }

    public final java.lang.String toString() {
        return "MutableIntState(value=" + ((defpackage.byi) defpackage.cer.e(this.a, this)).a + ")@" + hashCode();
    }
}
