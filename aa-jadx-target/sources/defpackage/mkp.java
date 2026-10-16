package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class mkp extends defpackage.tho {
    public static defpackage.mkp a;
    public static final defpackage.ygw b = defpackage.ygw.q(defpackage.mko.a);
    public android.content.Context c;
    public java.util.concurrent.Executor d;
    protected defpackage.afak e;
    protected defpackage.afak f;

    public abstract defpackage.mko a();

    public final java.lang.Object b(java.lang.Class cls, defpackage.thn thnVar) {
        return c(cls, b, thnVar);
    }

    public final java.lang.Object c(java.lang.Class cls, java.util.List list, defpackage.thn thnVar) {
        defpackage.mko mkoVarA = a();
        defpackage.ysr.bp(list.contains(mkoVarA), "%s cannot be instantiated from %s.", cls.getCanonicalName(), mkoVarA.name());
        java.lang.Object objCast = cls.cast(super.l(cls, false, thnVar));
        objCast.getClass();
        return objCast;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void d(defpackage.afak afakVar, defpackage.afak afakVar2, defpackage.afak afakVar3, defpackage.afak afakVar4) throws wfo {
        defpackage.wfp.c();
        a = this;
        this.c = (android.content.Context) afakVar.a();
        this.d = (java.util.concurrent.Executor) afakVar2.a();
        this.e = afakVar3;
        this.f = afakVar4;
    }

    @Override // defpackage.tho
    public final void e(java.lang.Class cls, defpackage.afak afakVar) {
        n(cls, new defpackage.qez(afakVar, 1));
    }

    public void f() {
    }

    public void g() {
    }
}
