package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jjw implements defpackage.jjv {
    private static final defpackage.yqm b = defpackage.yqm.c("CAR.WM.FrameRateLimit");
    public final defpackage.jjt a;
    private final android.os.Handler c = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.util.Map d = new java.util.LinkedHashMap();
    private int e = 0;
    private int f = 60;
    private int g;

    public jjw(defpackage.jjt jjtVar) {
        this.a = jjtVar;
    }

    private final synchronized int g() {
        int i = this.e;
        if (i > 0) {
            return i;
        }
        int iMin = this.f;
        java.util.Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Integer) it.next()).intValue();
            if (iIntValue > 0) {
                iMin = java.lang.Math.min(iMin, iIntValue);
            }
        }
        return iMin;
    }

    private final synchronized void h() {
        int iG = g();
        defpackage.yqm yqmVar = b;
        ((defpackage.yqj) yqmVar.l().ai(2239)).w("frame rate calculated: %d", iG);
        if (iG == this.g) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2240)).B("Frame rate change. %d fps -> %d fps", this.g, iG);
        this.g = iG;
        this.c.post(new defpackage.irj(this, iG, 3));
    }

    @Override // defpackage.jjv
    public final synchronized int a() {
        return this.g;
    }

    @Override // defpackage.jjv
    public final synchronized void b(defpackage.jju jjuVar, int i) {
        if (i <= 0) {
            f(jjuVar);
        }
        this.d.put(jjuVar, java.lang.Integer.valueOf(i));
        h();
    }

    @Override // defpackage.jjv
    public final synchronized void c(int i) {
        ((defpackage.yqj) b.l().ai((char) 2238)).w("configureForDisplay(/* fps= */ %d)", i);
        this.f = i;
        h();
    }

    @Override // defpackage.jjv
    public final synchronized void d(java.io.PrintWriter printWriter) {
        printWriter.format("FrameRateLimitManagerImpl (limit: %d fps, max: %d fps)\n", java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(this.f));
        int i = this.e;
        if (i > 0) {
            printWriter.format("  Fixed frame rate: %d fps\n", java.lang.Integer.valueOf(i));
        }
        printWriter.append("  Current restrictions:\n");
        java.util.Map map = this.d;
        if (map.isEmpty()) {
            printWriter.append("    -- no restrictions applied --\n");
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            printWriter.format("    %2d fps: %s\n", entry.getValue(), ((defpackage.jju) entry.getKey()).a());
        }
    }

    @Override // defpackage.jjv
    public final synchronized void e(int i) {
        ((defpackage.yqj) b.l().ai((char) 2241)).w("setFixedFrameRate(%d)", i);
        this.e = i;
        h();
    }

    public final synchronized void f(defpackage.jju jjuVar) {
        this.d.remove(jjuVar);
        h();
    }
}
