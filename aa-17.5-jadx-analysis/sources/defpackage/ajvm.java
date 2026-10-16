package defpackage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes2.dex */
public class ajvm {
    private final Log a;

    public ajvm(Log log) {
        this.a = log == null ? LogFactory.getLog(getClass()) : log;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: ajqm -> 0x00c6, TryCatch #0 {ajqm -> 0x00c6, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x0021, B:8:0x002b, B:10:0x0031, B:35:0x009c, B:37:0x00a6, B:39:0x00ac, B:40:0x00b5, B:20:0x0049, B:23:0x0050, B:26:0x0062, B:28:0x0074, B:30:0x0082, B:32:0x0094, B:34:0x0099), top: B:49:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.ajpe r9, defpackage.ajpj r10, defpackage.ajqr r11, defpackage.ajqe r12, defpackage.akba r13) {
        /*
            r8 = this;
            r0 = 0
            org.apache.commons.logging.Log r1 = r8.a     // Catch: defpackage.ajqm -> Lc6
            boolean r2 = r1.isDebugEnabled()     // Catch: defpackage.ajqm -> Lc6
            if (r2 == 0) goto L21
            java.lang.String r2 = r9.a()     // Catch: defpackage.ajqm -> Lc6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: defpackage.ajqm -> Lc6
            r3.<init>()     // Catch: defpackage.ajqm -> Lc6
            r3.append(r2)     // Catch: defpackage.ajqm -> Lc6
            java.lang.String r2 = " requested authentication"
            r3.append(r2)     // Catch: defpackage.ajqm -> Lc6
            java.lang.String r2 = r3.toString()     // Catch: defpackage.ajqm -> Lc6
            r1.debug(r2)     // Catch: defpackage.ajqm -> Lc6
        L21:
            java.util.Map r2 = r11.d(r10)     // Catch: defpackage.ajqm -> Lc6
            boolean r3 = r2.isEmpty()     // Catch: defpackage.ajqm -> Lc6
            if (r3 == 0) goto L31
            java.lang.String r9 = "Response contains no authentication challenges"
            r1.debug(r9)     // Catch: defpackage.ajqm -> Lc6
            return r0
        L31:
            ajpy r3 = r12.b     // Catch: defpackage.ajqm -> Lc6
            ajpx r4 = r12.a     // Catch: defpackage.ajqm -> Lc6
            int r4 = r4.ordinal()     // Catch: defpackage.ajqm -> Lc6
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L60
            if (r4 == r6) goto L4e
            r7 = 2
            if (r4 == r7) goto L4e
            r3 = 3
            if (r4 == r3) goto L4d
            r3 = 4
            if (r4 == r3) goto L49
            goto L9c
        L49:
            r12.a()     // Catch: defpackage.ajqm -> Lc6
            goto L9c
        L4d:
            return r0
        L4e:
            if (r3 != 0) goto L60
            java.lang.String r10 = "Auth scheme is null"
            r1.debug(r10)     // Catch: defpackage.ajqm -> Lc6
            r11.b(r9, r5, r13)     // Catch: defpackage.ajqm -> Lc6
            r12.a()     // Catch: defpackage.ajqm -> Lc6
            ajpx r9 = defpackage.ajpx.d     // Catch: defpackage.ajqm -> Lc6
            r12.a = r9     // Catch: defpackage.ajqm -> Lc6
            return r0
        L60:
            if (r3 == 0) goto L9c
            java.lang.String r4 = r3.b()     // Catch: defpackage.ajqm -> Lc6
            java.util.Locale r7 = java.util.Locale.ROOT     // Catch: defpackage.ajqm -> Lc6
            java.lang.String r4 = r4.toLowerCase(r7)     // Catch: defpackage.ajqm -> Lc6
            java.lang.Object r4 = r2.get(r4)     // Catch: defpackage.ajqm -> Lc6
            ajoy r4 = (defpackage.ajoy) r4     // Catch: defpackage.ajqm -> Lc6
            if (r4 == 0) goto L99
            java.lang.String r10 = "Authorization challenge processed"
            r1.debug(r10)     // Catch: defpackage.ajqm -> Lc6
            r3.d(r4)     // Catch: defpackage.ajqm -> Lc6
            boolean r10 = r3.e()     // Catch: defpackage.ajqm -> Lc6
            if (r10 == 0) goto L94
            java.lang.String r10 = "Authentication failed"
            r1.debug(r10)     // Catch: defpackage.ajqm -> Lc6
            ajpy r10 = r12.b     // Catch: defpackage.ajqm -> Lc6
            r11.b(r9, r10, r13)     // Catch: defpackage.ajqm -> Lc6
            r12.a()     // Catch: defpackage.ajqm -> Lc6
            ajpx r9 = defpackage.ajpx.d     // Catch: defpackage.ajqm -> Lc6
            r12.a = r9     // Catch: defpackage.ajqm -> Lc6
            return r0
        L94:
            ajpx r9 = defpackage.ajpx.c     // Catch: defpackage.ajqm -> Lc6
            r12.a = r9     // Catch: defpackage.ajqm -> Lc6
            return r6
        L99:
            r12.a()     // Catch: defpackage.ajqm -> Lc6
        L9c:
            java.util.Queue r9 = r11.a(r2, r9, r10, r13)     // Catch: defpackage.ajqm -> Lc6
            boolean r10 = r9.isEmpty()     // Catch: defpackage.ajqm -> Lc6
            if (r10 != 0) goto Lc5
            boolean r10 = r1.isDebugEnabled()     // Catch: defpackage.ajqm -> Lc6
            if (r10 == 0) goto Lb5
            java.lang.String r10 = "Selected authentication options: "
            java.lang.String r10 = defpackage.a.bX(r9, r10)     // Catch: defpackage.ajqm -> Lc6
            r1.debug(r10)     // Catch: defpackage.ajqm -> Lc6
        Lb5:
            ajpx r10 = defpackage.ajpx.b     // Catch: defpackage.ajqm -> Lc6
            r12.a = r10     // Catch: defpackage.ajqm -> Lc6
            java.lang.String r10 = "Queue of auth options"
            defpackage.ahgm.c(r9, r10)     // Catch: defpackage.ajqm -> Lc6
            r12.d = r9     // Catch: defpackage.ajqm -> Lc6
            r12.b = r5     // Catch: defpackage.ajqm -> Lc6
            r12.c = r5     // Catch: defpackage.ajqm -> Lc6
            return r6
        Lc5:
            return r0
        Lc6:
            r9 = move-exception
            org.apache.commons.logging.Log r8 = r8.a
            boolean r10 = r8.isWarnEnabled()
            if (r10 == 0) goto Le0
            java.lang.String r9 = r9.getMessage()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "Malformed challenge: "
            java.lang.String r9 = r10.concat(r9)
            r8.warn(r9)
        Le0:
            r12.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajvm.a(ajpe, ajpj, ajqr, ajqe, akba):boolean");
    }

    public final boolean b(ajpe ajpeVar, ajpj ajpjVar, ajqr ajqrVar, ajqe ajqeVar, akba akbaVar) {
        if (ajqrVar.e(ajpjVar)) {
            this.a.debug("Authentication required");
            if (ajqeVar.a == ajpx.e) {
                ajqrVar.b(ajpeVar, ajqeVar.b, akbaVar);
            }
            return true;
        }
        int iOrdinal = ajqeVar.a.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            this.a.debug("Authentication succeeded");
            ajqeVar.a = ajpx.e;
            ajqrVar.c(ajpeVar, ajqeVar.b, akbaVar);
            return false;
        }
        if (iOrdinal == 4) {
            return false;
        }
        ajqeVar.a = ajpx.a;
        return false;
    }
}
