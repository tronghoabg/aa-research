package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class syc {
    private static defpackage.tna a;

    public static synchronized void a() {
        if (a == null) {
            b(new defpackage.tna());
        }
    }

    public static synchronized void b(defpackage.tna tnaVar) {
        if (a != null) {
            throw new java.lang.IllegalStateException("init() already called");
        }
        a = tnaVar;
    }
}
