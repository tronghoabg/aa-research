package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class avf extends defpackage.cyc<defpackage.avg> {
    private final int a;

    public avf(int i) {
        this.a = i;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.avg(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.avg avgVar = (defpackage.avg) cgeVar;
        avgVar.b = this.a;
        avgVar.a = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.avf avfVar = obj instanceof defpackage.avf ? (defpackage.avf) obj : null;
        return avfVar != null && this.a == avfVar.a;
    }

    public final int hashCode() {
        return (this.a * 31) + 1231;
    }
}
