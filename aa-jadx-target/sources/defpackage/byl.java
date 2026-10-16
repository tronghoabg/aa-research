package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class byl extends defpackage.cfd implements defpackage.ces, defpackage.bwx, defpackage.bys {
    private defpackage.byk a;

    public byl(long j) {
        defpackage.cej cejVarB = defpackage.cer.b();
        defpackage.byk bykVar = new defpackage.byk(cejVarB.v(), j);
        if (!(cejVarB instanceof defpackage.cec)) {
            bykVar.h = new defpackage.byk(1L, j);
        }
        this.a = bykVar;
    }

    @Override // defpackage.bwx, defpackage.bys
    public final /* synthetic */ java.lang.Object a() {
        return java.lang.Long.valueOf(e());
    }

    @Override // defpackage.bwx
    public final /* synthetic */ void b(java.lang.Object obj) {
        h(((java.lang.Number) obj).longValue());
    }

    @Override // defpackage.cfc
    /* JADX INFO: renamed from: c */
    public final defpackage.cfe getA() {
        return this.a;
    }

    @Override // defpackage.cfc
    public final void d(defpackage.cfe cfeVar) {
        cfeVar.getClass();
        this.a = (defpackage.byk) cfeVar;
    }

    public final long e() {
        return ((defpackage.byk) defpackage.cer.h(this.a, this)).a;
    }

    @Override // defpackage.ces
    public final defpackage.byo f() {
        return defpackage.bxv.c;
    }

    @Override // defpackage.cfd, defpackage.cfc
    public final defpackage.cfe g(defpackage.cfe cfeVar, defpackage.cfe cfeVar2, defpackage.cfe cfeVar3) {
        if (((defpackage.byk) cfeVar2).a == ((defpackage.byk) cfeVar3).a) {
            return cfeVar2;
        }
        return null;
    }

    public final void h(long j) {
        defpackage.cej cejVarB;
        defpackage.byk bykVar = (defpackage.byk) defpackage.cer.e(this.a, this);
        if (bykVar.a != j) {
            defpackage.byk bykVar2 = this.a;
            synchronized (defpackage.cer.b) {
                cejVarB = defpackage.cer.b();
                ((defpackage.byk) defpackage.cer.g(bykVar2, this, cejVarB, bykVar)).a = j;
            }
            defpackage.cer.q(cejVarB, this);
        }
    }

    public final java.lang.String toString() {
        return "MutableLongState(value=" + ((defpackage.byk) defpackage.cer.e(this.a, this)).a + ")@" + hashCode();
    }
}
