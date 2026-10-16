package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class pn extends defpackage.ca {
    public static final java.util.concurrent.Executor c = new defpackage.pm(0);
    private static volatile defpackage.pn e;
    public final defpackage.ca d;
    private final defpackage.ca f;

    private pn() {
        super(null);
        defpackage.po poVar = new defpackage.po();
        this.f = poVar;
        this.d = poVar;
    }

    public static defpackage.pn bn() {
        if (e == null) {
            synchronized (defpackage.pn.class) {
                if (e == null) {
                    e = new defpackage.pn();
                }
            }
        }
        return e;
    }

    public final boolean bo() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }
}
