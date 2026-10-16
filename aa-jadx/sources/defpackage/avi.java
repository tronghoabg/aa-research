package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class avi extends defpackage.cyc<defpackage.avj> {
    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.avj();
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.avj avjVar = (defpackage.avj) cgeVar;
        avjVar.b = 2;
        avjVar.a = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.avi ? (defpackage.avi) obj : null) != null;
    }

    public final int hashCode() {
        return 1293;
    }
}
