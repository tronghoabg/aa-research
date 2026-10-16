package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class avo extends defpackage.cyc<defpackage.avp> {
    private final defpackage.affc a;

    public avo(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.avp(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.avp avpVar = (defpackage.avp) cgeVar;
        defpackage.affc affcVar = avpVar.a;
        defpackage.affc affcVar2 = this.a;
        if (affcVar != affcVar2 || !avpVar.b) {
            defpackage.cjv.r(avpVar).W(false);
        }
        avpVar.a = affcVar2;
        avpVar.b = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.avo avoVar = obj instanceof defpackage.avo ? (defpackage.avo) obj : null;
        return avoVar != null && this.a == avoVar.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public final java.lang.String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=true)";
    }
}
