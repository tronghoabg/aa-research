package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bbi extends defpackage.azc {
    public final defpackage.bwk a;
    private final defpackage.affi b;
    private final defpackage.affc c;

    public bbi(defpackage.affi affiVar, defpackage.affc affcVar, int i) {
        this.b = affiVar;
        this.c = affcVar;
        defpackage.bwk bwkVar = new defpackage.bwk();
        bwkVar.a(i, new defpackage.bbf(affcVar, affiVar));
        this.a = bwkVar;
    }

    @Override // defpackage.azc
    public final defpackage.bwk c() {
        return this.a;
    }
}
