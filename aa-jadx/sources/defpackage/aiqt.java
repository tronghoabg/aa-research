package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aiqt {
    private aiqt() {
    }

    public static final int a(defpackage.ajob ajobVar, int i) {
        return i == -1234567890 ? ajobVar.c() : i;
    }

    public static final java.lang.String b(byte b) {
        char[] cArr = defpackage.ajph.a;
        return new java.lang.String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    public static final java.lang.String c(int i) {
        if (i == 0) {
            return com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.DBG_VALUE;
        }
        char[] cArr = defpackage.ajph.a;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        if (i2 < 0) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bm(i2, "startIndex: ", ", endIndex: 8, size: 8"));
        }
        if (i2 <= 8) {
            return new java.lang.String(cArr2, i2, 8 - i2);
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bm(i2, "startIndex: ", " > endIndex: 8"));
    }

    public static final void d(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new java.lang.ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final boolean e(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public final <T> defpackage.aiqv<T> create(java.util.Collection<? extends T> collection) {
        collection.getClass();
        defpackage.aiqv<T> aiqvVar = new defpackage.aiqv<>(null);
        aiqvVar.addAll(collection);
        return aiqvVar;
    }

    public /* synthetic */ aiqt(defpackage.affu affuVar) {
        this();
    }

    public final <T> defpackage.aiqv<T> create() {
        return new defpackage.aiqv<>(null);
    }
}
