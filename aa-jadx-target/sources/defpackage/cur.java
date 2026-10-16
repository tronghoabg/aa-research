package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cur extends defpackage.cyc<defpackage.cus> {
    private final long a;
    private final defpackage.affc b;

    public cur(long j, defpackage.affc affcVar) {
        this.a = j;
        this.b = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.cus(this.a, this.b);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.cus cusVar = (defpackage.cus) cgeVar;
        cusVar.a = this.a;
        cusVar.b = 1.0f;
        cusVar.c = this.b;
        defpackage.deq deqVar = cusVar.d;
        if (deqVar != null) {
            cusVar.g(1.0f, deqVar);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.cur curVar = (defpackage.cur) obj;
        return this.a == curVar.a && this.b == curVar.b;
    }

    public final int hashCode() {
        return (((((int) this.a) * 31) + 1065353216) * 961) + this.b.hashCode();
    }
}
