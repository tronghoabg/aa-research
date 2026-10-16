package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jhd extends defpackage.rce {
    private final java.util.Queue a;

    public jhd(defpackage.jhe jheVar) {
        super(jheVar, android.os.Looper.getMainLooper());
        this.a = new java.util.ArrayDeque();
    }

    public final java.lang.Object a() {
        java.util.Queue queue = this.a;
        if (queue.isEmpty()) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.jhe.a.h()).ai((char) 2082)).u("Timeout Queue is empty");
            return null;
        }
        java.lang.Object objRemove = queue.remove();
        removeMessages(1);
        if (!queue.isEmpty()) {
            sendMessageDelayed(obtainMessage(1), 10000L);
        }
        return objRemove;
    }

    public final void b(java.lang.StringBuilder sb) {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append('\n');
        }
    }

    final void c() {
        this.a.clear();
        removeCallbacksAndMessages(null);
    }

    public final void d(java.lang.Object obj) {
        java.util.Queue queue = this.a;
        if (queue.isEmpty()) {
            sendMessageDelayed(obtainMessage(1), 10000L);
        }
        queue.offer(obj);
    }

    public final boolean e() {
        return this.a.isEmpty();
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        defpackage.jhe jheVar = (defpackage.jhe) v();
        if (message.what != 1 || jheVar == null) {
            return;
        }
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai(2080)).y("%s: Possible ANR detected", jheVar.b);
        try {
            if (!this.a.isEmpty() && yqmVar.a(java.util.logging.Level.SEVERE).Z()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unhandled items:\n");
                b(sb);
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai(2081)).y("%s", sb);
            }
        } finally {
            jheVar.w();
        }
    }
}
