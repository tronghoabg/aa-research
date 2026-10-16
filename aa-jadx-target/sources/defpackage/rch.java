package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rch implements java.lang.Runnable {
    final /* synthetic */ defpackage.rcm a;
    private final java.util.List b = new java.util.ArrayList(8);

    public rch(defpackage.rcm rcmVar) {
        this.a = rcmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.rcm rcmVar;
        java.util.List list;
        java.util.List list2;
        boolean zH;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        synchronized (defpackage.rcm.class) {
            rcmVar = this.a;
            rcmVar.f++;
            long j = (jElapsedRealtime - rcmVar.c) - 500;
            int i = 0;
            if (j > 500) {
                int i2 = (((int) j) / 500) + 1;
                int i3 = i2 * i2;
                defpackage.rrx.d(5, "CAR.TIME", null, "too much delay in timer. system heavily loaded? delay: %d back-off: %d", java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i3));
                int i4 = 0;
                while (true) {
                    java.util.List list3 = rcmVar.g;
                    if (i4 >= list3.size()) {
                        break;
                    }
                    ((defpackage.rci) list3.get(i4)).a += i3;
                    i4++;
                }
            }
            while (true) {
                list = rcmVar.g;
                if (i >= list.size()) {
                    break;
                }
                defpackage.rci rciVar = (defpackage.rci) list.get(i);
                if (rciVar.a <= rcmVar.f) {
                    this.b.add(rciVar);
                    if (rciVar.c()) {
                        rcmVar.h.add(rciVar);
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
            zH = rcmVar.h();
            rcmVar.b = !zH;
        }
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((defpackage.rci) it.next()).b();
        }
        list2.clear();
        rcmVar.c = jElapsedRealtime;
        if (zH) {
            return;
        }
        rcmVar.e.postDelayed(this, 500L);
    }
}
