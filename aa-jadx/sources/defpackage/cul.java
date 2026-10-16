package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cul extends defpackage.cyc<defpackage.cun> {
    private final defpackage.affc a;

    public cul(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.cun(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.cun) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cul) && this.a == ((defpackage.cul) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
