package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class irj implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ irj(java.lang.Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, rda] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, jde] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                ((defpackage.dvg) this.b).a(this.a);
                return;
            } else if (i == 2) {
                this.b.b(this.a);
                return;
            } else if (i == 3) {
                ((defpackage.jjw) this.b).a.A(this.a);
                return;
            } else {
                this.b.a(this.a);
                return;
            }
        }
        int i2 = this.a;
        java.lang.Object obj = ((defpackage.izq) this.b).a;
        if (i2 == 3) {
            ((defpackage.irk) obj).s = true;
        } else if (i2 == 5) {
            ((defpackage.irk) obj).t = true;
        }
        defpackage.irk irkVar = (defpackage.irk) obj;
        if (irkVar.r < 5 && irkVar.s && irkVar.t) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.irk.a.f()).ai((char) 1214)).u("Audio capture restarted.");
            defpackage.jfo jfoVar = irkVar.h;
            jfoVar.getClass();
            jfoVar.e(defpackage.zbe.AUDIO_DIAGNOSTICS, defpackage.zbd.wG);
        }
    }
}
