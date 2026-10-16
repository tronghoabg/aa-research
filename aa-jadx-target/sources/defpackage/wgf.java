package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wgf {
    public static final java.lang.Long a = 10L;
    public static final java.lang.Long b = 60000L;
    private final java.util.concurrent.ConcurrentMap c = new j$.util.concurrent.ConcurrentHashMap();

    @java.lang.Deprecated
    public wgf() {
    }

    public static defpackage.xyn a(java.nio.channels.FileChannel fileChannel, boolean z) throws java.io.IOException {
        try {
            return defpackage.xyn.h(new defpackage.wgd(fileChannel.lock(0L, Long.MAX_VALUE, z), 1));
        } catch (java.io.IOException e) {
            if (e.getMessage().contains("Resource deadlock would occur")) {
                return defpackage.xxe.a;
            }
            throw e;
        }
    }

    public final java.util.concurrent.Semaphore b(java.lang.String str) {
        return (java.util.concurrent.Semaphore) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(this.c, str, new defpackage.ydm(1));
    }
}
