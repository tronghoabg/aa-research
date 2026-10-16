package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ayo extends defpackage.cyc<defpackage.ayp> {
    private final defpackage.azi a;

    public ayo(defpackage.azi aziVar) {
        this.a = aziVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.ayp(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.ayp aypVar = (defpackage.ayp) cgeVar;
        defpackage.azi aziVar = aypVar.a;
        defpackage.azi aziVar2 = this.a;
        if (defpackage.afga.f(aziVar, aziVar2) || !aypVar.q.A) {
            return;
        }
        aypVar.a.c();
        aziVar2.b = aypVar;
        aypVar.a = aziVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ayo) && defpackage.afga.f(this.a, ((defpackage.ayo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ")";
    }
}
