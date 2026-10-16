package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cia extends defpackage.cyc<defpackage.cid> {
    private final defpackage.affc a;

    public cia(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.cid(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.cid) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cia) && this.a == ((defpackage.cia) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
