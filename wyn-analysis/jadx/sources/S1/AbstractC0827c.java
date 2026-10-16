package S1;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import l8.e0;

/* renamed from: S1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0827c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10848a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10849b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f10850c;

    /* renamed from: d, reason: collision with root package name */
    public k f10851d;

    public AbstractC0827c(boolean z2) {
        this.f10848a = z2;
    }

    @Override // S1.h
    public final void C(A a5) {
        a5.getClass();
        ArrayList arrayList = this.f10849b;
        if (arrayList.contains(a5)) {
            return;
        }
        arrayList.add(a5);
        this.f10850c++;
    }

    public final void b(int i5) {
        k kVar = this.f10851d;
        int i10 = Q1.x.f9724a;
        for (int i11 = 0; i11 < this.f10850c; i11++) {
            A a5 = (A) this.f10849b.get(i11);
            boolean z2 = this.f10848a;
            o2.g gVar = (o2.g) a5;
            synchronized (gVar) {
                e0 e0Var = o2.g.f41288n;
                if (z2 && (kVar.f10877h & 8) != 8) {
                    gVar.f41302h += i5;
                }
            }
        }
    }

    @Override // S1.h
    public Map d() {
        return Collections.EMPTY_MAP;
    }

    public final void l() {
        k kVar = this.f10851d;
        int i5 = Q1.x.f9724a;
        for (int i10 = 0; i10 < this.f10850c; i10++) {
            A a5 = (A) this.f10849b.get(i10);
            boolean z2 = this.f10848a;
            o2.g gVar = (o2.g) a5;
            synchronized (gVar) {
                try {
                    e0 e0Var = o2.g.f41288n;
                    if (z2 && (kVar.f10877h & 8) != 8) {
                        Q1.k.g(gVar.f41300f > 0);
                        gVar.f41297c.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i11 = (int) (jElapsedRealtime - gVar.f41301g);
                        gVar.f41303i += i11;
                        long j8 = gVar.f41304j;
                        long j10 = gVar.f41302h;
                        gVar.f41304j = j8 + j10;
                        if (i11 > 0) {
                            gVar.f41299e.a((j10 * 8000.0f) / i11, (int) Math.sqrt(j10));
                            if (gVar.f41303i >= 2000 || gVar.f41304j >= 524288) {
                                gVar.k = (long) gVar.f41299e.b();
                            }
                            gVar.b(i11, gVar.f41302h, gVar.k);
                            gVar.f41301g = jElapsedRealtime;
                            gVar.f41302h = 0L;
                        }
                        gVar.f41300f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f10851d = null;
    }

    public final void m() {
        for (int i5 = 0; i5 < this.f10850c; i5++) {
            ((A) this.f10849b.get(i5)).getClass();
        }
    }

    public final void o(k kVar) {
        this.f10851d = kVar;
        for (int i5 = 0; i5 < this.f10850c; i5++) {
            A a5 = (A) this.f10849b.get(i5);
            boolean z2 = this.f10848a;
            o2.g gVar = (o2.g) a5;
            synchronized (gVar) {
                try {
                    e0 e0Var = o2.g.f41288n;
                    if (z2 && (kVar.f10877h & 8) != 8) {
                        if (gVar.f41300f == 0) {
                            gVar.f41297c.getClass();
                            gVar.f41301g = SystemClock.elapsedRealtime();
                        }
                        gVar.f41300f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
