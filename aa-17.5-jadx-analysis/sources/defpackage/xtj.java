package defpackage;

import java.util.UUID;

/* loaded from: classes.dex */
public abstract class xtj implements xuk {
    private final xuk a;
    private final UUID b;
    private final String c;
    private final String d;
    private Thread e;

    public xtj(String str, xuk xukVar, nrd nrdVar) {
        str.getClass();
        this.d = str;
        this.a = xukVar;
        this.b = xukVar.f();
        this.c = xukVar.d();
        Object obj = nrdVar.b;
        this.e = Thread.currentThread();
    }

    public static String gQ(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // defpackage.xuk
    public final xuk a() {
        return this.a;
    }

    @Override // defpackage.xuk
    public final String c() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xuk] */
    @Override // defpackage.xul, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        nrd nrdVar = (nrd) xts.c.get();
        ?? r1 = nrdVar.c;
        if (r1 == 0) {
            throw new xtp("Tried to end [" + c() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
        }
        if (this == r1) {
            xuk xukVarA = r1.a();
            Object obj = nrdVar.b;
            xts.h(nrdVar, xukVarA);
            this.e = null;
            return;
        }
        throw new xtq("Tried to end span " + c() + ", but that span is not the current span. The current span is " + r1.c() + ".");
    }

    @Override // defpackage.xuk
    public final String d() {
        return this.c;
    }

    @Override // defpackage.xuk
    public final Thread e() {
        return this.e;
    }

    @Override // defpackage.xuk
    public final UUID f() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        r10 = r1.c.d;
        r16 = r7;
        r7 = java.lang.Integer.valueOf(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (r10.containsKey(r7) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        r1.c.d.put(r7, new defpackage.xug(r8, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r15 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        r15.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r15 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
    
        r15.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
    
        r1.d = r8;
        r1.e++;
        r1.b();
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtj.toString():java.lang.String");
    }

    public xtj(String str, UUID uuid, String str2, nrd nrdVar) {
        this.d = str;
        this.a = null;
        this.b = uuid;
        this.c = str2;
        Object obj = nrdVar.b;
        this.e = Thread.currentThread();
    }
}
