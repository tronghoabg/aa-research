package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mho {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.Preflight.Req");
    public final java.util.Queue b;
    public final android.os.Handler c;
    public boolean d;
    public final defpackage.wyz e;

    public mho(defpackage.wyz wyzVar, defpackage.ldx ldxVar) {
        java.lang.Object obj = ldxVar.a;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.b = arrayDeque;
        this.e = wyzVar;
        arrayDeque.addAll(obj);
        ((defpackage.yqj) a.l().ai(4928)).y("RequirementProcessor with requirements:\n%s", arrayDeque);
        this.c = new defpackage.mhn(this);
    }

    public final void a() {
        if (this.d) {
            throw new java.lang.IllegalStateException();
        }
        this.c.sendEmptyMessage(0);
    }
}
