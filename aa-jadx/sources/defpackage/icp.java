package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class icp extends defpackage.htc {
    public static defpackage.icp b() {
        defpackage.icp icpVar = new defpackage.icp();
        icpVar.d(new defpackage.usc());
        return icpVar;
    }

    public final void c(defpackage.ifh ifhVar) {
        this.a = ifhVar;
    }

    public final void d(defpackage.usc uscVar) {
        c(uscVar.a());
    }

    @Override // defpackage.htc
    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.icp) && super.equals(obj);
    }
}
