package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class zsw {
    private static final String a = "zsw";
    private static final long b;
    private static final AtomicInteger c;
    private int d;
    private final long e = SystemClock.elapsedRealtime();
    private final StringBuilder f;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        b = 60000L;
        c = new AtomicInteger(0);
    }

    public zsw(List list) {
        synchronized (this) {
            this.d = -1;
            StringBuilder sb = new StringBuilder("DRD");
            this.f = sb;
            sb.append("(");
            sb.append(c.incrementAndGet());
            sb.append("): ");
            String str = "";
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zsr zsrVar = (zsr) it.next();
                this.f.append(str);
                str = "|";
                this.f.append(zsrVar.h());
            }
        }
    }

    public final synchronized void a(int i, int i2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (i2 >= 8192) {
            int i3 = (int) jElapsedRealtime;
            if (i3 <= b) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                this.d = (i2 * 1000) / i3;
                String str = a;
                if (zrn.e(str, 3)) {
                    Log.d(str, "Sent " + i + ", Loaded " + i2 + " bytes.  Byte/Sec = " + this.d);
                }
            }
        }
        StringBuilder sb = this.f;
        sb.append(", ");
        if (i2 < 1000) {
            sb.append("<1kb");
        } else {
            sb.append(i2 / 1000);
            sb.append("kb");
        }
        String str2 = a;
        if (zrn.e(str2, 3)) {
            Log.d(str2, sb.toString());
        }
    }

    public final synchronized void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        StringBuilder sb = this.f;
        sb.append(", ");
        if (jElapsedRealtime < 1000) {
            sb.append("<1s");
        } else {
            sb.append(jElapsedRealtime / 1000);
            sb.append("s");
        }
    }
}
