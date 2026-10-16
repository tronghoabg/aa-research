package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adsp {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.adsp.class.getName());
    public final java.lang.String b;
    public final java.util.concurrent.atomic.AtomicLong c;

    public adsp() {
        java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
        this.c = atomicLong;
        this.b = "keepalive time nanos";
        atomicLong.set(Long.MAX_VALUE);
    }
}
