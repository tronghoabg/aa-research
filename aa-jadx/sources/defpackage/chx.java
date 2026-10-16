package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class chx extends defpackage.cyc<defpackage.chy> {
    private final defpackage.affc a;

    public chx(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.chy(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.chy) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.chx) && this.a == ((defpackage.chx) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
