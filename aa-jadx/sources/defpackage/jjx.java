package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jjx implements defpackage.jjv {
    private final defpackage.jjt a;
    private volatile int b;
    private volatile int c = 30;

    static {
        defpackage.yqm.c("CAR.WM.FrameRateLimitSt");
    }

    public jjx(defpackage.jjt jjtVar) {
        this.a = jjtVar;
        jjtVar.A(30);
    }

    @Override // defpackage.jjv
    public final int a() {
        return this.c;
    }

    @Override // defpackage.jjv
    public final void d(java.io.PrintWriter printWriter) {
        printWriter.println("FrameRateLimitManagerStaticImpl: current frame rate: " + this.c + ", fixed frame rate:" + this.b);
    }

    @Override // defpackage.jjv
    public final void e(int i) {
        this.b = i;
        int i2 = this.b > 0 ? this.b : 30;
        if (i2 == this.c) {
            return;
        }
        this.c = i2;
        this.a.A(i2);
    }

    @Override // defpackage.jjv
    public final void c(int i) {
    }

    @Override // defpackage.jjv
    public final void b(defpackage.jju jjuVar, int i) {
    }
}
