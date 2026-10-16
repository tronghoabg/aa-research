package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class airb {
    public static final defpackage.ajob a(java.lang.String str) {
        if ((str.length() & 1) != 0) {
            throw new java.lang.IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            bArr[i] = (byte) ((defpackage.aiuz.d(str.charAt(i2)) << 4) + defpackage.aiuz.d(str.charAt(i2 + 1)));
        }
        return new defpackage.ajob(bArr);
    }

    public static final defpackage.ajob b(java.lang.String str) {
        str.getClass();
        defpackage.ajob ajobVar = new defpackage.ajob(defpackage.airw.b(str));
        ajobVar.d = str;
        return ajobVar;
    }

    public static final defpackage.ajob c(byte... bArr) {
        bArr.getClass();
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        return new defpackage.ajob(bArrCopyOf);
    }

    public static /* synthetic */ int m(boolean z) {
        return z ? 1231 : 1237;
    }
}
