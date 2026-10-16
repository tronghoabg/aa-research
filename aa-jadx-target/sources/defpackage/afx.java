package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afx implements defpackage.afd {
    private final int a;
    private final defpackage.aey b;
    private final long c = 0;
    private final int d;

    public afx(int i, defpackage.aey aeyVar, int i2) {
        this.a = i;
        this.b = aeyVar;
        this.d = i2;
    }

    @Override // defpackage.aej
    public final defpackage.agy c(defpackage.bil bilVar) {
        return new defpackage.ahf(this.a, ((defpackage.afr) this.b).c(bilVar), this.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.afx)) {
            return false;
        }
        defpackage.afx afxVar = (defpackage.afx) obj;
        if (afxVar.a != this.a || !defpackage.afga.f(afxVar.b, this.b) || afxVar.d != this.d) {
            return false;
        }
        long j = afxVar.c;
        return true;
    }

    public final int hashCode() {
        return ((((this.a * 31) + this.b.hashCode()) * 31) + this.d) * 31;
    }
}
