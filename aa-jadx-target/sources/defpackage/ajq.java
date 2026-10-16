package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ajq extends defpackage.cyc<defpackage.ajr> {
    private final defpackage.ask a;
    private final defpackage.afer b;

    public ajq(defpackage.ask askVar, defpackage.afer aferVar) {
        this.a = askVar;
        this.b = aferVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.ajr(this.b, this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.ajr ajrVar = (defpackage.ajr) cgeVar;
        boolean z = ajrVar.b;
        ajrVar.w(this.a, null, false, true, null, null, this.b);
        if (z) {
            return;
        }
        ajrVar.J(false);
        ajrVar.J(true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.ajq ajqVar = (defpackage.ajq) obj;
        return defpackage.afga.f(this.a, ajqVar.a) && this.b == ajqVar.b;
    }

    public final int hashCode() {
        defpackage.ask askVar = this.a;
        return ((((((((askVar != null ? askVar.hashCode() : 0) * 961) + 1237) * 31) + 1231) * 29791) + this.b.hashCode()) * 923521) + 1231;
    }
}
