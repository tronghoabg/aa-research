package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ajx extends defpackage.cyc<defpackage.akb> {
    private final defpackage.ask a;

    public ajx(defpackage.ask askVar) {
        this.a = askVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.akb(this.a, 1, null);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.akb) cgeVar).b(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ajx) && defpackage.afga.f(this.a, ((defpackage.ajx) obj).a);
    }

    public final int hashCode() {
        defpackage.ask askVar = this.a;
        if (askVar != null) {
            return askVar.hashCode();
        }
        return 0;
    }
}
