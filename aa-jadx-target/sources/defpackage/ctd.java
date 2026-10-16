package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ctd extends defpackage.cyc<defpackage.cti> {
    private final defpackage.affh a;

    public ctd(defpackage.affh affhVar) {
        this.a = affhVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.cti(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.cti) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ctd) && this.a == ((defpackage.ctd) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
