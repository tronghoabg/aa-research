package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hre {
    public static final boolean a = hrf.b;
    private final List b = new ArrayList();
    private boolean c = false;

    public final synchronized void a(String str, long j) {
        if (this.c) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.b.add(new hrd(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        this.c = true;
        List<hrd> list = this.b;
        long j = list.size() == 0 ? 0L : ((hrd) list.get(list.size() - 1)).c - ((hrd) list.get(0)).c;
        if (j > 0) {
            long j2 = ((hrd) list.get(0)).c;
            hrf.a("(%-4d ms) %s", Long.valueOf(j), str);
            for (hrd hrdVar : list) {
                long j3 = hrdVar.c;
                hrf.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(hrdVar.b), hrdVar.a);
                j2 = j3;
            }
        }
    }

    protected final void finalize() throws Throwable {
        if (this.c) {
            return;
        }
        b("Request on the loose");
        hrf.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
