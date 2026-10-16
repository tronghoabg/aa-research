package t6;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import l8.e0;
import u6.AbstractC4256a;

/* renamed from: t6.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4138f implements InterfaceC4144l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f45862a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f45863b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f45864c;

    /* renamed from: d, reason: collision with root package name */
    public n f45865d;

    public AbstractC4138f(boolean z2) {
        this.f45862a = z2;
    }

    public final void b(int i5) {
        boolean z2;
        n nVar = this.f45865d;
        int i10 = u6.v.f46721a;
        for (int i11 = 0; i11 < this.f45864c; i11++) {
            K k = (K) this.f45863b.get(i11);
            boolean z10 = this.f45862a;
            p pVar = (p) k;
            synchronized (pVar) {
                e0 e0Var = p.f45887n;
                if (z10) {
                    int i12 = nVar.f45885g;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    pVar.f45901h += i5;
                }
            }
        }
    }

    @Override // t6.InterfaceC4144l
    public Map d() {
        return Collections.EMPTY_MAP;
    }

    public final void l() {
        boolean z2;
        n nVar = this.f45865d;
        int i5 = u6.v.f46721a;
        for (int i10 = 0; i10 < this.f45864c; i10++) {
            K k = (K) this.f45863b.get(i10);
            boolean z10 = this.f45862a;
            p pVar = (p) k;
            synchronized (pVar) {
                try {
                    e0 e0Var = p.f45887n;
                    if (z10) {
                        int i11 = nVar.f45885g;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        AbstractC4256a.i(pVar.f45899f > 0);
                        pVar.f45897d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i12 = (int) (jElapsedRealtime - pVar.f45900g);
                        pVar.f45903j += i12;
                        long j8 = pVar.k;
                        long j10 = pVar.f45901h;
                        pVar.k = j8 + j10;
                        if (i12 > 0) {
                            pVar.f45896c.a((j10 * 8000.0f) / i12, (int) Math.sqrt(j10));
                            if (pVar.f45903j >= 2000 || pVar.k >= 524288) {
                                pVar.f45904l = (long) pVar.f45896c.b();
                            }
                            pVar.b(i12, pVar.f45901h, pVar.f45904l);
                            pVar.f45900g = jElapsedRealtime;
                            pVar.f45901h = 0L;
                        }
                        pVar.f45899f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f45865d = null;
    }

    public final void m() {
        for (int i5 = 0; i5 < this.f45864c; i5++) {
            ((K) this.f45863b.get(i5)).getClass();
        }
    }

    public final void n(n nVar) {
        boolean z2;
        this.f45865d = nVar;
        for (int i5 = 0; i5 < this.f45864c; i5++) {
            K k = (K) this.f45863b.get(i5);
            boolean z10 = this.f45862a;
            p pVar = (p) k;
            synchronized (pVar) {
                try {
                    e0 e0Var = p.f45887n;
                    if (z10) {
                        int i10 = nVar.f45885g;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (pVar.f45899f == 0) {
                            pVar.f45897d.getClass();
                            pVar.f45900g = SystemClock.elapsedRealtime();
                        }
                        pVar.f45899f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // t6.InterfaceC4144l
    public final void z(K k) {
        k.getClass();
        ArrayList arrayList = this.f45863b;
        if (arrayList.contains(k)) {
            return;
        }
        arrayList.add(k);
        this.f45864c++;
    }
}
