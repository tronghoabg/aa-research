package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hzp {
    private static final java.util.Queue a;
    private int b;
    private int c;
    private java.lang.Object d;

    static {
        char[] cArr = defpackage.igg.a;
        a = new java.util.ArrayDeque(0);
    }

    private hzp() {
    }

    public static defpackage.hzp b(java.lang.Object obj) {
        defpackage.hzp hzpVar;
        java.util.Queue queue = a;
        synchronized (queue) {
            hzpVar = (defpackage.hzp) queue.poll();
        }
        if (hzpVar == null) {
            hzpVar = new defpackage.hzp();
        }
        hzpVar.d = obj;
        hzpVar.c = 0;
        hzpVar.b = 0;
        return hzpVar;
    }

    public final void a() {
        java.util.Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.hzp) {
            defpackage.hzp hzpVar = (defpackage.hzp) obj;
            int i = hzpVar.c;
            int i2 = hzpVar.b;
            if (this.d.equals(hzpVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
