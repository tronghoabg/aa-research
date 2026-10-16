package defpackage;

/* loaded from: classes3.dex */
public final class ujb implements uko {
    private static final yob g = yob.c("com/google/android/libraries/geo/mapcore/internal/model/ImageTile");
    private static final byte[] h = {76, 84, 73, 80, 10};
    private static final byte[] i = {-1, -40};
    private static final byte[] j = {-119, 80, 78, 71};
    private static final byte[] k = {71, 73, 70, 56, 57, 97};
    private static final byte[] l = {82, 73, 70, 70};
    public final ukp a;
    public final byte[] b;
    public int c;
    public final yfq d;
    public final yfq e;
    public final int f;
    private final abgl m;
    private final int n;
    private pka o;
    private toz p;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        r2 = new byte[4];
        java.lang.System.arraycopy(r9, 5, r2, 0, 4);
        defpackage.woy.T(true, "array too small: %s < %s", 4, 4);
        r11 = (((r2[0] << 24) | ((r2[1] & 255) << 16)) | ((r2[2] & 255) << 8)) | (r2[3] & 255);
        r0 = java.lang.Math.abs(r11);
        r2 = new java.io.ByteArrayInputStream(r9, 9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        if (r11 >= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        r2 = new java.util.zip.GZIPInputStream(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        r11 = defpackage.acjc.a;
        r6.c = (defpackage.acjc) defpackage.abnv.L(defpackage.acjc.class).e(r2);
        r2.close();
        r6.d = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
    
        r0 = r0 + 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        ((defpackage.ynz) ((defpackage.ynz) defpackage.ujs.a.a(defpackage.uys.a).p(r11)).ai(9387)).u("IOException reading map tile info");
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ujb(defpackage.pka r6, defpackage.abgl r7, defpackage.ukp r8, byte[] r9, defpackage.toz r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujb.<init>(pka, abgl, ukp, byte[], toz, int):void");
    }

    public static boolean g(byte[] bArr) {
        return h(bArr, h) || h(bArr, i) || h(bArr, j) || h(bArr, k) || h(bArr, l);
    }

    private static boolean h(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.uko
    public final int a() {
        return this.n;
    }

    @Override // defpackage.uko
    public final synchronized pka b() {
        return this.o;
    }

    @Override // defpackage.uko
    public final synchronized toz c() {
        return this.p;
    }

    @Override // defpackage.uko
    public final abgl d() {
        return this.m;
    }

    @Override // defpackage.uko
    public final synchronized void e(pka pkaVar) {
        this.o = pkaVar;
    }

    @Override // defpackage.uko
    public final synchronized void f(toz tozVar) {
        this.p = tozVar;
    }
}
