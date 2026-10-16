package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class swo implements defpackage.swy {
    public final java.lang.Object a = new java.lang.Object();
    public final defpackage.swp b;

    public swo(defpackage.swp swpVar) {
        this.b = swpVar;
    }

    @Override // defpackage.swy
    public final void a(defpackage.swx swxVar) {
        if (((defpackage.sxc) swxVar).c) {
            synchronized (this.a) {
            }
            new defpackage.sho(this, 13, null).run();
        }
    }
}
