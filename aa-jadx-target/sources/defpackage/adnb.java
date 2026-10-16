package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adnb extends defpackage.admy {
    private final adnc e;

    public adnb(java.lang.String str, boolean z, adnc adncVar) {
        super(str, z, adncVar);
        defpackage.ysr.bg(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        adncVar.getClass();
        this.e = adncVar;
    }

    @Override // defpackage.admy
    public final java.lang.Object a(byte[] bArr) {
        return this.e.a(bArr);
    }

    @Override // defpackage.admy
    public final byte[] b(java.lang.Object obj) {
        byte[] bArrB = this.e.b(obj);
        bArrB.getClass();
        return bArrB;
    }
}
