package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cry extends defpackage.cyc<defpackage.csa> {
    private final defpackage.affc a;
    private final defpackage.affc b = null;

    public cry(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.csa(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.csa) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cry)) {
            return false;
        }
        defpackage.cry cryVar = (defpackage.cry) obj;
        if (this.a != cryVar.a) {
            return false;
        }
        defpackage.affc affcVar = cryVar.b;
        return true;
    }

    public final int hashCode() {
        defpackage.affc affcVar = this.a;
        return (affcVar != null ? affcVar.hashCode() : 0) * 31;
    }
}
