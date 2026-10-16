package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bhv extends defpackage.cyc<defpackage.bhy> {
    private final defpackage.afer a;

    public bhv(defpackage.afer aferVar) {
        this.a = aferVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.bhy(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.bhy) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.bhv) && this.a == ((defpackage.bhv) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
