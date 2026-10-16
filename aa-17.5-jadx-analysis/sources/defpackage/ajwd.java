package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class ajwd implements ajqx {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0015 A[SYNTHETIC] */
    @Override // defpackage.ajqx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ajqj a(defpackage.ajqd r11) {
        /*
            r10 = this;
            j$.util.concurrent.ConcurrentHashMap r10 = r10.a
            java.lang.Object r0 = r10.get(r11)
            ajqj r0 = (defpackage.ajqj) r0
            if (r0 != 0) goto L77
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = -1
            r3 = 0
            r4 = r2
        L15:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L6e
            java.lang.Object r5 = r1.next()
            ajqd r5 = (defpackage.ajqd) r5
            java.lang.String r6 = r11.a
            java.lang.String r7 = r5.a
            boolean r8 = defpackage.a.ao(r6, r7)
            if (r8 == 0) goto L2d
            r6 = 1
            goto L35
        L2d:
            r8 = 0
            if (r6 == 0) goto L34
            if (r7 == 0) goto L34
        L32:
            r6 = r2
            goto L67
        L34:
            r6 = r8
        L35:
            java.lang.String r7 = r11.b
            java.lang.String r8 = r5.b
            boolean r9 = defpackage.a.ao(r7, r8)
            if (r9 == 0) goto L42
            int r6 = r6 + 2
            goto L47
        L42:
            if (r7 == 0) goto L47
            if (r8 == 0) goto L47
            goto L32
        L47:
            int r7 = r11.d
            int r8 = r5.d
            if (r7 != r8) goto L50
            int r6 = r6 + 4
            goto L55
        L50:
            if (r7 == r2) goto L55
            if (r8 == r2) goto L55
            goto L32
        L55:
            java.lang.String r7 = r11.c
            java.lang.String r8 = r5.c
            boolean r9 = defpackage.a.ao(r7, r8)
            if (r9 == 0) goto L62
            int r6 = r6 + 8
            goto L67
        L62:
            if (r7 == 0) goto L67
            if (r8 == 0) goto L67
            goto L32
        L67:
            if (r6 <= r4) goto L6a
            r3 = r5
        L6a:
            if (r6 <= r4) goto L15
            r4 = r6
            goto L15
        L6e:
            if (r3 == 0) goto L77
            java.lang.Object r10 = r10.get(r3)
            ajqj r10 = (defpackage.ajqj) r10
            return r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwd.a(ajqd):ajqj");
    }

    public final String toString() {
        return this.a.toString();
    }
}
