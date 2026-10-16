package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ayl extends defpackage.cyc<defpackage.ayk> {
    public defpackage.ayk a;
    public aium b;

    @Override // defpackage.cyc
    public final /* synthetic */ defpackage.cge d() {
        return new defpackage.ayk(this);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
    }

    public final boolean equals(java.lang.Object obj) {
        return obj == this;
    }

    public final java.lang.Object f(defpackage.afdk afdkVar) {
        aium aiumVar = this.b;
        if (aiumVar == null) {
            aiumVar = new aium();
            this.b = aiumVar;
            defpackage.ayk aykVar = this.a;
            if (aykVar != null && aykVar.A) {
                aykVar.b();
            }
        }
        java.lang.Object objGX = aiumVar.gX(afdkVar);
        return objGX == defpackage.afdr.a ? objGX : defpackage.afbk.a;
    }

    public final int hashCode() {
        return 234;
    }
}
