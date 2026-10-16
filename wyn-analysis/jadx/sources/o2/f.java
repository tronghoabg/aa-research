package o2;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f41287a;

    public final void a(int i5) {
        g gVar = this.f41287a;
        synchronized (gVar) {
            int i10 = gVar.f41306m;
            if (i10 == 0 || gVar.f41298d) {
                if (i10 == i5) {
                    return;
                }
                gVar.f41306m = i5;
                if (i5 != 1 && i5 != 0 && i5 != 8) {
                    gVar.k = gVar.a(i5);
                    gVar.f41297c.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    gVar.b(gVar.f41300f > 0 ? (int) (jElapsedRealtime - gVar.f41301g) : 0, gVar.f41302h, gVar.k);
                    gVar.f41301g = jElapsedRealtime;
                    gVar.f41302h = 0L;
                    gVar.f41304j = 0L;
                    gVar.f41303i = 0L;
                    r rVar = gVar.f41299e;
                    rVar.f41335b.clear();
                    rVar.f41337d = -1;
                    rVar.f41338e = 0;
                    rVar.f41339f = 0;
                }
            }
        }
    }
}
