package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cui extends defpackage.cyc<defpackage.cuk> {
    private final defpackage.affc a;

    public cui(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.cuk(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.cuk) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cui) && this.a == ((defpackage.cui) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
