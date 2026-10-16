package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lms implements defpackage.eqt {
    public final /* synthetic */ defpackage.lmt a;
    private final defpackage.eqt b = new defpackage.lkt(2);
    private final defpackage.eqt c = new defpackage.kqk(this, 14);
    private defpackage.eqp d;
    private defpackage.eqp e;

    public lms(defpackage.lmt lmtVar) {
        this.a = lmtVar;
    }

    public final void b() {
        defpackage.eqp eqpVar = this.d;
        if (eqpVar != null) {
            eqpVar.k(this.b);
            this.d = null;
        }
        defpackage.eqp eqpVar2 = this.e;
        if (eqpVar2 != null) {
            eqpVar2.k(this.c);
            this.e = null;
        }
    }

    @Override // defpackage.eqt
    public final /* bridge */ /* synthetic */ void ea(java.lang.Object obj) {
        android.content.ComponentName componentName = (android.content.ComponentName) obj;
        b();
        defpackage.lmt lmtVar = this.a;
        android.content.ComponentName componentName2 = lmtVar.a;
        if (componentName2 != null) {
            lmtVar.f.remove(componentName2);
        }
        lmtVar.a = componentName;
        lmtVar.b = false;
        if (componentName != null) {
            defpackage.eqp eqpVarF = defpackage.lpg.j().f(componentName);
            this.d = eqpVarF;
            eqpVarF.eM(lmtVar, this.b);
        }
        java.util.Iterator it = lmtVar.e.iterator();
        while (it.hasNext()) {
            ((ljy) it.next()).a(componentName);
        }
        if (componentName != null) {
            defpackage.eqp eqpVarA = defpackage.lot.a(componentName);
            this.e = eqpVarA;
            eqpVarA.eM(lmtVar, this.c);
        }
    }
}
