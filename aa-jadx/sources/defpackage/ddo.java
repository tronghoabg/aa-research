package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ddo extends defpackage.cyc<defpackage.ddq> implements defpackage.cgd {
    public final boolean a;
    public final defpackage.affc b;

    public ddo(boolean z, defpackage.affc affcVar) {
        this.a = z;
        this.b = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.ddq(this.a, this.b);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.ddq ddqVar = (defpackage.ddq) cgeVar;
        ddqVar.a = this.a;
        ddqVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ddo)) {
            return false;
        }
        defpackage.ddo ddoVar = (defpackage.ddo) obj;
        return this.a == ddoVar.a && this.b == ddoVar.b;
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }
}
