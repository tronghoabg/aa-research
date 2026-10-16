package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class rbm implements Runnable {
    final /* synthetic */ rbr a;
    private final List b = new ArrayList(8);

    public rbm(rbr rbrVar) {
        this.a = rbrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rbr rbrVar;
        List list;
        List list2;
        boolean zH;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (rbr.class) {
            rbrVar = this.a;
            rbrVar.f++;
            long j = (jElapsedRealtime - rbrVar.c) - 500;
            int i = 0;
            if (j > 500) {
                int i2 = (((int) j) / 500) + 1;
                int i3 = i2 * i2;
                rrd.d(5, "CAR.TIME", null, "too much delay in timer. system heavily loaded? delay: %d back-off: %d", Long.valueOf(j), Integer.valueOf(i3));
                int i4 = 0;
                while (true) {
                    List list3 = rbrVar.g;
                    if (i4 >= list3.size()) {
                        break;
                    }
                    ((rbn) list3.get(i4)).a += i3;
                    i4++;
                }
            }
            while (true) {
                list = rbrVar.g;
                if (i >= list.size()) {
                    break;
                }
                rbn rbnVar = (rbn) list.get(i);
                if (rbnVar.a <= rbrVar.f) {
                    this.b.add(rbnVar);
                    if (rbnVar.c()) {
                        rbrVar.h.add(rbnVar);
                    }
                }
                i++;
            }
            list2 = this.b;
            int size = list2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    list.remove(list2.get(size));
                }
            }
            zH = rbrVar.h();
            rbrVar.b = !zH;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((rbn) it.next()).b();
        }
        list2.clear();
        rbrVar.c = jElapsedRealtime;
        if (zH) {
            return;
        }
        rbrVar.e.postDelayed(this, 500L);
    }
}
