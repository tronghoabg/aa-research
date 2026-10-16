package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bhg extends defpackage.cyc<defpackage.bhk> {
    private final defpackage.affg a;

    public bhg(defpackage.affg affgVar) {
        this.a = affgVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.bhk(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.bhk) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.bhg) && this.a == ((defpackage.bhg) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
