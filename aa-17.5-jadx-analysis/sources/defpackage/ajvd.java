package defpackage;

/* loaded from: classes2.dex */
public final class ajvd implements ajow {
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
    
        if (java.lang.Long.parseLong(r9[0].c()) < 0) goto L42;
     */
    @Override // defpackage.ajow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.ajpj r10, defpackage.akba r11) throws java.util.NoSuchElementException {
        /*
            r9 = this;
            java.lang.String r9 = "HTTP context"
            defpackage.ahgm.e(r11, r9)
            akai r9 = r10.p()
            int r9 = r9.b
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r1 = "Content-Length"
            r2 = 0
            r3 = 204(0xcc, float:2.86E-43)
            if (r9 != r3) goto L2d
            ajoy r9 = r10.hW(r1)
            if (r9 == 0) goto L26
            java.lang.String r9 = r9.c()     // Catch: java.lang.NumberFormatException -> L26
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L26
            if (r9 > 0) goto L25
            goto L26
        L25:
            return r2
        L26:
            ajoy r9 = r10.hW(r0)
            if (r9 == 0) goto L2d
            return r2
        L2d:
            java.lang.String r9 = "http.request"
            java.lang.Object r9 = r11.v(r9)
            ajph r9 = (defpackage.ajph) r9
            java.lang.String r11 = "Close"
            java.lang.String r4 = "Connection"
            if (r9 == 0) goto L55
            akaj r5 = new akaj     // Catch: defpackage.ajpr -> L54
            akaf r6 = r9.o(r4)     // Catch: defpackage.ajpr -> L54
            r5.<init>(r6)     // Catch: defpackage.ajpr -> L54
        L44:
            boolean r6 = r5.hasNext()     // Catch: defpackage.ajpr -> L54
            if (r6 == 0) goto L55
            java.lang.String r6 = r5.b()     // Catch: defpackage.ajpr -> L54
            boolean r6 = r11.equalsIgnoreCase(r6)     // Catch: defpackage.ajpr -> L54
            if (r6 == 0) goto L44
        L54:
            return r2
        L55:
            akai r5 = r10.p()
            ajpt r5 = r5.a
            ajoy r0 = r10.hW(r0)
            r6 = 1
            if (r0 == 0) goto L6f
            java.lang.String r9 = "chunked"
            java.lang.String r0 = r0.c()
            boolean r9 = r9.equalsIgnoreCase(r0)
            if (r9 != 0) goto Lab
            return r2
        L6f:
            if (r9 == 0) goto L7f
            akah r9 = r9.p()
            java.lang.String r9 = r9.b
            java.lang.String r0 = "HEAD"
            boolean r9 = r9.equalsIgnoreCase(r0)
            if (r9 != 0) goto Lab
        L7f:
            akai r9 = r10.p()
            int r9 = r9.b
            r0 = 200(0xc8, float:2.8E-43)
            if (r9 < r0) goto Lab
            if (r9 == r3) goto Lab
            r0 = 304(0x130, float:4.26E-43)
            if (r9 == r0) goto Lab
            r0 = 205(0xcd, float:2.87E-43)
            if (r9 == r0) goto Lab
            ajoy[] r9 = r10.m(r1)
            int r0 = r9.length
            if (r0 != r6) goto Laa
            r9 = r9[r2]
            java.lang.String r9 = r9.c()     // Catch: java.lang.NumberFormatException -> Laa
            long r0 = java.lang.Long.parseLong(r9)     // Catch: java.lang.NumberFormatException -> Laa
            r7 = 0
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 >= 0) goto Lab
        Laa:
            return r2
        Lab:
            akaf r9 = r10.o(r4)
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto Lbb
            java.lang.String r9 = "Proxy-Connection"
            akaf r9 = r10.o(r9)
        Lbb:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Le5
            akaj r10 = new akaj     // Catch: defpackage.ajpr -> Le4
            r10.<init>(r9)     // Catch: defpackage.ajpr -> Le4
            r9 = r2
        Lc7:
            boolean r0 = r10.hasNext()     // Catch: defpackage.ajpr -> Le4
            if (r0 == 0) goto Le0
            java.lang.String r0 = r10.b()     // Catch: defpackage.ajpr -> Le4
            boolean r1 = r11.equalsIgnoreCase(r0)     // Catch: defpackage.ajpr -> Le4
            if (r1 == 0) goto Ld8
            return r2
        Ld8:
            java.lang.String r1 = "Keep-Alive"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch: defpackage.ajpr -> Le4
            r9 = r9 | r0
            goto Lc7
        Le0:
            if (r9 != 0) goto Le3
            goto Le5
        Le3:
            return r6
        Le4:
            return r2
        Le5:
            ajpm r9 = defpackage.ajpm.b
            boolean r9 = r5.a(r9)
            if (r9 != 0) goto Lee
            return r6
        Lee:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajvd.a(ajpj, akba):boolean");
    }
}
