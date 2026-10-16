package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class avw extends defpackage.cyc<defpackage.avy> {
    private final defpackage.avv a;

    public avw(defpackage.avv avvVar) {
        this.a = avvVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.avy(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.avy) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.avw avwVar = obj instanceof defpackage.avw ? (defpackage.avw) obj : null;
        if (avwVar == null) {
            return false;
        }
        return defpackage.afga.f(this.a, avwVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
