package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bhc extends defpackage.cyc<defpackage.bhd> {
    private final defpackage.affg a;

    public bhc(defpackage.affg affgVar) {
        this.a = affgVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.bhd(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.bhd) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.bhc) && this.a == ((defpackage.bhc) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
