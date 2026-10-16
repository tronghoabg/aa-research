package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iqa {
    private static final defpackage.yqm a = defpackage.yqm.c("CAR.AUDIO");
    private final java.util.ArrayDeque b;
    private final int c;
    private final defpackage.jdo d;
    private final int e;

    public iqa(int i, defpackage.jdo jdoVar) {
        java.lang.String str;
        int iC = (int) defpackage.acnz.a.fF().c();
        this.e = iC;
        defpackage.yqj yqjVar = (defpackage.yqj) a.l().ai(1003);
        if (iC == 0) {
            str = "unlimited";
        } else {
            str = iC + " frames";
        }
        yqjVar.D("Create queue with buffer size: %d bytes, max capacity: %s", i, str);
        this.c = i;
        this.b = new java.util.ArrayDeque(16);
        this.d = jdoVar;
    }

    public final synchronized int a() {
        return this.b.size();
    }

    public final defpackage.ipy b() {
        return new defpackage.ipy(this.c, this.d);
    }

    public final synchronized defpackage.ipy c() {
        return (defpackage.ipy) this.b.peek();
    }

    public final synchronized defpackage.ipy d() {
        return (defpackage.ipy) this.b.poll();
    }

    public final synchronized void e(defpackage.ipy ipyVar) {
        int i = this.e;
        if (i <= 0 || this.b.size() < i) {
            this.b.add(ipyVar);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).l(5, java.util.concurrent.TimeUnit.SECONDS)).ai(1004)).w("Audio transmission queue reached the max capacity of %d frames, dropping incoming frame", i);
        }
    }

    public final synchronized void f() {
        java.util.ArrayDeque arrayDeque = this.b;
        ((defpackage.yqj) a.l().ai((char) 1005)).w("Clear AudioBufferQueue which has %d buffers in it", arrayDeque.size());
        arrayDeque.clear();
    }
}
