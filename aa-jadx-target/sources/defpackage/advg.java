package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class advg implements adlp {
    private final /* synthetic */ int a;

    public advg(int i) {
        this.a = i;
    }

    public final /* synthetic */ java.lang.Object a(byte[] bArr) {
        if (this.a != 0) {
            return bArr;
        }
        if (bArr.length < 3) {
            throw new java.lang.NumberFormatException("Malformed status code ".concat(new java.lang.String(bArr, defpackage.adlq.a)));
        }
        return java.lang.Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
    }

    public final /* synthetic */ byte[] b(java.lang.Object obj) {
        if (this.a != 0) {
            return (byte[]) obj;
        }
        throw new java.lang.UnsupportedOperationException();
    }
}
