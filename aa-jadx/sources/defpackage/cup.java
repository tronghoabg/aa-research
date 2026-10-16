package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cup extends defpackage.cyc<defpackage.cuq> {
    private final defpackage.affc a;

    public cup(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.cuq(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.cuq cuqVar = (defpackage.cuq) cgeVar;
        cuqVar.a = this.a;
        cuqVar.b = -9223372034707292160L;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cup) && this.a == ((defpackage.cup) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
