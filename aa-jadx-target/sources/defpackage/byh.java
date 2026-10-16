package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class byh extends defpackage.cfd implements defpackage.ces, defpackage.bwx, defpackage.bys {
    private defpackage.byg a;

    public byh(float f) {
        defpackage.cej cejVarB = defpackage.cer.b();
        defpackage.byg bygVar = new defpackage.byg(cejVarB.v(), f);
        if (!(cejVarB instanceof defpackage.cec)) {
            bygVar.h = new defpackage.byg(1L, f);
        }
        this.a = bygVar;
    }

    @Override // defpackage.bwx, defpackage.bys
    public final /* synthetic */ java.lang.Object a() {
        return java.lang.Float.valueOf(e());
    }

    @Override // defpackage.bwx
    public final /* synthetic */ void b(java.lang.Object obj) {
        h(((java.lang.Number) obj).floatValue());
    }

    @Override // defpackage.cfc
    /* JADX INFO: renamed from: c */
    public final defpackage.cfe getA() {
        return this.a;
    }

    @Override // defpackage.cfc
    public final void d(defpackage.cfe cfeVar) {
        cfeVar.getClass();
        this.a = (defpackage.byg) cfeVar;
    }

    public final float e() {
        return ((defpackage.byg) defpackage.cer.h(this.a, this)).a;
    }

    @Override // defpackage.ces
    public final defpackage.byo f() {
        return defpackage.bxv.c;
    }

    @Override // defpackage.cfd, defpackage.cfc
    public final defpackage.cfe g(defpackage.cfe cfeVar, defpackage.cfe cfeVar2, defpackage.cfe cfeVar3) {
        if (((defpackage.byg) cfeVar2).a == ((defpackage.byg) cfeVar3).a) {
            return cfeVar2;
        }
        return null;
    }

    public final void h(float f) {
        defpackage.cej cejVarB;
        defpackage.byg bygVar = (defpackage.byg) defpackage.cer.e(this.a, this);
        if (bygVar.a == f) {
            return;
        }
        defpackage.byg bygVar2 = this.a;
        synchronized (defpackage.cer.b) {
            cejVarB = defpackage.cer.b();
            ((defpackage.byg) defpackage.cer.g(bygVar2, this, cejVarB, bygVar)).a = f;
        }
        defpackage.cer.q(cejVarB, this);
    }

    public final java.lang.String toString() {
        return "MutableFloatState(value=" + ((defpackage.byg) defpackage.cer.e(this.a, this)).a + ")@" + hashCode();
    }
}
