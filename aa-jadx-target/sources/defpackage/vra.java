package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vra {
    public defpackage.vrb a;
    public defpackage.vqu b;
    public final defpackage.vqz c = new defpackage.vqz();

    public vra(defpackage.vsl vslVar, defpackage.vrl vrlVar, defpackage.afak afakVar, defpackage.afak afakVar2) {
        int i = 4;
        defpackage.xzi xziVarAQ = defpackage.ysr.aQ(new defpackage.ryo(afakVar, i));
        defpackage.xzi xziVarAQ2 = defpackage.ysr.aQ(new defpackage.ryo(afakVar2, i));
        if (!((java.lang.Boolean) xziVarAQ2.fF()).booleanValue()) {
            d(vslVar, xziVarAQ, xziVarAQ2);
            c(vrlVar, xziVarAQ, xziVarAQ2);
        } else if (((java.lang.Boolean) xziVarAQ.fF()).booleanValue()) {
            c(vrlVar, xziVarAQ, xziVarAQ2);
        } else {
            d(vslVar, xziVarAQ, xziVarAQ2);
        }
    }

    private final void c(defpackage.vrl vrlVar, defpackage.xzi xziVar, defpackage.xzi xziVar2) {
        this.b = new defpackage.vqu(new defpackage.vqy(this, xziVar2, xziVar, vrlVar, 0));
        vrlVar.g.add(this.b);
    }

    private final void d(defpackage.vsl vslVar, defpackage.xzi xziVar, defpackage.xzi xziVar2) {
        defpackage.vrb vrbVar = new defpackage.vrb(new defpackage.vqy(this, xziVar2, xziVar, vslVar, 1));
        this.a = vrbVar;
        vslVar.a(vrbVar);
    }

    public final void a(defpackage.vqw vqwVar) {
        this.c.b.add(vqwVar);
    }

    public final void b(defpackage.vqw vqwVar) {
        this.c.b.remove(vqwVar);
    }
}
