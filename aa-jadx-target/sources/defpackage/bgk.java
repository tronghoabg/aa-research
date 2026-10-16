package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bgk implements defpackage.bht {
    public final android.view.View a;
    public final defpackage.afer b;
    public android.view.ActionMode f;
    public java.lang.Runnable g;
    public java.lang.Runnable h;
    private final defpackage.bil i = new defpackage.bil((byte[]) null, (char[]) null);
    public final defpackage.cez c = new defpackage.cez(new defpackage.bge(this, 1));
    public final defpackage.affc d = new defpackage.bge(this, 0);
    public final defpackage.affc e = new defpackage.bge(this, 2);

    public bgk(android.view.View view, defpackage.afer aferVar) {
        this.a = view;
        this.b = aferVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    public final java.lang.Object a(java.lang.Object obj, defpackage.affc affcVar, defpackage.afer aferVar) throws afbj {
        defpackage.afgv afgvVar = new defpackage.afgv();
        this.c.b(obj, affcVar, new defpackage.ajz(afgvVar, aferVar, 13));
        java.lang.Object obj2 = afgvVar.a;
        if (obj2 != null) {
            return obj2;
        }
        defpackage.afga.d("result");
        return defpackage.afbk.a;
    }

    @Override // defpackage.bht
    public final java.lang.Object b(defpackage.bhs bhsVar, defpackage.afdk afdkVar) {
        java.lang.Object objR = this.i.r(defpackage.akv.a, new defpackage.bgj(this, bhsVar, (defpackage.afdk) null, 0), afdkVar);
        return objR == defpackage.afdr.a ? objR : defpackage.afbk.a;
    }
}
