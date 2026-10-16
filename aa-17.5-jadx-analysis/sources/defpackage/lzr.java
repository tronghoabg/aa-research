package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class lzr {
    public static final yph a = yph.c("GH.NavClientProxy");
    private lzh d;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Queue c = new ArrayDeque();
    private final lzh e = new lzq();

    final synchronized lzh a() {
        lzh lzhVar = this.d;
        if (lzhVar != null) {
            return lzhVar;
        }
        ((ype) ((ype) a.l().l(1, TimeUnit.MINUTES)).ai(4532)).u("getClient() called with no active provider. Returning empty client");
        return this.e;
    }

    final synchronized void b(lzh lzhVar) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 4533)).y("setClient %s", lzhVar);
        this.d = lzhVar;
        if (lzhVar != null) {
            ype ypeVar = (ype) yphVar.l().ai(4534);
            Queue queue = this.c;
            ypeVar.w("Sending %d enqueued messages to nav provider", queue.size());
            while (!queue.isEmpty()) {
                this.b.post((Runnable) queue.remove());
            }
        }
    }

    final synchronized boolean c() {
        return this.d != null;
    }
}
