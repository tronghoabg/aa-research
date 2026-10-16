package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class swm implements defpackage.swy, defpackage.swt, defpackage.sws, defpackage.swp {
    public final defpackage.swk a;
    public final defpackage.sxc b;

    public swm(defpackage.swk swkVar, defpackage.sxc sxcVar) {
        this.a = swkVar;
        this.b = sxcVar;
    }

    @Override // defpackage.swy
    public final void a(defpackage.swx swxVar) {
        new defpackage.kfq(this, swxVar, 14, (char[]) null).run();
    }

    @Override // defpackage.swp
    public final void b() {
        this.b.r();
    }

    @Override // defpackage.sws
    public final void d(java.lang.Exception exc) {
        this.b.o(exc);
    }

    @Override // defpackage.swt
    public final void e(java.lang.Object obj) {
        this.b.p(obj);
    }
}
