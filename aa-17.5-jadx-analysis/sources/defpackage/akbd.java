package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class akbd {
    protected static final boolean a(ajph ajphVar, ajpj ajpjVar) {
        int i;
        return ("HEAD".equalsIgnoreCase(ajphVar.p().b) || (i = ajpjVar.p().b) < 200 || i == 204 || i == 304 || i == 205) ? false : true;
    }

    public static final void b(ajpj ajpjVar, akbc akbcVar, akba akbaVar) throws ajpd, IOException {
        ahgm.e(akbcVar, "HTTP processor");
        ahgm.e(akbaVar, "HTTP context");
        akbaVar.x("http.response", ajpjVar);
        akbcVar.b(ajpjVar, akbaVar);
    }

    public static final void c(ajph ajphVar, akbc akbcVar, akba akbaVar) throws ajpd, IOException {
        ahgm.e(akbcVar, "HTTP processor");
        ahgm.e(akbaVar, "HTTP context");
        akbaVar.x("http.request", ajphVar);
        akbcVar.a(ajphVar, akbaVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f A[Catch: RuntimeException -> 0x00c9, ajpd -> 0x00ce, IOException -> 0x00d3, TryCatch #2 {ajpd -> 0x00ce, IOException -> 0x00d3, RuntimeException -> 0x00c9, blocks: (B:3:0x000c, B:5:0x0029, B:7:0x0039, B:9:0x0041, B:11:0x004a, B:13:0x0054, B:14:0x0057, B:18:0x0062, B:19:0x0079, B:23:0x007f, B:25:0x0084, B:27:0x008e, B:32:0x009a, B:34:0x00a6, B:36:0x00ac, B:37:0x00b0, B:38:0x00c7), top: B:49:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ajpj d(defpackage.ajph r11, defpackage.ajoz r12, defpackage.akba r13) throws defpackage.ajpd, java.io.IOException {
        /*
            java.lang.String r0 = "http.request_sent"
            java.lang.String r1 = "Client connection"
            defpackage.ahgm.e(r12, r1)
            java.lang.String r2 = "HTTP context"
            defpackage.ahgm.e(r13, r2)
            defpackage.ahgm.e(r12, r1)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            defpackage.ahgm.e(r13, r2)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            java.lang.String r3 = "http.connection"
            r13.x(r3, r12)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            r13.x(r0, r3)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            r12.e(r11)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            boolean r3 = r11 instanceof defpackage.ajpc     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            r4 = 100
            r5 = 200(0xc8, float:2.8E-43)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L83
            akah r3 = r11.p()     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            ajpt r3 = r3.a     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            r8 = r11
            ajpc r8 = (defpackage.ajpc) r8     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            boolean r9 = r8.b()     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            r10 = 1
            if (r9 == 0) goto L7c
            ajpm r9 = defpackage.ajpm.b     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            boolean r3 = r3.a(r9)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            if (r3 != 0) goto L7c
            r12.b()     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            boolean r3 = r12.f()     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            if (r3 == 0) goto L7c
            ajpj r3 = r12.a()     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            boolean r9 = a(r11, r3)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            if (r9 == 0) goto L57
            r12.c(r3)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
        L57:
            akai r9 = r3.p()     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            int r9 = r9.b     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            if (r9 >= r5) goto L7a
            if (r9 != r4) goto L62
            goto L7c
        L62:
            ajps r11 = new ajps     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            akai r13 = r3.p()     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            java.lang.String r0 = "Unexpected response: "
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            java.lang.String r13 = r0.concat(r13)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            r11.<init>(r13)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            throw r11     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
        L7a:
            r10 = r6
            goto L7d
        L7c:
            r3 = r7
        L7d:
            if (r10 == 0) goto L84
            r12.d(r8)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            goto L84
        L83:
            r3 = r7
        L84:
            r12.b()     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            r13.x(r0, r8)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            if (r3 != 0) goto Lc8
            defpackage.ahgm.e(r12, r1)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            defpackage.ahgm.e(r13, r2)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
        L94:
            if (r7 == 0) goto L9a
            if (r6 >= r5) goto L99
            goto L9a
        L99:
            return r7
        L9a:
            ajpj r7 = r12.a()     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            akai r13 = r7.p()     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            int r6 = r13.b     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            if (r6 < r4) goto Lb0
            boolean r13 = a(r11, r7)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            if (r13 == 0) goto L94
            r12.c(r7)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            goto L94
        Lb0:
            ajps r11 = new ajps     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            akai r13 = r7.p()     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            java.lang.String r0 = "Invalid response: "
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            java.lang.String r13 = r0.concat(r13)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            r11.<init>(r13)     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
            throw r11     // Catch: java.lang.RuntimeException -> Lc9 defpackage.ajpd -> Lce java.io.IOException -> Ld3
        Lc8:
            return r3
        Lc9:
            r11 = move-exception
            e(r12)
            throw r11
        Lce:
            r11 = move-exception
            e(r12)
            throw r11
        Ld3:
            r11 = move-exception
            e(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbd.d(ajph, ajoz, akba):ajpj");
    }

    private static void e(ajoz ajozVar) {
        try {
            ajozVar.close();
        } catch (IOException unused) {
        }
    }
}
