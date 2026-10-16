package defpackage;

import java.io.PrintWriter;

/* loaded from: classes2.dex */
public final class jjq implements jjo {
    private final jjm a;
    private volatile int b;
    private volatile int c = 30;

    static {
        yph.c("CAR.WM.FrameRateLimitSt");
    }

    public jjq(jjm jjmVar) {
        this.a = jjmVar;
        jjmVar.A(30);
    }

    @Override // defpackage.jjo
    public final int a() {
        return this.c;
    }

    @Override // defpackage.jjo
    public final void d(PrintWriter printWriter) {
        printWriter.println("FrameRateLimitManagerStaticImpl: current frame rate: " + this.c + ", fixed frame rate:" + this.b);
    }

    @Override // defpackage.jjo
    public final void e(int i) {
        this.b = i;
        int i2 = this.b > 0 ? this.b : 30;
        if (i2 == this.c) {
            return;
        }
        this.c = i2;
        this.a.A(i2);
    }

    @Override // defpackage.jjo
    public final void c(int i) {
    }

    @Override // defpackage.jjo
    public final void b(jjn jjnVar, int i) {
    }
}
