package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lzy {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.NavClientProxy");
    private lzo d;
    private final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.util.Queue c = new java.util.ArrayDeque();
    private final lzo e = new defpackage.lzx();

    final synchronized lzo a() {
        lzo lzoVar = this.d;
        if (lzoVar != null) {
            return lzoVar;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.l().l(1, java.util.concurrent.TimeUnit.MINUTES)).ai(4535)).u("getClient() called with no active provider. Returning empty client");
        return this.e;
    }

    final synchronized void b(lzo lzoVar) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 4536)).y("setClient %s", lzoVar);
        this.d = lzoVar;
        if (lzoVar != null) {
            defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(4537);
            java.util.Queue queue = this.c;
            yqjVar.w("Sending %d enqueued messages to nav provider", queue.size());
            while (!queue.isEmpty()) {
                this.b.post((java.lang.Runnable) queue.remove());
            }
        }
    }

    final synchronized boolean c() {
        return this.d != null;
    }
}
