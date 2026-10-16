package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class shr implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ shr(int i, int i2, java.lang.Runnable runnable, int i3) {
        this.d = i3;
        this.a = i;
        this.b = i2;
        this.c = runnable;
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        int i2 = 1;
        if (i == 0) {
            defpackage.ypu ypuVarAi = defpackage.qtn.a.h().ai(7894);
            int i3 = this.b;
            int i4 = this.a;
            ypuVarAi.B("Critical protocol error %d (%d)", i4, i3);
            defpackage.wyz wyzVar = ((defpackage.sht) this.c).a.h;
            ((defpackage.qtn) wyzVar.a).d.post(new defpackage.shr(wyzVar, i4, i3, i2));
            return;
        }
        if (i == 1) {
            ((defpackage.qtn) ((defpackage.wyz) this.c).a).p(new com.google.android.gms.car.diagnostics.CriticalError(this.a, this.b));
            return;
        }
        int[] iArr = tng.a;
        int i5 = this.a;
        if (i5 <= 0 || i5 > 10) {
            throw new java.lang.IllegalArgumentException("Invalid java priority: " + i5);
        }
        int i6 = this.b;
        if (tng.a[i5 - 1] != i6) {
            android.os.Process.setThreadPriority(i6);
        }
        this.c.run();
    }

    public /* synthetic */ shr(java.lang.Object obj, int i, int i2, int i3) {
        this.d = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }
}
