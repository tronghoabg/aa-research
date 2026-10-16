package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class ajkk extends ajkj {
    final /* synthetic */ ajkn c;
    private long d;
    private boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajkk(ajkn ajknVar, ajhx ajhxVar) {
        super(ajknVar, ajhxVar);
        this.c = ajknVar;
        this.d = -1L;
        this.e = true;
    }

    @Override // defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.e && !ajis.k(this, TimeUnit.MILLISECONDS)) {
            this.c.c.h();
            c(ajkn.a);
        }
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014c, code lost:
    
        r4.b -= r5;
        r23.d = r10;
        r2 = defpackage.afyh.k(((defpackage.ajnw) r18).p(Long.MAX_VALUE)).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016d, code lost:
    
        if (r23.d < r16) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0173, code lost:
    
        if (r2.length() <= 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017c, code lost:
    
        if (defpackage.afyh.g(r2, ";", false) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0182, code lost:
    
        if (r23.d != r16) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0184, code lost:
    
        r23.e = false;
        c(r1.e.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0192, code lost:
    
        if (r23.e == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e1, code lost:
    
        throw new java.net.ProtocolException("expected chunk size and optional extensions but was \"" + r23.d + r2 + "\"");
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[Catch: NumberFormatException -> 0x01e8, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01e8, blocks: (B:16:0x0036, B:17:0x0045, B:20:0x0063, B:31:0x0088, B:32:0x009a, B:33:0x009b, B:36:0x00aa, B:38:0x00b7, B:41:0x00bd, B:52:0x00db, B:54:0x00e3, B:55:0x00f6, B:56:0x0110, B:46:0x00ca, B:51:0x00d7, B:64:0x0129, B:67:0x0137, B:71:0x014c, B:73:0x016f, B:75:0x0175, B:89:0x01c1, B:90:0x01e1, B:65:0x0133, B:60:0x0117, B:61:0x0124, B:91:0x01e2, B:92:0x01e7), top: B:98:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088 A[Catch: NumberFormatException -> 0x01e8, TryCatch #0 {NumberFormatException -> 0x01e8, blocks: (B:16:0x0036, B:17:0x0045, B:20:0x0063, B:31:0x0088, B:32:0x009a, B:33:0x009b, B:36:0x00aa, B:38:0x00b7, B:41:0x00bd, B:52:0x00db, B:54:0x00e3, B:55:0x00f6, B:56:0x0110, B:46:0x00ca, B:51:0x00d7, B:64:0x0129, B:67:0x0137, B:71:0x014c, B:73:0x016f, B:75:0x0175, B:89:0x01c1, B:90:0x01e1, B:65:0x0133, B:60:0x0117, B:61:0x0124, B:91:0x01e2, B:92:0x01e7), top: B:98:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0129 A[Catch: NumberFormatException -> 0x01e8, TryCatch #0 {NumberFormatException -> 0x01e8, blocks: (B:16:0x0036, B:17:0x0045, B:20:0x0063, B:31:0x0088, B:32:0x009a, B:33:0x009b, B:36:0x00aa, B:38:0x00b7, B:41:0x00bd, B:52:0x00db, B:54:0x00e3, B:55:0x00f6, B:56:0x0110, B:46:0x00ca, B:51:0x00d7, B:64:0x0129, B:67:0x0137, B:71:0x014c, B:73:0x016f, B:75:0x0175, B:89:0x01c1, B:90:0x01e1, B:65:0x0133, B:60:0x0117, B:61:0x0124, B:91:0x01e2, B:92:0x01e7), top: B:98:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133 A[Catch: NumberFormatException -> 0x01e8, TryCatch #0 {NumberFormatException -> 0x01e8, blocks: (B:16:0x0036, B:17:0x0045, B:20:0x0063, B:31:0x0088, B:32:0x009a, B:33:0x009b, B:36:0x00aa, B:38:0x00b7, B:41:0x00bd, B:52:0x00db, B:54:0x00e3, B:55:0x00f6, B:56:0x0110, B:46:0x00ca, B:51:0x00d7, B:64:0x0129, B:67:0x0137, B:71:0x014c, B:73:0x016f, B:75:0x0175, B:89:0x01c1, B:90:0x01e1, B:65:0x0133, B:60:0x0117, B:61:0x0124, B:91:0x01e2, B:92:0x01e7), top: B:98:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009b A[EDGE_INSN: B:99:0x009b->B:33:0x009b BREAK  A[LOOP:0: B:17:0x0045->B:28:0x007a], SYNTHETIC] */
    @Override // defpackage.ajkj, defpackage.ajoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long hU(defpackage.ajmy r24, long r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajkk.hU(ajmy, long):long");
    }
}
