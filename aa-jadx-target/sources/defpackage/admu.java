package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class admu extends defpackage.admy {
    private final admv e;

    public admu(java.lang.String str, admv admvVar) {
        super(str, false, admvVar);
        defpackage.ysr.bg(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        admvVar.getClass();
        this.e = admvVar;
    }

    @Override // defpackage.admy
    public final java.lang.Object a(byte[] bArr) {
        return this.e.a(new java.lang.String(bArr, java.nio.charset.StandardCharsets.US_ASCII));
    }

    @Override // defpackage.admy
    public final byte[] b(java.lang.Object obj) {
        return this.e.b(obj).getBytes(java.nio.charset.StandardCharsets.US_ASCII);
    }
}
