package defpackage;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class jgx extends rbj {
    private final Queue a;

    public jgx(jgy jgyVar) {
        super(jgyVar, Looper.getMainLooper());
        this.a = new ArrayDeque();
    }

    public final Object a() {
        Queue queue = this.a;
        if (queue.isEmpty()) {
            ((ype) ((ype) jgy.a.h()).ai((char) 2081)).u("Timeout Queue is empty");
            return null;
        }
        Object objRemove = queue.remove();
        removeMessages(1);
        if (!queue.isEmpty()) {
            sendMessageDelayed(obtainMessage(1), 10000L);
        }
        return objRemove;
    }

    public final void b(StringBuilder sb) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append('\n');
        }
    }

    final void c() {
        this.a.clear();
        removeCallbacksAndMessages(null);
    }

    public final void d(Object obj) {
        Queue queue = this.a;
        if (queue.isEmpty()) {
            sendMessageDelayed(obtainMessage(1), 10000L);
        }
        queue.offer(obj);
    }

    public final boolean e() {
        return this.a.isEmpty();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        jgy jgyVar = (jgy) v();
        if (message.what != 1 || jgyVar == null) {
            return;
        }
        yph yphVar = jgy.a;
        ((ype) ((ype) yphVar.g()).ai(2079)).y("%s: Possible ANR detected", jgyVar.b);
        try {
            if (!this.a.isEmpty() && yphVar.a(Level.SEVERE).Z()) {
                StringBuilder sb = new StringBuilder("Unhandled items:\n");
                b(sb);
                ((ype) ((ype) yphVar.g()).ai(2080)).y("%s", sb);
            }
        } finally {
            jgyVar.w();
        }
    }
}
