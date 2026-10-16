package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bhi implements defpackage.bhs {
    final /* synthetic */ defpackage.bhk a;
    private final long b;

    public bhi(defpackage.bhk bhkVar, long j) {
        this.a = bhkVar;
        this.b = j;
    }

    @Override // defpackage.bhs
    public final long a(defpackage.ctc ctcVar) {
        defpackage.ctc ctcVar2 = (defpackage.ctc) this.a.b.a();
        if (ctcVar2 == null) {
            defpackage.asq.b("Tried to open context menu before the anchor was placed.");
            throw new defpackage.afap();
        }
        if (ctcVar2.t()) {
            return ctcVar.m(ctcVar2.k(this.b));
        }
        return 0L;
    }

    @Override // defpackage.bhs
    public final defpackage.bfx b() {
        return defpackage.axd.T(this.a);
    }

    @Override // defpackage.bhs
    public final defpackage.cjj c(defpackage.ctc ctcVar) {
        return defpackage.bzo.C(a(ctcVar), 0L);
    }
}
