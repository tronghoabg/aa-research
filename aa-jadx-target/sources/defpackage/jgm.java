package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jgm {
    final /* synthetic */ defpackage.jgq a;
    private final java.lang.String b;
    private final defpackage.jgn c;
    private final defpackage.xzg d;

    public jgm(defpackage.jgq jgqVar, defpackage.xzo xzoVar, java.lang.String str, defpackage.jgn jgnVar) {
        this.a = jgqVar;
        this.b = str;
        this.c = jgnVar;
        this.d = new defpackage.xzg(xzoVar);
    }

    final void a() {
        if (this.a.n()) {
            defpackage.xzg xzgVar = this.d;
            if (xzgVar.a) {
                return;
            }
            xzgVar.e();
        }
    }

    final void b() {
        defpackage.xzg xzgVar = this.d;
        if (xzgVar.a && this.a.o()) {
            j$.time.Duration durationC = xzgVar.c();
            long seconds = durationC.toSeconds();
            if (seconds >= 1) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.jgq.a.h()).ai(2010)).L("blocking event, %s seconds = %d", this.b, seconds);
                this.c.a(durationC);
            }
        }
        xzgVar.d();
    }
}
