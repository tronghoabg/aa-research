package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yrz {
    private static final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static void a(defpackage.yry yryVar) {
        if (yryVar == null) {
            yryVar = defpackage.ysh.c;
        }
        if (!defpackage.a.o(defpackage.ysd.d, yryVar)) {
            throw new java.lang.IllegalStateException("Logger backends can only be configured once.");
        }
        defpackage.ysd.c();
    }

    public static void b() {
        if (!a.compareAndSet(false, true)) {
            throw new java.lang.IllegalStateException("Logger backend configuration may only occur once.");
        }
    }
}
