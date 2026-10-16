package defpackage;

/* loaded from: classes2.dex */
public final class gfs implements gfa {
    private final deu a;

    public gfs(deu deuVar) {
        this.a = deuVar;
    }

    @Override // defpackage.gfa
    public final boolean a() {
        deu deuVar = this.a;
        return (deuVar == null || deuVar.a() == 0) ? false : true;
    }

    @Override // defpackage.gfa
    public final gez b(dfw dfwVar, dlj dljVar, cjv cjvVar, boolean z, bux buxVar, int i) {
        dfwVar.getClass();
        buxVar.v(-32224263);
        gez gezVar = new gez(this.a);
        buxVar.o();
        return gezVar;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
