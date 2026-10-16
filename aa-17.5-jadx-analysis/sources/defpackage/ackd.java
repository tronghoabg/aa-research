package defpackage;

/* loaded from: classes3.dex */
public final class ackd {
    private static final double[] b = new double[128];
    public int a = 0;
    private char c;
    private final CharSequence d;
    private final int e;

    static {
        for (int i = 0; i < 128; i++) {
            b[i] = Math.pow(10.0d, i);
        }
    }

    public ackd(CharSequence charSequence) {
        this.d = charSequence;
        this.e = charSequence.length();
        this.c = charSequence.charAt(0);
    }

    private final char d() {
        int i = this.a;
        int i2 = this.e;
        if (i < i2) {
            i++;
            this.a = i;
        }
        if (i == i2) {
            return (char) 0;
        }
        return this.d.charAt(i);
    }

    private static final void e(char c) {
        throw new RuntimeException(a.bZ(c, "Unexpected char '", "'."));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[LOOP:6: B:13:0x0035->B:126:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6 A[PHI: r1 r13 r14
  0x00a6: PHI (r1v7 char) = (r1v6 char), (r1v25 char), (r1v28 char), (r1v24 char) binds: [B:27:0x006d, B:114:0x00a6, B:35:0x008c, B:30:0x0078] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r13v3 int) = (r13v2 int), (r13v6 int), (r13v9 int), (r13v2 int) binds: [B:27:0x006d, B:114:0x00a6, B:35:0x008c, B:30:0x0078] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r14v3 int) = (r14v2 int), (r14v9 int), (r14v2 int), (r14v2 int) binds: [B:27:0x006d, B:114:0x00a6, B:35:0x008c, B:30:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be A[PHI: r3
  0x00be: PHI (r3v1 boolean) = (r3v0 boolean), (r3v3 boolean) binds: [B:45:0x00b1, B:49:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb A[PHI: r1 r3
  0x00cb: PHI (r1v10 char) = (r1v9 char), (r1v8 char) binds: [B:51:0x00c4, B:47:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r3v2 boolean) = (r3v1 boolean), (r3v0 boolean) binds: [B:51:0x00c4, B:47:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a() {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ackd.a():float");
    }

    public final void b() {
        this.c = d();
    }

    public final void c() {
        while (true) {
            int i = this.a;
            if (i >= this.e || !Character.isWhitespace(this.d.charAt(i))) {
                return;
            } else {
                b();
            }
        }
    }
}
