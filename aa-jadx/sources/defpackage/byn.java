package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class byn<T> extends defpackage.cfd implements defpackage.ces<T> {
    public final defpackage.byo a;
    private defpackage.bym b;

    public byn(java.lang.Object obj, defpackage.byo byoVar) {
        this.a = byoVar;
        defpackage.cej cejVarB = defpackage.cer.b();
        defpackage.bym bymVar = new defpackage.bym(cejVarB.v(), obj);
        if (!(cejVarB instanceof defpackage.cec)) {
            bymVar.h = new defpackage.bym(1L, obj);
        }
        this.b = bymVar;
    }

    @Override // defpackage.bwx, defpackage.bys
    public final java.lang.Object a() {
        return ((defpackage.bym) defpackage.cer.h(this.b, this)).a;
    }

    @Override // defpackage.bwx
    public final void b(java.lang.Object obj) {
        defpackage.cej cejVarB;
        defpackage.bym bymVar = (defpackage.bym) defpackage.cer.e(this.b, this);
        if (this.a.a(bymVar.a, obj)) {
            return;
        }
        defpackage.bym bymVar2 = this.b;
        synchronized (defpackage.cer.b) {
            cejVarB = defpackage.cer.b();
            ((defpackage.bym) defpackage.cer.g(bymVar2, this, cejVarB, bymVar)).a = obj;
        }
        defpackage.cer.q(cejVarB, this);
    }

    @Override // defpackage.cfc
    /* JADX INFO: renamed from: c */
    public final defpackage.cfe getA() {
        return this.b;
    }

    @Override // defpackage.cfc
    public final void d(defpackage.cfe cfeVar) {
        cfeVar.getClass();
        this.b = (defpackage.bym) cfeVar;
    }

    @Override // defpackage.ces
    public final defpackage.byo f() {
        return this.a;
    }

    @Override // defpackage.cfd, defpackage.cfc
    public final defpackage.cfe g(defpackage.cfe cfeVar, defpackage.cfe cfeVar2, defpackage.cfe cfeVar3) {
        java.lang.Object obj = ((defpackage.bym) cfeVar2).a;
        java.lang.Object obj2 = ((defpackage.bym) cfeVar3).a;
        defpackage.byo byoVar = this.a;
        if (byoVar.a(obj, obj2)) {
            return cfeVar2;
        }
        byoVar.b();
        return null;
    }

    public final java.lang.String toString() {
        return "MutableState(value=" + ((defpackage.bym) defpackage.cer.e(this.b, this)).a + ")@" + hashCode();
    }
}
