package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cpy extends defpackage.cyc<defpackage.cqa> {
    private final defpackage.affc a;
    private final defpackage.affc b;

    public cpy(defpackage.affc affcVar, defpackage.affc affcVar2) {
        this.a = affcVar;
        this.b = affcVar2;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.cqa(this.a, this.b);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.cqa cqaVar = (defpackage.cqa) cgeVar;
        cqaVar.a = this.a;
        cqaVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cpy)) {
            return false;
        }
        defpackage.cpy cpyVar = (defpackage.cpy) obj;
        return this.a == cpyVar.a && this.b == cpyVar.b;
    }

    public final int hashCode() {
        defpackage.affc affcVar = this.a;
        int iHashCode = affcVar != null ? affcVar.hashCode() : 0;
        defpackage.affc affcVar2 = this.b;
        return (iHashCode * 31) + (affcVar2 != null ? affcVar2.hashCode() : 0);
    }
}
