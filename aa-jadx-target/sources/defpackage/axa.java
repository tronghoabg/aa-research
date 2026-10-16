package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class axa extends defpackage.cyc<defpackage.axc> {
    private final boolean a;
    private final defpackage.affg b;
    private final java.lang.Object c;
    private final int d;

    public axa(int i, boolean z, defpackage.affg affgVar, java.lang.Object obj) {
        this.d = i;
        this.a = z;
        this.b = affgVar;
        this.c = obj;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.axc(this.d, this.a, this.b);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.axc axcVar = (defpackage.axc) cgeVar;
        axcVar.c = this.d;
        axcVar.a = this.a;
        axcVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.axa axaVar = (defpackage.axa) obj;
        return this.d == axaVar.d && this.a == axaVar.a && defpackage.afga.f(this.c, axaVar.c);
    }

    public final int hashCode() {
        return (((this.d * 31) + (true != this.a ? 1237 : 1231)) * 31) + this.c.hashCode();
    }
}
