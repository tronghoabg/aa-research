package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cdb implements defpackage.bxw {
    public final defpackage.bzc a = new defpackage.bzc(new defpackage.bxx[16]);
    private final java.util.Set b;

    public cdb(java.util.Set set) {
        this.b = set;
    }

    @Override // defpackage.bxw
    public final void dw() {
        defpackage.bzc bzcVar = this.a;
        java.lang.Object[] objArr = bzcVar.a;
        int i = bzcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.bxw bxwVarA = ((defpackage.bxx) objArr[i2]).a();
            this.b.remove(bxwVarA);
            bxwVarA.dw();
        }
    }

    @Override // defpackage.bxw
    public final void ee() {
    }

    @Override // defpackage.bxw
    public final void ef() {
    }
}
