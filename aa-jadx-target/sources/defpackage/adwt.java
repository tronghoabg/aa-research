package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adwt extends defpackage.adjx {
    public final java.lang.String b;
    final /* synthetic */ defpackage.adww c;
    public final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference(defpackage.adww.e);
    private final defpackage.adjx d = new defpackage.adwp(this);

    public adwt(defpackage.adww adwwVar, java.lang.String str) {
        this.c = adwwVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.adjx
    public final java.lang.String a() {
        return this.b;
    }

    final void b(defpackage.adll adllVar) {
        java.util.Collection collection;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.a;
        defpackage.adll adllVar2 = (defpackage.adll) atomicReference.get();
        atomicReference.set(adllVar);
        if (adllVar2 != defpackage.adww.e || (collection = this.c.v) == null) {
            return;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((adws) it.next()).aT();
        }
    }

    public final defpackage.adrq c(defpackage.adng adngVar, defpackage.adjw adjwVar) {
        defpackage.adll adllVar = (defpackage.adll) this.a.get();
        if (adllVar == null) {
            return this.d.d(adngVar, adjwVar);
        }
        if (!(adllVar instanceof defpackage.adxg)) {
            return new adwj(adllVar, this.d, this.c.k, adngVar, adjwVar);
        }
        defpackage.adxf adxfVarB = ((defpackage.adxg) adllVar).b.b(adngVar);
        if (adxfVarB != null) {
            adjwVar = adjwVar.f(defpackage.adxf.a, adxfVarB);
        }
        return this.d.d(adngVar, adjwVar);
    }

    @Override // defpackage.adjx
    public final defpackage.adrq d(defpackage.adng adngVar, defpackage.adjw adjwVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.a;
        java.lang.Object obj = atomicReference.get();
        defpackage.adll adllVar = defpackage.adww.e;
        if (obj != adllVar) {
            return c(adngVar, adjwVar);
        }
        defpackage.adww adwwVar = this.c;
        defpackage.adug adugVar = new defpackage.adug(this, 18);
        defpackage.adox adoxVar = adwwVar.m;
        adoxVar.execute(adugVar);
        if (atomicReference.get() != adllVar) {
            return c(adngVar, adjwVar);
        }
        if (adwwVar.z.get()) {
            return new adwq();
        }
        adws adwsVar = new adws(this, defpackage.adkr.k(), adngVar, adjwVar);
        adoxVar.execute(new defpackage.adwr(this, adwsVar, 0));
        return adwsVar;
    }
}
