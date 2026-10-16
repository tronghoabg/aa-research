package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bhl extends defpackage.cyc<defpackage.bhn> {
    private final defpackage.affc a;
    private final defpackage.affc b;
    private final defpackage.affc c;
    private final defpackage.vuj d;

    public bhl(defpackage.vuj vujVar, defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.affc affcVar3) {
        this.d = vujVar;
        this.a = affcVar;
        this.b = affcVar2;
        this.c = affcVar3;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.bhn(this.d, this.a, this.b, this.c);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.bhn bhnVar = (defpackage.bhn) cgeVar;
        bhnVar.e.b = null;
        bhnVar.e = this.d;
        defpackage.vuj vujVar = bhnVar.e;
        vujVar.b = bhnVar;
        vujVar.a = true != bhnVar.A ? 2 : 3;
        bhnVar.a = this.a;
        bhnVar.b = this.b;
        bhnVar.c = this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bhl)) {
            return false;
        }
        defpackage.bhl bhlVar = (defpackage.bhl) obj;
        return this.d == bhlVar.d && this.a == bhlVar.a && this.b == bhlVar.b && this.c == bhlVar.c;
    }

    public final int hashCode() {
        return (((((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
