package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ajzc implements ajzt {
    protected final akan a;
    private final ajzu b;
    private final ajsm c;
    private final List d;
    private int e;
    private ajpg f;

    @Deprecated
    public ajzc(ajzu ajzuVar, akas akasVar) {
        ahgm.e(akasVar, "HTTP parameters");
        this.b = ajzuVar;
        this.c = new ajsm(akasVar.c("http.connection.max-line-length", -1), akasVar.c("http.connection.max-header-count", -1));
        this.a = akae.a;
        this.d = new ArrayList();
        this.e = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        r6 = new defpackage.ajoy[r10.size()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r4 >= r10.size()) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        r6[r4] = new defpackage.akak((defpackage.akbh) r10.get(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        throw new defpackage.ajps(r6.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a7, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ajoy[] c(defpackage.ajzu r6, int r7, int r8, defpackage.akan r9, java.util.List r10) throws defpackage.ajpd, java.io.IOException {
        /*
            java.lang.String r0 = "Session input buffer"
            defpackage.ahgm.e(r6, r0)
            java.lang.String r0 = "Line parser"
            defpackage.ahgm.e(r9, r0)
            r9 = 0
            r0 = r9
            r1 = r0
        Ld:
            if (r0 != 0) goto L17
            akbh r0 = new akbh
            r2 = 64
            r0.<init>(r2)
            goto L1a
        L17:
            r0.i()
        L1a:
            int r2 = r6.c(r0)
            r3 = -1
            r4 = 0
            if (r2 == r3) goto L80
            int r2 = r0.b
            if (r2 > 0) goto L27
            goto L80
        L27:
            char r2 = r0.charAt(r4)
            r3 = 9
            r5 = 32
            if (r2 == r5) goto L37
            char r2 = r0.charAt(r4)
            if (r2 != r3) goto L6a
        L37:
            if (r1 == 0) goto L6a
        L39:
            int r2 = r0.b
            if (r4 >= r2) goto L49
            char r2 = r0.charAt(r4)
            if (r2 == r5) goto L46
            if (r2 == r3) goto L46
            goto L49
        L46:
            int r4 = r4 + 1
            goto L39
        L49:
            if (r8 <= 0) goto L5e
            int r2 = r1.b
            int r2 = r2 + 1
            int r3 = r0.b
            int r2 = r2 + r3
            int r2 = r2 - r4
            if (r2 > r8) goto L56
            goto L5e
        L56:
            ajpo r6 = new ajpo
            java.lang.String r7 = "Maximum line length limit exceeded"
            r6.<init>(r7)
            throw r6
        L5e:
            r1.e(r5)
            int r2 = r0.b
            int r2 = r2 - r4
            char[] r3 = r0.a
            r1.h(r3, r4, r2)
            goto L6f
        L6a:
            r10.add(r0)
            r1 = r0
            r0 = r9
        L6f:
            if (r7 <= 0) goto Ld
            int r2 = r10.size()
            if (r2 >= r7) goto L78
            goto Ld
        L78:
            ajpo r6 = new ajpo
            java.lang.String r7 = "Maximum header count exceeded"
            r6.<init>(r7)
            throw r6
        L80:
            int r6 = r10.size()
            ajoy[] r6 = new defpackage.ajoy[r6]
        L86:
            int r7 = r10.size()
            if (r4 >= r7) goto La7
            java.lang.Object r7 = r10.get(r4)
            akbh r7 = (defpackage.akbh) r7
            akak r8 = new akak     // Catch: defpackage.ajpr -> L9c
            r8.<init>(r7)     // Catch: defpackage.ajpr -> L9c
            r6[r4] = r8     // Catch: defpackage.ajpr -> L9c
            int r4 = r4 + 1
            goto L86
        L9c:
            r6 = move-exception
            ajps r7 = new ajps
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r6)
            throw r7
        La7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajzc.c(ajzu, int, int, akan, java.util.List):ajoy[]");
    }

    protected abstract ajpg a(ajzu ajzuVar) throws ajpd, ajpr, IOException;

    @Override // defpackage.ajzt
    public final ajpg b() throws ajpd, IOException {
        if (this.e == 0) {
            try {
                this.f = a(this.b);
                this.e = 1;
            } catch (ajpr e) {
                throw new ajps(e.getMessage(), e);
            }
        }
        ajzu ajzuVar = this.b;
        ajsm ajsmVar = this.c;
        akan akanVar = this.a;
        List list = this.d;
        this.f.i(c(ajzuVar, ajsmVar.c, ajsmVar.b, akanVar, list));
        ajpg ajpgVar = this.f;
        this.f = null;
        list.clear();
        this.e = 0;
        return ajpgVar;
    }
}
