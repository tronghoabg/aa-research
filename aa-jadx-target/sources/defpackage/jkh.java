package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jkh extends defpackage.jhj {
    final /* synthetic */ defpackage.jki a;

    public jkh(defpackage.jki jkiVar) {
        this.a = jkiVar;
    }

    @Override // defpackage.jhk
    public final java.lang.String a() {
        return this.a.d;
    }

    @Override // defpackage.jhj, defpackage.jhk
    public final void b(defpackage.jhl jhlVar) {
        defpackage.jki jkiVar = this.a;
        jkiVar.b.K(jhlVar, false);
        jkiVar.b();
    }

    @Override // defpackage.jhj, defpackage.jhk
    public final void e(defpackage.jhl jhlVar, int i, int i2) {
        defpackage.jki jkiVar = this.a;
        jkiVar.b();
        if (jkiVar.e) {
            jkiVar.b.q(jhlVar);
            jkiVar.e = false;
        }
    }

    @Override // defpackage.jhj, defpackage.jhk
    public final void f(defpackage.jhl jhlVar, android.view.KeyEvent keyEvent) {
        defpackage.jki.a.l().u("Input events to the loading screen do nothing");
    }

    @Override // defpackage.jhj, defpackage.jhk
    public final void g(defpackage.jhl jhlVar, android.view.MotionEvent motionEvent) {
        defpackage.jki.a.l().u("Input events on the loading screen do nothing");
    }
}
