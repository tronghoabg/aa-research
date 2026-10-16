package defpackage;

/* loaded from: classes.dex */
final class adma extends adlx {
    private final admb e;

    public adma(String str, boolean z, admb admbVar) {
        super(str, z, admbVar);
        woy.W(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        admbVar.getClass();
        this.e = admbVar;
    }

    @Override // defpackage.adlx
    public final Object a(byte[] bArr) {
        return this.e.a(bArr);
    }

    @Override // defpackage.adlx
    public final byte[] b(Object obj) {
        byte[] bArrB = this.e.b(obj);
        bArrB.getClass();
        return bArrB;
    }
}
