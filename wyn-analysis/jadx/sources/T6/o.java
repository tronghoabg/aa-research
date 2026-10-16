package t6;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final /* synthetic */ class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f45886a;

    public final void a(int i5) {
        p pVar = this.f45886a;
        synchronized (pVar) {
            int i10 = pVar.f45902i;
            if (i10 == 0 || pVar.f45898e) {
                if (i10 == i5) {
                    return;
                }
                pVar.f45902i = i5;
                if (i5 != 1 && i5 != 0 && i5 != 8) {
                    pVar.f45904l = pVar.a(i5);
                    pVar.f45897d.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    pVar.b(pVar.f45899f > 0 ? (int) (jElapsedRealtime - pVar.f45900g) : 0, pVar.f45901h, pVar.f45904l);
                    pVar.f45900g = jElapsedRealtime;
                    pVar.f45901h = 0L;
                    pVar.k = 0L;
                    pVar.f45903j = 0L;
                    I i11 = pVar.f45896c;
                    i11.f45835b.clear();
                    i11.f45837d = -1;
                    i11.f45838e = 0;
                    i11.f45839f = 0;
                }
            }
        }
    }
}
